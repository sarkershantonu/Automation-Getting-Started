package org.automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.restlet.Route;

import static java.lang.String.format;

/**
 * Created by shantonu on 9/7/16.
 */
public class Test {
    private static final String URL = "http://localhost:9100";
    private static final String user ="shantonu";
    private static final String pass ="123456";

    public Response getPostContent(int postNumber) {


        return RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get(format("%s/posts/%s", URL, Integer.toString(postNumber)));
    }

    private static final String demoBug = "{\n" +
            "\n" +
            "     \"title\": \"this is a bug\",\n" +
            "     \"summary\": \"Sample Bug\" ,\n" +
            "     \"exceptions\": \"Exception Is not present\",\n" +
            "     \"comments\": \"Comments \",\n" +
            "     \"foundDateTime\":\"1st december\",\n" +
            "     \"tags\": \"New, On production\",\n" +
            "     \"priority\": \"High\",\n" +
            "     \"servility\": \"Blocker\",\n" +
            "     \"attachmentPath\": \"http://\",\n" +
            "     \"description\": \"Sampel Data \"\n" +
            "   }";



    @org.junit.Test
    public void testCreate(){
        String path = URL+"/table/bugs";
        RestAssured.given().auth().basic(user,pass).
                when().get(path).then().statusCode(200);

    }
}
