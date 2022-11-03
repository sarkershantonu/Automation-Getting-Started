package org.automation.junit5.config;

import org.slf4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.automation.junit5.runner.Junit5Runner.getLogger;

public class PropertyLoaders {

    private static Logger logger = getLogger();

    public final static String classConfig="test-class.ini";
    public final static String packageProperties="package.properties";
    public final static String runnerProperties="runner.properties";

    public static void load() throws IOException {

        setAsSystemProperty(read(runnerProperties));
        if(readBoolean(System.getProperty("is.package.runner"))){
            setAsSystemProperty();
        } else if (readBoolean(System.getProperty("is.class.runner"))) {

        }
        else
        {
            logger.info("Please select Package or Class runner in runner.properties");
        }

    }

    public static void getClassNames(){

    }

    public static Properties read(final String filePath) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(filePath)));
        return properties;
    }

    public static void setAsSystemProperty(Properties property){
        System.setProperties(property);
    }

    public static boolean readBoolean(String value){
        if(Boolean.valueOf(value)==true){
            return true;
        }else {
            return false;
        }
    }
}
