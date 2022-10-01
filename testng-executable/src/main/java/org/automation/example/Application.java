package org.automation.example;

import org.automation.example.runner.TestNgRunner;

import java.io.IOException;
import java.util.Properties;

import static org.automation.example.config.AppConfigHelper.initiateProperties;
import static org.automation.example.config.SuiteFileLoader.getFilePaths;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println(" Trying to run test");
        initiateProperties();
        String[] suiteNames = {getFilePaths("AdhocTests.xml"), getFilePaths("ExceptionTests.xml")};

        TestNgRunner runner = new TestNgRunner(suiteNames);
        runner.run();
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
