package com.github.xgp.hub.sinch.server;

import com.cloudhopper.sxmp.DeliveryStatus;
import com.clxcommunications.xms.api.BatchDeliveryReport;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.config.ProviderConfig;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SinchDlrResource {

  private final ProviderConfig config;
  private final Router router;
  private final DeliveryReportRequest dlr;

  public SinchDlrResource(ProviderConfig config, Router router, DeliveryReportRequest dlr) {
    this.config = config;
    this.router = router;
    this.dlr = dlr;
  }

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  public Response receiveDeliveryReceipt(
      BatchDeliveryReport report, @Context SecurityContext securityContext) {
    log.info("Sinch dlr: {}", report);
    //  convert deliveryReceipt to dlr, validate
    dlr.setStatus(
        new DeliveryStatus(
            report.statuses().get(0).code(),
            report.statuses().get(0).status().status())); // TODO convert to internal type
    //  public DeliveryReportResponse onDeliveryReceipt(DeliveryReportRequest dlr) {
    this.router.onDeliveryReceipt(dlr);
    return Response.ok().build();
  }
}
