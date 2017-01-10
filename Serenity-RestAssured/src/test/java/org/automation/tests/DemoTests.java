package org.automation.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.mapper.ObjectMapperType;
import org.apache.http.HttpStatus;
import org.automation.model.Bug;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Created by shantonu on 1/7/17.
 */
public class DemoTests {

    @Test
    public void seeAllBugs(){
        RestAssured.
                given().
                auth().basic("shantonu", "123456").
                get("http://localhost:9100/table/bugs").
                then().
                statusCode(200).and().
                header("Content-Type", "application/json;charset=UTF-8").
                contentType(ContentType.JSON).
                time(Matchers.lessThan(500L));
    }

    @Test
    public void addABug(){
        Bug aBug = Bug.getABug();
        RestAssured.
                given().
                auth().basic("shantonu", "123456").
                contentType(ContentType.JSON).
                body(aBug, ObjectMapperType.JACKSON_2).
                post("http://localhost:9100/table/bugs").
                then().statusCode(HttpStatus.SC_CREATED);
    }
}
