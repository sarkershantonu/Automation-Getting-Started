package org.automation.core;

import org.junit.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 8/14/17.
 */
public class TestBase {


    @BeforeClass
    public void initAllTests(){
        PropertyLoader.loadProperties();
    }


}
