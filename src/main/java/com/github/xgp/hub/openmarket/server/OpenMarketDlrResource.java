package com.github.xgp.hub.openmarket.server;

import com.github.xgp.hub.Router;
import com.github.xgp.hub.config.ProviderConfig;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import com.openmarket.sms.v4.mt.DeliveryReceipt;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenMarketDlrResource {

  private final ProviderConfig config;
  private final Router router;
  private final DeliveryReportRequest dlr;

  public OpenMarketDlrResource(ProviderConfig config, Router router, DeliveryReportRequest dlr) {
    this.config = config;
    this.router = router;
    this.dlr = dlr;
  }

  @POST
  @Consumes({MediaType.APPLICATION_XML})
  public Response receiveDeliveryReceipt(
      DeliveryReceipt deliveryRedeipt, @Context SecurityContext securityContext) {
    log.info("OpenMarket dlr");
    //  convert deliveryReceipt to dlr, validate

    //  public DeliveryReportResponse onDeliveryReceipt(DeliveryReportRequest dlr) {
    this.router.onDeliveryReceipt(dlr);

    return Response.ok().build();
  }
}
