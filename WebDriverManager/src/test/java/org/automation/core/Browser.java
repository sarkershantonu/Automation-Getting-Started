package org.automation.core;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by shantonu on 7/20/17.
 * this is the main class where we are taking advantages of webdriver manager
 */
public class Browser {
    private static WebDriver driver;

    public static WebDriver getInstance() {
        return (driver == null) ? getInstance(System.getProperty("default.browser")) : driver;
    }

    private static WebDriver getInstance(String browser) {
        if ("firefox".equals(browser)) {
            FirefoxDriverManager.getInstance().arch32().setup();
            return new FirefoxDriver();
        } else if ("chrome".equals(browser)) {
            ChromeDriverManager.getInstance().arch64().setup();
            return new ChromeDriver();
        } else if ("ie".equals(browser)) {
            InternetExplorerDriverManager.getInstance().arch32().setup();
            return new InternetExplorerDriver();
        } else if ("edge".equals(browser)) {
            EdgeDriverManager.getInstance().arch64().setup();
            return new EdgeDriver();
        } else if ("phantomjs".equals(browser)) {
            PhantomJsDriverManager.getInstance().arch32().setup();
            return new PhantomJSDriver();
        } else if ("opera".equals(browser)) {
            OperaDriverManager.getInstance().arch32().setup();
            return new OperaDriver();
        } else {
            ChromeDriverManager.getInstance().arch64().setup();
            return new ChromeDriver();
        }
    }

    public static void closeSession() {
        driver=null;
    }
}
