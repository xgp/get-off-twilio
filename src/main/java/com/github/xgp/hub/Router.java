package com.github.xgp.hub;

import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliverResponse;
import com.cloudhopper.sxmp.DeliveryReportRequest;
import com.cloudhopper.sxmp.DeliveryReportResponse;
import com.cloudhopper.sxmp.SubmitRequest;
import com.cloudhopper.sxmp.SubmitResponse;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

public class Router implements ClientApi, CallbackApi {

  @Setter private String defaultProvider;
  @Setter private CallbackApi apiProvider;
  @Setter private ProviderMap providerMap;
  @Getter @Setter private Map<String, Provider> providerClientMap;

  @Override
  public SubmitResponse sendMessage(SubmitRequest submit) throws Exception {
    String provider = providerMap.getProviderFor(submit.getSourceAddress());
    ClientApi client = providerClientMap.get(provider).createClient();
    return client.sendMessage(submit);
  }

  @Override
  public DeliveryReportRequest getMessageStatus(String id) throws Exception {
    String p = defaultProvider;
    if (id.indexOf('_') > 0) {
      p = id.substring(0, id.indexOf('_'));
      id = id.substring(id.indexOf('_'));
    }
    ClientApi client = providerClientMap.get(p).createClient();
    return client.getMessageStatus(id);
  }

  String getProviderFromId(String id) {
    if (id.indexOf('_') > 0) return id.substring(0, id.indexOf('_'));
    else return defaultProvider;
  }

  @Override
  public DeliverResponse onMessage(DeliverRequest deliver) {
    return apiProvider.onMessage(deliver);
  }

  @Override
  public DeliveryReportResponse onDeliveryReceipt(DeliveryReportRequest dlr) {
    return apiProvider.onDeliveryReceipt(dlr);
  }
}
