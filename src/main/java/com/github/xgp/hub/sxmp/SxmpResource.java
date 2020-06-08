package com.github.xgp.hub.sxmp;

import com.cloudhopper.sxmp.Account;
import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliverResponse;
import com.cloudhopper.sxmp.DeliveryReportResponse;
import com.cloudhopper.sxmp.SubmitRequest;
import com.cloudhopper.sxmp.SubmitResponse;
import com.cloudhopper.sxmp.SxmpProcessor;
import com.cloudhopper.sxmp.servlet.HttpStatusCodeException;
import com.cloudhopper.sxmp.servlet.SxmpServletProcessor;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.jaxrs.NotImplementedException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.core.UriInfo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/sxmp/1.2")
public class SxmpResource implements SxmpProcessor {

  public static final String PROVIDER_ID = "sxmp";

  @Context UriInfo uriInfo;
  private final Router router;

  @javax.inject.Inject
  public SxmpResource(Router router) {
    this.router = router;
  }

  @POST
  @Produces({MediaType.TEXT_XML})
  @Consumes({MediaType.TEXT_XML})
  public Response processSxmp(
      @HeaderParam("Content-Type") String contentType, InputStream requestBody) {
    SxmpProcessor processor = this;
    StreamingOutput stream =
        new StreamingOutput() {
          @Override
          public void write(OutputStream os) throws IOException, WebApplicationException {
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os)));
            try {
              SxmpServletProcessor.doProcess(
                  processor,
                  requestBody,
                  out,
                  uriInfo.getAbsolutePath().toString(),
                  "POST",
                  contentType);
            } catch (HttpStatusCodeException e) {
              log.warn("Bad HTTP request, return non-200 status code: {}", e.getMessage());
              throw new WebApplicationException(e.getMessage(), e.getStatusCode());
            } catch (Throwable t) {
              log.error("Uncaught exception during SXMP doProcess", t);
              throw new WebApplicationException(
                  t.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
            }
            out.flush(); // <-- This is very important.  Do not forget.
          }
        };
    return Response.ok(stream).header("Content-Type", "text/xml; charset=\"iso-8859-1\"").build();
  }

  @Override
  public boolean authenticate(Account account) {
    return true;
  }

  @Override
  public DeliverResponse deliver(Account account, DeliverRequest deliverRequest) {
    throw new NotImplementedException();
  }

  @Override
  public DeliveryReportResponse deliveryReport(
      Account account, com.cloudhopper.sxmp.DeliveryReportRequest deliveryRequest) {
    throw new NotImplementedException();
  }

  @Override
  public SubmitResponse submit(Account account, SubmitRequest submitRequest) {
    router.createSubmitRequest(PROVIDER_ID, submitRequest);
    try {
      return router.sendMessage(submitRequest);
    } catch (Exception e) {
      throw new WebApplicationException(e);
    }
  }
}
