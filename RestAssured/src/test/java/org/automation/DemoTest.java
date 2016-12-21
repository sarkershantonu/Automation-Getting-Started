package org.automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.restlet.Route;


/**
 * Created by shantonu on 9/7/16.
 */
public class DemoTest {
    private static final String URL = "http://localhost:9100";
    private static final String user ="shantonu";
    private static final String pass ="123456";

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



    @Test
    public void testViewAllBugs(){
        String path = URL+"/table/bugs";
        RestAssured.given().auth().basic(user,pass).
                when().get(path).then().statusCode(200);
        RestAssured.given().auth().basic(user,pass).
                when().get(path).then().contentType(ContentType.JSON);
    }
}
