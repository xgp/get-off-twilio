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
import java.math.BigDecimal;
import java.util.Objects;
import javax.validation.constraints.*;

/** Applications */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class Applications {
  @JsonProperty("applications")
  private java.util.List<Object> applications = null;

  @JsonProperty("end")
  private BigDecimal end = null;

  @JsonProperty("first_page_uri")
  private String firstPageUri = null;

  @JsonProperty("last_page_uri")
  private String lastPageUri = null;

  @JsonProperty("next_page_uri")
  private Object nextPageUri = null;

  @JsonProperty("num_pages")
  private BigDecimal numPages = null;

  @JsonProperty("page")
  private BigDecimal page = null;

  @JsonProperty("page_size")
  private BigDecimal pageSize = null;

  @JsonProperty("previous_page_uri")
  private Object previousPageUri = null;

  @JsonProperty("start")
  private BigDecimal start = null;

  @JsonProperty("total")
  private BigDecimal total = null;

  @JsonProperty("uri")
  private String uri = null;

  public Applications applications(java.util.List<Object> applications) {
    this.applications = applications;
    return this;
  }

  public Applications addApplicationsItem(Object applicationsItem) {
    if (this.applications == null) {
      this.applications = new java.util.ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * Get applications
   *
   * @return applications
   */
  @JsonProperty("applications")
  @Schema(description = "")
  public java.util.List<Object> getApplications() {
    return applications;
  }

  public void setApplications(java.util.List<Object> applications) {
    this.applications = applications;
  }

  public Applications end(BigDecimal end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   *
   * @return end
   */
  @JsonProperty("end")
  @Schema(description = "")
  public BigDecimal getEnd() {
    return end;
  }

  public void setEnd(BigDecimal end) {
    this.end = end;
  }

  public Applications firstPageUri(String firstPageUri) {
    this.firstPageUri = firstPageUri;
    return this;
  }

  /**
   * Get firstPageUri
   *
   * @return firstPageUri
   */
  @JsonProperty("first_page_uri")
  @Schema(description = "")
  public String getFirstPageUri() {
    return firstPageUri;
  }

  public void setFirstPageUri(String firstPageUri) {
    this.firstPageUri = firstPageUri;
  }

  public Applications lastPageUri(String lastPageUri) {
    this.lastPageUri = lastPageUri;
    return this;
  }

  /**
   * Get lastPageUri
   *
   * @return lastPageUri
   */
  @JsonProperty("last_page_uri")
  @Schema(description = "")
  public String getLastPageUri() {
    return lastPageUri;
  }

  public void setLastPageUri(String lastPageUri) {
    this.lastPageUri = lastPageUri;
  }

  public Applications nextPageUri(Object nextPageUri) {
    this.nextPageUri = nextPageUri;
    return this;
  }

  /**
   * Get nextPageUri
   *
   * @return nextPageUri
   */
  @JsonProperty("next_page_uri")
  @Schema(description = "")
  public Object getNextPageUri() {
    return nextPageUri;
  }

  public void setNextPageUri(Object nextPageUri) {
    this.nextPageUri = nextPageUri;
  }

  public Applications numPages(BigDecimal numPages) {
    this.numPages = numPages;
    return this;
  }

  /**
   * Get numPages
   *
   * @return numPages
   */
  @JsonProperty("num_pages")
  @Schema(description = "")
  public BigDecimal getNumPages() {
    return numPages;
  }

  public void setNumPages(BigDecimal numPages) {
    this.numPages = numPages;
  }

  public Applications page(BigDecimal page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @JsonProperty("page")
  @Schema(description = "")
  public BigDecimal getPage() {
    return page;
  }

  public void setPage(BigDecimal page) {
    this.page = page;
  }

  public Applications pageSize(BigDecimal pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   */
  @JsonProperty("page_size")
  @Schema(description = "")
  public BigDecimal getPageSize() {
    return pageSize;
  }

  public void setPageSize(BigDecimal pageSize) {
    this.pageSize = pageSize;
  }

  public Applications previousPageUri(Object previousPageUri) {
    this.previousPageUri = previousPageUri;
    return this;
  }

  /**
   * Get previousPageUri
   *
   * @return previousPageUri
   */
  @JsonProperty("previous_page_uri")
  @Schema(description = "")
  public Object getPreviousPageUri() {
    return previousPageUri;
  }

  public void setPreviousPageUri(Object previousPageUri) {
    this.previousPageUri = previousPageUri;
  }

  public Applications start(BigDecimal start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   *
   * @return start
   */
  @JsonProperty("start")
  @Schema(description = "")
  public BigDecimal getStart() {
    return start;
  }

  public void setStart(BigDecimal start) {
    this.start = start;
  }

  public Applications total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   *
   * @return total
   */
  @JsonProperty("total")
  @Schema(description = "")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Applications uri(String uri) {
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
    Applications applications = (Applications) o;
    return Objects.equals(this.applications, applications.applications)
        && Objects.equals(this.end, applications.end)
        && Objects.equals(this.firstPageUri, applications.firstPageUri)
        && Objects.equals(this.lastPageUri, applications.lastPageUri)
        && Objects.equals(this.nextPageUri, applications.nextPageUri)
        && Objects.equals(this.numPages, applications.numPages)
        && Objects.equals(this.page, applications.page)
        && Objects.equals(this.pageSize, applications.pageSize)
        && Objects.equals(this.previousPageUri, applications.previousPageUri)
        && Objects.equals(this.start, applications.start)
        && Objects.equals(this.total, applications.total)
        && Objects.equals(this.uri, applications.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        applications,
        end,
        firstPageUri,
        lastPageUri,
        nextPageUri,
        numPages,
        page,
        pageSize,
        previousPageUri,
        start,
        total,
        uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Applications {\n");

    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    firstPageUri: ").append(toIndentedString(firstPageUri)).append("\n");
    sb.append("    lastPageUri: ").append(toIndentedString(lastPageUri)).append("\n");
    sb.append("    nextPageUri: ").append(toIndentedString(nextPageUri)).append("\n");
    sb.append("    numPages: ").append(toIndentedString(numPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    previousPageUri: ").append(toIndentedString(previousPageUri)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
