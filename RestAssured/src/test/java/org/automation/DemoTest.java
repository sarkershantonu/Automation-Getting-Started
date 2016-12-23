package org.automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.restlet.Route;


import static io.restassured.RestAssured.given;

/**
 * Created by shantonu on 9/7/16.
 */
public class DemoTest {
    private static final String URL = "http://localhost:9100";
    private static final String user = "shantonu";
    private static final String pass = "123456";

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
    public void testViewAllBugs() {
        RestAssured.baseURI = URL + "/table/bugs";
        given().auth().basic(user, pass).
                when().get("").then().statusCode(200).and().contentType(ContentType.JSON);

    }

    @Test
    public void testAddABug() {

        RestAssured.baseURI = URL + "/table/bugs";
        Response response = given().auth().basic(user, pass).contentType(ContentType.JSON).body(demoBug).when().post("").thenReturn();
        System.out.println(response.getBody().asString());
    }
    @Test
    public void testViewABug(){

        for(int i=1; i<=15;i++){
            RestAssured.baseURI = URL + "/table/bugs/"+i;
            Response response =  given().auth().basic(user, pass).
                    when().get("").thenReturn();
            System.out.println(response.getBody().asString());
        }



    }
    @Test
    public void testDeleteABug(){

    }
    @Test
    public void testUpdateeABug(){

    }
}
