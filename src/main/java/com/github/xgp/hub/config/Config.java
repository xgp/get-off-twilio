package com.github.xgp.hub.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Config {

  @JsonProperty("base_url")
  private String baseUrl;

  @JsonProperty("callback_url")
  private String callbackUrl;

  @JsonProperty("server_interface")
  private String serverInterface;

  @JsonProperty("providers")
  private List<ProviderConfig> providers = null;

  @JsonProperty("mappings")
  private List<MappingConfig> mappings = null;

  @JsonProperty("base_url")
  public String getBaseUrl() {
    return baseUrl;
  }

  @JsonProperty("base_url")
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  @JsonProperty("callback_url")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  @JsonProperty("callback_url")
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  @JsonProperty("server_interface")
  public String getServerInterface() {
    return serverInterface;
  }

  @JsonProperty("server_interface")
  public void setServerInterface(String serverInterface) {
    this.serverInterface = serverInterface;
  }

  @JsonProperty("providers")
  public List<ProviderConfig> getProviders() {
    return providers;
  }

  @JsonProperty("providers")
  public void setProviders(List<ProviderConfig> providers) {
    this.providers = providers;
  }

  @JsonProperty("mappings")
  public List<MappingConfig> getMappings() {
    return mappings;
  }

  @JsonProperty("mappings")
  public void setMappings(List<MappingConfig> mappings) {
    this.mappings = mappings;
  }
}
