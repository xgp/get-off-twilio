package com.github.xgp.hub.sinch;

import com.github.xgp.hub.sinch.client.SinchClientApi;
import com.github.xgp.hub.sinch.server.SinchMoResource;
import com.github.xgp.hub.sinch.server.SinchDlrResource;
import com.github.xgp.hub.ClientApi;
import com.github.xgp.hub.AbstractProvider;
import com.github.xgp.hub.Provider;
import com.github.xgp.hub.Router;
import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliveryReportRequest;
import com.github.xgp.hub.config.ProviderConfig;
import com.google.auto.service.AutoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AutoService(Provider.class)
public class SinchProvider extends AbstractProvider {

  public String getType() {
    return "sinch";
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
