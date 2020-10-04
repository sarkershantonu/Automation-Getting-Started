package org.automation.webtest.tests.page.checkout;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Author: Arafat Mamun
 * username: amamun@freshdirect.com
 * Email: arafatmamun@hotmail.com
 * Date: 6/3/2019
 * Time: 11:32 AM
 */

public class CheckoutPromoAndGiftFormTests extends TestBase {
    private Checkout checkoutPage;
    private CheckoutSteps checkout;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("checkout.promoAndGiftForm"));
    }

    @Before
    public void initTest() throws InterruptedException {
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
    }


    @Test
    @Title("Checkout page has promotional code field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void checkoutHasPromotionalCodeField() {
        checkout.verifyPromotionalCodeInputField(PropertyLoader.getValue("global.validPromoCode"));
    }

    @Test
    @Title("Checkout page  has promotional code apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void checkoutHasPromotionalCodeApplyButton() {
        checkout.promotionalCodeApplyButtonDisplayed();
        checkout.promotionalCodeApplyButtonDisabled();
    }

    @Test
    @Title("Typing valid promotional code enables apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void typingValidPromotionalCodeEnablesPromotionalCodeApplyButton() {
        checkout.typePromotionalCode(PropertyLoader.getValue("global.validPromoCode"));
        checkout.promotionalCodeApplyButtonEnabled();
    }

    @Test
    @Title("Invalid promotional code error message")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void applyingInValidPromotionalCodeErrorMessage() {
        checkout.typePromotionalCode(PropertyLoader.getValue("global.invalidPromoCode"));
        checkout.clickOnPromotionalCodeApplyButton();
        checkout.verifyInvalidPromotionalCodeErrorMessage(PropertyLoader.getValue("global.invalidPromoCode"));
    }

    @Test
    @Title("Checkout page gift card field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Gift card")
    @Stories("Checkout")
    public void checkoutHasGiftCardField() {
        checkout.verifyGiftCardInputField(PropertyLoader.getValue("global.validPromoCode"));
    }

    @Test
    @Title("Checkout page  has gift card apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Gift card")
    @Stories("Checkout")
    public void checkoutHasGiftCardApplyButton() {
        checkout.giftCardApplyButtonDisplayed();
        checkout.giftCardApplyButtonDisabled();
    }

    @Test
    @Title("Typing valid gift card enables apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Gift card")
    @Stories("Checkout")
    public void typingValidGiftCardEnablesPromotionalCodeApplyButton() {
        checkout.typeGiftCard(PropertyLoader.getValue("global.validGiftCardNumber"));
        checkout.giftCardApplyButtonEnabled();
    }

    @Test
    @Title("Invalid gift card error message")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Gift card")
    @Stories("Checkout")
    public void applyingInValidGiftCardErrorMessage() {
        checkout.typeGiftCard(PropertyLoader.getValue("global.inValidGiftCardNumber"));
        checkout.clickOnGiftCardApplyButton();
        checkout.verifyInvalidGiftCardErrorMessage();
    }
}
