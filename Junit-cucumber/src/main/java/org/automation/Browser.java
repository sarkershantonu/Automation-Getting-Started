package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by shantonu on 5/11/16.
 */
public class Browser {
    private static WebDriver driver = null;

    public static WebDriver getInstance(String browserName) {
        if (driver == null) {
            driver = getABrowser(browserName);
            //driver = new FirefoxDriver();
        }
        return driver;
    }

    private Browser() {
    }


    private static WebDriver getABrowser(String nameOfBrowser) {
        String os = System.getProperty("os.name");
        if ("firefox".equals(nameOfBrowser)) {
            //running old version(46) firefox, download link => https://ftp.mozilla.org/pub/firefox/releases/46.0/linux-x86_64-EME-free/en-US/
            if (os.contains("windows")) {
                System.setProperty("webdriver.firefox.bin","place where you unzipped firefox executable");
            } else {
                System.setProperty("webdriver.firefox.bin", "/home/shantonu/ff46/firefox");
            }
            return new FirefoxDriver();
        } else if ("opera".equals(nameOfBrowser)) {
            return new OperaDriver();
        } else if ("ie".equals(nameOfBrowser)) {
            File iedriver = new File("Point your Selenium Server exe Path");//todo for your PC
            System.setProperty("webdriver.ie.driver", iedriver.getAbsolutePath());
            //-Dwebdriver.ie.driver=physicall
            return new InternetExplorerDriver();
        } else {
            if (os.contains("windows")) {
                System.setProperty("webdriver.chrome.driver"
                        , "C:\\Users\\%USERNAME%\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");// can be changed for your PC
            } else {

                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            }
            //return new ChromeDriver();

            ChromeDriverService service = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File("/usr/local/bin/chromedriver"))
                    .usingAnyFreePort()
                    .build();
            try {
                service.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());

        }
    }


    public static void close() {
        driver.close();
        driver = null;// to avoid closeing time of browser by JVM
    }

}
