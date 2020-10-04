package org.automation.webtest.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    public static void loadProperties() throws IOException {
        load("./properties/default/log4j.properties");
        load("./properties/default/allure.properties");
        load("./properties/test.properties");
        load("./properties/webdriver.properties");

        if(null == System.getProperty("browser.name")) {
            load("./properties/browser/" + System.getProperty("browser.default") + ".properties");
        } else {
            load("./properties/browser/" + System.getProperty("browser.name") + ".properties");
        }

        load("./properties/env/env." + System.getProperty("active.env") + ".properties");
        load("./properties/user/user." + System.getProperty("active.env.user") + ".properties");
        load("./properties/address/address." + System.getProperty("active.env.address") + ".properties");
        load("./properties/payment/payment." + System.getProperty("active.env.payment") + ".properties");
        load("./properties/product/product." + System.getProperty("active.env.product") + ".properties");

    }

    public static void load(final String propertyPath) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(propertyPath)));
        for (String key : properties.stringPropertyNames()) {
            System.setProperty(key, properties.getProperty(key));
        }
    }

    public static String getValue(final String key){
        return System.getProperty(key);
    }
    public static Long getValueAsLong(final String key){
        return Long.valueOf(System.getProperty(key));
    }

}
