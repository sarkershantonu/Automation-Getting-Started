package org.automation.core;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by shantonu on 12/23/16.
 */
public abstract class TestBase {
    protected static final String URL = "http://localhost:9100";
    protected static final String user = "shantonu";
    protected static final String pass = "123456";
    @BeforeClass
    public static void initClass(){
        RestAssured.baseURI = URL;
    }

}
