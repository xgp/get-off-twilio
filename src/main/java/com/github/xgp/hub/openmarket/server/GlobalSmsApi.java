package com.github.xgp.hub.openmarket.server;

import com.openmarket.sms.v4.mo.MobileOriginate;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/openmarket")
public class GlobalSmsApi {

  @POST
  @Path("/mo")
  @Consumes({MediaType.APPLICATION_XML})
  public Response receiveSms(MobileOriginate mo, @Context SecurityContext securityContext) {
    // do
    return Response.ok().build();
  }

  // - convert the url to
  // http://local.url/<provider>/dlr/<internal_id>/<source_provider>/<urlencode(base64(callback))>
  @POST
  @Path("/dlr/{internalId}/{sourceProvider}/{callbackUrl}")
  @Consumes({MediaType.APPLICATION_XML})
  public Response receiveDeliveryReceipt(
      @PathParam("internalId") String internalId,
      @PathParam("sourceProvider") String sourceProvider,
      @PathParam("callbackUrl") String callbackUrl,
      @Context SecurityContext securityContext) {
    // do
    return Response.ok().build();
  }
}
