package org.automation.tests;

import io.restassured.response.Response;
import org.automation.config.Constants;
import org.automation.core.BugTestBase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by SSarker on 8/5/2018.
 */
// Basic security tests
public class HttpHeaderTests extends BugTestBase {

    public Response response;
    @Before
    public void init(){
        response  = given().auth().basic(user,pass).get();
    }
//Restrict other sites from placing it in an iframe in order to prevent ClickJacking attacks
    @Test
    public void testRestrictIframing() {
        Assert.assertNotNull(response.getHeaders().getValue(Constants.XFRAMEOPTIONS));
        Assert.assertEquals("DENY",response.getHeaders().getValue(Constants.XFRAMEOPTIONS));

    }
    @Test
    public void testXSSProtection(){
        Assert.assertNotNull(response.getHeaders().getValue(Constants.XXSSPROTECTION));
        Assert.assertEquals("1; mode=block",response.getHeaders().getValue(Constants.XXSSPROTECTION));
    }

    @Test
    public void testNoCach(){
        Assert.assertEquals("no-cache, no-store, max-age=0, must-revalidate",response.getHeaders().getValue(Constants.CACHECONTROL));
    }
}
