package com.github.xgp.hub.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Config {

  @JsonProperty("providers")
  private List<ProviderConfig> providers = null;

  @JsonProperty("mappings")
  private List<MappingConfig> mappings = null;

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
