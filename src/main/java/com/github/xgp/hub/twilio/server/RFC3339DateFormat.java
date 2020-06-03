package com.github.xgp.hub.twilio.server;

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
