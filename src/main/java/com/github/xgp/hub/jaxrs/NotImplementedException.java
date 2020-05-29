package com.github.xgp.hub.jaxrs;

import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/** HTTP 501 Not Implemented exception */
public class NotImplementedException extends ServerErrorException {

  public NotImplementedException() {
    this("Not Implemented");
  }

  public NotImplementedException(String message) {
    super(
        Response.status(Response.Status.fromStatusCode(501))
            .entity(message)
            .type(MediaType.TEXT_PLAIN)
            .build());
  }
}
