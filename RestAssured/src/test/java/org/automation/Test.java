package org.automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static java.lang.String.format;

/**
 * Created by shantonu on 9/7/16.
 */
public class Test {
    private static final String URL = "";

    public Response getPostContent(int postNumber) {

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get(format("%s/posts/%s", URL, Integer.toString(postNumber)));
    }
}
