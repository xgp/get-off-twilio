package com.github.xgp.hub.sinch.client;

import com.cloudhopper.sxmp.DeliveryStatus;
import com.cloudhopper.sxmp.SubmitRequest;
import com.cloudhopper.sxmp.SubmitResponse;
import com.clxcommunications.xms.ApiConnection;
import com.clxcommunications.xms.BatchDeliveryReportParams;
import com.clxcommunications.xms.ClxApi;
import com.clxcommunications.xms.ErrorResponseException;
import com.clxcommunications.xms.api.BatchDeliveryReport;
import com.clxcommunications.xms.api.BatchId;
import com.clxcommunications.xms.api.MtBatchTextSmsCreate;
import com.clxcommunications.xms.api.MtBatchTextSmsResult;
import com.clxcommunications.xms.api.ReportType;
import com.github.xgp.hub.ClientApi;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.config.ProviderConfig;
import com.github.xgp.hub.sinch.SinchProvider;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import java.net.URI;
import java.net.URISyntaxException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SinchClientApi implements ClientApi {

  private final String spid;
  private final String token;
  private final Router router;

  public SinchClientApi(ProviderConfig config, Router router) {
    this.spid = config.getCredentials().getUsername();
    this.token = config.getCredentials().getPassword();
    this.router = router;
  }

  @Override
  public SubmitResponse sendMessage(SubmitRequest submit) throws Exception {
    log.info("Sending message {}", submit);
    SubmitResponse response = submit.createResponse();
    try (ApiConnection conn = ApiConnection.builder().servicePlanId(spid).token(token).start()) {
      MtBatchTextSmsResult batch = conn.createBatch(submitToMtBatchText(submit));
      router.setTicketId(response, SinchProvider.PROVIDER_ID, batch.id().toString());
    } catch (ErrorResponseException ere) {
      response.setErrorCode(new Integer(ere.getCode())); // TODO convert to internal type
      response.setErrorMessage(ere.getText()); // TODO convert to internal type
    } catch (Exception e) {
      log.error("Error sending message to Sinch", e);
      // TODO generic exception error into response
    }
    return response;
  }

  MtBatchTextSmsCreate submitToMtBatchText(SubmitRequest submit) {
    MtBatchTextSmsCreate.Builder builder =
        ClxApi.batchTextSms()
            .sender(submit.getSourceAddress().getAddress())
            .addRecipient(submit.getDestinationAddress().getAddress())
            .body(submit.getText());
    if (submit.getDeliveryReport() != null
        && submit.getDeliveryReport()
        && submit.getOptionalParams() != null) {
      String callbackUrl = router.getInternalCallbackUrl(submit, SinchProvider.PROVIDER_ID);
      log.info("Using callbackUrl {}", callbackUrl);
      try {
        builder.callbackUrl(new URI(callbackUrl)).deliveryReport(ReportType.FULL);
      } catch (URISyntaxException e) {
        log.warn("Callback URL was malformed. Ignoring.", e);
      }
    }
    return builder.build();
  }

  @Override
  public DeliveryReportRequest getMessageStatus(String id) throws Exception {
    DeliveryReportRequest request = new DeliveryReportRequest();
    request.setTicketId(id);
    try (ApiConnection conn = ApiConnection.builder().servicePlanId(spid).token(token).start()) {
      BatchDeliveryReport report =
          conn.fetchDeliveryReport(
              BatchId.of(id), BatchDeliveryReportParams.builder().fullReport().build());
      request.setStatus(
          new DeliveryStatus(
              report.statuses().get(0).code(),
              report.statuses().get(0).status().status())); // TODO convert to internal type
    } catch (ErrorResponseException ere) {
      request.setMessageErrorCode(new Integer(ere.getCode())); // TODO convert to internal type
    } catch (Exception e) {
      log.error("Error sending message to Sinch", e);
      // TODO generic exception error into response
    }
    return request;
  }
}
