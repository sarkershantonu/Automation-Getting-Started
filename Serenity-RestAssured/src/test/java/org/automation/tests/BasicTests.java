package org.automation.tests;



import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.mapper.ObjectMapperType;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.apache.http.HttpStatus;
import org.automation.core.BugTestBase;
import org.automation.model.Bug;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.rest.RestRequests.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by shantonu on 9/7/16.
 */
@RunWith(SerenityRunner.class)
public class BasicTests extends BugTestBase {

    private static String URL = base+"/table/bugs/";
    /**
     * Validations : HTTP status, content type and header
     * if we need to validate defined schema of JSON body , just add
     * .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""))
     */
    @Test
    public void testViewAll() {
       given().
               auth().basic(user,pass).
               get(URL).
               then().assertThat().
               statusCode(HttpStatus.SC_OK).
               contentType(ContentType.JSON).
               header("Content-Type", "application/json;charset=UTF-8");
    }

    /**
     * validating basic insertion, type, response body, time of response
     */
    @Test
    public void testAddOne_validateResponse(){
        Bug aBug = Bug.getABug();
        given().
                auth().basic(user,pass).
                contentType(ContentType.JSON).body(Bug.getABug(), ObjectMapperType.JACKSON_2).
                post(URL).then().assertThat().
                statusCode(HttpStatus.SC_CREATED).
                contentType(ContentType.JSON).
                header("Content-Type", "application/json;charset=UTF-8").
                body("title",equalTo(aBug.getTitle()));
    }
    @Test
    public void testAddOne_validateResponseObject() {
        Bug request = Bug.getABug();
        Bug responsedBug = given().
                auth().basic(user,pass).
                contentType(ContentType.JSON).
                body(request,ObjectMapperType.JACKSON_2).
                post(URL).as(Bug.class);
        Assert.assertTrue(request.equals(responsedBug));// validating responseded item is equal to what i put in
        System.out.println(responsedBug.toString());// optional, to view purpose

        //cleanup my data
        given().auth().basic(user,pass).
                delete(URL+responsedBug.getId().
                        toString()).then().
                assertThat().statusCode(HttpStatus.SC_NO_CONTENT);

    }
    @Test
    // assuming that bug with ID 1 present.
    public void testViewABug(){
        given().
                auth().basic(user,pass).
                get(URL+Integer.toString(1)).then().assertThat().
                statusCode(HttpStatus.SC_OK).
                contentType(ContentType.JSON).
                header("Content-Type", "application/json;charset=UTF-8").
                body("id", equalTo(1));

    }
    @Test
    //Add a bug & delete that bug with ID and check http status
    public void testDeleteABug(){
        Bug respnsebug =
                given().
                        auth().basic(user,pass).
                        contentType(ContentType.JSON).
                        body(Bug.getABug(),ObjectMapperType.JACKSON_2).
                        post(URL).as(Bug.class);
        given().auth().basic(user,pass).
                delete(URL+respnsebug.getId().toString()).
                then().assertThat().
                statusCode(HttpStatus.SC_NO_CONTENT);
    }
    @Test
    public void testUpdateeABug(){
        Bug createdbug =
                given().
                        auth().basic(user,pass).
                        contentType(ContentType.JSON).
                        body(Bug.getABug(),ObjectMapperType.JACKSON_2).
                        post(URL).as(Bug.class);

        createdbug.setTitle("This is modified title");
        createdbug.setDescription("This is modified description");

        given().
                auth().basic(user,pass).
                contentType(ContentType.JSON).body(createdbug,ObjectMapperType.JACKSON_2).
                when().put(URL+createdbug.getId().toString()).
                then().assertThat().
                statusCode(HttpStatus.SC_ACCEPTED).
                contentType(ContentType.JSON).
                header("Content-Type", "application/json;charset=UTF-8").
                body("id",equalTo(createdbug.getId().intValue()));
        //cleanup
        given().
                auth().basic(user,pass).
                delete(URL+createdbug.getId().toString()).
                then().assertThat().
                statusCode(HttpStatus.SC_NO_CONTENT);
    }
}
