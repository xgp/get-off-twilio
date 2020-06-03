package com.github.xgp.hub;

import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliveryReportRequest;
import com.github.xgp.hub.config.ProviderConfig;

public abstract class AbstractProvider implements Provider {

  protected ProviderConfig config;
  protected Router router;

  @Override
  public abstract String getType();

  @Override
  public void configure(ProviderConfig config) {
    this.config = config;
  }

  @Override
  public void router(Router router) {
    this.router = router;
  }

  @Override
  public abstract ClientApi createClient();

  @Override
  public abstract Object getMoResource(DeliverRequest deliver);

  @Override
  public abstract Object getDlrResource(DeliveryReportRequest dlr);
}
