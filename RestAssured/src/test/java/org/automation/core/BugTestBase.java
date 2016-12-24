package org.automation.core;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import org.junit.BeforeClass;

/**
 * Created by shantonu on 12/23/16.
 */
public abstract class BugTestBase {
    private static final String URL = "http://localhost:9100";
    private static final String user = "shantonu";
    private static final String pass = "123456";
    protected static final Long globalResponseTimeout = 2000l;

    // following best practice, I am putting my all settings in before class so that it can be initialized before test class.
    @BeforeClass
    public static void initClass(){
        RestAssured.baseURI = URL;
        RestAssured.basic(user,pass);
        RestAssured.basePath="/table/bugs/";

    }
    @BeforeClass
    public static void cleanupClass(){
        // causing errors => RestAssured.reset();
    }

}
