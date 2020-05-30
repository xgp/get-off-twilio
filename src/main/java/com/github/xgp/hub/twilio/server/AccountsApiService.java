package com.github.xgp.hub.twilio.server;

import javax.validation.constraints.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public interface AccountsApiService {
  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String applicationSid,
      SecurityContext securityContext);

  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String applicationSid,
      SecurityContext securityContext);

  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String applicationSid,
      SecurityContext securityContext);

  public Response accountsAccountSidApplicationsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidApplicationsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String connectAppSid,
      SecurityContext securityContext);

  public Response accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet(
      String accountSid,
      @Size(min = 2, max = 2) String isoCountryCode,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet(
      String accountSid,
      @Size(min = 2, max = 2) String isoCountryCode,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response
      accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet(
          String accountSid,
          @Size(min = 2, max = 2) String isoCountryCode,
          String mediaTypeExtension,
          SecurityContext securityContext);

  public Response accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet(
      String accountSid,
      String callSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet(
      String accountSid,
      String callSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidCallsCallSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext);

  public Response accountsAccountSidCallsCallSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext);

  public Response accountsAccountSidCallsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidCallsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete(
          String accountSid,
          String conferenceSid,
          String mediaTypeExtension,
          String callSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet(
          String accountSid,
          String conferenceSid,
          String mediaTypeExtension,
          String callSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost(
          String accountSid,
          String conferenceSid,
          String mediaTypeExtension,
          String callSid,
          SecurityContext securityContext);

  public Response accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet(
      String accountSid,
      String conferenceSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String conferenceSid,
      SecurityContext securityContext);

  public Response accountsAccountSidConferencesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String connectAppSid,
      SecurityContext securityContext);

  public Response accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String connectAppSid,
      SecurityContext securityContext);

  public Response accountsAccountSidConnectAppsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete(
          String accountSid,
          String mediaTypeExtension,
          String incomingPhoneNumberSid,
          SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String incomingPhoneNumberSid,
      SecurityContext securityContext);

  public Response
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost(
          String accountSid,
          String mediaTypeExtension,
          String incomingPhoneNumberSid,
          SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut(
      String accountSid,
      String mediaTypeExtension,
      String incomingPhoneNumberSid,
      SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet(
      String accountSid,
      String messageSid,
      String mediaTypeExtension,
      String mediaSid,
      SecurityContext securityContext);

  public Response accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet(
      String accountSid,
      String messageSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidMessagesMessageSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String messageSid,
      SecurityContext securityContext);

  public Response accountsAccountSidMessagesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidMessagesmediaTypeExtensionPost(
      String to,
      String from,
      String messagingServiceSid,
      String body,
      String mediaUrl,
      String accountSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String notificationSid,
      SecurityContext securityContext);

  public Response accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String notificationSid,
      SecurityContext securityContext);

  public Response accountsAccountSidNotificationsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext);

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext);

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext);

  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut(
      String accountSid,
      String mediaTypeExtension,
      String outgoingCallerIdSid,
      SecurityContext securityContext);

  public Response accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      String callSid,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet(
      String accountSid,
      String queueSid,
      String mediaTypeExtension,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String queueSid,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String queueSid,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String queueSid,
      SecurityContext securityContext);

  public Response accountsAccountSidQueuesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidQueuesmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String recordingSid,
      SecurityContext securityContext);

  public Response accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String recordingSid,
      SecurityContext securityContext);

  public Response accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String recordingSid,
      SecurityContext securityContext);

  public Response accountsAccountSidRecordingsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete(
          String accountSid,
          String clSid,
          String mediaTypeExtension,
          String credentialSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet(
          String accountSid,
          String clSid,
          String mediaTypeExtension,
          String credentialSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost(
          String accountSid,
          String clSid,
          String mediaTypeExtension,
          String credentialSid,
          SecurityContext securityContext);

  public Response accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet(
      String accountSid, String clSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost(
      String accountSid, String clSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String clSid, SecurityContext securityContext);

  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String clSid, SecurityContext securityContext);

  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String clSid, SecurityContext securityContext);

  public Response accountsAccountSidSIPCredentialListsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidSIPCredentialListsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          String clSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          String alSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          String alSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost(
          String accountSid,
          String sipDomainSid,
          String mediaTypeExtension,
          SecurityContext securityContext);

  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String sipDomainSid,
      SecurityContext securityContext);

  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String sipDomainSid,
      SecurityContext securityContext);

  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String sipDomainSid,
      SecurityContext securityContext);

  public Response accountsAccountSidSIPDomainsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidSIPDomainsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete(
          String accountSid,
          String mediaTypeExtension,
          String ipAccessControlListSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet(
          String accountSid,
          String mediaTypeExtension,
          String ipAccessControlListSid,
          SecurityContext securityContext);

  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost(
          String accountSid,
          String mediaTypeExtension,
          String ipAccessControlListSid,
          SecurityContext securityContext);

  public Response accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String shortCodeSid,
      SecurityContext securityContext);

  public Response accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String shortCodeSid,
      SecurityContext securityContext);

  public Response accountsAccountSidSMSShortCodesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String transcriptionSid,
      SecurityContext securityContext);

  public Response accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String transcriptionSid,
      SecurityContext securityContext);

  public Response accountsAccountSidTranscriptionsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String subresource,
      SecurityContext securityContext);

  public Response accountsAccountSidUsageRecordsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete(
      String accountSid,
      String mediaTypeExtension,
      String usageTriggerSid,
      SecurityContext securityContext);

  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet(
      String accountSid,
      String mediaTypeExtension,
      String usageTriggerSid,
      SecurityContext securityContext);

  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost(
      String accountSid,
      String mediaTypeExtension,
      String usageTriggerSid,
      SecurityContext securityContext);

  public Response accountsAccountSidUsageTriggersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidUsageTriggersmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsAccountSidmediaTypeExtensionGet(
      String mediaTypeExtension,
      @Size(min = 34, max = 34) String accountSid,
      SecurityContext securityContext);

  public Response accountsAccountSidmediaTypeExtensionPost(
      String mediaTypeExtension,
      @Size(min = 34, max = 34) String accountSid,
      SecurityContext securityContext);

  public Response accountsAccountSidmediaTypeExtensionPut(
      String mediaTypeExtension,
      @Size(min = 34, max = 34) String accountSid,
      SecurityContext securityContext);
}
