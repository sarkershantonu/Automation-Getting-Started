package org.automation.tests;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.automation.core.BugTestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by SSarker on 8/5/2018.
 */
//this will test only allowed method are accessible.
    //https://www.owasp.org/index.php/REST_Security_Cheat_Sheet
public class HttpMethodTests extends BugTestBase {

    @Test
    public void test_options_method_off(){
        given().auth().basic(user,pass+5).options().then().assertThat().statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED);
    }
    @Test
    public void test_head_method_off(){
        given().auth().basic(user,pass+5).head().then().assertThat().statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED);
    }
    @Test
    public void test_patch_method_off(){
        given().auth().basic(user,pass+5).patch().then().assertThat().statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED);
    }

}
