package com.github.xgp.hub;

import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import com.cloudhopper.sxmp.SubmitRequest;
import com.cloudhopper.sxmp.SubmitResponse;

/**
 * Client for sending submit messages and requesting delivery status. Should be implemented by
 * providers who want to receive MT traffic, and the Router.
 */
public interface ClientApi {
  public SubmitResponse sendMessage(SubmitRequest submit) throws Exception;

  public DeliveryReportRequest getMessageStatus(String id) throws Exception;
}
