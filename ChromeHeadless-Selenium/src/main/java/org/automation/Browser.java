package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    WebDriver driver;
    private void initChrome(){
        System.setProperty("","/home/shantonu/env/chromedriver");
        driver = new ChromeDriver();
    }
}
