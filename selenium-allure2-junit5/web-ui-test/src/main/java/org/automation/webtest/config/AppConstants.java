package org.automation.webtest.config;

public class AppConstants {
    public static final String PASSWORD = System.getProperty("global.validPassword");
    public static String FILE_SEPERATOR=System.getProperty("file.separator");
    public static String CLASSPATH=System.getProperty("java.class.path");
    public static String JAVA_HOME=System.getProperty("java.home");
    public static String JAVA_VENDOR=System.getProperty("java.vendor");
    public static String JAVA_VENDOR_URL=System.getProperty("java.vendor.url");
    public static String JAVA_VERSION=System.getProperty("java.version");
    public static String LINE_SEPERATOR=System.getProperty("line.separator");
    public static String OS_ARCHITECTURE=System.getProperty("os.arch");
    public static String OS_NAME=System.getProperty("os.name");
    public static String OS_VERSION=System.getProperty("os.version");
    public static String JAVA_PATH_SEPERATOR=System.getProperty("path.separator");
    public static String USER_WORKING_DIR=System.getProperty("user.dir");
    public static String USER_HOME=System.getProperty("user.home");
    public static String USER_NAME=System.getProperty("user.name");
    public static long PAGE_TIMEOUT=Long.valueOf(System.getProperty("page.wait"));
    public static String SQL_PATH="./sql/";
}
