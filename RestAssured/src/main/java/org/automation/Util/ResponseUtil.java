package org.automation.Util;

import io.restassured.response.Response;
import org.automation.model.Bug;

/**
 * Created by shantonu on 12/23/16.
 */
public class ResponseUtil {
    public static String getResponseBodyAsString(Response response) {
        return response.getBody().asString();
    }

    public static String getResponseHeaderAsString(Response response) {
        return response.headers().toString();
    }

    public static String[] findHeaders(Response response, final String... headers) {
        String[] found = null;
        for (int i = 0; i < headers.length; i++) {
            found[i] = new String(response.getHeader(headers[i]));
        }
        return found;
    }

    public static String findHeader(Response response, final String header) {

        return new String(response.getHeader(header));

    }

}
