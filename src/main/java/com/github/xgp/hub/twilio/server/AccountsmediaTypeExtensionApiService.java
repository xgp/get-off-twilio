package com.github.xgp.hub.twilio.server;





import javax.validation.constraints.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public interface AccountsmediaTypeExtensionApiService {
  public Response accountsmediaTypeExtensionGet(
      String mediaTypeExtension, SecurityContext securityContext);

  public Response accountsmediaTypeExtensionPost(
      String mediaTypeExtension, SecurityContext securityContext);
}
