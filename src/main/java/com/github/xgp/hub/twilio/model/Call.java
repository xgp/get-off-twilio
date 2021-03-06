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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.*;

/** Call */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class Call {
  @JsonProperty("account_sid")
  private String accountSid = null;

  @JsonProperty("answered_by")
  private String answeredBy = null;

  @JsonProperty("api_version")
  private String apiVersion = null;

  @JsonProperty("caller_name")
  private String callerName = null;

  @JsonProperty("date_created")
  private String dateCreated = null;

  @JsonProperty("date_updated")
  private String dateUpdated = null;

  @JsonProperty("direction")
  private String direction = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("formatted_from")
  private String formattedFrom = null;

  @JsonProperty("formatted_to")
  private String formattedTo = null;

  @JsonProperty("forwarded_from")
  private String forwardedFrom = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("parent_call_sid")
  private String parentCallSid = null;

  @JsonProperty("phone_number_sid")
  private String phoneNumberSid = null;

  @JsonProperty("price")
  private String price = null;

  @JsonProperty("sid")
  private String sid = null;

  @JsonProperty("start_time")
  private String startTime = null;

  /** Gets or Sets status */
  public enum StatusEnum {
    QUEUED("queued"),

    RINGING("ringing"),

    IN_PROGRESS("in-progress"),

    CANCELED("canceled"),

    COMPLETED("completed"),

    FAILED("failed"),

    BUSY("busy"),

    NO_ANSWER("no-answer");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("subresource_uris")
  private Object subresourceUris = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("uri")
  private String uri = null;

  public Call accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

  /**
   * The unique id of the Account responsible for creating this call.
   *
   * @return accountSid
   */
  @JsonProperty("account_sid")
  @Schema(description = "The unique id of the Account responsible for creating this call.")
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public Call answeredBy(String answeredBy) {
    this.answeredBy = answeredBy;
    return this;
  }

  /**
   * Get answeredBy
   *
   * @return answeredBy
   */
  @JsonProperty("answered_by")
  @Schema(description = "")
  public String getAnsweredBy() {
    return answeredBy;
  }

  public void setAnsweredBy(String answeredBy) {
    this.answeredBy = answeredBy;
  }

  public Call apiVersion(String apiVersion) {
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

  public Call callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }

  /**
   * Get callerName
   *
   * @return callerName
   */
  @JsonProperty("caller_name")
  @Schema(description = "")
  public String getCallerName() {
    return callerName;
  }

  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }

  public Call dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * GMT in RFC 2822 format.
   *
   * @return dateCreated
   */
  @JsonProperty("date_created")
  @Schema(description = "GMT in RFC 2822 format.")
  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public Call dateUpdated(String dateUpdated) {
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

  public Call direction(String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   *
   * @return direction
   */
  @JsonProperty("direction")
  @Schema(description = "")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public Call duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   *
   * @return duration
   */
  @JsonProperty("duration")
  @Schema(description = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Call endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Given as GMT in RFC 2822 format.
   *
   * @return endTime
   */
  @JsonProperty("end_time")
  @Schema(description = "Given as GMT in RFC 2822 format.")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Call formattedFrom(String formattedFrom) {
    this.formattedFrom = formattedFrom;
    return this;
  }

  /**
   * Get formattedFrom
   *
   * @return formattedFrom
   */
  @JsonProperty("formatted_from")
  @Schema(description = "")
  public String getFormattedFrom() {
    return formattedFrom;
  }

  public void setFormattedFrom(String formattedFrom) {
    this.formattedFrom = formattedFrom;
  }

  public Call formattedTo(String formattedTo) {
    this.formattedTo = formattedTo;
    return this;
  }

  /**
   * Get formattedTo
   *
   * @return formattedTo
   */
  @JsonProperty("formatted_to")
  @Schema(description = "")
  public String getFormattedTo() {
    return formattedTo;
  }

  public void setFormattedTo(String formattedTo) {
    this.formattedTo = formattedTo;
  }

  public Call forwardedFrom(String forwardedFrom) {
    this.forwardedFrom = forwardedFrom;
    return this;
  }

  /**
   * Get forwardedFrom
   *
   * @return forwardedFrom
   */
  @JsonProperty("forwarded_from")
  @Schema(description = "")
  public String getForwardedFrom() {
    return forwardedFrom;
  }

  public void setForwardedFrom(String forwardedFrom) {
    this.forwardedFrom = forwardedFrom;
  }

  public Call from(String from) {
    this.from = from;
    return this;
  }

  /**
   * The phone number, SIP address or Client identifier that made this call. Phone numbers are in
   * E.164 format (e.g. +16175551212).
   *
   * @return from
   */
  @JsonProperty("from")
  @Schema(
      description =
          "The phone number, SIP address or Client identifier that made this call. Phone numbers are in E.164 format (e.g. +16175551212).")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Call parentCallSid(String parentCallSid) {
    this.parentCallSid = parentCallSid;
    return this;
  }

  /**
   * Get parentCallSid
   *
   * @return parentCallSid
   */
  @JsonProperty("parent_call_sid")
  @Schema(description = "")
  @Size(min = 34, max = 34)
  public String getParentCallSid() {
    return parentCallSid;
  }

  public void setParentCallSid(String parentCallSid) {
    this.parentCallSid = parentCallSid;
  }

  public Call phoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
    return this;
  }

  /**
   * Get phoneNumberSid
   *
   * @return phoneNumberSid
   */
  @JsonProperty("phone_number_sid")
  @Schema(description = "")
  public String getPhoneNumberSid() {
    return phoneNumberSid;
  }

  public void setPhoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
  }

  public Call price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   *
   * @return price
   */
  @JsonProperty("price")
  @Schema(description = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Call sid(String sid) {
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
  @Size(min = 34, max = 34)
  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public Call startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Given as GMT in RFC 2822 format.
   *
   * @return startTime
   */
  @JsonProperty("start_time")
  @Schema(description = "Given as GMT in RFC 2822 format.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public Call status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @JsonProperty("status")
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Call subresourceUris(Object subresourceUris) {
    this.subresourceUris = subresourceUris;
    return this;
  }

  /**
   * Get subresourceUris
   *
   * @return subresourceUris
   */
  @JsonProperty("subresource_uris")
  @Schema(description = "")
  public Object getSubresourceUris() {
    return subresourceUris;
  }

  public void setSubresourceUris(Object subresourceUris) {
    this.subresourceUris = subresourceUris;
  }

  public Call to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Phone numbers are in E.164 format (e.g. +16175551212). SIP addresses are formated as
   * name@company.com. Client identifiers are formatted client:name.
   *
   * @return to
   */
  @JsonProperty("to")
  @Schema(
      description =
          "Phone numbers are in E.164 format (e.g. +16175551212). SIP addresses are formated as name@company.com. Client identifiers are formatted client:name.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Call uri(String uri) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Call call = (Call) o;
    return Objects.equals(this.accountSid, call.accountSid)
        && Objects.equals(this.answeredBy, call.answeredBy)
        && Objects.equals(this.apiVersion, call.apiVersion)
        && Objects.equals(this.callerName, call.callerName)
        && Objects.equals(this.dateCreated, call.dateCreated)
        && Objects.equals(this.dateUpdated, call.dateUpdated)
        && Objects.equals(this.direction, call.direction)
        && Objects.equals(this.duration, call.duration)
        && Objects.equals(this.endTime, call.endTime)
        && Objects.equals(this.formattedFrom, call.formattedFrom)
        && Objects.equals(this.formattedTo, call.formattedTo)
        && Objects.equals(this.forwardedFrom, call.forwardedFrom)
        && Objects.equals(this.from, call.from)
        && Objects.equals(this.parentCallSid, call.parentCallSid)
        && Objects.equals(this.phoneNumberSid, call.phoneNumberSid)
        && Objects.equals(this.price, call.price)
        && Objects.equals(this.sid, call.sid)
        && Objects.equals(this.startTime, call.startTime)
        && Objects.equals(this.status, call.status)
        && Objects.equals(this.subresourceUris, call.subresourceUris)
        && Objects.equals(this.to, call.to)
        && Objects.equals(this.uri, call.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountSid,
        answeredBy,
        apiVersion,
        callerName,
        dateCreated,
        dateUpdated,
        direction,
        duration,
        endTime,
        formattedFrom,
        formattedTo,
        forwardedFrom,
        from,
        parentCallSid,
        phoneNumberSid,
        price,
        sid,
        startTime,
        status,
        subresourceUris,
        to,
        uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Call {\n");

    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    answeredBy: ").append(toIndentedString(answeredBy)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    formattedFrom: ").append(toIndentedString(formattedFrom)).append("\n");
    sb.append("    formattedTo: ").append(toIndentedString(formattedTo)).append("\n");
    sb.append("    forwardedFrom: ").append(toIndentedString(forwardedFrom)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    parentCallSid: ").append(toIndentedString(parentCallSid)).append("\n");
    sb.append("    phoneNumberSid: ").append(toIndentedString(phoneNumberSid)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subresourceUris: ").append(toIndentedString(subresourceUris)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
