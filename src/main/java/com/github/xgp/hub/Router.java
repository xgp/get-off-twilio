package com.github.xgp.hub;

import com.cloudhopper.sxmp.DeliverRequest;
import com.cloudhopper.sxmp.DeliverResponse;
import com.cloudhopper.sxmp.DeliveryReportResponse;
import com.cloudhopper.sxmp.MessageRequest;
import com.cloudhopper.sxmp.Operation;
import com.cloudhopper.sxmp.OptionalParamMap;
import com.cloudhopper.sxmp.SubmitRequest;
import com.cloudhopper.sxmp.SubmitResponse;
import com.cloudhopper.sxmp.SxmpErrorException;
import com.github.xgp.hub.sxmp.DeliveryReportRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Router implements ClientApi, CallbackApi {

  @Setter private String baseUrl;
  @Setter private String callbackUrl;
  @Setter private String serverInterface;
  @Setter private String defaultProvider;
  @Setter private CallbackApi apiProvider;
  @Setter private ProviderMap providerMap;
  @Getter @Setter private Map<String, Provider> providerClientMap;

  public SubmitRequest createSubmitRequest(String provider) {
    return createSubmitRequest(provider, new SubmitRequest());
  }

  public SubmitRequest createSubmitRequest(String provider, SubmitRequest submit) {
    try {
      submit.setReferenceId(generateId());
      submit.setDeliveryReport(true);
      OptionalParamMap params = new OptionalParamMap(OptionalParamMap.HASH_MAP);
      params.put(Constants.PARAM_KEY_ORIGINAL_CALLBACK_URL, callbackUrl);
      params.put(Constants.PARAM_KEY_SOURCE_PROVIDER, provider);
      submit.setOptionalParams(params);
      return submit;
    } catch (SxmpErrorException e) {
      throw new IllegalStateException(e);
    }
  }

  public DeliverRequest createDeliverRequest(String provider) {
    return createDeliverRequest(provider, new DeliverRequest());
  }

  public DeliverRequest createDeliverRequest(String provider, DeliverRequest deliver) {
    try {
      deliver.setReferenceId(generateId());
      deliver.setOptionalParams(new OptionalParamMap(OptionalParamMap.HASH_MAP));
      return deliver;
    } catch (SxmpErrorException e) {
      throw new IllegalStateException(e);
    }
  }

  public DeliveryReportRequest createDeliveryReportRequest(
      String sourceProvider, String destinationProvider, String internalId, String callbackUrl) {
    DeliveryReportRequest dlr = new DeliveryReportRequest();
    try {
      dlr.setReferenceId(internalId);
      OptionalParamMap params = new OptionalParamMap(OptionalParamMap.HASH_MAP);
      params.put(Constants.PARAM_KEY_ORIGINAL_CALLBACK_URL, callbackUrl);
      params.put(Constants.PARAM_KEY_SOURCE_PROVIDER, sourceProvider);
      params.put(Constants.PARAM_KEY_DESTINATION_PROVIDER, destinationProvider);
      dlr.setOptionalParams(params);
      return dlr;
    } catch (SxmpErrorException e) {
      throw new IllegalStateException(e);
    }
  }

  public void setTicketId(Operation operation, String provider, String providerId) {
    operation.setTicketId(String.format("%s_%s", provider, providerId));
  }

  public String getInternalCallbackUrl(MessageRequest request, String destinationProvider) {
    return getInternalCallbackUrl(
        request.getOptionalParams().get(Constants.PARAM_KEY_SOURCE_PROVIDER).toString(),
        request.getReferenceId(),
        request.getOptionalParams().get(Constants.PARAM_KEY_ORIGINAL_CALLBACK_URL).toString(),
        destinationProvider);
  }

  public String getInternalCallbackUrl(
      String sourceProvider,
      String internalId,
      String originalCallbackUrl,
      String destinationProvider) {
    return String.format(
        "%s/providers/%s/dlr/%s/%s/%s",
        baseUrl, destinationProvider, internalId, sourceProvider, urlencode(originalCallbackUrl));
  }

  @Override
  public SubmitResponse sendMessage(SubmitRequest submit) throws Exception {
    String provider = providerMap.getProviderFor(submit.getSourceAddress());
    log.info("Found provider {} for address {}", provider, submit.getSourceAddress().getAddress());
    ClientApi client = providerClientMap.get(provider).createClient();
    return client.sendMessage(submit);
  }

  @Override
  public DeliveryReportRequest getMessageStatus(String id) throws Exception {
    String p = defaultProvider;
    if (id.indexOf('_') > 0) {
      p = id.substring(0, id.indexOf('_'));
      id = id.substring(id.indexOf('_'));
    }
    ClientApi client = providerClientMap.get(p).createClient();
    return client.getMessageStatus(id);
  }

  String getProviderFromId(String id) {
    if (id.indexOf('_') > 0) return id.substring(0, id.indexOf('_'));
    else return defaultProvider;
  }

  @Override
  public DeliverResponse onMessage(DeliverRequest deliver) {
    return apiProvider.onMessage(deliver);
  }

  @Override
  public DeliveryReportResponse onDeliveryReceipt(DeliveryReportRequest dlr) {
    return apiProvider.onDeliveryReceipt(dlr);
  }

  public static String generateId() {
    return UUID.randomUUID().toString();
  }

  public static String urlencode(String raw) {
    try {
      return URLEncoder.encode(raw, StandardCharsets.UTF_8.toString());
    } catch (UnsupportedEncodingException e) {
      log.warn("Error encoding " + raw, e);
      throw new RuntimeException(e);
    }
  }

  public static String urldecode(String enc) {
    try {
      return URLDecoder.decode(enc, StandardCharsets.UTF_8.toString());
    } catch (UnsupportedEncodingException e) {
      log.warn("Error decoding " + enc, e);
      throw new RuntimeException(e);
    }
  }
}
