package com.github.xgp.hub.twilio.client;

import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliverResponse;
import com.cloudhopper.sxmp.DeliveryReportResponse;
import com.github.xgp.hub.CallbackApi;
import com.github.xgp.hub.Router;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

@Slf4j
public class TwilioCallbackApi implements CallbackApi {

  private final String callbackUrl;
  private final String callbackMethod;
  private final Router router;

  public TwilioCallbackApi(String callbackUrl, String callbackMethod, Router router) {
    try {
      new URL(callbackUrl);
    } catch (MalformedURLException e) {
      throw new IllegalArgumentException(callbackUrl + " is not a valid URL.", e);
    }
    this.callbackUrl = callbackUrl;
    if (!callbackMethod.equals(HttpGet.METHOD_NAME)
        && !callbackMethod.equals(HttpPost.METHOD_NAME)) {
      throw new IllegalArgumentException(callbackMethod + " is not GET or POST");
    }
    this.callbackMethod = callbackMethod;
    this.router = router;
  }

  List<NameValuePair> getMessageParams(DeliverRequest deliver) {
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(
        new BasicNameValuePair(
            "MessageSid",
            deliver
                .getTicketId())); // A 34 character unique identifier for the message. May be used
    // to later retrieve this message from the REST API.
    params.add(
        new BasicNameValuePair(
            "SmsSid",
            deliver
                .getTicketId())); // Same value as MessageSid. Deprecated and included for backward
    // compatibility.
    params.add(
        new BasicNameValuePair(
            "AccountSid",
            "")); // The 34 character id of the Account this message is associated with.
    params.add(
        new BasicNameValuePair(
            "MessagingServiceSid",
            "")); // The 34 character id of the Messaging Service associated with the message.
    params.add(
        new BasicNameValuePair(
            "From",
            deliver
                .getSourceAddress()
                .getAddress())); // The phone number or Channel address that sent this message.
    params.add(
        new BasicNameValuePair(
            "To",
            deliver
                .getDestinationAddress()
                .getAddress())); // The phone number or Channel address of the recipient.
    params.add(
        new BasicNameValuePair(
            "Body",
            deliver.getText())); // The text body of the message. Up to 1600 characters long.
    params.add(
        new BasicNameValuePair(
            "NumMedia", "0")); // The number of media items associated with your message
    return params;
  }

  List<NameValuePair> getDlrParams(DeliveryReportRequest dlr) {
    List<NameValuePair> params = new ArrayList<NameValuePair>();
    params.add(
        new BasicNameValuePair(
            "MessageSid",
            dlr.getTicketId())); // A 34 character unique identifier for the message. May be used
    // to later retrieve this message from the REST API.
    params.add(
        new BasicNameValuePair(
            "SmsSid",
            dlr.getTicketId())); // Same value as MessageSid. Deprecated and included for backward
    // compatibility.

    params.add(
        new BasicNameValuePair(
            "AccountSid",
            "")); // The 34 character id of the Account this message is associated with.
    params.add(
        new BasicNameValuePair(
            "MessagingServiceSid",
            "")); // The 34 character id of the Messaging Service associated with the message.
    params.add(
        new BasicNameValuePair(
            "From", "")); // The phone number or Channel address that sent this message.
    params.add(
        new BasicNameValuePair("To", "")); // The phone number or Channel address of the recipient.
    params.add(new BasicNameValuePair("MessageStatus", dlr.getStatus().getMessage())); //
    params.add(new BasicNameValuePair("SmsStatus", dlr.getStatus().getMessage())); //
    params.add(new BasicNameValuePair("ApiVersion", "2010-04-01")); //
    return params;
  }

  HttpRequestBase post(List<NameValuePair> params) throws IOException {
    HttpPost request = new HttpPost(callbackUrl);
    request.addHeader("Content-Type", "application/xml; charset=UTF-8");
    request.addHeader("Accept", "application/xml");
    request.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
    return request;
  }

  HttpRequestBase get(List<NameValuePair> params) {
    HttpGet request = new HttpGet(callbackUrl + "?" + URLEncodedUtils.format(params, "UTF-8"));
    request.addHeader("Content-Type", "application/xml; charset=UTF-8");
    request.addHeader("Accept", "application/xml");
    return request;
  }

  @Override
  public DeliverResponse onMessage(DeliverRequest deliver) {
    try (CloseableHttpClient client = getHttpClient()) {
      DeliverResponse deliverResponse = deliver.createResponse();
      HttpRequestBase request = null;
      if (callbackMethod.equals(HttpGet.METHOD_NAME)) request = get(getMessageParams(deliver));
      else if (callbackMethod.equals(HttpPost.METHOD_NAME))
        request = post(getMessageParams(deliver));
      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      int status = response.getStatusLine().getStatusCode();
      if (status == 200) {
        // twiml

        // DeliverResponse
      } else {

      }
      return deliverResponse;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public DeliveryReportResponse onDeliveryReceipt(DeliveryReportRequest dlr) {
    try (CloseableHttpClient client = getHttpClient()) {
      DeliveryReportResponse dlrResponse = dlr.createResponse();
      HttpRequestBase request = null;
      if (callbackMethod.equals(HttpGet.METHOD_NAME)) request = get(getDlrParams(dlr));
      else if (callbackMethod.equals(HttpPost.METHOD_NAME)) request = post(getDlrParams(dlr));
      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      int status = response.getStatusLine().getStatusCode();
      if (status == 200) {
        // twiml

        // DeliveryReportResponse
      } else {

      }
      return dlrResponse;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  // todo maybe pass this or have a factory somewhere
  CloseableHttpClient getHttpClient() {
    CloseableHttpClient client = HttpClients.createDefault();
    return client;
  }
}
