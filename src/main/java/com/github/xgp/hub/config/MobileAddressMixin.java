package com.github.xgp.hub.config;

import com.cloudhopper.sxmp.MobileAddress;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class MobileAddressMixin {

  @JsonCreator
  public MobileAddressMixin(
      @JsonProperty("type") MobileAddress.Type type, @JsonProperty("address") String address) {}
}
