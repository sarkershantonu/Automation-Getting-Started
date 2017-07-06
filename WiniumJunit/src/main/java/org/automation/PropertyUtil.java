package org.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by shantonu on 7/6/17.
 */
public class PropertyUtil {
    public static String FILE_SEPERATOR = System.getProperty("file.separator");
    public static String CLASSPATH = System.getProperty("java.class.path");
    public static String JAVA_HOME = System.getProperty("java.home");
    public static String JAVA_VENDOR = System.getProperty("java.vendor");
    public static String JAVA_VENDOR_URL = System.getProperty("java.vendor.url");
    public static String JAVA_VERSION = System.getProperty("java.version");
    public static String LINE_SEPERATOR = System.getProperty("line.separator");
    public static String OS_ARCHITECTURE = System.getProperty("os.arch");
    public static String OS_NAME = System.getProperty("os.name");
    public static String OS_VERSION = System.getProperty("os.version");
    public static String JAVA_PATH_SEPERATOR = System.getProperty("path.separator");
    public static String USER_WORKING_DIR = System.getProperty("user.dir");
    public static String USER_HOME = System.getProperty("user.home");
    public static String USER_NAME = System.getProperty("user.name");

    public static void loadProperties(String path) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(new File(path)));
        for (String k : p.stringPropertyNames()) {
            System.setProperty(k, p.getProperty(k));
        }
    }

    public static void initProperties() {
        try {
            loadProperties(USER_WORKING_DIR + "/src/test/resources/app.properties");
            loadProperties(USER_WORKING_DIR + "/src/test/resources/log4j.properties");
            loadProperties(USER_WORKING_DIR + "/src/test/resources/winium.properties");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
