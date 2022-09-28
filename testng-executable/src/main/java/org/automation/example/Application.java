package org.automation.example;

import org.automation.example.runner.TestNgRunner;
import org.automation.example.utils.PropertyFileLoader;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println(" Trying to run test");
        System.out.println(args.length);
        setSystemProperty(new PropertyFileLoader("app.properties").load());
        String[] suiteNames = {getFilePaths("AdhocTests.xml"),getFilePaths("ExceptionTests.xml")};
        TestNgRunner runner = new TestNgRunner(suiteNames);
        runner.run();
    }

    public static String getFilePaths(String suiteName) throws IOException {
        return new File("./suites/"+suiteName).getCanonicalPath();
    }
    public static void setSystemProperty(final Properties properties){
        for (String key : properties.stringPropertyNames()) {
            System.setProperty(key, properties.getProperty(key));
        }
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
