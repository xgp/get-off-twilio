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

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-05-22T20:36:25.160+02:00[Europe/Paris]")
public class StringUtil {
  /**
   * Check if the given array contains the given value (with case-insensitive comparison).
   *
   * @param array The array
   * @param value The value to search
   * @return true if the array contains the value
   */
  public static boolean containsIgnoreCase(String[] array, String value) {
    for (String str : array) {
      if (value == null && str == null) return true;
      if (value != null && value.equalsIgnoreCase(str)) return true;
    }
    return false;
  }

  /**
   * Join an array of strings with the given separator.
   *
   * <p>Note: This might be replaced by utility method from commons-lang or guava someday if one of
   * those libraries is added as dependency.
   *
   * @param array The array of strings
   * @param separator The separator
   * @return the resulting string
   */
  public static String join(String[] array, String separator) {
    int len = array.length;
    if (len == 0) return "";

    StringBuilder out = new StringBuilder();
    out.append(array[0]);
    for (int i = 1; i < len; i++) {
      out.append(separator).append(array[i]);
    }
    return out.toString();
  }
}
