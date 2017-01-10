package org.automation.tests;



import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.internal.mapper.ObjectMapperType;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.RestRequests;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.rest.rules.RestConfigurationRule;
import org.apache.http.HttpStatus;
import org.automation.model.Bug;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.runner.RunWith;

import static net.serenitybdd.rest.RestRequests.given;

/**
 * Created by shantonu on 1/7/17.
 */
@RunWith(SerenityRunner.class)
public class DemoTests {
    @Rule
    public MethodRule methodRule  = new RestConfigurationRule();

    @Test
    public void seeAllBugs(){
                given().
                auth().basic("shantonu", "123456").
                get("http://localhost:9100/table/bugs").
                then().
                statusCode(200).and().
                header("Content-Type", "application/json;charset=UTF-8").
                contentType(ContentType.JSON);
    }

    @Test
    public void addABug(){
        Bug aBug = Bug.getABug();
                given().
                auth().basic("shantonu", "123456").
                contentType(ContentType.JSON).
                body(aBug, ObjectMapperType.JACKSON_2).
                post("http://localhost:9100/table/bugs").
                then().statusCode(HttpStatus.SC_CREATED);
    }
}
