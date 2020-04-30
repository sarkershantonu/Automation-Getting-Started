package org.automation.tests.google.opencart;

import com.opencart.demo.pages.common.FooterArea;
import org.automation.TestBase;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.*;
import static org.automation.validation.validator.linkValidator;

/**
 * Created by shantonu on 8/27/17.
 */
public class CheckAllFooterLinks extends TestBase {
    private static final Logger log = Logger.getLogger(CheckAllFooterLinks.class.getName());

    static {
        TestBase.loadProperties();
    }

    private FooterArea footers;

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Before
    public void init() {

        footers = new FooterArea();
    }

    @Test
    public void TestAllFooterLinks() {
        open(footers.base_url);

        try {
            linkValidator(By.cssSelector(footers.aboutUsLink_css), "About Us");
            linkValidator(By.cssSelector(footers.deliveryInfoLink_css), "Delivery Information");
            linkValidator(By.cssSelector(footers.privacyPolicyLink_css), "Privacy Policy");
            linkValidator(By.cssSelector(footers.termsAndConditionLink_css), "Terms & Conditions");
            linkValidator(By.cssSelector(footers.contactUsLink_css), "Contact Us");
            linkValidator(By.cssSelector(footers.returnsLink_css), "Product Returns");
            linkValidator(By.cssSelector(footers.siteMapLink_css), "Site Map");
            linkValidator(By.cssSelector(footers.brandsLink_css), "Find Your Favorite Brand");
            linkValidator(By.cssSelector(footers.giftVoucersLink_css), "Purchase a Gift Certificate");
            linkValidator(By.cssSelector(footers.affiliatesLink_css), "Affiliate Program");
            linkValidator(By.cssSelector(footers.specialsLink_css), "Special Offers");
          //sa  lisarker.shantonunkValidator(By.cssSelector(footers.myAccountLink_css), "Account Login");
            linkValidator(By.cssSelector(footers.orderHistoryLink_css), "Account Login");
            linkValidator(By.cssSelector(footers.wishListLink_css), "Account Login");
            linkValidator(By.cssSelector(footers.newsLetterLink_css), "Account Login");
        } catch (AssertionError e) {
            collector.addError(e);
        }
    }


}
