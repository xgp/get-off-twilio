package com.github.xgp.hub.openmarket.client;

public class GlobalSmsResponse<T> {

  private T body;
  private final int status;
  private final String requestId;

  public GlobalSmsResponse(int status, String requestId) {
    this.status = status;
    this.requestId = requestId;
  }

  public int getStatus() {
    return this.status;
  }

  public String getRequestId() {
    return this.requestId;
  }

  public GlobalSmsResponse body(T body) {
    this.body = body;
    return this;
  }

  public T getBody() {
    return this.body;
  }
}
