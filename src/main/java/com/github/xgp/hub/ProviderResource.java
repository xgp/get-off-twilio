package com.github.xgp.hub;

import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliveryReportRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/providers/{provider}")
public class ProviderResource {

  private final Router router;

  @javax.inject.Inject
  public ProviderResource(Router router) {
    this.router = router;
    log.info("ProviderResource created");
  }

  @Path("/mo")
  public Object receiveSms(
      @PathParam("provider") String provider, @Context SecurityContext securityContext) {
    log.error("Received /mo from {}", provider);
    DeliverRequest deliver = new DeliverRequest();
    // TODO setup the deliver

    //  Object getMoResource(DeliverRequest deliver);
    return router.getProviderClientMap().get(provider).getMoResource(deliver);
  }

  @Path("/dlr/{internalId}/{sourceProvider}/{callbackUrl}")
  public Object receiveDeliveryReceipt(
      @PathParam("provider") String provider,
      @PathParam("internalId") String internalId,
      @PathParam("sourceProvider") String sourceProvider,
      @PathParam("callbackUrl") String callbackUrlEnc,
      @Context SecurityContext securityContext) {
    String callbackUrl = decode(callbackUrlEnc);
    log.info("Received /dlr/{}/{}/{} from {}", internalId, sourceProvider, callbackUrl, provider);
    DeliveryReportRequest dlr = new DeliveryReportRequest();
    // TODO setup the dlr

    //  Object getDlrResource(DeliveryReportRequest dlr);
    return router.getProviderClientMap().get(provider).getDlrResource(dlr);
  }

  private String decode(String enc) {
    try {
      return URLDecoder.decode(enc, StandardCharsets.UTF_8.toString());
    } catch (UnsupportedEncodingException e) {
      throw new IllegalArgumentException(e.getCause());
    }
  }
}
