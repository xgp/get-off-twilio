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

/** AuthApp */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class AuthApp {
  @JsonProperty("account_sid")
  private String accountSid = null;

  @JsonProperty("connect_app_company_name")
  private String connectAppCompanyName = null;

  @JsonProperty("connect_app_description")
  private String connectAppDescription = null;

  @JsonProperty("connect_app_friendly_name")
  private String connectAppFriendlyName = null;

  @JsonProperty("connect_app_homepage_url")
  private String connectAppHomepageUrl = null;

  @JsonProperty("connect_app_sid")
  private String connectAppSid = null;

  @JsonProperty("permissions")
  private java.util.List<String> permissions = null;

  public AuthApp accountSid(String accountSid) {
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

  public AuthApp connectAppCompanyName(String connectAppCompanyName) {
    this.connectAppCompanyName = connectAppCompanyName;
    return this;
  }

  /**
   * Get connectAppCompanyName
   *
   * @return connectAppCompanyName
   */
  @JsonProperty("connect_app_company_name")
  @Schema(description = "")
  public String getConnectAppCompanyName() {
    return connectAppCompanyName;
  }

  public void setConnectAppCompanyName(String connectAppCompanyName) {
    this.connectAppCompanyName = connectAppCompanyName;
  }

  public AuthApp connectAppDescription(String connectAppDescription) {
    this.connectAppDescription = connectAppDescription;
    return this;
  }

  /**
   * Get connectAppDescription
   *
   * @return connectAppDescription
   */
  @JsonProperty("connect_app_description")
  @Schema(description = "")
  public String getConnectAppDescription() {
    return connectAppDescription;
  }

  public void setConnectAppDescription(String connectAppDescription) {
    this.connectAppDescription = connectAppDescription;
  }

  public AuthApp connectAppFriendlyName(String connectAppFriendlyName) {
    this.connectAppFriendlyName = connectAppFriendlyName;
    return this;
  }

  /**
   * Get connectAppFriendlyName
   *
   * @return connectAppFriendlyName
   */
  @JsonProperty("connect_app_friendly_name")
  @Schema(description = "")
  public String getConnectAppFriendlyName() {
    return connectAppFriendlyName;
  }

  public void setConnectAppFriendlyName(String connectAppFriendlyName) {
    this.connectAppFriendlyName = connectAppFriendlyName;
  }

  public AuthApp connectAppHomepageUrl(String connectAppHomepageUrl) {
    this.connectAppHomepageUrl = connectAppHomepageUrl;
    return this;
  }

  /**
   * Get connectAppHomepageUrl
   *
   * @return connectAppHomepageUrl
   */
  @JsonProperty("connect_app_homepage_url")
  @Schema(description = "")
  public String getConnectAppHomepageUrl() {
    return connectAppHomepageUrl;
  }

  public void setConnectAppHomepageUrl(String connectAppHomepageUrl) {
    this.connectAppHomepageUrl = connectAppHomepageUrl;
  }

  public AuthApp connectAppSid(String connectAppSid) {
    this.connectAppSid = connectAppSid;
    return this;
  }

  /**
   * Get connectAppSid
   *
   * @return connectAppSid
   */
  @JsonProperty("connect_app_sid")
  @Schema(description = "")
  public String getConnectAppSid() {
    return connectAppSid;
  }

  public void setConnectAppSid(String connectAppSid) {
    this.connectAppSid = connectAppSid;
  }

  public AuthApp permissions(java.util.List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AuthApp addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new java.util.ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   *
   * @return permissions
   */
  @JsonProperty("permissions")
  @Schema(description = "")
  public java.util.List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(java.util.List<String> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthApp authApp = (AuthApp) o;
    return Objects.equals(this.accountSid, authApp.accountSid)
        && Objects.equals(this.connectAppCompanyName, authApp.connectAppCompanyName)
        && Objects.equals(this.connectAppDescription, authApp.connectAppDescription)
        && Objects.equals(this.connectAppFriendlyName, authApp.connectAppFriendlyName)
        && Objects.equals(this.connectAppHomepageUrl, authApp.connectAppHomepageUrl)
        && Objects.equals(this.connectAppSid, authApp.connectAppSid)
        && Objects.equals(this.permissions, authApp.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountSid,
        connectAppCompanyName,
        connectAppDescription,
        connectAppFriendlyName,
        connectAppHomepageUrl,
        connectAppSid,
        permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthApp {\n");

    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    connectAppCompanyName: ")
        .append(toIndentedString(connectAppCompanyName))
        .append("\n");
    sb.append("    connectAppDescription: ")
        .append(toIndentedString(connectAppDescription))
        .append("\n");
    sb.append("    connectAppFriendlyName: ")
        .append(toIndentedString(connectAppFriendlyName))
        .append("\n");
    sb.append("    connectAppHomepageUrl: ")
        .append(toIndentedString(connectAppHomepageUrl))
        .append("\n");
    sb.append("    connectAppSid: ").append(toIndentedString(connectAppSid)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
