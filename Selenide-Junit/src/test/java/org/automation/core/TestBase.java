package org.automation.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 8/14/17.
 */
public class TestBase {

    protected TestBase(){
        Properties properties = System.getProperties();
        try {
            properties.load(this.getClass().getResourceAsStream("/selenide.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadProperties(){

        try {
            loadProperties("./src/test/resources/test.properties");
            loadProperties("./src/test/resources/selenide.properties");
            loadProperties("./src/test/resources/"+System.getProperty("test.env"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void loadProperties(String path) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File(path)));
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }

}
