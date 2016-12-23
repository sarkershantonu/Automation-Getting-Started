package org.automation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import org.apache.http.HttpStatus;
import org.automation.core.BugTestBase;
import org.automation.model.Bug;
import org.automation.model.TempBugString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;
import static org.apache.commons.lang3.Validate.matchesPattern;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

/**
 * Created by shantonu on 9/7/16.
 */
public class BasicTests extends BugTestBase {



    @Before
    public void init(){


    }

    /**
     * Validations : HTTP status, content type and header
     * if we need to validate defined schema of JSON body , just add  .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""))
     */
    @Test
    public void testViewAll() {
       given().when().get().then().assertThat().statusCode(HttpStatus.SC_OK).contentType(ContentType.JSON).header("Content-Type", "application/json;charset=UTF-8").time(lessThan(globalTimeout));


    }
    @Test
    public void testAddOne_validateResponse(){
        Bug aBug = Bug.getABug();
        given().auth().basic(user, pass).contentType(ContentType.JSON).body(Bug.getABug(),ObjectMapperType.JACKSON_2).
                post().then().assertThat().
                statusCode(HttpStatus.SC_CREATED).
                contentType(ContentType.JSON).
                header("Content-Type", "application/json;charset=UTF-8").body("title",equalTo(aBug.getTitle()));
    }
    @Test
    public void testAddOne_validateResponseObject() {

        Bug request = Bug.getABug();
        Bug respnsebug = given().contentType(ContentType.JSON).
                                body(request,ObjectMapperType.JACKSON_2).
                                post().as(Bug.class);
        Assert.assertTrue(request.equals(respnsebug));// validating responseded item is equal to what i put in
        System.out.println(respnsebug.toString());// optional, to view purpose
        //cleanup my data
        given().delete(respnsebug.getId().toString()).then().assertThat().statusCode(HttpStatus.SC_NO_CONTENT);

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
