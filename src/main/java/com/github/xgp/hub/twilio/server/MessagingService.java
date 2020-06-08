package com.github.xgp.hub.twilio.server;

import com.cloudhopper.sxmp.MobileAddress;
import com.cloudhopper.sxmp.SubmitRequest;
import com.cloudhopper.sxmp.SubmitResponse;
import com.github.xgp.hub.Constants;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.jaxrs.NotImplementedException;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import com.github.xgp.hub.twilio.model.Message;
import javax.validation.constraints.*;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessagingService extends DefaultAccountsApiService {

  public static final String PROVIDER_ID = "twilio";

  private final Router router;

  @javax.inject.Inject
  public MessagingService(Router router) {
    this.router = router;
    log.info("MessagingService created");
  }

  /** "To send a new outgoing message, make an HTTP POST to your Messages list resource URI" */
  @Override
  public Response accountsAccountSidMessagesmediaTypeExtensionPost(
      String to,
      String from,
      String messagingServiceSid,
      String body,
      String mediaUrl,
      String statusCallback,
      String accountSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info(
        "accountsAccountSidMessagesmediaTypeExtensionPost -> to:{}, from:{}, body:{}",
        to,
        from,
        body);

    SubmitRequest request = router.createSubmitRequest(PROVIDER_ID);

    try {
      request.setText(body);
      if (from.startsWith("+")) { // checking for short code hack for now
        request.setSourceAddress(new MobileAddress(MobileAddress.Type.INTERNATIONAL, from));
      } else {
        request.setSourceAddress(new MobileAddress(MobileAddress.Type.NETWORK, from));
      }
      request.setDestinationAddress(new MobileAddress(MobileAddress.Type.INTERNATIONAL, to));
      if (statusCallback != null && !"".equals(statusCallback)) {
        request.getOptionalParams().put(Constants.PARAM_KEY_ORIGINAL_CALLBACK_URL, statusCallback);
      }

      SubmitResponse response = router.sendMessage(request);

      Message message =
          new Message()
              .accountSid(accountSid)
              .apiVersion("2010-04-01")
              .dateCreated("todo")
              .dateSent("todo")
              .dateUpdated("todo")
              .direction("outbound-api")
              .from(from)
              .to(to)
              .numMedia("0")
              .numSegments("1")
              .sid(response.getTicketId())
              .status("sent")
              .uri(
                  String.format(
                      "/2010-04-01/Accounts/%s/Messages/%s.json",
                      accountSid, response.getTicketId()));

      return Response.status(201).entity(message).build();
    } catch (Exception e) {
      log.error("Error sending message", e);
      throw new WebApplicationException(e);
    }
  }

  /** "Returns a single message specified by the provided {MessageSid}." */
  @Override
  public Response accountsAccountSidMessagesMessageSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String messageSid,
      SecurityContext securityContext) {
    log.info(
        "accountsAccountSidMessagesMessageSidmediaTypeExtensionGet -> messageSid:{}", messageSid);

    try {
      DeliveryReportRequest dlr = router.getMessageStatus(messageSid);

      Message message =
          new Message()
              .accountSid(accountSid)
              .apiVersion("2010-04-01")
              .dateCreated("todo")
              .dateSent("todo")
              .dateUpdated("todo")
              .direction("outbound-api")
              .from(dlr.getSourceAddress().getAddress())
              .to(dlr.getDestinationAddress().getAddress())
              .numMedia("0")
              .numSegments("1")
              .sid(dlr.getTicketId())
              .status(dlr.getStatus().getMessage()) // todo convert to twilio types
              .uri(
                  String.format(
                      "/2010-04-01/Accounts/%s/Messages/%s.json", accountSid, dlr.getTicketId()));

      return Response.status(200).entity(message).build();
    } catch (Exception e) {
      throw new WebApplicationException(e);
    }
  }

  //////////////////////////////////////
  // TODO do we need to implement these?

  @Override
  public Response accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet(
      String accountSid,
      String messageSid,
      String mediaTypeExtension,
      String mediaSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  //      description = "Returns a list of media associated with your message.",
  @Override
  public Response accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet(
      String accountSid,
      String messageSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  //     "Returns a list of messages associated with your account. The list includes paging
  // information.",
  @Override
  public Response accountsAccountSidMessagesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  //      description = "Get a single message.",
  @Override
  public Response accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String shortCodeSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }
}
