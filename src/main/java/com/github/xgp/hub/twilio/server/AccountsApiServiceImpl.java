package com.github.xgp.hub.twilio.server;

import com.github.xgp.hub.jaxrs.NotImplementedException;
import javax.validation.constraints.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccountsApiServiceImpl implements AccountsApiService {

  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String applicationSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String applicationSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String applicationSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidApplicationsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidApplicationsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidApplicationsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidApplicationsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String connectAppSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet(
      String accountSid,
      @Size(min = 2, max = 2) String isoCountryCode,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet(
      String accountSid,
      @Size(min = 2, max = 2) String isoCountryCode,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet(
          String accountSid,
          @Size(min = 2, max = 2) String isoCountryCode,
          String mediaTypeExtension,
          SecurityContext securityContext) {
    log.info("accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet(
      String accountSid,
      String callSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet(
      String accountSid,
      String callSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidCallsCallSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidCallsCallSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidCallsCallSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidCallsCallSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidCallsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidCallsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidCallsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidCallsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete(
          String accountSid,
          String conferenceSid,
          String mediaTypeExtension,
          String callSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet(
          String accountSid,
          String conferenceSid,
          String mediaTypeExtension,
          String callSid,
          SecurityContext securityContext) {
    log.info("accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost(
          String accountSid,
          String conferenceSid,
          String mediaTypeExtension,
          String callSid,
          SecurityContext securityContext) {
    log.info("accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet(
      String accountSid,
      String conferenceSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String conferenceSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidConferencesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidConferencesmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String connectAppSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String connectAppSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidConnectAppsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidConnectAppsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete(
          String accountSid,
          String mediaTypeExtension,
          String incomingPhoneNumberSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String incomingPhoneNumberSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost(
          String accountSid,
          String mediaTypeExtension,
          String incomingPhoneNumberSid,
          SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut(
      String accountSid,
      String mediaTypeExtension,
      String incomingPhoneNumberSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet(
      String accountSid,
      String messageSid,
      String mediaTypeExtension,
      String mediaSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet(
      String accountSid,
      String messageSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidMessagesMessageSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String messageSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesMessageSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidMessagesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidMessagesmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

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

  public Response accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String notificationSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String notificationSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidNotificationsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidNotificationsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String queueSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String queueSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String queueSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesQueueSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidQueuesmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidQueuesmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String recordingSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String recordingSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String recordingSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidRecordingsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidRecordingsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete(
          String accountSid,
          String clSid,
          String mediaTypeExtension,
          String credentialSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet(
          String accountSid,
          String clSid,
          String mediaTypeExtension,
          String credentialSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost(
          String accountSid,
          String clSid,
          String mediaTypeExtension,
          String credentialSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet(
      String accountSid, String clSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost(
      String accountSid, String clSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String clSid, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String clSid, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String clSid, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPCredentialListsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPCredentialListsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPCredentialListsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPCredentialListsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          String clSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext) {
    log.info("accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          String alSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          String alSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String sipDomainSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String sipDomainSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String sipDomainSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPDomainsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPDomainsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPDomainsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPDomainsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete(
          String accountSid,
          String mediaTypeExtension,
          String ipAccessControlListSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet(
          String accountSid,
          String mediaTypeExtension,
          String ipAccessControlListSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost(
          String accountSid,
          String mediaTypeExtension,
          String ipAccessControlListSid,
          SecurityContext securityContext) {
    log.info(
        "accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String shortCodeSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String shortCodeSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidSMSShortCodesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidSMSShortCodesmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String transcriptionSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String transcriptionSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidTranscriptionsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidTranscriptionsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String subresource,
      SecurityContext securityContext) {
    log.info("accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidUsageRecordsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidUsageRecordsmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String usageTriggerSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String usageTriggerSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String usageTriggerSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidUsageTriggersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidUsageTriggersmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidUsageTriggersmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext) {
    log.info("accountsAccountSidUsageTriggersmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidmediaTypeExtensionGet(
      String mediaTypeExtension,
      @Size(min = 34, max = 34) String accountSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidmediaTypeExtensionGet");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidmediaTypeExtensionPost(
      String mediaTypeExtension,
      @Size(min = 34, max = 34) String accountSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidmediaTypeExtensionPost");
    throw new NotImplementedException();
  }

  public Response accountsAccountSidmediaTypeExtensionPut(
      String mediaTypeExtension,
      @Size(min = 34, max = 34) String accountSid,
      SecurityContext securityContext) {
    log.info("accountsAccountSidmediaTypeExtensionPut");
    throw new NotImplementedException();
  }
}
