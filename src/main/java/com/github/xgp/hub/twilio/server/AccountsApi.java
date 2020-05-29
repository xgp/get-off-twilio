package com.github.xgp.hub.twilio.server;

import com.github.xgp.hub.twilio.model.Account;
import com.github.xgp.hub.twilio.model.Application;
import com.github.xgp.hub.twilio.model.Applications;
import com.github.xgp.hub.twilio.model.AuthApp;
import com.github.xgp.hub.twilio.model.AuthApps;
import com.github.xgp.hub.twilio.model.AvailablePhoneNumbers;
import com.github.xgp.hub.twilio.model.Call;
import com.github.xgp.hub.twilio.model.CallInstance;
import com.github.xgp.hub.twilio.model.Calls;
import com.github.xgp.hub.twilio.model.Conference;
import com.github.xgp.hub.twilio.model.Conferences;
import com.github.xgp.hub.twilio.model.ConnectApp;
import com.github.xgp.hub.twilio.model.ConnectApps;
import com.github.xgp.hub.twilio.model.Credential;
import com.github.xgp.hub.twilio.model.CredentialList;
import com.github.xgp.hub.twilio.model.CredentialListMapping;
import com.github.xgp.hub.twilio.model.CredentialListMappings;
import com.github.xgp.hub.twilio.model.CredentialLists;
import com.github.xgp.hub.twilio.model.Credentials;
import com.github.xgp.hub.twilio.model.Domain;
import com.github.xgp.hub.twilio.model.Domains;
import com.github.xgp.hub.twilio.model.IncomingCall;
import com.github.xgp.hub.twilio.model.IncomingCalls;
import com.github.xgp.hub.twilio.model.IpAccessControlListMapping;
import com.github.xgp.hub.twilio.model.IpAddress;
import com.github.xgp.hub.twilio.model.IpAddresses;
import com.github.xgp.hub.twilio.model.Media;
import com.github.xgp.hub.twilio.model.MediaList;
import com.github.xgp.hub.twilio.model.Member;
import com.github.xgp.hub.twilio.model.Members;
import com.github.xgp.hub.twilio.model.Message;
import com.github.xgp.hub.twilio.model.Messages;
import com.github.xgp.hub.twilio.model.Notification;
import com.github.xgp.hub.twilio.model.Notifications;
import com.github.xgp.hub.twilio.model.OutCaller;
import com.github.xgp.hub.twilio.model.OutCallerIds;
import com.github.xgp.hub.twilio.model.OutgoingCallerId;
import com.github.xgp.hub.twilio.model.Participant;
import com.github.xgp.hub.twilio.model.Participants;
import com.github.xgp.hub.twilio.model.PhoneMobileNumbers;
import com.github.xgp.hub.twilio.model.PhoneTollFreeNumbers;
import com.github.xgp.hub.twilio.model.Queue;
import com.github.xgp.hub.twilio.model.Queues;
import com.github.xgp.hub.twilio.model.Recordings;
import com.github.xgp.hub.twilio.model.ShortCode;
import com.github.xgp.hub.twilio.model.ShortCodes;
import com.github.xgp.hub.twilio.model.Transcription;
import com.github.xgp.hub.twilio.model.Transcriptions;
import com.github.xgp.hub.twilio.model.UsageRecords;
import com.github.xgp.hub.twilio.model.UsageTrigger;
import com.github.xgp.hub.twilio.model.UsageTriggers;
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
import javax.ws.rs.core.MediaType;

@Path("/Accounts")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyDIServerCodegen",
    date = "2020-05-22T20:53:26.418+02:00[Europe/Paris]")
public class AccountsApi {

  private AccountsApiService delegate;

  protected AccountsApi() {}

  @javax.inject.Inject
  public AccountsApi(AccountsApiService delegate) {
    this.delegate = delegate;
  }

