package org.automation.tests.opencart;

import org.automation.core.TestBase;
import org.automation.pages.opencart.common.FooterArea;
import org.automation.validation.LinkValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by shantonu on 8/27/17.
 */
public class CheckAllFooterLinks extends TestBase {
    private static final Logger log = Logger.getLogger(CheckAllFooterLinks.class.getName());


    private FooterArea footers;

/*    @Rule
    public ErrorCollector collector = new ErrorCollector();*/

    @BeforeEach
    public void init() {
        footers = new FooterArea();
    }

    @Test
    public void TestAllFooterLinks() {
        open(footers.base_url);

        //SoftAssertion softAssertion = new SoftAssertion();
        /*try {
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
            //collector.addError(e);
        }*/

        Assertions.assertAll("Footer Links",
                () -> Assertions.assertTrue(new LinkValidator(footers.aboutUsLink_css).isTitle("About Us"))
        );
    }


}
