package com.github.xgp.hub.sxmp;

import com.cloudhopper.sxmp.MobileAddress;
import com.cloudhopper.sxmp.OptionalParamMap;
import com.cloudhopper.sxmp.SxmpErrorCode;
import com.cloudhopper.sxmp.SxmpErrorException;
import com.cloudhopper.sxmp.util.ToStringUtil;

public class DeliveryReportRequest extends com.cloudhopper.sxmp.DeliveryReportRequest {

  private Integer operatorId;
  private MobileAddress sourceAddress;
  private MobileAddress destinationAddress;
  private OptionalParamMap optionalParams;

  public void setSourceAddress(MobileAddress value) {
    this.sourceAddress = value;
  }

  public MobileAddress getSourceAddress() {
    return this.sourceAddress;
  }

  public void setDestinationAddress(MobileAddress value) {
    this.destinationAddress = value;
  }

  public MobileAddress getDestinationAddress() {
    return this.destinationAddress;
  }

  public void setOperatorId(Integer value) throws com.cloudhopper.sxmp.SxmpErrorException {
    if (value != null && value < 0) {
      throw new SxmpErrorException(
          SxmpErrorCode.INVALID_VALUE, "The [operatorId] must be greater than or equal to 0");
    }
    this.operatorId = value;
  }

  public Integer getOperatorId() {
    return this.operatorId;
  }

  public void setOptionalParams(OptionalParamMap optionalParams) {
    this.optionalParams = optionalParams;
  }

  public OptionalParamMap getOptionalParams() {
    return optionalParams;
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append(super.toString())
        .append(" (operator [")
        .append(ToStringUtil.nullSafe(this.operatorId))
        .append("] srcAddr [")
        .append(ToStringUtil.nullSafe(this.sourceAddress))
        .append("] destAddr [")
        .append(ToStringUtil.nullSafe(this.destinationAddress))
        .append("] optParams [")
        .append(ToStringUtil.nullSafe(this.optionalParams))
        .append("])")
        .toString();
  }
}
