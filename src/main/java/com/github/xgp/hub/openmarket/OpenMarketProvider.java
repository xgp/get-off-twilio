package com.github.xgp.hub.openmarket;

import com.cloudhopper.sxmp.DeliverRequest;
import com.github.xgp.hub.AbstractProvider;
import com.github.xgp.hub.ClientApi;
import com.github.xgp.hub.Provider;
import com.github.xgp.hub.openmarket.client.OpenMarketClientApi;
import com.github.xgp.hub.openmarket.server.OpenMarketDlrResource;
import com.github.xgp.hub.openmarket.server.OpenMarketMoResource;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import com.google.auto.service.AutoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AutoService(Provider.class)
public class OpenMarketProvider extends AbstractProvider {

  public String getType() {
    return "openmarket";
  }

  public ClientApi createClient() {
    return new OpenMarketClientApi(config, router);
  }

  public Object getMoResource(DeliverRequest deliver) {
    return new OpenMarketMoResource(config, router, deliver);
  }

  public Object getDlrResource(DeliveryReportRequest dlr) {
    return new OpenMarketDlrResource(config, router, dlr);
  }
}
