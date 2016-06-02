package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * Created by shantonu on 3/12/16.
 */
public class BrowserFactory {

    public static WebDriver getBrowserInstance(String name){

        if(name == "ie"){
            return new InternetExplorerDriver();
        }
       else if(name == "chrome"){
            return new ChromeDriver();
        }
        else if(name == "Opera"){
        return new OperaDriver();
        }
        else if(name == "HtmlUnit"){
            return new HtmlUnitDriver();
        }
        else
        {
            return new FirefoxDriver();
        }

    }
}
