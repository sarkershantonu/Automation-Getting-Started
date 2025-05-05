package automation;

import org.automation.ChromeManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestChromeArguments {

    WebDriver driver;

    @Before public void init(){
        System.setProperty("webdriver.chrome.driver","/home/shantonu/env/chromedriver");
        System.setProperty("chrome.log.path","./logs/chrome.log");
        System.setProperty("linux.chrome.bin", "/usr/bin/google-chrome");
        System.setProperty("chrome.verbose", "true");

    }

    @Test
    public void testChrome() {
        driver = ChromeManager.getBrowser();
        driver.get("https://www.linkedin.com");
    }

    @Test public void testChromeHeadless() throws InterruptedException {
        driver = ChromeManager.getBrowser();
        driver.get("https://www.facebook.com");
        Assert.assertEquals("Facebook - Log In or Sign Up",driver.getTitle());

        Thread.sleep(10000);
    }

    @After public void end(){
        driver.close();
    }
}
