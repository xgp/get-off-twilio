package com.github.xgp.hub;

import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliverResponse;
import com.cloudhopper.sxmp.DeliveryReportRequest;
import com.cloudhopper.sxmp.DeliveryReportResponse;

/**
 * Receive deliver messages and DLRs via callbacks from providers. Should be implemented by the
 * Router and interface provider, and called by providers who want to send MO traffic in their
 * endpoint implementations.
 */
public interface CallbackApi {
  public DeliverResponse onMessage(DeliverRequest deliver);

  public DeliveryReportResponse onDeliveryReceipt(DeliveryReportRequest dlr);
}
