package org.automation.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    public static final String PROP_PATH="./properties/";
    public static void loadProperties(){

        try {
            loadProperties(PROP_PATH+"test.properties");
            loadProperties(PROP_PATH+ "properties/selenide.properties");
            loadProperties(PROP_PATH
                            +System.getProperty("test.app.name")
                            +System.lineSeparator()
                            +System.getProperty("test.env")+".properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void loadProperties(String path) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File(path)));
        for(String k: p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }
}
