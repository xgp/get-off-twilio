package com.github.xgp.hub.twilio.server;

import com.github.xgp.hub.jaxrs.NotImplementedException;
import javax.validation.constraints.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessagingService extends DefaultAccountsApiService {

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

  //      description = "Returns a single message specified by the provided {MessageSid}. ",
  @Override
  public Response accountsAccountSidMessagesMessageSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String messageSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesMessageSidmediaTypeExtensionGet");
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

  //          "To send a new outgoing message, make an HTTP POST to your Messages list resource
  // URI",
  @Override
  public Response accountsAccountSidMessagesmediaTypeExtensionPost(
      String to,
      String from,
      String messagingServiceSid,
      String body,
      String mediaUrl,
      String accountSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesmediaTypeExtensionPost");
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
