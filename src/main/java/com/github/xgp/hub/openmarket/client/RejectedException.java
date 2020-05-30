package com.github.xgp.hub.openmarket.client;

public class RejectedException extends Exception {

  private final int status;
  private final String code;
  private final String description;

  public RejectedException(int status, String code, String description) {
    this.status = status;
    this.code = code;
    this.description = description;
  }

  public int getStatus() {
    return this.status;
  }

  public String getCode() {
    return this.code;
  }

  public String getDescription() {
    return this.description;
  }
}
