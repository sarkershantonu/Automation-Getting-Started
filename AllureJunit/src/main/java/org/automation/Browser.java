package org.automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.automation.browser.BrowserFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by shantonu on 3/12/16.
 */
public class Browser {
    private static WebDriver aDriver = new FirefoxDriver();
    public static final int defaultTimeout = 30;
    private Browser(){
        aDriver = new FirefoxDriver();
    }

    public static WebDriver getInstance(){
        if(aDriver==null){
            aDriver = BrowserFactory.getBrowserInstance("firefox");
        }
        init();
        return aDriver;
    }
    private static void  init(){
        makeFullScreen();
        setDefaultTimeOut();
    }
    public WebDriver resizeTo(int w, int h){
        aDriver.manage().window().setSize(new Dimension(w,h));
        return aDriver;
    }
    public static void makeFullScreen(){
        aDriver.manage().window().maximize();
    }
    public static void setDefaultTimeOut(){
        aDriver.manage().timeouts().implicitlyWait(defaultTimeout, TimeUnit.SECONDS);

    }
    public static WebDriver setTimeOut(int second){
        aDriver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
        return aDriver;
    }

}
