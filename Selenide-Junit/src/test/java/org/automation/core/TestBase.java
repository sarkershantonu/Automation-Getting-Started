package org.automation.core;

import org.junit.jupiter.api.BeforeAll;

/**
 * Created by shantonu on 8/14/17.
 */
public class TestBase {


    @BeforeAll
    public static void initAllTests(){
        PropertyLoader.loadProperties();
    }


}
