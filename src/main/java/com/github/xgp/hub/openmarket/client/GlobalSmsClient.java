package com.github.xgp.hub.openmarket.client;

import com.openmarket.sms.v4.mt.MobileTerminate;
import com.openmarket.sms.v4.mt.MtStatus;
import com.openmarket.sms.v4.preview.Preview;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import lombok.NonNull;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * OpenMarket HTTP Global SMS API requests, using XML format.
 * https://www.openmarket.com/docs/Content/apis/v4http/overview.htm Can be used as an OpenMarket
 * client outside of the context of hub.
 */
public class GlobalSmsClient {

  private final UsernamePasswordCredentials creds;

  public GlobalSmsClient(@NonNull String accountId, @NonNull String password) {
    this.creds = new UsernamePasswordCredentials(accountId, password);
  }

  // https://www.openmarket.com/docs/Content/apis/v4http/send-xml.htm
  // POST https://smsc.openmarket.com/sms/v4/mt

  /**
   * Send an SMS message
   *
   * @param mt MobileTerminate message envelope
   * @return ticketId
   */
  public GlobalSmsResponse<String> sendSms(MobileTerminate mt) throws RejectedException {
    try (CloseableHttpClient client = getHttpClient()) {
      HttpPost request = new HttpPost("https://smsc.openmarket.com/sms/v4/mt");
      request.addHeader("Content-Type", "application/xml; charset=UTF-8");
      request.addHeader("Accept", "application/xml");
      addAuthorization(request);

      JAXBContext context = JAXBContext.newInstance(MobileTerminate.class);
      Marshaller mar = context.createMarshaller();
      mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      StringWriter xml = new StringWriter();
      mar.marshal(mt, xml);

      request.setEntity(new StringEntity(xml.toString()));
      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      int status = response.getStatusLine().getStatusCode();
      // TODO do something with X-Request-Id
      String location = response.getFirstHeader("Location").getValue();
      if (status == 202 && location != null) {
        return new GlobalSmsResponse(status, response.getFirstHeader("X-Request-Id").getValue())
            .body(location.substring(location.lastIndexOf("/")));
      } else {
        com.openmarket.sms.v4.mt.Error error = getMtError(entity.getContent());
        throw new RejectedException(status, error.getCode(), error.getDescription());
      }
    } catch (IOException | JAXBException | AuthenticationException e) {
      throw new RuntimeException(e);
    }
  }

  // https://www.openmarket.com/docs/Content/apis/v4http/get-status-xml.htm
  // GET https://mtstatus.openmarket.com/sms/v4/mt/<ticket ID>/status

  /**
   * Get status for SMS
   *
   * @param ticketId
   * @return status
   */
  public GlobalSmsResponse<MtStatus> getSmsStatus(String ticketId) throws RejectedException {
    try (CloseableHttpClient client = getHttpClient()) {
      HttpGet request =
          new HttpGet(
              String.format("https://mtstatus.openmarket.com/sms/v4/mt/%s/status", ticketId));
      request.addHeader("Accept", "application/xml");
      addAuthorization(request);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      int status = response.getStatusLine().getStatusCode();
      if (status == 200) {
        return new GlobalSmsResponse(status, response.getFirstHeader("X-Request-Id").getValue())
            .body(getStatus(entity.getContent()));
      } else {
        com.openmarket.sms.v4.mt.Error error = getMtError(entity.getContent());
        throw new RejectedException(status, error.getCode(), error.getDescription());
      }
    } catch (IOException | JAXBException | AuthenticationException e) {
      throw new RuntimeException(e);
    }
  }

  // https://www.openmarket.com/docs/Content/apis/v4http/get-operator-xml.htm
  // GET https://smsc.openmarket.com/sms/v4/preview/<phone number>

  /**
   * Lookup an operator by phone number
   *
   * @param phoneNumber E.164 without the '+'
   * @return operatorLookup
   */
  public GlobalSmsResponse<Preview> lookupOperator(String phoneNumber) throws RejectedException {
    try (CloseableHttpClient client = getHttpClient()) {
      HttpGet request =
          new HttpGet(String.format("https://smsc.openmarket.com/sms/v4/preview/", phoneNumber));
      request.addHeader("Accept", "application/xml");
      addAuthorization(request);

      HttpResponse response = client.execute(request);
      HttpEntity entity = response.getEntity();
      int status = response.getStatusLine().getStatusCode();
      if (status == 200) {
        return new GlobalSmsResponse(status, response.getFirstHeader("X-Request-Id").getValue())
            .body(getPreview(entity.getContent()));
      } else {
        com.openmarket.sms.v4.preview.Error error = getPreviewError(entity.getContent());
        throw new RejectedException(status, error.getCode(), error.getDescription());
      }
    } catch (IOException | JAXBException | AuthenticationException e) {
      throw new RuntimeException(e);
    }
  }

  com.openmarket.sms.v4.mt.Error getMtError(InputStream is) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(Error.class);
    com.openmarket.sms.v4.mt.Error error =
        (com.openmarket.sms.v4.mt.Error) context.createUnmarshaller().unmarshal(is);
    return error;
  }

  com.openmarket.sms.v4.preview.Error getPreviewError(InputStream is) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(Error.class);
    com.openmarket.sms.v4.preview.Error error =
        (com.openmarket.sms.v4.preview.Error) context.createUnmarshaller().unmarshal(is);
    return error;
  }

  MtStatus getStatus(InputStream is) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(MtStatus.class);
    MtStatus status = (MtStatus) context.createUnmarshaller().unmarshal(is);
    return status;
  }

  Preview getPreview(InputStream is) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(Preview.class);
    Preview preview = (Preview) context.createUnmarshaller().unmarshal(is);
    return preview;
  }

  void addAuthorization(HttpRequest request) throws AuthenticationException {
    request.addHeader(new BasicScheme().authenticate(this.creds, request, null));
  }

  CloseableHttpClient getHttpClient() {
    CloseableHttpClient client = HttpClients.createDefault();
    return client;
  }
}
