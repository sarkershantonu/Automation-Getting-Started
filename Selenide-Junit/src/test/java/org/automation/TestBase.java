package org.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 8/14/17.
 */
public abstract class TestBase {

    protected TestBase(){
        Properties properties = System.getProperties();
        try {
            properties.load(this.getClass().getResourceAsStream("/selenide.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadProperties(){
        Properties properties = System.getProperties();
        try {
            properties.load(new FileInputStream(new File("./src/test/resources//test.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
