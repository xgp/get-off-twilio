/*
 * Twilio
 * Enabling phones, VoIP, and messaging to be embedded into web, desktop, and mobile software.
 *
 * OpenAPI spec version: 2010-04-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.xgp.hub.twilio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.*;

/** Application */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class Application {
  @JsonProperty("account_sid")
  private String accountSid = null;

  @JsonProperty("api_version")
  private String apiVersion = null;

  @JsonProperty("date_created")
  private String dateCreated = null;

  @JsonProperty("date_updated")
  private String dateUpdated = null;

  @JsonProperty("friendly_name")
  private String friendlyName = null;

  @JsonProperty("sid")
  private String sid = null;

  @JsonProperty("sms_fallback_method")
  private String smsFallbackMethod = null;

  @JsonProperty("sms_fallback_url")
  private Object smsFallbackUrl = null;

  @JsonProperty("sms_method")
  private String smsMethod = null;

  @JsonProperty("sms_status_callback")
  private Object smsStatusCallback = null;

  @JsonProperty("sms_url")
  private Object smsUrl = null;

  @JsonProperty("status_callback")
  private Object statusCallback = null;

  @JsonProperty("status_callback_method")
  private Object statusCallbackMethod = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("voice_caller_id_lookup")
  private Object voiceCallerIdLookup = null;

  @JsonProperty("voice_fallback_method")
  private String voiceFallbackMethod = null;

  @JsonProperty("voice_fallback_url")
  private Object voiceFallbackUrl = null;

  @JsonProperty("voice_method")
  private String voiceMethod = null;

  @JsonProperty("voice_url")
  private String voiceUrl = null;

  public Application accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * Get accountSid
   *
   * @return accountSid
   */
  @JsonProperty("account_sid")
  @Schema(description = "")
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public Application apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Get apiVersion
   *
   * @return apiVersion
   */
  @JsonProperty("api_version")
  @Schema(description = "")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public Application dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   *
   * @return dateCreated
   */
  @JsonProperty("date_created")
  @Schema(description = "")
  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Application dateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
    return this;
  }

  /**
   * Get dateUpdated
   *
   * @return dateUpdated
   */
  @JsonProperty("date_updated")
  @Schema(description = "")
  public String getDateUpdated() {
    return dateUpdated;
  }

  public void setDateUpdated(String dateUpdated) {
    this.dateUpdated = dateUpdated;
  }

  public Application friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Get friendlyName
   *
   * @return friendlyName
   */
  @JsonProperty("friendly_name")
  @Schema(description = "")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public Application sid(String sid) {
    this.sid = sid;
    return this;
  }

  /**
   * Get sid
   *
   * @return sid
   */
  @JsonProperty("sid")
  @Schema(description = "")
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public Application smsFallbackMethod(String smsFallbackMethod) {
    this.smsFallbackMethod = smsFallbackMethod;
    return this;
  }

  /**
   * Get smsFallbackMethod
   *
   * @return smsFallbackMethod
   */
  @JsonProperty("sms_fallback_method")
  @Schema(description = "")
  public String getSmsFallbackMethod() {
    return smsFallbackMethod;
  }

  public void setSmsFallbackMethod(String smsFallbackMethod) {
    this.smsFallbackMethod = smsFallbackMethod;
  }

  public Application smsFallbackUrl(Object smsFallbackUrl) {
    this.smsFallbackUrl = smsFallbackUrl;
    return this;
  }

  /**
   * Get smsFallbackUrl
   *
   * @return smsFallbackUrl
   */
  @JsonProperty("sms_fallback_url")
  @Schema(description = "")
  public Object getSmsFallbackUrl() {
    return smsFallbackUrl;
  }

  public void setSmsFallbackUrl(Object smsFallbackUrl) {
    this.smsFallbackUrl = smsFallbackUrl;
  }

  public Application smsMethod(String smsMethod) {
    this.smsMethod = smsMethod;
    return this;
  }

  /**
   * Get smsMethod
   *
   * @return smsMethod
   */
  @JsonProperty("sms_method")
  @Schema(description = "")
  public String getSmsMethod() {
    return smsMethod;
  }

  public void setSmsMethod(String smsMethod) {
    this.smsMethod = smsMethod;
  }

  public Application smsStatusCallback(Object smsStatusCallback) {
    this.smsStatusCallback = smsStatusCallback;
    return this;
  }

  /**
   * Get smsStatusCallback
   *
   * @return smsStatusCallback
   */
  @JsonProperty("sms_status_callback")
  @Schema(description = "")
  public Object getSmsStatusCallback() {
    return smsStatusCallback;
  }

  public void setSmsStatusCallback(Object smsStatusCallback) {
    this.smsStatusCallback = smsStatusCallback;
  }

  public Application smsUrl(Object smsUrl) {
    this.smsUrl = smsUrl;
    return this;
  }

  /**
   * Get smsUrl
   *
   * @return smsUrl
   */
  @JsonProperty("sms_url")
  @Schema(description = "")
  public Object getSmsUrl() {
    return smsUrl;
  }

  public void setSmsUrl(Object smsUrl) {
    this.smsUrl = smsUrl;
  }

  public Application statusCallback(Object statusCallback) {
    this.statusCallback = statusCallback;
    return this;
  }

  /**
   * Get statusCallback
   *
   * @return statusCallback
   */
  @JsonProperty("status_callback")
  @Schema(description = "")
  public Object getStatusCallback() {
    return statusCallback;
  }

  public void setStatusCallback(Object statusCallback) {
    this.statusCallback = statusCallback;
  }

  public Application statusCallbackMethod(Object statusCallbackMethod) {
    this.statusCallbackMethod = statusCallbackMethod;
    return this;
  }

  /**
   * Get statusCallbackMethod
   *
   * @return statusCallbackMethod
   */
  @JsonProperty("status_callback_method")
  @Schema(description = "")
  public Object getStatusCallbackMethod() {
    return statusCallbackMethod;
  }

  public void setStatusCallbackMethod(Object statusCallbackMethod) {
    this.statusCallbackMethod = statusCallbackMethod;
  }

  public Application uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   *
   * @return uri
   */
  @JsonProperty("uri")
  @Schema(description = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Application voiceCallerIdLookup(Object voiceCallerIdLookup) {
    this.voiceCallerIdLookup = voiceCallerIdLookup;
    return this;
  }

  /**
   * Get voiceCallerIdLookup
   *
   * @return voiceCallerIdLookup
   */
  @JsonProperty("voice_caller_id_lookup")
  @Schema(description = "")
  public Object getVoiceCallerIdLookup() {
    return voiceCallerIdLookup;
  }

  public void setVoiceCallerIdLookup(Object voiceCallerIdLookup) {
    this.voiceCallerIdLookup = voiceCallerIdLookup;
  }

  public Application voiceFallbackMethod(String voiceFallbackMethod) {
    this.voiceFallbackMethod = voiceFallbackMethod;
    return this;
  }

  /**
   * Get voiceFallbackMethod
   *
   * @return voiceFallbackMethod
   */
  @JsonProperty("voice_fallback_method")
  @Schema(description = "")
  public String getVoiceFallbackMethod() {
    return voiceFallbackMethod;
  }

  public void setVoiceFallbackMethod(String voiceFallbackMethod) {
    this.voiceFallbackMethod = voiceFallbackMethod;
  }

  public Application voiceFallbackUrl(Object voiceFallbackUrl) {
    this.voiceFallbackUrl = voiceFallbackUrl;
    return this;
  }

  /**
   * Get voiceFallbackUrl
   *
   * @return voiceFallbackUrl
   */
  @JsonProperty("voice_fallback_url")
  @Schema(description = "")
  public Object getVoiceFallbackUrl() {
    return voiceFallbackUrl;
  }

  public void setVoiceFallbackUrl(Object voiceFallbackUrl) {
    this.voiceFallbackUrl = voiceFallbackUrl;
  }

  public Application voiceMethod(String voiceMethod) {
    this.voiceMethod = voiceMethod;
    return this;
  }

  /**
   * Get voiceMethod
   *
   * @return voiceMethod
   */
  @JsonProperty("voice_method")
  @Schema(description = "")
  public String getVoiceMethod() {
    return voiceMethod;
  }

  public void setVoiceMethod(String voiceMethod) {
    this.voiceMethod = voiceMethod;
  }

  public Application voiceUrl(String voiceUrl) {
    this.voiceUrl = voiceUrl;
    return this;
  }

  /**
   * Get voiceUrl
   *
   * @return voiceUrl
   */
  @JsonProperty("voice_url")
  @Schema(description = "")
  public String getVoiceUrl() {
    return voiceUrl;
  }

  public void setVoiceUrl(String voiceUrl) {
    this.voiceUrl = voiceUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.accountSid, application.accountSid)
        && Objects.equals(this.apiVersion, application.apiVersion)
        && Objects.equals(this.dateCreated, application.dateCreated)
        && Objects.equals(this.dateUpdated, application.dateUpdated)
        && Objects.equals(this.friendlyName, application.friendlyName)
        && Objects.equals(this.sid, application.sid)
        && Objects.equals(this.smsFallbackMethod, application.smsFallbackMethod)
        && Objects.equals(this.smsFallbackUrl, application.smsFallbackUrl)
        && Objects.equals(this.smsMethod, application.smsMethod)
        && Objects.equals(this.smsStatusCallback, application.smsStatusCallback)
        && Objects.equals(this.smsUrl, application.smsUrl)
        && Objects.equals(this.statusCallback, application.statusCallback)
        && Objects.equals(this.statusCallbackMethod, application.statusCallbackMethod)
        && Objects.equals(this.uri, application.uri)
        && Objects.equals(this.voiceCallerIdLookup, application.voiceCallerIdLookup)
        && Objects.equals(this.voiceFallbackMethod, application.voiceFallbackMethod)
        && Objects.equals(this.voiceFallbackUrl, application.voiceFallbackUrl)
        && Objects.equals(this.voiceMethod, application.voiceMethod)
        && Objects.equals(this.voiceUrl, application.voiceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountSid,
        apiVersion,
        dateCreated,
        dateUpdated,
        friendlyName,
        sid,
        smsFallbackMethod,
        smsFallbackUrl,
        smsMethod,
        smsStatusCallback,
        smsUrl,
        statusCallback,
        statusCallbackMethod,
        uri,
        voiceCallerIdLookup,
        voiceFallbackMethod,
        voiceFallbackUrl,
        voiceMethod,
        voiceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");

    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    smsFallbackMethod: ").append(toIndentedString(smsFallbackMethod)).append("\n");
    sb.append("    smsFallbackUrl: ").append(toIndentedString(smsFallbackUrl)).append("\n");
    sb.append("    smsMethod: ").append(toIndentedString(smsMethod)).append("\n");
    sb.append("    smsStatusCallback: ").append(toIndentedString(smsStatusCallback)).append("\n");
    sb.append("    smsUrl: ").append(toIndentedString(smsUrl)).append("\n");
    sb.append("    statusCallback: ").append(toIndentedString(statusCallback)).append("\n");
    sb.append("    statusCallbackMethod: ")
        .append(toIndentedString(statusCallbackMethod))
        .append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    voiceCallerIdLookup: ")
        .append(toIndentedString(voiceCallerIdLookup))
        .append("\n");
    sb.append("    voiceFallbackMethod: ")
        .append(toIndentedString(voiceFallbackMethod))
        .append("\n");
    sb.append("    voiceFallbackUrl: ").append(toIndentedString(voiceFallbackUrl)).append("\n");
    sb.append("    voiceMethod: ").append(toIndentedString(voiceMethod)).append("\n");
    sb.append("    voiceUrl: ").append(toIndentedString(voiceUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
