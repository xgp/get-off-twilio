package com.github.xgp.hub;

import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliveryReportRequest;
import com.github.xgp.hub.config.ProviderConfig;

public interface Provider {
  String getType();

  void configure(ProviderConfig config);

  void router(Router router);

  ClientApi createClient();

  Object getMoResource(DeliverRequest deliver);

  Object getDlrResource(DeliveryReportRequest dlr);
}
