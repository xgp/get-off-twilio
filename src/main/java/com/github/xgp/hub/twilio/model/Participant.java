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

/** Participant */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class Participant {
  @JsonProperty("account_sid")
  private String accountSid = null;

  @JsonProperty("call_sid")
  private String callSid = null;

  @JsonProperty("conference_sid")
  private String conferenceSid = null;

  @JsonProperty("date_created")
  private String dateCreated = null;

  @JsonProperty("date_updated")
  private String dateUpdated = null;

  @JsonProperty("end_conference_on_exit")
  private Boolean endConferenceOnExit = null;

  @JsonProperty("muted")
  private Boolean muted = null;

  @JsonProperty("start_conference_on_enter")
  private Boolean startConferenceOnEnter = null;

  @JsonProperty("uri")
  private String uri = null;

  public Participant accountSid(String accountSid) {
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

  public Participant callSid(String callSid) {
    this.callSid = callSid;
    return this;
  }

  /**
   * Get callSid
   *
   * @return callSid
   */
  @JsonProperty("call_sid")
  @Schema(description = "")
  public String getCallSid() {
    return callSid;
  }

  public void setCallSid(String callSid) {
    this.callSid = callSid;
  }

  public Participant conferenceSid(String conferenceSid) {
    this.conferenceSid = conferenceSid;
    return this;
  }

  /**
   * Get conferenceSid
   *
   * @return conferenceSid
   */
  @JsonProperty("conference_sid")
  @Schema(description = "")
  public String getConferenceSid() {
    return conferenceSid;
  }

  public void setConferenceSid(String conferenceSid) {
    this.conferenceSid = conferenceSid;
  }

  public Participant dateCreated(String dateCreated) {
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

  public Participant dateUpdated(String dateUpdated) {
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

  public Participant endConferenceOnExit(Boolean endConferenceOnExit) {
    this.endConferenceOnExit = endConferenceOnExit;
    return this;
  }

  /**
   * Get endConferenceOnExit
   *
   * @return endConferenceOnExit
   */
  @JsonProperty("end_conference_on_exit")
  @Schema(description = "")
  public Boolean isEndConferenceOnExit() {
    return endConferenceOnExit;
  }

  public void setEndConferenceOnExit(Boolean endConferenceOnExit) {
    this.endConferenceOnExit = endConferenceOnExit;
  }

  public Participant muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Get muted
   *
   * @return muted
   */
  @JsonProperty("muted")
  @Schema(description = "")
  public Boolean isMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public Participant startConferenceOnEnter(Boolean startConferenceOnEnter) {
    this.startConferenceOnEnter = startConferenceOnEnter;
    return this;
  }

  /**
   * Get startConferenceOnEnter
   *
   * @return startConferenceOnEnter
   */
  @JsonProperty("start_conference_on_enter")
  @Schema(description = "")
  public Boolean isStartConferenceOnEnter() {
    return startConferenceOnEnter;
  }

  public void setStartConferenceOnEnter(Boolean startConferenceOnEnter) {
    this.startConferenceOnEnter = startConferenceOnEnter;
  }

  public Participant uri(String uri) {
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
    Participant participant = (Participant) o;
    return Objects.equals(this.accountSid, participant.accountSid)
        && Objects.equals(this.callSid, participant.callSid)
        && Objects.equals(this.conferenceSid, participant.conferenceSid)
        && Objects.equals(this.dateCreated, participant.dateCreated)
        && Objects.equals(this.dateUpdated, participant.dateUpdated)
        && Objects.equals(this.endConferenceOnExit, participant.endConferenceOnExit)
        && Objects.equals(this.muted, participant.muted)
        && Objects.equals(this.startConferenceOnEnter, participant.startConferenceOnEnter)
        && Objects.equals(this.uri, participant.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountSid,
        callSid,
        conferenceSid,
        dateCreated,
        dateUpdated,
        endConferenceOnExit,
        muted,
        startConferenceOnEnter,
        uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");

    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    callSid: ").append(toIndentedString(callSid)).append("\n");
    sb.append("    conferenceSid: ").append(toIndentedString(conferenceSid)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    endConferenceOnExit: ")
        .append(toIndentedString(endConferenceOnExit))
        .append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    startConferenceOnEnter: ")
        .append(toIndentedString(startConferenceOnEnter))
        .append("\n");
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
