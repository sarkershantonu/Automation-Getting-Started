package automation;

import org.automation.ChromeManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;

import static org.automation.ChromeManager.destroyBrowser;

public class TestChromeArgConstants {

    WebDriver driver;

    @BeforeClass
    public static void init(){
        System.setProperty("chrome.verbose", "true");
    }

    @Test
    public void testChromeWithUI() {
        driver = ChromeManager.getBrowser();
        driver.get("https://www.linkedin.com");
        Assert.assertEquals("LinkedIn: Log In or Sign Up",driver.getTitle());
    }

    @Test public void testChromeHeadless() throws InterruptedException {
        driver = ChromeManager.getBrowser();
        driver.get("https://www.facebook.com");
        Assert.assertEquals("Facebook - log in or sign up",driver.getTitle());
    }

    @After public void end(){
        destroyBrowser();
    }
}
