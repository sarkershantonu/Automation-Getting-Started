package org.automation.example.config;

import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    public static void setSystemProperty(final Properties properties){
        for (String key : properties.stringPropertyNames()) {
            System.setProperty(key, properties.getProperty(key));
        }
    }

    public static void initiateProperties() throws IOException {
        setSystemProperty(new PropertyFileLoader("app.properties").load());
    }
}
