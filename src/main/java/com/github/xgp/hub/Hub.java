package com.github.xgp.hub;

import com.github.xgp.hub.twilio.server.*;
import java.io.File;
import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

@Slf4j
@ApplicationPath("")
public class Hub extends ResourceConfig {

  public Hub() throws Exception {
    log.info("Initializing Hub...");
    final Bootstrap bootstrap =
        new Bootstrap(new File("config.json"));
    register(
        new AbstractBinder() {
          @Override
          protected void configure() {
            bind(MessagingService.class).to(AccountsApiService.class).in(Singleton.class);
            bind(bootstrap.getRouter()).to(Router.class);
          }
        });
    packages(
        "com.github.xgp.hub"); // recursive by default. use packages(boolean recursive, String...
                               // packages) to limit. Can also use register(Class) to do one at a
                               // time
  }
}
