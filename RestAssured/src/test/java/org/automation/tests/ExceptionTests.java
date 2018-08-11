package org.automation.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.automation.core.BugTestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by SSarker on 8/6/2018.
 */
public class ExceptionTests extends BugTestBase {

    @Test
    public void test_InvaidInput_viewAll_queryParam(){

        given().log().all()
                .auth().basic(user,pass)
               .contentType(ContentType.JSON)
                .queryParam("2")
                .get().then().assertThat()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .contentType(ContentType.JSON);
    }
}
