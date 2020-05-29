package com.github.xgp.hub;

import com.github.xgp.hub.twilio.server.*;
import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationPath("/2010-04-01")
public class Hub extends ResourceConfig {

  public static class HubBinder extends AbstractBinder {
    @Override
    protected void configure() {
      bind(MessagingService.class).to(AccountsApiService.class).in(Singleton.class);
    }
  }

  public Hub() {
    log.info("Initializing Hub...");
    register(new HubBinder());
    packages("com.github.xgp.hub.twilio.server");
  }
}
