package com.github.xgp.hub.sinch;

import com.cloudhopper.sxmp.DeliverRequest;
import com.github.xgp.hub.AbstractProvider;
import com.github.xgp.hub.ClientApi;
import com.github.xgp.hub.Provider;
import com.github.xgp.hub.sinch.client.SinchClientApi;
import com.github.xgp.hub.sinch.server.SinchDlrResource;
import com.github.xgp.hub.sinch.server.SinchMoResource;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import com.google.auto.service.AutoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AutoService(Provider.class)
public class SinchProvider extends AbstractProvider {

  public static final String PROVIDER_ID = "sinch";

  public String getType() {
    return PROVIDER_ID;
  }

  public ClientApi createClient() {
    return new SinchClientApi(config, router);
  }

  public Object getMoResource(DeliverRequest deliver) {
    return new SinchMoResource(config, router, deliver);
  }

  public Object getDlrResource(DeliveryReportRequest dlr) {
    return new SinchDlrResource(config, router, dlr);
  }
}
