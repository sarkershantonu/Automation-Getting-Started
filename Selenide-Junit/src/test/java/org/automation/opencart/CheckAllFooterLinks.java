package org.automation.opencart;

import org.automation.TestBase;
import org.automation.opencart.pages.common.FooterArea;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
/**
 * Created by shantonu on 8/27/17.
 */
public class CheckAllFooterLinks extends TestBase {

    static {
        TestBase.loadProperties();
    }
    private FooterArea footers;

    @Before
    public void init(){

        footers = new FooterArea();
    }

    @Test
    public void TestAllFooterLinks() {
        open(footers.base_url);
        System.out.println("####"+footers.aboutUsLink_css);
        $(By.cssSelector(footers.aboutUsLink_css)).click();
       // Assert.assertEquals("About us",title());
    }
}
