package com.github.xgp.hub.sinch.server;

import com.cloudhopper.sxmp.DeliverRequest;
import com.clxcommunications.xms.api.MoTextSms;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.config.ProviderConfig;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SinchMoResource {

  private final ProviderConfig config;
  private final Router router;
  private final DeliverRequest deliver;

  public SinchMoResource(ProviderConfig config, Router router, DeliverRequest deliver) {
    this.config = config;
    this.router = router;
    this.deliver = deliver;
  }

  @POST
  @Consumes({MediaType.APPLICATION_JSON})
  public Response receiveSms(MoTextSms mo, @Context SecurityContext securityContext) {
    log.info("Sinch mo");

    //  convert mo to deliver, validate

    //  public DeliverResponse onMessage(DeliverRequest deliver) {
    this.router.onMessage(deliver);

    return Response.ok().build();
  }
}
