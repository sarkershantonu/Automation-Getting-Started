package org.automation.core;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by shantonu on 12/23/16.
 */
// following best practice, I am putting my all settings in before class so that it can be initialized before test class.// following best practice, I am putting my all settings in before class so that it can be initialized before test class.
public abstract class BugTestBase extends TestBase{
    protected static final String URL = "http://localhost:9100";
    protected static final String user = "shantonu";
    protected static final String pass = "123456";
    protected static final Long globalResponseTimeout = 2000l;


    @BeforeClass
    public static void initClass(){
        RestAssured.baseURI = URL;
        RestAssured.basePath = "/table/bugs/";
    }
    @AfterClass
    public static void cleanupClass(){
        // causing errors => RestAssured.reset();
    }

}
