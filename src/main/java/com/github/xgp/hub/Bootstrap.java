package com.github.xgp.hub;

import com.cloudhopper.sxmp.MobileAddress;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.xgp.hub.config.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/** Creates a fully hydrated Router instance from a config file and service loader. */
@Slf4j
public class Bootstrap {

  private final Router router;

  public Bootstrap(File configFile) throws IOException {
    log.info("Starting Bootstrap...");

    // load the config file
    log.info("Loading config from file {}", configFile);
    ObjectMapper mapper = buildMapper();
    Config config = mapper.readValue(configFile, Config.class);

    // make a Router
    router = new Router();
    router.setBaseUrl(config.getBaseUrl());
    router.setCallbackUrl(config.getCallbackUrl());
    router.setServerInterface(config.getServerInterface());
    
    // make a map of the ProviderConfigs
    Map<String, ProviderConfig> providerConfigs =
        config.getProviders().stream()
            .collect(Collectors.toMap(ProviderConfig::getType, Function.identity()));

    // load the Provider SPI implementations
    ServiceLoader<Provider> loader = ServiceLoader.load(Provider.class);
    Map<String, Provider> providers = new HashMap<String, Provider>();
    for (Provider p : loader) {
      ProviderConfig c = providerConfigs.get(p.getType());
      log.info(
          "Loading provider {} with config {}",
          p.getType(),
          mapper.writeValueAsString(c)); // todo get rid of this to avoid un/pw in the logs
      if (c.getDefault() != null && c.getDefault()) {
        log.info("Selected default provider as {}", c.getType());
        router.setDefaultProvider(c.getType());
      }
      p.configure(c);
      p.router(router);
      providers.put(p.getType(), p);
    }
    router.setProviderClientMap(providers);

    // load the address mappings
    final Map<MobileAddress, String> mappings = new HashMap<MobileAddress, String>();
    config.getMappings().stream()
        .forEach(
            m ->
                m.getAddresses().stream()
                    .forEach(
                        a -> {
                          log.info(
                              "Mapping {} ({}) to {}", a.getAddress(), a.getType(), m.getType());
                          mappings.put(a, m.getType());
                        }));
    ProviderMap providerMap =
        new ProviderMap() {
          @Override
          public String getProviderFor(MobileAddress address) {
            return mappings.get(address);
          }
        };
    router.setProviderMap(providerMap);

    log.info("...Completed Bootstrap");
  }

  public Router getRouter() {
    return this.router;
  }

  private static ObjectMapper buildMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.setVisibility(
        mapper
            .getSerializationConfig()
            .getDefaultVisibilityChecker()
            .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
            .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
            .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
            .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
    // mixins
    mapper.addMixIn(MobileAddress.class, MobileAddressMixin.class);
    return mapper;
  }
}