  @DELETE
  @Path("/{AccountSid}/Applications/{ApplicationSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Delete this application.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "Application deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ApplicationSid")
          String applicationSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidApplicationsApplicationSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, applicationSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Applications/{ApplicationSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get application instance resource.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Application.class))),
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
  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ApplicationSid")
          String applicationSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidApplicationsApplicationSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, applicationSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Applications/{ApplicationSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Tries to update the application's properties, and returns the updated resource representation if successful. The returned response is identical to that returned above when making a GET request. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Application.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ApplicationSid")
          String applicationSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidApplicationsApplicationSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, applicationSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Applications{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of Application resource representations, each representing an application within your account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Applications.class))),
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
  public Response accountsAccountSidApplicationsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidApplicationsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Applications{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Creates a new application within your account.",
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
            content = @Content(schema = @Schema(implementation = Application.class))),
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
  public Response accountsAccountSidApplicationsmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidApplicationsmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/AuthorizedConnectApps/{ConnectAppSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get the properties of the authorized application.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = AuthApp.class))),
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
  public Response accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ConnectAppSid")
          String connectAppSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidAuthorizedConnectAppsConnectAppSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, connectAppSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/AuthorizedConnectApps{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of Connect App resource representations, each representing a Connect App you've authorized to access your account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = AuthApps.class))),
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
  public Response accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidAuthorizedConnectAppsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/AvailablePhoneNumbers/{IsoCountryCode}/Local{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of local AvailablePhoneNumber resource representations that match the specified filters, each representing a phone number tha is currently available for provisioning within your account. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = AvailablePhoneNumbers.class))),
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
  public Response accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "ISO 3166-1 alpha-2.", required = true)
          @PathParam("IsoCountryCode")
          String isoCountryCode,
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
    return delegate.accountsAccountSidAvailablePhoneNumbersIsoCountryCodeLocalmediaTypeExtensionGet(
        accountSid, isoCountryCode, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/AvailablePhoneNumbers/{IsoCountryCode}/Mobile{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of mobile AvailablePhoneNumber resource representations that match the specified filters, each representing a phone number that is currently available for provisioning within your account.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = PhoneMobileNumbers.class))),
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
  public Response accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "ISO 3166-1 alpha-2.", required = true)
          @PathParam("IsoCountryCode")
          String isoCountryCode,
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
    return delegate
        .accountsAccountSidAvailablePhoneNumbersIsoCountryCodeMobilemediaTypeExtensionGet(
            accountSid, isoCountryCode, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/AvailablePhoneNumbers/{IsoCountryCode}/TollFree{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of toll-free AvailablePhoneNumber elements that match the specified filters, each representing a phone number that is currently available for provisioning within your account. To provision an available phone number, POST the number to the IncomingPhoneNumbers resource. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = PhoneTollFreeNumbers.class))),
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
  public Response
      accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "ISO 3166-1 alpha-2.", required = true)
              @PathParam("IsoCountryCode")
              String isoCountryCode,
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
    return delegate
        .accountsAccountSidAvailablePhoneNumbersIsoCountryCodeTollFreemediaTypeExtensionGet(
            accountSid, isoCountryCode, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/AvailablePhoneNumbers{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of all AvailablePhoneNumber subresources for your account by ISO Country. For full information about our phone number support, see our Phone Number CSV (http://www.twilio.com/resources/rates/international-phone-number-rates.csv).",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = AvailablePhoneNumbers.class))),
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
  public Response accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidAvailablePhoneNumbersmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Calls/{CallSid}/Notifications{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of notifications generated for an account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Notifications.class))),
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
  public Response accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
          String callSid,
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
    return delegate.accountsAccountSidCallsCallSidNotificationsmediaTypeExtensionGet(
        accountSid, callSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Calls/{CallSid}/Recordings{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of Recording resource representations, each representing a recording generated during the course of a phone call. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Recordings.class))),
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
  public Response accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
          String callSid,
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
    return delegate.accountsAccountSidCallsCallSidRecordingsmediaTypeExtensionGet(
        accountSid, callSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Calls/{CallSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns the single Call resource identified by {CallSid}.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = CallInstance.class))),
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
  public Response accountsAccountSidCallsCallSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
          String callSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidCallsCallSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, callSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Calls/{CallSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Modify a phone call.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = CallInstance.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidCallsCallSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
          String callSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidCallsCallSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, callSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Calls{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of phone calls made to and from the account identified by {AccountSid}.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Calls.class))),
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
  public Response accountsAccountSidCallsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidCallsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Calls{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "To make a call, make an HTTP POST request. Initiate a new phone call.",
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
            content = @Content(schema = @Schema(implementation = Call.class))),
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
  public Response accountsAccountSidCallsmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidCallsmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/Conferences/{ConferenceSid}/Participants/{CallSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Kick this participant from the conference.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "Participant was successfully booted from the conference."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("ConferenceSid")
              String conferenceSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
              String callSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionDelete(
            accountSid, conferenceSid, mediaTypeExtension, callSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Conferences/{ConferenceSid}/Participants/{CallSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns a representation of this participant.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Participant.class))),
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
  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("ConferenceSid")
              String conferenceSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
              String callSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionGet(
            accountSid, conferenceSid, mediaTypeExtension, callSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Conferences/{ConferenceSid}/Participants/{CallSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Updates the status of a participant.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Participant.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response
      accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("ConferenceSid")
              String conferenceSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
              String callSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidConferencesConferenceSidParticipantsCallSidmediaTypeExtensionPost(
            accountSid, conferenceSid, mediaTypeExtension, callSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Conferences/{ConferenceSid}/Participants{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns the list of participants in the conference identified by {ConferenceSid}. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Participants.class))),
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
  public Response accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ConferenceSid")
          String conferenceSid,
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
    return delegate.accountsAccountSidConferencesConferenceSidParticipantsmediaTypeExtensionGet(
        accountSid, conferenceSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Conferences/{ConferenceSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns a representation of the conference identified by {ConferenceSid}. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Conference.class))),
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
  public Response accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ConferenceSid")
          String conferenceSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidConferencesConferenceSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, conferenceSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Conferences{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of conferences within an account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Conferences.class))),
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
  public Response accountsAccountSidConferencesmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidConferencesmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/ConnectApps/{ConnectAppSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get the properties of a Connect App.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = ConnectApp.class))),
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
  public Response accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ConnectAppSid")
          String connectAppSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, connectAppSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/ConnectApps/{ConnectAppSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Tries to update the Connect App's properties, and returns the updated resource representation if successful. The returned response is identical to that returned above when making a GET request. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = ConnectApp.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ConnectAppSid")
          String connectAppSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidConnectAppsConnectAppSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, connectAppSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/ConnectApps{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of Connect App resource representations, each representing a Connect App in your account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = ConnectApps.class))),
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
  public Response accountsAccountSidConnectAppsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidConnectAppsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Release this phone number from your account. Twilio will no longer answer calls to this number, and you will stop being billed the monthly phone number fee. The phone number will eventually be recycled and potentially given to another customer, so use with care. If you make a mistake, contac us. We may be able to give you the number back. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "Phone number removed."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IncomingPhoneNumberSid")
              String incomingPhoneNumberSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionDelete(
            accountSid, mediaTypeExtension, incomingPhoneNumberSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get info about incoming call's phone number.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = IncomingCall.class))),
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
  public Response accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("IncomingPhoneNumberSid")
          String incomingPhoneNumberSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate
        .accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionGet(
            accountSid, mediaTypeExtension, incomingPhoneNumberSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Tries to update the incoming phone number's properties, and returns the updated resource representation if successful. The returned response is identical to that returned above when making a GET request. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = IncomingCall.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response
      accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IncomingPhoneNumberSid")
              String incomingPhoneNumberSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPost(
            accountSid, mediaTypeExtension, incomingPhoneNumberSid, securityContext);
  }

  @PUT
  @Path("/{AccountSid}/IncomingPhoneNumbers/{IncomingPhoneNumberSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Tries to update the incoming phone number's properties, and returns the updated resource representation if successful. The returned response is identical to that returned above when making a GET request. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = IncomingCall.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("IncomingPhoneNumberSid")
          String incomingPhoneNumberSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate
        .accountsAccountSidIncomingPhoneNumbersIncomingPhoneNumberSidmediaTypeExtensionPut(
            accountSid, mediaTypeExtension, incomingPhoneNumberSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/IncomingPhoneNumbers/Local{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Returns a list of local <IncomingPhoneNumber> elements, each representing a local (not toll-free) phone number given to your account, under an <IncomingPhoneNumbers> list element that includes paging information. Works exactly the same as the IncomingPhoneNumber resource, but filters out toll-free numbers.",
      tags = {})
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
  public Response accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/IncomingPhoneNumbers/Local{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Adds a new phone number to your account. If a phone number is found for your request, Twilio will add it to your account and bill you for the first month's cost of the phone number. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "201", description = "Created"),
        @ApiResponse(
            responseCode = "400",
            description =
                "If Twilio can't find a phone number to match your request, you will receive an HTTP 400 with Twilio error code 21452.")
      })
  public Response accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidIncomingPhoneNumbersLocalmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/IncomingPhoneNumbers/Mobile{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Returns a list of local <IncomingPhoneNumber> elements, each representing a mobile phone number given to your account, under an <IncomingPhoneNumbers> list element that includes paging information. Works exactly the same as the IncomingPhoneNumber resource, but filters out local and toll free numbers.",
      tags = {})
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
  public Response accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/IncomingPhoneNumbers/Mobile{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Adds a new phone number to your account. If a phone number is found for your request, Twilio will add it to your account and bill you for the first month's cost of the phone number.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "201", description = "Created"),
        @ApiResponse(
            responseCode = "400",
            description =
                "If Twilio can't find a phone number to match your request, you will receive an HTTP 400 with Twilio error code 21452.")
      })
  public Response accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidIncomingPhoneNumbersMobilemediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/IncomingPhoneNumbers/TollFree{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Returns a list of local <IncomingPhoneNumber> elements, each representing a toll-free phone number given to your account, under an <IncomingPhoneNumbers> list element that includes paging information. Works exactly the same as the IncomingPhoneNumber resource, but filters out all numbers that aren't toll-free.",
      tags = {})
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
  public Response accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/IncomingPhoneNumbers/TollFree{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Adds a new phone number to your account. If a phone number is found for your request, Twilio will add it to your account and bill you for the first month's cost of the phone number. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "201", description = "Created"),
        @ApiResponse(
            responseCode = "400",
            description =
                "If Twilio can't find a phone number to match your request, you will receive an HTTP 400 with Twilio error code 21452.")
      })
  public Response accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidIncomingPhoneNumbersTollFreemediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/IncomingPhoneNumbers{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of IncomingPhoneNumber resource representations, each representing a phone number given to your account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = IncomingCalls.class))),
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
  public Response accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/IncomingPhoneNumbers{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Purchases a new phone number for your account. If a phone number is found for your request, Twilio will add it to your account and bill you for the first month's cost of the phone number. To find an available phone number to POST, use the subresources of the AvailablePhoneNumbers list resource. ",
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
            content = @Content(schema = @Schema(implementation = IncomingCall.class))),
        @ApiResponse(
            responseCode = "400",
            description =
                "If Twilio cannot find a phone number to match your request, you will receive an HTTP 400 with Twilio error code 21452."),
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
  public Response accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidIncomingPhoneNumbersmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Messages/{MessageSid}/Media/{MediaSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Without an extension, the media is returned using the mime-type provided when the media was generated.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Media.class))),
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
  public Response accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("MessageSid")
          String messageSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("MediaSid")
          String mediaSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidMessagesMessageSidMediaMediaSidmediaTypeExtensionGet(
        accountSid, messageSid, mediaTypeExtension, mediaSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Messages/{MessageSid}/Media{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns a list of media associated with your message.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = MediaList.class))),
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
  public Response accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("MessageSid")
          String messageSid,
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
    return delegate.accountsAccountSidMessagesMessageSidMediamediaTypeExtensionGet(
        accountSid, messageSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Messages/{MessageSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns a single message specified by the provided {MessageSid}. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Message.class))),
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
  public Response accountsAccountSidMessagesMessageSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("MessageSid")
          String messageSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidMessagesMessageSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, messageSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Messages{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of messages associated with your account. The list includes paging information.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Messages.class))),
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
  public Response accountsAccountSidMessagesmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidMessagesmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Messages{mediaTypeExtension}")
  @Consumes({"application/x-www-form-urlencoded"})
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "To send a new outgoing message, make an HTTP POST to your Messages list resource URI",
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
            content = @Content(schema = @Schema(implementation = Message.class))),
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
  public Response accountsAccountSidMessagesmediaTypeExtensionPost(
      @Parameter(description = "", required = true) @FormParam("To") String to,
      @Parameter(description = "", required = true) @FormParam("From") String from,
      @Parameter(description = "", required = true) @FormParam("MessagingServiceSid")
          String messagingServiceSid,
      @Parameter(description = "", required = true) @FormParam("Body") String body,
      @Parameter(description = "", required = true) @FormParam("MediaUrl") String mediaUrl,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidMessagesmediaTypeExtensionPost(
        to,
        from,
        messagingServiceSid,
        body,
        mediaUrl,
        accountSid,
        mediaTypeExtension,
        securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/Notifications/{NotificationSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Deletes the notification identified by {NotificationSid} from an account's log. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "Notification removed."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("NotificationSid")
          String notificationSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidNotificationsNotificationSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, notificationSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Notifications/{NotificationSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get a notification entry.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Notification.class))),
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
  public Response accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("NotificationSid")
          String notificationSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidNotificationsNotificationSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, notificationSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Notifications{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of notifications generated for an account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Notifications.class))),
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
  public Response accountsAccountSidNotificationsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidNotificationsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Deletes the caller ID from the account. Returns an HTTP 204 response if successful, with no body. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "Deletion successful."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("OutgoingCallerIdSid")
          String outgoingCallerIdSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, outgoingCallerIdSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get the set of an account's verified phone numbers.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = OutgoingCallerId.class))),
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
  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("OutgoingCallerIdSid")
          String outgoingCallerIdSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, outgoingCallerIdSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Updates the caller id, and returns the updated resource if successful.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = OutgoingCallerId.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("OutgoingCallerIdSid")
          String outgoingCallerIdSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, outgoingCallerIdSid, securityContext);
  }

  @PUT
  @Path("/{AccountSid}/OutgoingCallerIds/{OutgoingCallerIdSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Updates the caller id, and returns the updated resource if successful.",
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
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("OutgoingCallerIdSid")
          String outgoingCallerIdSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidOutgoingCallerIdsOutgoingCallerIdSidmediaTypeExtensionPut(
        accountSid, mediaTypeExtension, outgoingCallerIdSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/OutgoingCallerIds{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of OutgoingCallerId resource representations, each representing a Caller ID number valid for an account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = OutCallerIds.class))),
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
  public Response accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidOutgoingCallerIdsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/OutgoingCallerIds{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Adds a new CallerID to your account.",
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
            content = @Content(schema = @Schema(implementation = OutCaller.class))),
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
  public Response accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidOutgoingCallerIdsmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Queues/{QueueSid}/Members/{CallSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get a specific member.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Member.class))),
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
  public Response accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
          String callSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionGet(
        accountSid, queueSid, mediaTypeExtension, callSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Queues/{QueueSid}/Members/{CallSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Posting a URL and Method to a Queue instance will dequeue a member from a queue and have the member's call begin executing the TwiML document at that URL When redirecting a member of a queue addressed by CallSid, only the first request will succeed and return a 200 response code. A second request will fail and return an appropriate 400 response code. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Member.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
        @ApiResponse(responseCode = "400", description = "Member was already dequed."),
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
  public Response accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CallSid")
          String callSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidQueuesQueueSidMembersCallSidmediaTypeExtensionPost(
        accountSid, queueSid, mediaTypeExtension, callSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Queues/{QueueSid}/Members/Front{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get a front member.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Member.class))),
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
  public Response accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
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
    return delegate.accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionGet(
        accountSid, queueSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Queues/{QueueSid}/Members/Front{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Posting a URL and Method to a Queue instance will dequeue a member from a queue and have the member's call begin executing the TwiML document at that URL When dequeuing the 'Front' of the queue, the next call in the queue will be redirected. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Member.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
        @ApiResponse(responseCode = "400", description = "Member was already dequed."),
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
  public Response accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
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
    return delegate.accountsAccountSidQueuesQueueSidMembersFrontmediaTypeExtensionPost(
        accountSid, queueSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Queues/{QueueSid}/Members{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns the list of members in the queue identified by {QueueSid}.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Members.class))),
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
  public Response accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
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
    return delegate.accountsAccountSidQueuesQueueSidMembersmediaTypeExtensionGet(
        accountSid, queueSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/Queues/{QueueSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "The DELETE method allows you to remove a Queue. Only empty queues are deletable. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "Queue removed."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidQueuesQueueSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, queueSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Queues/{QueueSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get resource's individual Queue instance. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Queue.class))),
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
  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidQueuesQueueSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, queueSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Queues/{QueueSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "This POST request allows you to change the FriendlyName or MaxSize. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Queue.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidQueuesQueueSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("QueueSid")
          String queueSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidQueuesQueueSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, queueSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Queues{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of queues within an account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Queues.class))),
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
  public Response accountsAccountSidQueuesmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidQueuesmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Queues{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Create a new Queue resource. ",
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
            content = @Content(schema = @Schema(implementation = Queue.class))),
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
  public Response accountsAccountSidQueuesmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidQueuesmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Recordings/{RecordingSid}/Transcriptions{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a set of Transcription resource representations that includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Transcriptions.class))),
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
  public Response accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("RecordingSid")
          String recordingSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidRecordingsRecordingSidTranscriptionsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, recordingSid, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/Recordings/{RecordingSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Deletes a recording  from your account.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "Deletion successful."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description = "",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".wav", ".mp3"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("RecordingSid")
          String recordingSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidRecordingsRecordingSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, recordingSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Recordings/{RecordingSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Returns one of several representations: Without an extension, or with a \".wav\", a binary WAV audio file is returned with mime-type \"audio/x-wav\". Appending \".mp3\" to the URI returns a binary MP3 audio file with mime-type type \"audio/mpeg\". Appending \".xml\" to the URI returns a XML representation. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "200", description = "A binary WAV audio file is returned."),
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
  public Response accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description = "",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".wav", ".mp3"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("RecordingSid")
          String recordingSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidRecordingsRecordingSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, recordingSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Recordings{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of Recording resource representations, each representing a recording generated during the course of a phone call. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Recordings.class))),
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
  public Response accountsAccountSidRecordingsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidRecordingsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials/{CredentialSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Remove a Credential from a CredentialList.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "The request was successful; the resource was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
              String clSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("CredentialSid")
              String credentialSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionDelete(
            accountSid, clSid, mediaTypeExtension, credentialSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials/{CredentialSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Get a specific Credential in a list. Though a password is stored for each username in your list, the password is not returned to protect your password. If you cannot remember your password, you will need to POST to this resource to update it.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Credential.class))),
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
  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
              String clSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("CredentialSid")
              String credentialSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionGet(
            accountSid, clSid, mediaTypeExtension, credentialSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials/{CredentialSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Change the password of a Credential record.  If the change is successful, Twilio will respond with the Credential record but will not include the password in the response. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Credential.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response
      accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
              String clSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("CredentialSid")
              String credentialSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPCredentialListsCLSidCredentialsCredentialSidmediaTypeExtensionPost(
            accountSid, clSid, mediaTypeExtension, credentialSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Get the list of Credentials in a CredentialList. The passwords for the Credentials are intentionally not returned so as to protect them.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Credentials.class))),
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
  public Response accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
          String clSid,
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
    return delegate.accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionGet(
        accountSid, clSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}/Credentials{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Add a Credential to the CredentialList.  When creating a Credential, you will POST both a username and password, but only receive the username back in the response. The password is intentionally not returned so as to protect it. ",
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
            content = @Content(schema = @Schema(implementation = Credential.class))),
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
  public Response accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
          String clSid,
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
    return delegate.accountsAccountSidSIPCredentialListsCLSidCredentialsmediaTypeExtensionPost(
        accountSid, clSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Delete a CredentialList from your account. It can only be deleted if no domains are mapped to it. If you attempt to delete one that is mapped to a domain, you will receive an error.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "The request was successful; the resource was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
          String clSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, clSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get a credential list instance resource",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = CredentialList.class))),
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
  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
          String clSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, clSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/CredentialLists/{CLSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Change the FriendlyName of the list",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = CredentialList.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
          String clSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPCredentialListsCLSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, clSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/CredentialLists{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Gets a list of Credential Lists for an account",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = CredentialLists.class))),
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
  public Response accountsAccountSidSIPCredentialListsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidSIPCredentialListsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/CredentialLists{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Create a new Credential List.",
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
            content = @Content(schema = @Schema(implementation = CredentialList.class))),
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
  public Response accountsAccountSidSIPCredentialListsmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidSIPCredentialListsmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path(
      "/{AccountSid}/SIP/Domains/{SipDomainSid}/CredentialListMappings/{CLSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Remove a CredentialListMapping from a domain",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "The request was successful; the resource was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("SipDomainSid")
              String sipDomainSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("CLSid")
              String clSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsCLSidmediaTypeExtensionDelete(
            accountSid, sipDomainSid, mediaTypeExtension, clSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/Domains/{SipDomainSid}/CredentialListMappings{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get the user lists mapped to this domain.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = CredentialListMappings.class))),
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
  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("SipDomainSid")
              String sipDomainSid,
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
    return delegate
        .accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionGet(
            accountSid, sipDomainSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/Domains/{SipDomainSid}/CredentialListMappings{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Map a CredentialList to the domain.",
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
            content = @Content(schema = @Schema(implementation = CredentialListMapping.class))),
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
  public Response
      accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("SipDomainSid")
              String sipDomainSid,
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
    return delegate
        .accountsAccountSidSIPDomainsSipDomainSidCredentialListMappingsmediaTypeExtensionPost(
            accountSid, sipDomainSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path(
      "/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings/{ALSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Remove a mapping from this domain.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "The request was successful; the resource was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("SipDomainSid")
              String sipDomainSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("ALSid")
              String alSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionDelete(
            accountSid, sipDomainSid, mediaTypeExtension, alSid, securityContext);
  }

  @GET
  @Path(
      "/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings/{ALSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Return a specific IpAccessControlListMapping instance by Sid.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content =
                @Content(schema = @Schema(implementation = IpAccessControlListMapping.class))),
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
  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("SipDomainSid")
              String sipDomainSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("ALSid")
              String alSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsALSidmediaTypeExtensionGet(
            accountSid, sipDomainSid, mediaTypeExtension, alSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Return the IpAccessControlListMappings that are associated to this domain.",
      tags = {})
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("SipDomainSid")
              String sipDomainSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionGet(
            accountSid, sipDomainSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/Domains/{SipDomainSid}/IpAccessControlListMappings{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Map an IpAccessControlList to this domain.",
      tags = {})
  @ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Created")})
  public Response
      accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("SipDomainSid")
              String sipDomainSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPDomainsSipDomainSidIpAccessControlListMappingsmediaTypeExtensionPost(
            accountSid, sipDomainSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/SIP/Domains/{SipDomainSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Delete a domain. If you have created subdomains of a domain, you will not be able to delete the domain until you first delete all subdomains of it.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "The request was successful; the resource was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("SipDomainSid")
          String sipDomainSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, sipDomainSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/Domains/{SipDomainSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Return a specific instance by Sid.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Domain.class))),
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
  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("SipDomainSid")
          String sipDomainSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, sipDomainSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/Domains/{SipDomainSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Update the attributes of a domain.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Domain.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("SipDomainSid")
          String sipDomainSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPDomainsSipDomainSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, sipDomainSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/Domains{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns a paged list of the domains for an account.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Domains.class))),
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
  public Response accountsAccountSidSIPDomainsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidSIPDomainsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/Domains{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Creates a new Domain and returns its instance resource. You must pick a unique domain name that ends in \".sip.twilio.com\". After creating a Domain, you must map it to an authentication method before the domain is ready to receive traffic. ",
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
            content = @Content(schema = @Schema(implementation = Domain.class))),
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
  public Response accountsAccountSidSIPDomainsmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidSIPDomainsmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path(
      "/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses/{IpAddressSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Deletes an IP address entry from the list.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "The request was successful; the resource was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAddressSid")
              String ipAddressSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionDelete(
            accountSid, ipAccessControlListSid, mediaTypeExtension, ipAddressSid, securityContext);
  }

  @GET
  @Path(
      "/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses/{IpAddressSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Return a single IP Address resource.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = IpAddress.class))),
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
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAddressSid")
              String ipAddressSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionGet(
            accountSid, ipAccessControlListSid, mediaTypeExtension, ipAddressSid, securityContext);
  }

  @POST
  @Path(
      "/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses/{IpAddressSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Change the description or IP address of a given IpAddress instance resource",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = IpAddress.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAddressSid")
              String ipAddressSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesIpAddressSidmediaTypeExtensionPost(
            accountSid, ipAccessControlListSid, mediaTypeExtension, ipAddressSid, securityContext);
  }

  @GET
  @Path(
      "/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "List the IP Addresses contained in this list.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = IpAddresses.class))),
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
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
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
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionGet(
            accountSid, ipAccessControlListSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path(
      "/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}/IpAddresses{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Add an IP Address to the list with a description.",
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
            content = @Content(schema = @Schema(implementation = IpAddress.class))),
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
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
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
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidIpAddressesmediaTypeExtensionPost(
            accountSid, ipAccessControlListSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description =
          "Delete an IpAccessControlList from your account. It can only be deleted if no domains are mapped to it. If you attempt to delete one that is mapped to a domain, you will receive an error.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "204",
            description = "The request was successful; the resource was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionDelete(
            accountSid, mediaTypeExtension, ipAccessControlListSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Return a specific IpAccessControlList resource.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content =
                @Content(schema = @Schema(implementation = IpAccessControlListMapping.class))),
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
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionGet(
            accountSid, mediaTypeExtension, ipAccessControlListSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/IpAccessControlLists/{IpAccessControlListSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Rename an IpAccessControlList.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content =
                @Content(schema = @Schema(implementation = IpAccessControlListMapping.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response
      accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost(
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("AccountSid")
              String accountSid,
          @Parameter(
                  in = ParameterIn.PATH,
                  description =
                      "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
                  required = true,
                  schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
              @PathParam("mediaTypeExtension")
              String mediaTypeExtension,
          @Parameter(in = ParameterIn.PATH, description = "", required = true)
              @PathParam("IpAccessControlListSid")
              String ipAccessControlListSid,
          @Context SecurityContext securityContext)
          throws NotFoundException {
    return delegate
        .accountsAccountSidSIPIpAccessControlListsIpAccessControlListSidmediaTypeExtensionPost(
            accountSid, mediaTypeExtension, ipAccessControlListSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SIP/IpAccessControlLists{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Return a paged list of all IpAccessControlLists under this account.",
      tags = {})
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "OK")})
  public Response accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SIP/IpAccessControlLists{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Create a new IpAccessControlList resource.  When created, the list will contain no IP addresses. You will need to add IP addresses to the list for it to be active. To add IP addresses, you will need to POST to the IpAddresses List subresource. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "201",
            description = "Created",
            content = @Content(schema = @Schema(implementation = IpAccessControlListMapping.class)))
      })
  public Response accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSIPIpAccessControlListsmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SMS/ShortCodes/{ShortCodeSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Get a single message.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = ShortCode.class))),
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
  public Response accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ShortCodeSid")
          String shortCodeSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, shortCodeSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/SMS/ShortCodes/{ShortCodeSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Tries to update the shortcode's properties, and returns the updated resource representation if successful. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = ShortCode.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("ShortCodeSid")
          String shortCodeSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidSMSShortCodesShortCodeSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, shortCodeSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/SMS/ShortCodes{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of ShortCode resource representations, each representing a short code within your account. The list includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = ShortCodes.class))),
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
  public Response accountsAccountSidSMSShortCodesmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidSMSShortCodesmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/Transcriptions/{TranscriptionSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Deletes a transcription from your account.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "Deletion successful."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".json", ".csv", ".html", ".txt", ".xml"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("TranscriptionSid")
          String transcriptionSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, transcriptionSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Transcriptions/{TranscriptionSid}{mediaTypeExtension}")
  @Produces({"application/xml", "application/text"})
  @Operation(
      summary = "",
      description =
          "Returns a single Transcription resource representation identified by the given {TranscriptionSid}. By default Twilio will respond with the XML metadata for the Transcription. If you append \".txt\" to the end of the Transcription resource's URI Twilio will just return you the transcription tex. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Transcription.class))),
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
  public Response accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".json", ".csv", ".html", ".txt", ".xml"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("TranscriptionSid")
          String transcriptionSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidTranscriptionsTranscriptionSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, transcriptionSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Transcriptions{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a set of Transcription resource representations that includes paging information. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Transcriptions.class))),
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
  public Response accountsAccountSidTranscriptionsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidTranscriptionsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Usage/Records/{Subresource}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns UsageRecords for all usage categories for a specified period. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = UsageRecords.class))),
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
  public Response accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "|Subresource|Description| |---|---| |Daily|Return multiple UsageRecords for each usage category, each representing usage over a daily time-interval.| |Monthly|Return multiple UsageRecords for each usage category, each representing usage over a monthly time-interval.| |Yearly|Return multple UsageRecords for each usage category, each representing usage over a yearly time-interval.| |AllTime|  Return a single UsageRecord for each usage category, each representing usage over the date-range specified. This is the same as the root /Usage/Records.| |Today|Return a single UsageRecord per usage category, for today's usage only.| ||Yesterday|Return a single UsageRecord per usage category, for yesterday's usage only.| |ThisMonth|Return a single UsageRecord per usage category, for this month's usage only.| |LastMonth|Return a single UsageRecord per usage category, for last month's usage only.| ",
              required = true,
              schema =
                  @Schema(
                      allowableValues = {
                        "Daily",
                        "Monthly",
                        "Yearly",
                        "AllTime",
                        "Today",
                        "Yesterday",
                        "ThisMonth",
                        "LastMonth"
                      }))
          @PathParam("Subresource")
          String subresource,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidUsageRecordsSubresourcemediaTypeExtensionGet(
        accountSid, mediaTypeExtension, subresource, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Usage/Records{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns UsageRecords for all usage categories. The list includes paging information. By default, the UsageRecords resource will return one UsageRecord for each Category, representing all usage accrued all-time for the account. You can filter the usage Category or change the date-range over which usage is counted using optional GET query parameters. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = UsageRecords.class))),
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
  public Response accountsAccountSidUsageRecordsmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidUsageRecordsmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @DELETE
  @Path("/{AccountSid}/Usage/Triggers/{UsageTriggerSid}{mediaTypeExtension}")
  @Operation(
      summary = "",
      description = "Delete this UsageTrigger.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(responseCode = "204", description = "UsageTrigger was deleted."),
        @ApiResponse(
            responseCode = "401",
            description =
                "The supplied credentials, if any, are not sufficient to delete the resource. "),
        @ApiResponse(responseCode = "404", description = "NOT FOUND."),
        @ApiResponse(responseCode = "405", description = "You can't DELETE the resource."),
        @ApiResponse(
            responseCode = "429",
            description = "Your application is sending too many simultaneous requests."),
        @ApiResponse(
            responseCode = "500",
            description = "We couldn't delete the resource. Please try again.")
      })
  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("UsageTriggerSid")
          String usageTriggerSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionDelete(
        accountSid, mediaTypeExtension, usageTriggerSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Usage/Triggers/{UsageTriggerSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns a repesentation of the UsageTrigger.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = UsageTrigger.class))),
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
  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("UsageTriggerSid")
          String usageTriggerSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, usageTriggerSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Usage/Triggers/{UsageTriggerSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Tries to update the UsageTrigger's properties, and returns the updated resource representation if successful. ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = UsageTrigger.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(in = ParameterIn.PATH, description = "", required = true)
          @PathParam("UsageTriggerSid")
          String usageTriggerSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidUsageTriggersUsageTriggerSidmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, usageTriggerSid, securityContext);
  }

  @GET
  @Path("/{AccountSid}/Usage/Triggers{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Returns a list of UsageTrigger resource representations. The list includes paging information. By default, all UsageTriggers are returned. You can filter the list by specifying one or more query parameters. Note that the query parameters are case-sensitive ",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = UsageTriggers.class))),
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
  public Response accountsAccountSidUsageTriggersmediaTypeExtensionGet(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidUsageTriggersmediaTypeExtensionGet(
        accountSid, mediaTypeExtension, securityContext);
  }

  @POST
  @Path("/{AccountSid}/Usage/Triggers{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description =
          "Creates a new UsageTrigger. Each account can create up to 1,000 UsageTriggers. Currently, UsageTriggers that are no longer active are not deleted automatically. Use DELETE to delete triggers you no longer need. ",
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
            content = @Content(schema = @Schema(implementation = UsageTrigger.class))),
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
  public Response accountsAccountSidUsageTriggersmediaTypeExtensionPost(
      @Parameter(in = ParameterIn.PATH, description = "", required = true) @PathParam("AccountSid")
          String accountSid,
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
    return delegate.accountsAccountSidUsageTriggersmediaTypeExtensionPost(
        accountSid, mediaTypeExtension, securityContext);
  }

  @GET
  @Path("/{AccountSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Returns a representation of an account.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful and the response body contains the representation requested. ",
            content = @Content(schema = @Schema(implementation = Account.class))),
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
  public Response accountsAccountSidmediaTypeExtensionGet(
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(
              in = ParameterIn.PATH,
              description = "A 34 character string that uniquely identifies this account.",
              required = true)
          @PathParam("AccountSid")
          String accountSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidmediaTypeExtensionGet(
        mediaTypeExtension, accountSid, securityContext);
  }

  @POST
  @Path("/{AccountSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Allows you to modify the properties of an account.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Account.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidmediaTypeExtensionPost(
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(
              in = ParameterIn.PATH,
              description = "A 34 character string that uniquely identifies this account.",
              required = true)
          @PathParam("AccountSid")
          String accountSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidmediaTypeExtensionPost(
        mediaTypeExtension, accountSid, securityContext);
  }

  @PUT
  @Path("/{AccountSid}{mediaTypeExtension}")
  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
  @Operation(
      summary = "",
      description = "Allows you to modify the properties of an account.",
      tags = {})
  @ApiResponses(
      value = {
        @ApiResponse(
            responseCode = "200",
            description =
                "The request was successful, we updated the resource and the response body contains the representation. ",
            content = @Content(schema = @Schema(implementation = Account.class))),
        @ApiResponse(
            responseCode = "201",
            description =
                "The request was successful, we created a new resource and the response body contains the representation. "),
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
  public Response accountsAccountSidmediaTypeExtensionPut(
      @Parameter(
              in = ParameterIn.PATH,
              description =
                  "By default, Twilio's REST API returns XML. You may obtain CSV, JSON or HTML by appending \".csv\", \".json\", or \".html\". ",
              required = true,
              schema = @Schema(allowableValues = {".xml", ".json", ".csv", ".html"}))
          @PathParam("mediaTypeExtension")
          String mediaTypeExtension,
      @Parameter(
              in = ParameterIn.PATH,
              description = "A 34 character string that uniquely identifies this account.",
              required = true)
          @PathParam("AccountSid")
          String accountSid,
      @Context SecurityContext securityContext)
      throws NotFoundException {
    return delegate.accountsAccountSidmediaTypeExtensionPut(
        mediaTypeExtension, accountSid, securityContext);
  }
}
