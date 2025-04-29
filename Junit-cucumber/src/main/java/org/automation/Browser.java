package org.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by shantonu on 5/11/16.
 */
public class Browser {
    private static WebDriver driver = null;
    private static String os = System.getProperty("os.name");
    private static String chromeDriverPathWIN = "C:\\Users\\ssarker\\Downloads\\chromedriver.exe";// can be changed for your PC
    private static String chromeDriverPathLINUX = System.getProperty("user.home")+"/selenium/chromedriver";
    private static String chromePathLINUX="";
    private static String chromePathWIN="";
    private static String firefoxPathLINUX= System.getProperty("user.home")+"/selenium/ff46/firefox";
    private static String firefoxPathWIN="C:\\Program Files\\Mozilla Firefox\\firefox.exe";
    private static String firefoxGekoDriverPathLINUX="";
    private static String firefoxGekoDriverPathWIN="C:\\Users\\ssarker\\JavaTools\\env\\geckodriver.exe";
    private static String IEServerPath = "C:\\Users\\ssarker\\JavaTools\\env\\IEDriverServer.exe";

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = getABrowser("chrome");
        }
        return driver;
    }

    public static WebDriver getInstance(String browserName) {
        if (driver == null) {
            driver = getABrowser(browserName);
        }
        return driver;
    }

    private Browser() {
    }
    private static WebDriver getABrowser(String nameOfBrowser){
        switch (nameOfBrowser){
            case  "chrome" : {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            case  "firefox" : {
                WebDriverManager.firefoxdriver().setup();
                return new ChromeDriver();
            }
            case  "safari" : {
                WebDriverManager.safaridriver().setup();
                return new ChromeDriver();
            } default: WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
        }
    }

    private static ChromeOptions getLocalChromeOptions() {
        String exeChromium = "<path to your chtome or chromium >chrome.exe";
        ChromeOptions options = new ChromeOptions();
        String driverLocation = null;

        if (os.contains("Windows")) {
            driverLocation = "<path to chromium driver>chromedriver.exe";//windows path
        } else {
            driverLocation = "/usr/bin/google-chrome";//linux path, default, you can change it
        }
        System.setProperty("webdriver.chrome.driver", driverLocation);
        options.setBinary(exeChromium);

        return options;
    }

    public static void close() {
        driver.close();
        driver = null;// to avoid closeing time of browser by JVM
    }

    private static DesiredCapabilities getLocalChrome() {
        String exeChromium = "<path to chromium>chrome.exe";
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName", "chrome");
        cap.setCapability("binary", exeChromium);
        return cap;
    }
}
