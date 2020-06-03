/*
 * Twilio
 * Enabling phones, VoIP, and messaging to be embedded into web, desktop, and mobile software.
 *
 * OpenAPI spec version: 2010-04-01
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.github.xgp.hub.twilio.client;

import com.fasterxml.jackson.databind.util.StdDateFormat;

public class RFC3339DateFormat extends StdDateFormat {

  // Same as ISO8601DateFormat but serializing milliseconds.
  /*
  @Override
  public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
    String value = StdDateFormat.DATE_FORMAT_ISO8601.format(date);
    toAppendTo.append(value);
    return toAppendTo;
  }
  */
}
