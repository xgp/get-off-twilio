package com.github.xgp.hub.twilio.server;

import com.github.xgp.hub.twilio.model.Account;
import com.github.xgp.hub.twilio.model.Accounts;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/Accounts{mediaTypeExtension}")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:43:20.517+02:00[Europe/Paris]")
public class AccountsmediaTypeExtensionApi {

  private AccountsmediaTypeExtensionApiService delegate;

  protected AccountsmediaTypeExtensionApi() {}

  @javax.inject.Inject
  public AccountsmediaTypeExtensionApi(AccountsmediaTypeExtensionApiService delegate) {
    this.delegate = delegate;
  }

  @GET
  @Produces({"application/xml"})
  @Operation(
      summary = "",
      description =
          "Retrieve a list of the Account resources belonging to the account used to make the API request. This list will include that Account as well. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Accounts.class))),
        @ApiResponse(
            responseCode = "302",
            description =
                "A common redirect response; you can GET the representation at the URI in the Location response header. "),
        @ApiResponse(
            responseCode = "304",
            description =
                "Your client's cached version of the representation is still up to date. "),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to access the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description =
                "We couldn't return the representation due to an internal server error. "),
        @ApiResponse(
            responseCode = "503",
            description =
                "We are temporarily unable to return the representation. Please wait for a bit and try again. ")
      })
  public Response accountsmediaTypeExtensionGet(
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsmediaTypeExtensionGet(mediaTypeExtension, securityContext);
  }

  @POST
  @Produces({"application/xml"})
  @Operation(
      summary = "",
      description =
          "Create a new Account instance resource as a subaccount of the one used to make the request. See Creating Subaccounts for more information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. "),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Account.class))),
        @ApiResponse(
            responseCode = "400",
            description =
                "The data given in the POST or PUT failed validation. Inspect the response body for details. "),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to create or update the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't POST or PUT to the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't return the representation due to an internal server error. ")
      })
  public Response accountsmediaTypeExtensionPost(
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsmediaTypeExtensionPost(mediaTypeExtension, securityContext);
  }
}
