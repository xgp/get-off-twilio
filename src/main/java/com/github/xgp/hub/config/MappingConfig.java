package com.github.xgp.hub.config;

import com.cloudhopper.sxmp.MobileAddress;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MappingConfig {

  @JsonProperty("type")
  private String type;

  @JsonProperty("addresses")
  private List<MobileAddress> addresses = null;

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("addresses")
  public List<MobileAddress> getAddresses() {
    return addresses;
  }

  @JsonProperty("addresses")
  public void setAddresses(List<MobileAddress> addresses) {
    this.addresses = addresses;
  }
}
