package com.github.xgp.hub.openmarket.server;

import com.cloudhopper.sxmp.DeliverRequest;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.config.ProviderConfig;
import com.openmarket.sms.v4.mo.MobileOriginate;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OpenMarketMoResource {

  private final ProviderConfig config;
  private final Router router;
  private final DeliverRequest deliver;

  public OpenMarketMoResource(ProviderConfig config, Router router, DeliverRequest deliver) {
    this.config = config;
    this.router = router;
    this.deliver = deliver;
  }

  @POST
  @Consumes({MediaType.APPLICATION_XML})
  public Response receiveSms(MobileOriginate mo, @Context SecurityContext securityContext) {
    log.info("OpenMarket mo");

    //  convert mo to deliver, validate

    //  public DeliverResponse onMessage(DeliverRequest deliver) {
    this.router.onMessage(deliver);

    return Response.ok().build();
  }
}
