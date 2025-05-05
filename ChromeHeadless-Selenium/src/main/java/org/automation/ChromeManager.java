package org.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.automation.chrome.ChromeBrowser.*;

public class ChromeManager {

    private static WebDriver driver;
    private static void initChrome(){
        WebDriverManager.chromedriver().setup();
        headLessChrome();
    }
    private static void initDefaultChrome(){
        driver = new ChromeDriver();
    }
    private static void headLessChrome(){
        driver = new ChromeDriver(getHeadlessOptions());
    }
    private static void uiChrome(){
        driver = new ChromeDriver(getUIOptions());
    }
    private static void initHeadlessChromeAsService(){
        ChromeOptions options = getHeadlessOptions();
        final ChromeDriverService service = new ChromeDriverService.Builder().
                usingAnyFreePort().
                withVerbose(Boolean.getBoolean("chrome.verbose")).
                withSilent(true).build();

        driver = new ChromeDriver(service, options);
    }
    private static void initHeadLessChromeServiceWithLog(){
        ChromeOptions options = getHeadlessOptions();
        final ChromeDriverService service = new ChromeDriverService.Builder().
                usingAnyFreePort().
                withSilent(true).
                withLogFile(new File(System.getProperty("chrome.log.path"))).
                build();

        driver = new ChromeDriver(service, options);
    }
    private static void initChromeServiceWithEnvParameter(Map<String,String> env){
        ChromeOptions options = getHeadlessOptions();
        final ChromeDriverService service = new ChromeDriverService.Builder().
                usingAnyFreePort().
                withEnvironment(env).
                withSilent(true).build();

        driver = new ChromeDriver(service, options);
    }
    public static WebDriver getBrowser(){
        if(driver==null){
            initChrome();
        }
        initBrowser();
        return driver;
    }

    private static void initBrowser() {
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.MINUTES);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
        driver.manage().window().setSize(new Dimension(1366,768));
        driver.manage().deleteAllCookies();
    }
}
