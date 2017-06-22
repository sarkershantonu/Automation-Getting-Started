package org.automation.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

import org.apache.http.HttpStatus;
import org.automation.core.BugTestBase;
import org.automation.model.Bug;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

/**
 * Created by shantonu on 9/7/16.
 */
public class BasicTests extends BugTestBase {

    /**
     * Validations : HTTP status, content type and header
     * if we need to validate defined schema of JSON body , just add
     * .body(JsonSchemaValidator.matchesJsonSchemaInClasspath(""))
     */
    @Test
    public void testViewAll() {
       given().
               auth().basic(user,pass).
               get().
               then().assertThat().
               statusCode(HttpStatus.SC_OK).
               contentType(ContentType.JSON).
               header("Content-Type", "application/json;charset=UTF-8").
               time(lessThan(globalResponseTimeout));
    }

    /**
     * validating basic insertion, type, response body, time of response
     */
    @Test
    public void testAddOne_validateResponse(){
        Bug aBug = Bug.getABug();
        given().
                auth().basic(user,pass).
                contentType(ContentType.JSON).body(Bug.getABug(),ObjectMapperType.JACKSON_2).
                post().then().assertThat().
                statusCode(HttpStatus.SC_CREATED).
                contentType(ContentType.JSON).
                header("Content-Type", "application/json;charset=UTF-8").
                body("title",equalTo(aBug.getTitle())).
                time(lessThan(globalResponseTimeout));
    }
    @Test
    public void testAddOne_validateResponseObject() {
        Bug request = Bug.getABug();
        Bug responsedBug = given().
                auth().basic(user,pass).
                contentType(ContentType.JSON).
                body(request,ObjectMapperType.JACKSON_2).
                post().as(Bug.class);
        Assert.assertTrue(request.equals(responsedBug));// validating responseded item is equal to what i put in
        System.out.println(responsedBug.toString());// optional, to view purpose

        //cleanup my data
        given().auth().basic(user,pass).
                delete(responsedBug.getId().
                        toString()).then().
                assertThat().statusCode(HttpStatus.SC_NO_CONTENT);


        given().auth().basic("","").contentType(ContentType.JSON).body(request,ObjectMapperType.JACKSON_2).post();
    }
    @Test
    // assuming that bug with ID 1 present.
    public void testViewABug(){
        given().
                auth().basic(user,pass).
                get(Integer.toString(1)).then().assertThat().
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
                        post().as(Bug.class);
        given().auth().basic(user,pass).
                delete(respnsebug.getId().toString()).
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
                        post().as(Bug.class);

        createdbug.setTitle("This is modified title");
        createdbug.setDescription("This is modified description");

        given().
                auth().basic(user,pass).
                contentType(ContentType.JSON).body(createdbug,ObjectMapperType.JACKSON_2).
                when().put(createdbug.getId().toString()).
                then().assertThat().
                statusCode(HttpStatus.SC_ACCEPTED).
                contentType(ContentType.JSON).
                header("Content-Type", "application/json;charset=UTF-8").
                body("id",equalTo(createdbug.getId().intValue()));
        //cleanup
        given().
                auth().basic(user,pass).
                delete(createdbug.getId().toString()).
                then().assertThat().
                statusCode(HttpStatus.SC_NO_CONTENT);
    }
}
