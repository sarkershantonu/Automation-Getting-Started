package org.automation.example.config;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class AppConfigHelper {
    public static void setSystemProperty(final Properties properties){
        for (String key : properties.stringPropertyNames()) {
            System.setProperty(key, properties.getProperty(key));
        }
    }

    public static void initiateProperties() throws IOException {
        setSystemProperty(new PropertyFileLoader("app.properties").load());
    }

    public static void setSystemPropertyKeepingExisting(final Properties properties) {
        for (String key : properties.stringPropertyNames()) {
            if((null==System.getProperty(key))||System.getProperty(key)==""||(System.getProperty(key)==" "))
            {
                System.setProperty(key, properties.getProperty(key));
            }
        }
    }

}