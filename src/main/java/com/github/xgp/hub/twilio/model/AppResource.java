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

/** AppResource */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class AppResource {
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
  private String smsFallbackUrl = null;

  @JsonProperty("sms_method")
  private String smsMethod = null;

  @JsonProperty("sms_status_callback")
  private String smsStatusCallback = null;

  @JsonProperty("sms_url")
  private String smsUrl = null;

  @JsonProperty("status_callback")
  private String statusCallback = null;

  @JsonProperty("status_callback_method")
  private String statusCallbackMethod = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("voice_caller_id_lookup")
  private String voiceCallerIdLookup = null;

  @JsonProperty("voice_fallback_method")
  private String voiceFallbackMethod = null;

  @JsonProperty("voice_fallback_url")
  private String voiceFallbackUrl = null;

  @JsonProperty("voice_method")
  private String voiceMethod = null;

  @JsonProperty("voice_url")
  private String voiceUrl = null;

  public AppResource accountSid(String accountSid) {
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

  public AppResource apiVersion(String apiVersion) {
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

  public AppResource dateCreated(String dateCreated) {
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

  public AppResource dateUpdated(String dateUpdated) {
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

  public AppResource friendlyName(String friendlyName) {
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

  public AppResource sid(String sid) {
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

  public AppResource smsFallbackMethod(String smsFallbackMethod) {
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

  public AppResource smsFallbackUrl(String smsFallbackUrl) {
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
  public String getSmsFallbackUrl() {
    return smsFallbackUrl;
  }

  public void setSmsFallbackUrl(String smsFallbackUrl) {
    this.smsFallbackUrl = smsFallbackUrl;
  }

  public AppResource smsMethod(String smsMethod) {
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

  public AppResource smsStatusCallback(String smsStatusCallback) {
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
  public String getSmsStatusCallback() {
    return smsStatusCallback;
  }

  public void setSmsStatusCallback(String smsStatusCallback) {
    this.smsStatusCallback = smsStatusCallback;
  }

  public AppResource smsUrl(String smsUrl) {
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
  public String getSmsUrl() {
    return smsUrl;
  }

  public void setSmsUrl(String smsUrl) {
    this.smsUrl = smsUrl;
  }

  public AppResource statusCallback(String statusCallback) {
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
  public String getStatusCallback() {
    return statusCallback;
  }

  public void setStatusCallback(String statusCallback) {
    this.statusCallback = statusCallback;
  }

  public AppResource statusCallbackMethod(String statusCallbackMethod) {
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
  public String getStatusCallbackMethod() {
    return statusCallbackMethod;
  }

  public void setStatusCallbackMethod(String statusCallbackMethod) {
    this.statusCallbackMethod = statusCallbackMethod;
  }

  public AppResource uri(String uri) {
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

  public AppResource voiceCallerIdLookup(String voiceCallerIdLookup) {
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
  public String getVoiceCallerIdLookup() {
    return voiceCallerIdLookup;
  }

  public void setVoiceCallerIdLookup(String voiceCallerIdLookup) {
    this.voiceCallerIdLookup = voiceCallerIdLookup;
  }

  public AppResource voiceFallbackMethod(String voiceFallbackMethod) {
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

  public AppResource voiceFallbackUrl(String voiceFallbackUrl) {
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
  public String getVoiceFallbackUrl() {
    return voiceFallbackUrl;
  }

  public void setVoiceFallbackUrl(String voiceFallbackUrl) {
    this.voiceFallbackUrl = voiceFallbackUrl;
  }

  public AppResource voiceMethod(String voiceMethod) {
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

  public AppResource voiceUrl(String voiceUrl) {
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
    AppResource appResource = (AppResource) o;
    return Objects.equals(this.accountSid, appResource.accountSid)
        && Objects.equals(this.apiVersion, appResource.apiVersion)
        && Objects.equals(this.dateCreated, appResource.dateCreated)
        && Objects.equals(this.dateUpdated, appResource.dateUpdated)
        && Objects.equals(this.friendlyName, appResource.friendlyName)
        && Objects.equals(this.sid, appResource.sid)
        && Objects.equals(this.smsFallbackMethod, appResource.smsFallbackMethod)
        && Objects.equals(this.smsFallbackUrl, appResource.smsFallbackUrl)
        && Objects.equals(this.smsMethod, appResource.smsMethod)
        && Objects.equals(this.smsStatusCallback, appResource.smsStatusCallback)
        && Objects.equals(this.smsUrl, appResource.smsUrl)
        && Objects.equals(this.statusCallback, appResource.statusCallback)
        && Objects.equals(this.statusCallbackMethod, appResource.statusCallbackMethod)
        && Objects.equals(this.uri, appResource.uri)
        && Objects.equals(this.voiceCallerIdLookup, appResource.voiceCallerIdLookup)
        && Objects.equals(this.voiceFallbackMethod, appResource.voiceFallbackMethod)
        && Objects.equals(this.voiceFallbackUrl, appResource.voiceFallbackUrl)
        && Objects.equals(this.voiceMethod, appResource.voiceMethod)
        && Objects.equals(this.voiceUrl, appResource.voiceUrl);
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
    sb.append("class AppResource {\n");

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
