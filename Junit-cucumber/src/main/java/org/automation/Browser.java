package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;

/**
 * Created by shantonu on 5/11/16.
 */
public class Browser {
    private static WebDriver driver = null;

    public static WebDriver getInstance(String browserName){
        if(driver==null){
            //driver = getABrowser(browserName);
            driver = new FirefoxDriver();
        }
        return driver;
    }

    private Browser(){}

    private static WebDriver getABrowser(String nameOfBrowser) {

        if (nameOfBrowser == "firefox") {
            return new FirefoxDriver();
        }
        else if (nameOfBrowser == "opera") {
            return new OperaDriver();
        } else if (nameOfBrowser == "ie") {
            File iedriver = new File("selenium.browser.ie.path");//todo for your PC
            System.setProperty("webdriver.ie.driver", iedriver.getAbsolutePath());
            //-Dwebdriver.ie.driver=physicall
            return new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
            return new ChromeDriver();

        }
    }

    }
