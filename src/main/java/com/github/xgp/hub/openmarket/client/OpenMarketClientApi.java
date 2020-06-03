package com.github.xgp.hub.openmarket.client;

import com.cloudhopper.sxmp.DeliveryReportRequest;
import com.cloudhopper.sxmp.SubmitRequest;
import com.cloudhopper.sxmp.SubmitResponse;
import com.github.xgp.hub.ClientApi;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.config.ProviderConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenMarketClientApi implements ClientApi {

  private final GlobalSmsClient client;
  private final Router router;

  public OpenMarketClientApi(ProviderConfig config, Router router) {
    this.client =
        new GlobalSmsClient(
            config.getCredentials().getUsername(), config.getCredentials().getPassword());
    this.router = router;
  }

  @Override
  public SubmitResponse sendMessage(SubmitRequest submit) throws Exception {

    //  public GlobalSmsResponse<String> sendSms(MobileTerminate mt) throws RejectedException {

    return null;
  }

  @Override
  public DeliveryReportRequest getMessageStatus(String id) throws Exception {

    //   public GlobalSmsResponse<MtStatus> getSmsStatus(String ticketId) throws RejectedException {

    return null;
  }
}
