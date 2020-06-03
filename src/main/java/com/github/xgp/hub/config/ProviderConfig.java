package com.github.xgp.hub.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProviderConfig {

  @JsonProperty("type")
  private String type;

  @JsonProperty("credentials")
  private Credentials credentials;

  @JsonProperty("config")
  private Map<String, String> config = new HashMap<String, String>();

  @JsonProperty("default")
  private Boolean _default;

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("credentials")
  public Credentials getCredentials() {
    return credentials;
  }

  @JsonProperty("credentials")
  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  @JsonProperty("config")
  public Map<String, String> getConfig() {
    return config;
  }

  @JsonProperty("config")
  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }

  @JsonProperty("default")
  public void setDefault(Boolean _default) {
    this._default = _default;
  }
}
