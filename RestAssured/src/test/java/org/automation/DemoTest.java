package org.automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.automation.core.TestBase;
import org.automation.model.TempBugString;
import org.junit.Before;
import org.junit.Test;



import static io.restassured.RestAssured.given;
import static org.apache.commons.lang3.Validate.matchesPattern;
import static org.hamcrest.Matchers.contains;

/**
 * Created by shantonu on 9/7/16.
 */
public class DemoTest extends TestBase {



    @Before
    public void init(){
        RestAssured.baseURI+="/table/bugs/";
    }

    /**
     * Testing HTTP 200 + response JSON
     */
    @Test
    public void testViewAll() {
       given().auth().basic(user, pass).when().get().then().statusCode(200).contentType(ContentType.JSON);
    }

    @Test
    public void testAddOne() {
        Response response = given().auth().basic(user, pass).contentType(ContentType.JSON).body(TempBugString.getBugStringToAdd()).when().post("").thenReturn();
        System.out.println(response.getBody().asString());
    }
    @Test
    public void testViewABug(){

        for(int i=1; i<=15;i++){

            Response response =  given().auth().basic(user, pass).
                    when().get(Integer.toString(i)).thenReturn();
            System.out.println(response.getBody().asString());
        }
    }
    @Test
    //todo : add a bug, then delete & validate the bug is not present
    public void testDeleteABug(){


        Response response =  given().auth().basic(user, pass).
                when().delete("/2").thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
    }
    @Test
    //todo :  add a bug, get the id, then change , validate the change and finally cleanup
    public void testUpdateeABug(){

        Response response =  given().auth().basic(user, pass).body(TempBugString.getBugStringForModify(4)).contentType(ContentType.JSON).
                when().put("4").thenReturn();

        System.out.println(response.getStatusLine());
    }
}
