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

/** ConnectApps */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class ConnectApps {
  @JsonProperty("connect_apps")
  private java.util.List<Object> connectApps = null;

  @JsonProperty("end")
  private Integer end = null;

  @JsonProperty("first_page_uri")
  private String firstPageUri = null;

  @JsonProperty("last_page_uri")
  private String lastPageUri = null;

  @JsonProperty("next_page_uri")
  private String nextPageUri = null;

  @JsonProperty("num_pages")
  private Integer numPages = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("page_size")
  private Integer pageSize = null;

  @JsonProperty("previous_page_uri")
  private String previousPageUri = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("uri")
  private String uri = null;

  public ConnectApps connectApps(java.util.List<Object> connectApps) {
    this.connectApps = connectApps;
    return this;
  }

  public ConnectApps addConnectAppsItem(Object connectAppsItem) {
    if (this.connectApps == null) {
      this.connectApps = new java.util.ArrayList<>();
    }
    this.connectApps.add(connectAppsItem);
    return this;
  }

  /**
   * Get connectApps
   *
   * @return connectApps
   */
  @JsonProperty("connect_apps")
  @Schema(description = "")
  public java.util.List<Object> getConnectApps() {
    return connectApps;
  }

  public void setConnectApps(java.util.List<Object> connectApps) {
    this.connectApps = connectApps;
  }

  public ConnectApps end(Integer end) {
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
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public ConnectApps firstPageUri(String firstPageUri) {
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

  public ConnectApps lastPageUri(String lastPageUri) {
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

  public ConnectApps nextPageUri(String nextPageUri) {
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
  public String getNextPageUri() {
    return nextPageUri;
  }

  public void setNextPageUri(String nextPageUri) {
    this.nextPageUri = nextPageUri;
  }

  public ConnectApps numPages(Integer numPages) {
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
  public Integer getNumPages() {
    return numPages;
  }

  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }

  public ConnectApps page(Integer page) {
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
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ConnectApps pageSize(Integer pageSize) {
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
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ConnectApps previousPageUri(String previousPageUri) {
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
  public String getPreviousPageUri() {
    return previousPageUri;
  }

  public void setPreviousPageUri(String previousPageUri) {
    this.previousPageUri = previousPageUri;
  }

  public ConnectApps start(Integer start) {
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
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ConnectApps total(Integer total) {
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
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ConnectApps uri(String uri) {
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
    ConnectApps connectApps = (ConnectApps) o;
    return Objects.equals(this.connectApps, connectApps.connectApps)
        && Objects.equals(this.end, connectApps.end)
        && Objects.equals(this.firstPageUri, connectApps.firstPageUri)
        && Objects.equals(this.lastPageUri, connectApps.lastPageUri)
        && Objects.equals(this.nextPageUri, connectApps.nextPageUri)
        && Objects.equals(this.numPages, connectApps.numPages)
        && Objects.equals(this.page, connectApps.page)
        && Objects.equals(this.pageSize, connectApps.pageSize)
        && Objects.equals(this.previousPageUri, connectApps.previousPageUri)
        && Objects.equals(this.start, connectApps.start)
        && Objects.equals(this.total, connectApps.total)
        && Objects.equals(this.uri, connectApps.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        connectApps,
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
    sb.append("class ConnectApps {\n");

    sb.append("    connectApps: ").append(toIndentedString(connectApps)).append("\n");
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
