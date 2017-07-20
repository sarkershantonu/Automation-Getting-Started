package org.automation;

import org.automation.core.App;
import org.automation.core.Browser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 7/20/17.
 */
public class TestLoadAPage {

    private static WebDriver browser;
    private static String baseUrl;

    @BeforeClass
    public static void initClass() {
        App.loadDefaultProperties();
        browser = Browser.getInstance();
        baseUrl=System.getProperty("url.protocol")+"://"+System.getProperty("base.url");
    }

    @Test
    public void checkUrl() {
        browser.get(baseUrl);
    }

    @AfterClass
    public static void cleanupClass() {
        browser.close();
        browser.quit();
        Browser.closeSession();
    }
}
