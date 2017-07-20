package org.automation.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 7/20/17.
 */
public class App {
    public static void loadDefaultProperties(){
        try {
            loadProperties("./src/test/resources/test.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void loadProperties(String path) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File(path)));
        for(String k:p.stringPropertyNames()){
            System.setProperty(k,p.getProperty(k));
        }
    }
}
