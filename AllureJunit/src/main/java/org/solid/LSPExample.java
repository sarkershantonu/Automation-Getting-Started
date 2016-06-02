package org.solid;

import org.automation.Calculator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.internal.Killable;
import org.selenium.GooglePage;

/**
 * Created by shantonu on 3/12/16.
 */
public class LSPExample {

    public static void main(String... args){

        System.out.println(Runtime.getRuntime().freeMemory());

        WebDriver driver = new FirefoxDriver();

        System.out.println(Runtime.getRuntime().freeMemory());

        Killable driverKillable = (Killable) driver;
        System.out.println("Hasg code driverKillable =>"+driverKillable.hashCode());


        JavascriptExecutor jsRunner  = (JavascriptExecutor) driver;
        System.out.println("Hasg code jsRunner =>"+jsRunner.hashCode());
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        System.out.println("Hasg code screenshot =>"+screenshot.hashCode());
        HasInputDevices inputDevices = (HasInputDevices)driver;
        System.out.println("Hasg code inputDevices =>"+inputDevices.hashCode());
        System.out.println(Runtime.getRuntime().freeMemory());
        GooglePage aPage = new GooglePage(driver);

        System.out.println(aPage.getTitle());
        driver.close();
        System.out.println(Runtime.getRuntime().freeMemory());

    }
}
