package com.github.xgp.hub.twilio.client.api;

import com.github.xgp.hub.twilio.client.ApiClient;
import com.github.xgp.hub.twilio.client.ApiException;
import com.github.xgp.hub.twilio.client.Configuration;
import com.github.xgp.hub.twilio.client.Pair;
import com.github.xgp.hub.twilio.model.Account;
import com.github.xgp.hub.twilio.model.Accounts;
import com.github.xgp.hub.twilio.model.Application;
import com.github.xgp.hub.twilio.model.Applications;
import com.github.xgp.hub.twilio.model.AuthApp;
import com.github.xgp.hub.twilio.model.AuthApps;
import com.github.xgp.hub.twilio.model.AvailablePhoneNumbers;
import com.github.xgp.hub.twilio.model.CallInstance;
import com.github.xgp.hub.twilio.model.Calls;
import com.github.xgp.hub.twilio.model.Conference;
import com.github.xgp.hub.twilio.model.Conferences;
import com.github.xgp.hub.twilio.model.ConnectApp;
import com.github.xgp.hub.twilio.model.ConnectApps;
import com.github.xgp.hub.twilio.model.Credential;
import com.github.xgp.hub.twilio.model.CredentialList;
import com.github.xgp.hub.twilio.model.CredentialListMappings;
import com.github.xgp.hub.twilio.model.CredentialLists;
import com.github.xgp.hub.twilio.model.Credentials;
import com.github.xgp.hub.twilio.model.Domain;
import com.github.xgp.hub.twilio.model.Domains;
import com.github.xgp.hub.twilio.model.IncomingCall;
import com.github.xgp.hub.twilio.model.IncomingCalls;
import com.github.xgp.hub.twilio.model.IpAccessControlListMapping;
import com.github.xgp.hub.twilio.model.IpAddress;
import com.github.xgp.hub.twilio.model.IpAddresses;
import com.github.xgp.hub.twilio.model.Media;
import com.github.xgp.hub.twilio.model.MediaList;
import com.github.xgp.hub.twilio.model.Member;
import com.github.xgp.hub.twilio.model.Members;
import com.github.xgp.hub.twilio.model.Message;
import com.github.xgp.hub.twilio.model.Messages;
import com.github.xgp.hub.twilio.model.Notification;
import com.github.xgp.hub.twilio.model.Notifications;
import com.github.xgp.hub.twilio.model.OutCallerIds;
import com.github.xgp.hub.twilio.model.OutgoingCallerId;
import com.github.xgp.hub.twilio.model.Participant;
import com.github.xgp.hub.twilio.model.Participants;
import com.github.xgp.hub.twilio.model.PhoneMobileNumbers;
import com.github.xgp.hub.twilio.model.PhoneTollFreeNumbers;
import com.github.xgp.hub.twilio.model.Queue;
import com.github.xgp.hub.twilio.model.Queues;
import com.github.xgp.hub.twilio.model.Recordings;
import com.github.xgp.hub.twilio.model.ShortCode;
import com.github.xgp.hub.twilio.model.ShortCodes;
import com.github.xgp.hub.twilio.model.Transcription;
import com.github.xgp.hub.twilio.model.Transcriptions;
import com.github.xgp.hub.twilio.model.UsageRecords;
import com.github.xgp.hub.twilio.model.UsageTrigger;
import com.github.xgp.hub.twilio.model.UsageTriggers;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-05-22T20:36:25.160+02:00[Europe/Paris]")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete this application.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param applicationSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String applicationSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'applicationSid' is set
    if (applicationSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'applicationSid' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Applications/{ApplicationSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ApplicationSid" + "\\}",
                apiClient.escapeString(applicationSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get application instance resource.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param applicationSid (required)
   * @return Application
   * @throws ApiException if fails to make API call
   */
  public Application accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String applicationSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'applicationSid' is set
    if (applicationSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'applicationSid' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Applications/{ApplicationSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ApplicationSid" + "\\}",
                apiClient.escapeString(applicationSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Application> localVarReturnType = new GenericType<Application>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Tries to update the application&#x27;s properties, and returns the updated resource
   * representation if successful. The returned response is identical to that returned above when
   * making a GET request.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param applicationSid (required)
   * @return Application
   * @throws ApiException if fails to make API call
   */
  public Application accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String applicationSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'applicationSid' is set
    if (applicationSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'applicationSid' when calling accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Applications/{ApplicationSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ApplicationSid" + "\\}",
                apiClient.escapeString(applicationSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Application> localVarReturnType = new GenericType<Application>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of Application resource representations, each representing an application within
   * your account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Applications
   * @throws ApiException if fails to make API call
   */
  public Applications accountsAccountSidApplicationsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidApplicationsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidApplicationsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Applications{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Applications> localVarReturnType = new GenericType<Applications>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Creates a new application within your account.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidApplicationsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidApplicationsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidApplicationsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Applications{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get the properties of the authorized application.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param connectAppSid (required)
   * @return AuthApp
   * @throws ApiException if fails to make API call
   */
  public AuthApp accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String connectAppSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'connectAppSid' is set
    if (connectAppSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'connectAppSid' when calling accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/AuthorizedConnectApps/{ConnectAppSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ConnectAppSid" + "\\}", apiClient.escapeString(connectAppSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<AuthApp> localVarReturnType = new GenericType<AuthApp>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of Connect App resource representations, each representing a Connect App
   * you&#x27;ve authorized to access your account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return AuthApps
   * @throws ApiException if fails to make API call
   */
  public AuthApps accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/AuthorizedConnectApps{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<AuthApps> localVarReturnType = new GenericType<AuthApps>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of local AvailablePhoneNumber resource representations that match the specified
   * filters, each representing a phone number tha is currently available for provisioning within
   * your account.
   *
   * @param accountSid (required)
   * @param isoCountryCode ISO 3166-1 alpha-2. (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return AvailablePhoneNumbers
   * @throws ApiException if fails to make API call
   */
  public AvailablePhoneNumbers
      accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet(
          String accountSid, String isoCountryCode, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet");
    }
    // verify the required parameter 'isoCountryCode' is set
    if (isoCountryCode == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'isoCountryCode' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/AvailablePhoneNumbers/{IsoCountryCode}/Local{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IsoCountryCode" + "\\}", apiClient.escapeString(isoCountryCode.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<AvailablePhoneNumbers> localVarReturnType =
        new GenericType<AvailablePhoneNumbers>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of mobile AvailablePhoneNumber resource representations that match the specified
   * filters, each representing a phone number that is currently available for provisioning within
   * your account.
   *
   * @param accountSid (required)
   * @param isoCountryCode ISO 3166-1 alpha-2. (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return PhoneMobileNumbers
   * @throws ApiException if fails to make API call
   */
  public PhoneMobileNumbers
      accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet(
          String accountSid, String isoCountryCode, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet");
    }
    // verify the required parameter 'isoCountryCode' is set
    if (isoCountryCode == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'isoCountryCode' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/AvailablePhoneNumbers/{IsoCountryCode}/Mobile{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IsoCountryCode" + "\\}", apiClient.escapeString(isoCountryCode.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<PhoneMobileNumbers> localVarReturnType = new GenericType<PhoneMobileNumbers>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of toll-free AvailablePhoneNumber elements that match the specified filters,
   * each representing a phone number that is currently available for provisioning within your
   * account. To provision an available phone number, POST the number to the IncomingPhoneNumbers
   * resource.
   *
   * @param accountSid (required)
   * @param isoCountryCode ISO 3166-1 alpha-2. (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return PhoneTollFreeNumbers
   * @throws ApiException if fails to make API call
   */
  public PhoneTollFreeNumbers
      accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet(
          String accountSid, String isoCountryCode, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet");
    }
    // verify the required parameter 'isoCountryCode' is set
    if (isoCountryCode == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'isoCountryCode' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/AvailablePhoneNumbers/{IsoCountryCode}/TollFree{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IsoCountryCode" + "\\}", apiClient.escapeString(isoCountryCode.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<PhoneTollFreeNumbers> localVarReturnType =
        new GenericType<PhoneTollFreeNumbers>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of all AvailablePhoneNumber subresources for your account by ISO Country. For
   * full information about our phone number support, see our Phone Number CSV
   * (http://www.twilio.com/resources/rates/international-phone-number-rates.csv).
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return AvailablePhoneNumbers
   * @throws ApiException if fails to make API call
   */
  public AvailablePhoneNumbers accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/AvailablePhoneNumbers{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<AvailablePhoneNumbers> localVarReturnType =
        new GenericType<AvailablePhoneNumbers>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of notifications generated for an account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param callSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Notifications
   * @throws ApiException if fails to make API call
   */
  public Notifications accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet(
      String accountSid, String callSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Calls/{CallSid}/Notifications{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Notifications> localVarReturnType = new GenericType<Notifications>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of Recording resource representations, each representing a recording generated
   * during the course of a phone call.
   *
   * @param accountSid (required)
   * @param callSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Recordings
   * @throws ApiException if fails to make API call
   */
  public Recordings accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet(
      String accountSid, String callSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Calls/{CallSid}/Recordings{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Recordings> localVarReturnType = new GenericType<Recordings>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns the single Call resource identified by {CallSid}.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param callSid (required)
   * @return CallInstance
   * @throws ApiException if fails to make API call
   */
  public CallInstance accountsAccountSidCallsCallSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String callSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidCallsCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidCallsCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidCallsCallSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Calls/{CallSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<CallInstance> localVarReturnType = new GenericType<CallInstance>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Modify a phone call.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param callSid (required)
   * @return CallInstance
   * @throws ApiException if fails to make API call
   */
  public CallInstance accountsAccountSidCallsCallSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String callSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidCallsCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidCallsCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidCallsCallSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Calls/{CallSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<CallInstance> localVarReturnType = new GenericType<CallInstance>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of phone calls made to and from the account identified by {AccountSid}.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Calls
   * @throws ApiException if fails to make API call
   */
  public Calls accountsAccountSidCallsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidCallsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidCallsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Calls{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Calls> localVarReturnType = new GenericType<Calls>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * To make a call, make an HTTP POST request. Initiate a new phone call.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidCallsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidCallsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidCallsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Calls{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Kick this participant from the conference.
   *
   * @param accountSid (required)
   * @param conferenceSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param callSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete(
      String accountSid, String conferenceSid, String mediaTypeExtension, String callSid)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'conferenceSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Conferences/{ConferenceSid}/Participants/{CallSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "ConferenceSid" + "\\}", apiClient.escapeString(conferenceSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a representation of this participant.
   *
   * @param accountSid (required)
   * @param conferenceSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param callSid (required)
   * @return Participant
   * @throws ApiException if fails to make API call
   */
  public Participant
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet(
          String accountSid, String conferenceSid, String mediaTypeExtension, String callSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'conferenceSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Conferences/{ConferenceSid}/Participants/{CallSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "ConferenceSid" + "\\}", apiClient.escapeString(conferenceSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Participant> localVarReturnType = new GenericType<Participant>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Updates the status of a participant.
   *
   * @param accountSid (required)
   * @param conferenceSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param callSid (required)
   * @return Participant
   * @throws ApiException if fails to make API call
   */
  public Participant
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost(
          String accountSid, String conferenceSid, String mediaTypeExtension, String callSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'conferenceSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Conferences/{ConferenceSid}/Participants/{CallSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "ConferenceSid" + "\\}", apiClient.escapeString(conferenceSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Participant> localVarReturnType = new GenericType<Participant>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns the list of participants in the conference identified by {ConferenceSid}.
   *
   * @param accountSid (required)
   * @param conferenceSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Participants
   * @throws ApiException if fails to make API call
   */
  public Participants accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet(
      String accountSid, String conferenceSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet");
    }
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'conferenceSid' when calling accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Conferences/{ConferenceSid}/Participants{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "ConferenceSid" + "\\}", apiClient.escapeString(conferenceSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Participants> localVarReturnType = new GenericType<Participants>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a representation of the conference identified by {ConferenceSid}.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param conferenceSid (required)
   * @return Conference
   * @throws ApiException if fails to make API call
   */
  public Conference accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String conferenceSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'conferenceSid' is set
    if (conferenceSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'conferenceSid' when calling accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Conferences/{ConferenceSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ConferenceSid" + "\\}", apiClient.escapeString(conferenceSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Conference> localVarReturnType = new GenericType<Conference>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of conferences within an account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Conferences
   * @throws ApiException if fails to make API call
   */
  public Conferences accountsAccountSidConferencesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConferencesmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConferencesmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Conferences{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Conferences> localVarReturnType = new GenericType<Conferences>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Get the properties of a Connect App.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param connectAppSid (required)
   * @return ConnectApp
   * @throws ApiException if fails to make API call
   */
  public ConnectApp accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String connectAppSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'connectAppSid' is set
    if (connectAppSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'connectAppSid' when calling accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/ConnectApps/{ConnectAppSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ConnectAppSid" + "\\}", apiClient.escapeString(connectAppSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<ConnectApp> localVarReturnType = new GenericType<ConnectApp>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Tries to update the Connect App&#x27;s properties, and returns the updated resource
   * representation if successful. The returned response is identical to that returned above when
   * making a GET request.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param connectAppSid (required)
   * @return ConnectApp
   * @throws ApiException if fails to make API call
   */
  public ConnectApp accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String connectAppSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'connectAppSid' is set
    if (connectAppSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'connectAppSid' when calling accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/ConnectApps/{ConnectAppSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ConnectAppSid" + "\\}", apiClient.escapeString(connectAppSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<ConnectApp> localVarReturnType = new GenericType<ConnectApp>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of Connect App resource representations, each representing a Connect App in your
   * account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return ConnectApps
   * @throws ApiException if fails to make API call
   */
  public ConnectApps accountsAccountSidConnectAppsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidConnectAppsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidConnectAppsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/ConnectApps{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<ConnectApps> localVarReturnType = new GenericType<ConnectApps>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Release this phone number from your account. Twilio will no longer answer calls to this number,
   * and you will stop being billed the monthly phone number fee. The phone number will eventually
   * be recycled and potentially given to another customer, so use with care. If you make a mistake,
   * contac us. We may be able to give you the number back.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param incomingPhoneNumberSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String incomingPhoneNumberSid)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'incomingPhoneNumberSid' is set
    if (incomingPhoneNumberSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incomingPhoneNumberSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IncomingPhoneNumberSid" + "\\}",
                apiClient.escapeString(incomingPhoneNumberSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get info about incoming call&#x27;s phone number.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param incomingPhoneNumberSid (required)
   * @return IncomingCall
   * @throws ApiException if fails to make API call
   */
  public IncomingCall
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet(
          String accountSid, String mediaTypeExtension, String incomingPhoneNumberSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'incomingPhoneNumberSid' is set
    if (incomingPhoneNumberSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incomingPhoneNumberSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IncomingPhoneNumberSid" + "\\}",
                apiClient.escapeString(incomingPhoneNumberSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IncomingCall> localVarReturnType = new GenericType<IncomingCall>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Tries to update the incoming phone number&#x27;s properties, and returns the updated resource
   * representation if successful. The returned response is identical to that returned above when
   * making a GET request.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param incomingPhoneNumberSid (required)
   * @return IncomingCall
   * @throws ApiException if fails to make API call
   */
  public IncomingCall
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost(
          String accountSid, String mediaTypeExtension, String incomingPhoneNumberSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'incomingPhoneNumberSid' is set
    if (incomingPhoneNumberSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incomingPhoneNumberSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IncomingPhoneNumberSid" + "\\}",
                apiClient.escapeString(incomingPhoneNumberSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IncomingCall> localVarReturnType = new GenericType<IncomingCall>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Tries to update the incoming phone number&#x27;s properties, and returns the updated resource
   * representation if successful. The returned response is identical to that returned above when
   * making a GET request.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param incomingPhoneNumberSid (required)
   * @return IncomingCall
   * @throws ApiException if fails to make API call
   */
  public IncomingCall
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut(
          String accountSid, String mediaTypeExtension, String incomingPhoneNumberSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut");
    }
    // verify the required parameter 'incomingPhoneNumberSid' is set
    if (incomingPhoneNumberSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'incomingPhoneNumberSid' when calling accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IncomingPhoneNumberSid" + "\\}",
                apiClient.escapeString(incomingPhoneNumberSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IncomingCall> localVarReturnType = new GenericType<IncomingCall>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of local &lt;IncomingPhoneNumber&gt; elements, each representing a local (not
   * toll-free) phone number given to your account, under an &lt;IncomingPhoneNumbers&gt; list
   * element that includes paging information. Works exactly the same as the IncomingPhoneNumber
   * resource, but filters out toll-free numbers.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/Local{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Adds a new phone number to your account. If a phone number is found for your request, Twilio
   * will add it to your account and bill you for the first month&#x27;s cost of the phone number.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/Local{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a list of local &lt;IncomingPhoneNumber&gt; elements, each representing a mobile phone
   * number given to your account, under an &lt;IncomingPhoneNumbers&gt; list element that includes
   * paging information. Works exactly the same as the IncomingPhoneNumber resource, but filters out
   * local and toll free numbers.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/Mobile{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Adds a new phone number to your account. If a phone number is found for your request, Twilio
   * will add it to your account and bill you for the first month&#x27;s cost of the phone number.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/Mobile{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a list of local &lt;IncomingPhoneNumber&gt; elements, each representing a toll-free
   * phone number given to your account, under an &lt;IncomingPhoneNumbers&gt; list element that
   * includes paging information. Works exactly the same as the IncomingPhoneNumber resource, but
   * filters out all numbers that aren&#x27;t toll-free.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/TollFree{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Adds a new phone number to your account. If a phone number is found for your request, Twilio
   * will add it to your account and bill you for the first month&#x27;s cost of the phone number.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers/TollFree{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a list of IncomingPhoneNumber resource representations, each representing a phone
   * number given to your account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return IncomingCalls
   * @throws ApiException if fails to make API call
   */
  public IncomingCalls accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IncomingCalls> localVarReturnType = new GenericType<IncomingCalls>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Purchases a new phone number for your account. If a phone number is found for your request,
   * Twilio will add it to your account and bill you for the first month&#x27;s cost of the phone
   * number. To find an available phone number to POST, use the subresources of the
   * AvailablePhoneNumbers list resource.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/IncomingPhoneNumbers{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Without an extension, the media is returned using the mime-type provided when the media was
   * generated.
   *
   * @param accountSid (required)
   * @param messageSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param mediaSid (required)
   * @return Media
   * @throws ApiException if fails to make API call
   */
  public Media accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet(
      String accountSid, String messageSid, String mediaTypeExtension, String mediaSid)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'messageSid' is set
    if (messageSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'messageSid' when calling accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaSid' is set
    if (mediaSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaSid' when calling accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Messages/{MessageSid}/Media/{MediaSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "MessageSid" + "\\}", apiClient.escapeString(messageSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "MediaSid" + "\\}", apiClient.escapeString(mediaSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Media> localVarReturnType = new GenericType<Media>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of media associated with your message.
   *
   * @param accountSid (required)
   * @param messageSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return MediaList
   * @throws ApiException if fails to make API call
   */
  public MediaList accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet(
      String accountSid, String messageSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet");
    }
    // verify the required parameter 'messageSid' is set
    if (messageSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'messageSid' when calling accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Messages/{MessageSid}/Media{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "MessageSid" + "\\}", apiClient.escapeString(messageSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<MediaList> localVarReturnType = new GenericType<MediaList>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a single message specified by the provided {MessageSid}.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param messageSid (required)
   * @return Message
   * @throws ApiException if fails to make API call
   */
  public Message accountsAccountSidMessagesMessageSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String messageSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidMessagesMessageSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidMessagesMessageSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'messageSid' is set
    if (messageSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'messageSid' when calling accountsAccountSidMessagesMessageSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Messages/{MessageSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "MessageSid" + "\\}", apiClient.escapeString(messageSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Message> localVarReturnType = new GenericType<Message>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of messages associated with your account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Messages
   * @throws ApiException if fails to make API call
   */
  public Messages accountsAccountSidMessagesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidMessagesmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidMessagesmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Messages{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Messages> localVarReturnType = new GenericType<Messages>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * To send a new outgoing message, make an HTTP POST to your Messages list resource URI
   *
   * @param to (required)
   * @param from (required)
   * @param messagingServiceSid (required)
   * @param body (required)
   * @param mediaUrl (required)
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidMessagesmediaTypeExtensionPost(
      String to,
      String from,
      String messagingServiceSid,
      String body,
      String mediaUrl,
      String accountSid,
      String mediaTypeExtension)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'to' when calling accountsAccountSidMessagesmediaTypeExtensionPost");
    }
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'from' when calling accountsAccountSidMessagesmediaTypeExtensionPost");
    }
    // verify the required parameter 'messagingServiceSid' is set
    if (messagingServiceSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'messagingServiceSid' when calling accountsAccountSidMessagesmediaTypeExtensionPost");
    }
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'body' when calling accountsAccountSidMessagesmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaUrl' is set
    if (mediaUrl == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaUrl' when calling accountsAccountSidMessagesmediaTypeExtensionPost");
    }
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidMessagesmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidMessagesmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Messages{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (to != null) localVarFormParams.put("To", to);
    if (from != null) localVarFormParams.put("From", from);
    if (messagingServiceSid != null)
      localVarFormParams.put("MessagingServiceSid", messagingServiceSid);
    if (body != null) localVarFormParams.put("Body", body);
    if (mediaUrl != null) localVarFormParams.put("MediaUrl", mediaUrl);

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/x-www-form-urlencoded"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Deletes the notification identified by {NotificationSid} from an account&#x27;s log.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param notificationSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String notificationSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'notificationSid' is set
    if (notificationSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'notificationSid' when calling accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Notifications/{NotificationSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "NotificationSid" + "\\}",
                apiClient.escapeString(notificationSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get a notification entry.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param notificationSid (required)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String notificationSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'notificationSid' is set
    if (notificationSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'notificationSid' when calling accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Notifications/{NotificationSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "NotificationSid" + "\\}",
                apiClient.escapeString(notificationSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of notifications generated for an account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Notifications
   * @throws ApiException if fails to make API call
   */
  public Notifications accountsAccountSidNotificationsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidNotificationsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidNotificationsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Notifications{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Notifications> localVarReturnType = new GenericType<Notifications>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Deletes the caller ID from the account. Returns an HTTP 204 response if successful, with no
   * body.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param outgoingCallerIdSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String outgoingCallerIdSid)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'outgoingCallerIdSid' is set
    if (outgoingCallerIdSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'outgoingCallerIdSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "OutgoingCallerIdSid" + "\\}",
                apiClient.escapeString(outgoingCallerIdSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get the set of an account&#x27;s verified phone numbers.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param outgoingCallerIdSid (required)
   * @return OutgoingCallerId
   * @throws ApiException if fails to make API call
   */
  public OutgoingCallerId
      accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet(
          String accountSid, String mediaTypeExtension, String outgoingCallerIdSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'outgoingCallerIdSid' is set
    if (outgoingCallerIdSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'outgoingCallerIdSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "OutgoingCallerIdSid" + "\\}",
                apiClient.escapeString(outgoingCallerIdSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<OutgoingCallerId> localVarReturnType = new GenericType<OutgoingCallerId>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Updates the caller id, and returns the updated resource if successful.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param outgoingCallerIdSid (required)
   * @return OutgoingCallerId
   * @throws ApiException if fails to make API call
   */
  public OutgoingCallerId
      accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost(
          String accountSid, String mediaTypeExtension, String outgoingCallerIdSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'outgoingCallerIdSid' is set
    if (outgoingCallerIdSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'outgoingCallerIdSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "OutgoingCallerIdSid" + "\\}",
                apiClient.escapeString(outgoingCallerIdSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<OutgoingCallerId> localVarReturnType = new GenericType<OutgoingCallerId>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Updates the caller id, and returns the updated resource if successful.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param outgoingCallerIdSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut(
      String accountSid, String mediaTypeExtension, String outgoingCallerIdSid)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut");
    }
    // verify the required parameter 'outgoingCallerIdSid' is set
    if (outgoingCallerIdSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'outgoingCallerIdSid' when calling accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "OutgoingCallerIdSid" + "\\}",
                apiClient.escapeString(outgoingCallerIdSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a list of OutgoingCallerId resource representations, each representing a Caller ID
   * number valid for an account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return OutCallerIds
   * @throws ApiException if fails to make API call
   */
  public OutCallerIds accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/OutgoingCallerIds{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<OutCallerIds> localVarReturnType = new GenericType<OutCallerIds>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Adds a new CallerID to your account.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/OutgoingCallerIds{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get a specific member.
   *
   * @param accountSid (required)
   * @param queueSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param callSid (required)
   * @return Member
   * @throws ApiException if fails to make API call
   */
  public Member accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet(
      String accountSid, String queueSid, String mediaTypeExtension, String callSid)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}/Members/{CallSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Member> localVarReturnType = new GenericType<Member>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Posting a URL and Method to a Queue instance will dequeue a member from a queue and have the
   * member&#x27;s call begin executing the TwiML document at that URL When redirecting a member of
   * a queue addressed by CallSid, only the first request will succeed and return a 200 response
   * code. A second request will fail and return an appropriate 400 response code.
   *
   * @param accountSid (required)
   * @param queueSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param callSid (required)
   * @return Member
   * @throws ApiException if fails to make API call
   */
  public Member accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost(
      String accountSid, String queueSid, String mediaTypeExtension, String callSid)
      throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'callSid' is set
    if (callSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'callSid' when calling accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}/Members/{CallSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CallSid" + "\\}", apiClient.escapeString(callSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Member> localVarReturnType = new GenericType<Member>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Get a front member.
   *
   * @param accountSid (required)
   * @param queueSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Member
   * @throws ApiException if fails to make API call
   */
  public Member accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet(
      String accountSid, String queueSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}/Members/Front{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Member> localVarReturnType = new GenericType<Member>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Posting a URL and Method to a Queue instance will dequeue a member from a queue and have the
   * member&#x27;s call begin executing the TwiML document at that URL When dequeuing the
   * &#x27;Front&#x27; of the queue, the next call in the queue will be redirected.
   *
   * @param accountSid (required)
   * @param queueSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Member
   * @throws ApiException if fails to make API call
   */
  public Member accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost(
      String accountSid, String queueSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}/Members/Front{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Member> localVarReturnType = new GenericType<Member>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns the list of members in the queue identified by {QueueSid}.
   *
   * @param accountSid (required)
   * @param queueSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Members
   * @throws ApiException if fails to make API call
   */
  public Members accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet(
      String accountSid, String queueSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}/Members{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Members> localVarReturnType = new GenericType<Members>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * The DELETE method allows you to remove a Queue. Only empty queues are deletable.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param queueSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String queueSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get resource&#x27;s individual Queue instance.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param queueSid (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public Queue accountsAccountSidQueuesQueueSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String queueSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Queue> localVarReturnType = new GenericType<Queue>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * This POST request allows you to change the FriendlyName or MaxSize.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param queueSid (required)
   * @return Queue
   * @throws ApiException if fails to make API call
   */
  public Queue accountsAccountSidQueuesQueueSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String queueSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'queueSid' is set
    if (queueSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'queueSid' when calling accountsAccountSidQueuesQueueSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues/{QueueSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "QueueSid" + "\\}", apiClient.escapeString(queueSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Queue> localVarReturnType = new GenericType<Queue>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of queues within an account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Queues
   * @throws ApiException if fails to make API call
   */
  public Queues accountsAccountSidQueuesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Queues> localVarReturnType = new GenericType<Queues>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Create a new Queue resource.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidQueuesmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidQueuesmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidQueuesmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Queues{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a set of Transcription resource representations that includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param recordingSid (required)
   * @return Transcriptions
   * @throws ApiException if fails to make API call
   */
  public Transcriptions accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String recordingSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet");
    }
    // verify the required parameter 'recordingSid' is set
    if (recordingSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'recordingSid' when calling accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Recordings/{RecordingSid}/Transcriptions{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "RecordingSid" + "\\}", apiClient.escapeString(recordingSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Transcriptions> localVarReturnType = new GenericType<Transcriptions>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Deletes a recording from your account.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @param recordingSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String recordingSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'recordingSid' is set
    if (recordingSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'recordingSid' when calling accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Recordings/{RecordingSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "RecordingSid" + "\\}", apiClient.escapeString(recordingSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns one of several representations: Without an extension, or with a \&quot;.wav\&quot;, a
   * binary WAV audio file is returned with mime-type \&quot;audio/x-wav\&quot;. Appending
   * \&quot;.mp3\&quot; to the URI returns a binary MP3 audio file with mime-type type
   * \&quot;audio/mpeg\&quot;. Appending \&quot;.xml\&quot; to the URI returns a XML representation.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @param recordingSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String recordingSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'recordingSid' is set
    if (recordingSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'recordingSid' when calling accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Recordings/{RecordingSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "RecordingSid" + "\\}", apiClient.escapeString(recordingSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a list of Recording resource representations, each representing a recording generated
   * during the course of a phone call.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Recordings
   * @throws ApiException if fails to make API call
   */
  public Recordings accountsAccountSidRecordingsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidRecordingsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidRecordingsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Recordings{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Recordings> localVarReturnType = new GenericType<Recordings>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Remove a Credential from a CredentialList.
   *
   * @param accountSid (required)
   * @param clSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param credentialSid (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete(
          String accountSid, String clSid, String mediaTypeExtension, String credentialSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'credentialSid' is set
    if (credentialSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'credentialSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials/{CredentialSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "CredentialSid" + "\\}", apiClient.escapeString(credentialSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get a specific Credential in a list. Though a password is stored for each username in your
   * list, the password is not returned to protect your password. If you cannot remember your
   * password, you will need to POST to this resource to update it.
   *
   * @param accountSid (required)
   * @param clSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param credentialSid (required)
   * @return Credential
   * @throws ApiException if fails to make API call
   */
  public Credential
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet(
          String accountSid, String clSid, String mediaTypeExtension, String credentialSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'credentialSid' is set
    if (credentialSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'credentialSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials/{CredentialSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "CredentialSid" + "\\}", apiClient.escapeString(credentialSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Credential> localVarReturnType = new GenericType<Credential>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Change the password of a Credential record. If the change is successful, Twilio will respond
   * with the Credential record but will not include the password in the response.
   *
   * @param accountSid (required)
   * @param clSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param credentialSid (required)
   * @return Credential
   * @throws ApiException if fails to make API call
   */
  public Credential
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost(
          String accountSid, String clSid, String mediaTypeExtension, String credentialSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'credentialSid' is set
    if (credentialSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'credentialSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials/{CredentialSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "CredentialSid" + "\\}", apiClient.escapeString(credentialSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Credential> localVarReturnType = new GenericType<Credential>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Get the list of Credentials in a CredentialList. The passwords for the Credentials are
   * intentionally not returned so as to protect them.
   *
   * @param accountSid (required)
   * @param clSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Credentials
   * @throws ApiException if fails to make API call
   */
  public Credentials accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet(
      String accountSid, String clSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Credentials> localVarReturnType = new GenericType<Credentials>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Add a Credential to the CredentialList. When creating a Credential, you will POST both a
   * username and password, but only receive the username back in the response. The password is
   * intentionally not returned so as to protect it.
   *
   * @param accountSid (required)
   * @param clSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost(
      String accountSid, String clSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Delete a CredentialList from your account. It can only be deleted if no domains are mapped to
   * it. If you attempt to delete one that is mapped to a domain, you will receive an error.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param clSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String clSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get a credential list instance resource
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param clSid (required)
   * @return CredentialList
   * @throws ApiException if fails to make API call
   */
  public CredentialList accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String clSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<CredentialList> localVarReturnType = new GenericType<CredentialList>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Change the FriendlyName of the list
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param clSid (required)
   * @return CredentialList
   * @throws ApiException if fails to make API call
   */
  public CredentialList accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String clSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists/{CLSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<CredentialList> localVarReturnType = new GenericType<CredentialList>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Gets a list of Credential Lists for an account
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return CredentialLists
   * @throws ApiException if fails to make API call
   */
  public CredentialLists accountsAccountSidSIPCredentialListsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<CredentialLists> localVarReturnType = new GenericType<CredentialLists>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Create a new Credential List.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidSIPCredentialListsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPCredentialListsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPCredentialListsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/CredentialLists{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Remove a CredentialListMapping from a domain
   *
   * @param accountSid (required)
   * @param sipDomainSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param clSid (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete(
          String accountSid, String sipDomainSid, String mediaTypeExtension, String clSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'clSid' is set
    if (clSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'clSid' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}/CredentialListMappings/{CLSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "CLSid" + "\\}", apiClient.escapeString(clSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Get the user lists mapped to this domain.
   *
   * @param accountSid (required)
   * @param sipDomainSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return CredentialListMappings
   * @throws ApiException if fails to make API call
   */
  public CredentialListMappings
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet(
          String accountSid, String sipDomainSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}/CredentialListMappings{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<CredentialListMappings> localVarReturnType =
        new GenericType<CredentialListMappings>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Map a CredentialList to the domain.
   *
   * @param accountSid (required)
   * @param sipDomainSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost(
      String accountSid, String sipDomainSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}/CredentialListMappings{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Remove a mapping from this domain.
   *
   * @param accountSid (required)
   * @param sipDomainSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param alSid (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete(
          String accountSid, String sipDomainSid, String mediaTypeExtension, String alSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'alSid' is set
    if (alSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'alSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings/{ALSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "ALSid" + "\\}", apiClient.escapeString(alSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Return a specific IpAccessControlListMapping instance by Sid.
   *
   * @param accountSid (required)
   * @param sipDomainSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param alSid (required)
   * @return IpAccessControlListMapping
   * @throws ApiException if fails to make API call
   */
  public IpAccessControlListMapping
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet(
          String accountSid, String sipDomainSid, String mediaTypeExtension, String alSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'alSid' is set
    if (alSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'alSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings/{ALSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll("\\{" + "ALSid" + "\\}", apiClient.escapeString(alSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IpAccessControlListMapping> localVarReturnType =
        new GenericType<IpAccessControlListMapping>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Return the IpAccessControlListMappings that are associated to this domain.
   *
   * @param accountSid (required)
   * @param sipDomainSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet(
          String accountSid, String sipDomainSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Map an IpAccessControlList to this domain.
   *
   * @param accountSid (required)
   * @param sipDomainSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost(
          String accountSid, String sipDomainSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Delete a domain. If you have created subdomains of a domain, you will not be able to delete the
   * domain until you first delete all subdomains of it.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param sipDomainSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String sipDomainSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Return a specific instance by Sid.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param sipDomainSid (required)
   * @return Domain
   * @throws ApiException if fails to make API call
   */
  public Domain accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String sipDomainSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Domain> localVarReturnType = new GenericType<Domain>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Update the attributes of a domain.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param sipDomainSid (required)
   * @return Domain
   * @throws ApiException if fails to make API call
   */
  public Domain accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String sipDomainSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'sipDomainSid' is set
    if (sipDomainSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'sipDomainSid' when calling accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains/{SipDomainSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "SipDomainSid" + "\\}", apiClient.escapeString(sipDomainSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Domain> localVarReturnType = new GenericType<Domain>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a paged list of the domains for an account.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Domains
   * @throws ApiException if fails to make API call
   */
  public Domains accountsAccountSidSIPDomainsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Domains> localVarReturnType = new GenericType<Domains>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Creates a new Domain and returns its instance resource. You must pick a unique domain name that
   * ends in \&quot;.sip.twilio.com\&quot;. After creating a Domain, you must map it to an
   * authentication method before the domain is ready to receive traffic.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidSIPDomainsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPDomainsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPDomainsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/Domains{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Deletes an IP address entry from the list.
   *
   * @param accountSid (required)
   * @param ipAccessControlListSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param ipAddressSid (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'ipAddressSid' is set
    if (ipAddressSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAddressSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses/{IpAddressSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IpAddressSid" + "\\}", apiClient.escapeString(ipAddressSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Return a single IP Address resource.
   *
   * @param accountSid (required)
   * @param ipAccessControlListSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param ipAddressSid (required)
   * @return IpAddress
   * @throws ApiException if fails to make API call
   */
  public IpAddress
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'ipAddressSid' is set
    if (ipAddressSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAddressSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses/{IpAddressSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IpAddressSid" + "\\}", apiClient.escapeString(ipAddressSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IpAddress> localVarReturnType = new GenericType<IpAddress>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Change the description or IP address of a given IpAddress instance resource
   *
   * @param accountSid (required)
   * @param ipAccessControlListSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param ipAddressSid (required)
   * @return IpAddress
   * @throws ApiException if fails to make API call
   */
  public IpAddress
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost(
          String accountSid,
          String ipAccessControlListSid,
          String mediaTypeExtension,
          String ipAddressSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'ipAddressSid' is set
    if (ipAddressSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAddressSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses/{IpAddressSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IpAddressSid" + "\\}", apiClient.escapeString(ipAddressSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IpAddress> localVarReturnType = new GenericType<IpAddress>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * List the IP Addresses contained in this list.
   *
   * @param accountSid (required)
   * @param ipAccessControlListSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return IpAddresses
   * @throws ApiException if fails to make API call
   */
  public IpAddresses
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet(
          String accountSid, String ipAccessControlListSid, String mediaTypeExtension)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IpAddresses> localVarReturnType = new GenericType<IpAddresses>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Add an IP Address to the list with a description.
   *
   * @param accountSid (required)
   * @param ipAccessControlListSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost(
          String accountSid, String ipAccessControlListSid, String mediaTypeExtension)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Delete an IpAccessControlList from your account. It can only be deleted if no domains are
   * mapped to it. If you attempt to delete one that is mapped to a domain, you will receive an
   * error.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param ipAccessControlListSid (required)
   * @throws ApiException if fails to make API call
   */
  public void
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete(
          String accountSid, String mediaTypeExtension, String ipAccessControlListSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Return a specific IpAccessControlList resource.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param ipAccessControlListSid (required)
   * @return IpAccessControlListMapping
   * @throws ApiException if fails to make API call
   */
  public IpAccessControlListMapping
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet(
          String accountSid, String mediaTypeExtension, String ipAccessControlListSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IpAccessControlListMapping> localVarReturnType =
        new GenericType<IpAccessControlListMapping>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Rename an IpAccessControlList.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param ipAccessControlListSid (required)
   * @return IpAccessControlListMapping
   * @throws ApiException if fails to make API call
   */
  public IpAccessControlListMapping
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost(
          String accountSid, String mediaTypeExtension, String ipAccessControlListSid)
          throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'ipAccessControlListSid' is set
    if (ipAccessControlListSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'ipAccessControlListSid' when calling accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "IpAccessControlListSid" + "\\}",
                apiClient.escapeString(ipAccessControlListSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IpAccessControlListMapping> localVarReturnType =
        new GenericType<IpAccessControlListMapping>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Return a paged list of all IpAccessControlLists under this account.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Create a new IpAccessControlList resource. When created, the list will contain no IP addresses.
   * You will need to add IP addresses to the list for it to be active. To add IP addresses, you
   * will need to POST to the IpAddresses List subresource.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension (required)
   * @return IpAccessControlListMapping
   * @throws ApiException if fails to make API call
   */
  public IpAccessControlListMapping accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SIP/IpAccessControlLists{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<IpAccessControlListMapping> localVarReturnType =
        new GenericType<IpAccessControlListMapping>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Get a single message.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param shortCodeSid (required)
   * @return ShortCode
   * @throws ApiException if fails to make API call
   */
  public ShortCode accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String shortCodeSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'shortCodeSid' is set
    if (shortCodeSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'shortCodeSid' when calling accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SMS/ShortCodes/{ShortCodeSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ShortCodeSid" + "\\}", apiClient.escapeString(shortCodeSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<ShortCode> localVarReturnType = new GenericType<ShortCode>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Tries to update the shortcode&#x27;s properties, and returns the updated resource
   * representation if successful.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param shortCodeSid (required)
   * @return ShortCode
   * @throws ApiException if fails to make API call
   */
  public ShortCode accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String shortCodeSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'shortCodeSid' is set
    if (shortCodeSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'shortCodeSid' when calling accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SMS/ShortCodes/{ShortCodeSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "ShortCodeSid" + "\\}", apiClient.escapeString(shortCodeSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<ShortCode> localVarReturnType = new GenericType<ShortCode>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of ShortCode resource representations, each representing a short code within
   * your account. The list includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return ShortCodes
   * @throws ApiException if fails to make API call
   */
  public ShortCodes accountsAccountSidSMSShortCodesmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidSMSShortCodesmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidSMSShortCodesmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/SMS/ShortCodes{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<ShortCodes> localVarReturnType = new GenericType<ShortCodes>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Deletes a transcription from your account.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param transcriptionSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String transcriptionSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'transcriptionSid' is set
    if (transcriptionSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'transcriptionSid' when calling accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Transcriptions/{TranscriptionSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "TranscriptionSid" + "\\}",
                apiClient.escapeString(transcriptionSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a single Transcription resource representation identified by the given
   * {TranscriptionSid}. By default Twilio will respond with the XML metadata for the Transcription.
   * If you append \&quot;.txt\&quot; to the end of the Transcription resource&#x27;s URI Twilio
   * will just return you the transcription tex.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param transcriptionSid (required)
   * @return Transcription
   * @throws ApiException if fails to make API call
   */
  public Transcription accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String transcriptionSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'transcriptionSid' is set
    if (transcriptionSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'transcriptionSid' when calling accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Transcriptions/{TranscriptionSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "TranscriptionSid" + "\\}",
                apiClient.escapeString(transcriptionSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml", "application/text"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Transcription> localVarReturnType = new GenericType<Transcription>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a set of Transcription resource representations that includes paging information.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Transcriptions
   * @throws ApiException if fails to make API call
   */
  public Transcriptions accountsAccountSidTranscriptionsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidTranscriptionsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidTranscriptionsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Transcriptions{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Transcriptions> localVarReturnType = new GenericType<Transcriptions>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns UsageRecords for all usage categories for a specified period.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param subresource |Subresource|Description| |---|---| |Daily|Return multiple UsageRecords for
   *     each usage category, each representing usage over a daily time-interval.| |Monthly|Return
   *     multiple UsageRecords for each usage category, each representing usage over a monthly
   *     time-interval.| |Yearly|Return multple UsageRecords for each usage category, each
   *     representing usage over a yearly time-interval.| |AllTime| Return a single UsageRecord for
   *     each usage category, each representing usage over the date-range specified. This is the
   *     same as the root /Usage/Records.| |Today|Return a single UsageRecord per usage category,
   *     for today&#x27;s usage only.| ||Yesterday|Return a single UsageRecord per usage category,
   *     for yesterday&#x27;s usage only.| |ThisMonth|Return a single UsageRecord per usage
   *     category, for this month&#x27;s usage only.| |LastMonth|Return a single UsageRecord per
   *     usage category, for last month&#x27;s usage only.| (required)
   * @return UsageRecords
   * @throws ApiException if fails to make API call
   */
  public UsageRecords accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String subresource) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet");
    }
    // verify the required parameter 'subresource' is set
    if (subresource == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'subresource' when calling accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Usage/Records/{Subresource}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "Subresource" + "\\}", apiClient.escapeString(subresource.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<UsageRecords> localVarReturnType = new GenericType<UsageRecords>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns UsageRecords for all usage categories. The list includes paging information. By
   * default, the UsageRecords resource will return one UsageRecord for each Category, representing
   * all usage accrued all-time for the account. You can filter the usage Category or change the
   * date-range over which usage is counted using optional GET query parameters.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return UsageRecords
   * @throws ApiException if fails to make API call
   */
  public UsageRecords accountsAccountSidUsageRecordsmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidUsageRecordsmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidUsageRecordsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Usage/Records{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<UsageRecords> localVarReturnType = new GenericType<UsageRecords>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Delete this UsageTrigger.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param usageTriggerSid (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete(
      String accountSid, String mediaTypeExtension, String usageTriggerSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete");
    }
    // verify the required parameter 'usageTriggerSid' is set
    if (usageTriggerSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'usageTriggerSid' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Usage/Triggers/{UsageTriggerSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "UsageTriggerSid" + "\\}",
                apiClient.escapeString(usageTriggerSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {};

    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a repesentation of the UsageTrigger.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param usageTriggerSid (required)
   * @return UsageTrigger
   * @throws ApiException if fails to make API call
   */
  public UsageTrigger accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension, String usageTriggerSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'usageTriggerSid' is set
    if (usageTriggerSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'usageTriggerSid' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Usage/Triggers/{UsageTriggerSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "UsageTriggerSid" + "\\}",
                apiClient.escapeString(usageTriggerSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<UsageTrigger> localVarReturnType = new GenericType<UsageTrigger>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Tries to update the UsageTrigger&#x27;s properties, and returns the updated resource
   * representation if successful.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param usageTriggerSid (required)
   * @return UsageTrigger
   * @throws ApiException if fails to make API call
   */
  public UsageTrigger accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension, String usageTriggerSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'usageTriggerSid' is set
    if (usageTriggerSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'usageTriggerSid' when calling accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Usage/Triggers/{UsageTriggerSid}{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "UsageTriggerSid" + "\\}",
                apiClient.escapeString(usageTriggerSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<UsageTrigger> localVarReturnType = new GenericType<UsageTrigger>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Returns a list of UsageTrigger resource representations. The list includes paging information.
   * By default, all UsageTriggers are returned. You can filter the list by specifying one or more
   * query parameters. Note that the query parameters are case-sensitive
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return UsageTriggers
   * @throws ApiException if fails to make API call
   */
  public UsageTriggers accountsAccountSidUsageTriggersmediaTypeExtensionGet(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidUsageTriggersmediaTypeExtensionGet");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidUsageTriggersmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Usage/Triggers{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<UsageTriggers> localVarReturnType = new GenericType<UsageTriggers>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Creates a new UsageTrigger. Each account can create up to 1,000 UsageTriggers. Currently,
   * UsageTriggers that are no longer active are not deleted automatically. Use DELETE to delete
   * triggers you no longer need.
   *
   * @param accountSid (required)
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsAccountSidUsageTriggersmediaTypeExtensionPost(
      String accountSid, String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidUsageTriggersmediaTypeExtensionPost");
    }
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidUsageTriggersmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}/Usage/Triggers{mediaTypeExtension}"
            .replaceAll("\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()))
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
  /**
   * Returns a representation of an account.
   *
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param accountSid A 34 character string that uniquely identifies this account. (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account accountsAccountSidmediaTypeExtensionGet(
      String mediaTypeExtension, String accountSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidmediaTypeExtensionGet");
    }
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}{mediaTypeExtension}"
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Allows you to modify the properties of an account.
   *
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param accountSid A 34 character string that uniquely identifies this account. (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account accountsAccountSidmediaTypeExtensionPost(
      String mediaTypeExtension, String accountSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidmediaTypeExtensionPost");
    }
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}{mediaTypeExtension}"
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Allows you to modify the properties of an account.
   *
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @param accountSid A 34 character string that uniquely identifies this account. (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account accountsAccountSidmediaTypeExtensionPut(
      String mediaTypeExtension, String accountSid) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsAccountSidmediaTypeExtensionPut");
    }
    // verify the required parameter 'accountSid' is set
    if (accountSid == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountSid' when calling accountsAccountSidmediaTypeExtensionPut");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts/{AccountSid}{mediaTypeExtension}"
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()))
            .replaceAll(
                "\\{" + "AccountSid" + "\\}", apiClient.escapeString(accountSid.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PUT",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Retrieve a list of the Account resources belonging to the account used to make the API request.
   * This list will include that Account as well.
   *
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @return Accounts
   * @throws ApiException if fails to make API call
   */
  public Accounts accountsmediaTypeExtensionGet(String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsmediaTypeExtensionGet");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts{mediaTypeExtension}"
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<Accounts> localVarReturnType = new GenericType<Accounts>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /**
   * Create a new Account instance resource as a subaccount of the one used to make the request. See
   * Creating Subaccounts for more information.
   *
   * @param mediaTypeExtension By default, Twilio&#x27;s REST API returns XML. You may obtain CSV,
   *     JSON or HTML by appending \&quot;.csv\&quot;, \&quot;.json\&quot;, or \&quot;.html\&quot;.
   *     (required)
   * @throws ApiException if fails to make API call
   */
  public void accountsmediaTypeExtensionPost(String mediaTypeExtension) throws ApiException {
    Object localVarPostBody = null;
    // verify the required parameter 'mediaTypeExtension' is set
    if (mediaTypeExtension == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'mediaTypeExtension' when calling accountsmediaTypeExtensionPost");
    }
    // create path and map variables
    String localVarPath =
        "/Accounts{mediaTypeExtension}"
            .replaceAll(
                "\\{" + "mediaTypeExtension" + "\\}",
                apiClient.escapeString(mediaTypeExtension.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/xml"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};

    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null);
  }
}
