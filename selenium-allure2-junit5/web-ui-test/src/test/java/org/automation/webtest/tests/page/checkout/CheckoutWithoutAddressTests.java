package org.automation.webtest.tests.page.checkout;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.DriverWindow;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.*;
import com.freshdirect.testing.steps.pages.*;
import com.freshdirect.testing.steps.popups.AddAddressPopupSteps;
import com.freshdirect.testing.steps.popups.AddPaymentPopupSteps;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by: Arafat Mamun
 * User Name: amamaun@freshdirect.com
 * Email: arafatmamun@hotmail.com
 * Date: 3/14/2019
 * Time: 3:52 PM
 */

public class CheckoutWithoutAddressTests extends TestBase {
    private Checkout checkoutPage;
    private CheckoutSteps checkout;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("checkout.userWithoutAddress"));
    }

    @Before
    public void initTest() throws InterruptedException {
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
    }

    @Test
    @Title("Checkout page validation")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void checkoutPage() {
        checkout.checkoutPageTitle();
        checkout.checkoutPageLoadedText();
    }

    @Test
    @Title("Clicking on Add an Address button opens up add address form")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void addAddressButtonOpensAddAddressForm(){
        checkout.clickOnAddAnAddressButton();
        AddAddressPopupSteps addAddressPopup = new AddAddressPopupSteps(checkoutPage.addAddressPopup);
        addAddressPopup.isAddAddressPopupDisplayed();
    }

    /*@Test
    @Title("Select a Time button has no action without selecting a delivery address")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void selectATimeButtonOpensTimeSlotsForm(){
        checkout.clickOnSelectATimeButton();

    }*/

    @Test
    @Title("Clicking on Add a Method button opens up add payment form")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void addAMethodButtonOpensAddPaymentForm(){
        checkout.clickOnAddAMethodButton();
        AddPaymentPopupSteps addPaymentFormPopup = new AddPaymentPopupSteps(checkoutPage.addPaymentPopup);
        addPaymentFormPopup.addPaymentFormPopupDisplayed();
    }

    @Test
    @Title("Clicking on PayPal button opens up paypal login page in a new window")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void payPalButtonValidation(){
        try {
            checkout.clickOnPayPalButton();
            switchWindow(DriverWindow.SECOND, false);
            PayPalLoginPage payPal = new PayPalLoginPage(browser);
            PayPalLoginPageSteps payPalLoginPage = new PayPalLoginPageSteps(payPal);
            payPalLoginPage.waitForPayPalLoginPageToLoad();
            payPalLoginPage.payPalLoginPageTitle();
            payPalLoginPage.payPalLoginPageLoadedText();
        } finally {
            switchWindow(DriverWindow.FIRST, true);
        }
    }

    @Test
    @Title("Clicking on masterpass button opens up masterpass sign up page in a new window")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void masterPassButtonValidation(){
        try {
            checkout.clickOnMasterPassButton();
            checkoutPage.switchFrame(checkoutPage.frame_masterPass);
            MasterPassSignUpPage masterPass = new MasterPassSignUpPage(browser);
            MasterPassSignUpPageSteps masterPassSignUpPage = new MasterPassSignUpPageSteps(masterPass);
            masterPassSignUpPage.waitForMasterPassSignUpPageToLoad();
            masterPassSignUpPage.masterPassSignUpPageLoadedText();
        } finally {
            checkoutPage.switchBackToDefaultContent();
        }
    }

    @Test
    @Title("Clicking on Learn More link redirects to Master card home in a new tab")
    @Severity(SeverityLevel.MINOR)
    @Features("Checkout")
    @Stories("Checkout")
    public void learnMoreLinkValidation(){
        try {
            checkout.clickOnLearnMoreLink();
            switchWindow(DriverWindow.SECOND, false);
            MasterPassSite page = new MasterPassSite(browser);
            MasterPassSiteSteps masterPassSite = new MasterPassSiteSteps(page);
            holdExecution();
            masterPassSite.masterPassPageUrl();
        } finally {
            switchWindow(DriverWindow.FIRST, true);
        }
    }

    @Test
    @Title("Hovering on Tip icon opens up Optional Tip overlay")
    @Severity(SeverityLevel.MINOR)
    @Features("Checkout")
    @Stories("Checkout")
    public void tipIconValidation(){
        checkout.hoverOnOptionalTipIcon();
        checkout.optionalTipOverlayDisplayed();
    }

    @Test
    @Title("Selected tip amount should be displayed")
    @Severity(SeverityLevel.NORMAL)
    @Features("Checkout")
    @Stories("Checkout")
    public void validateTipAmountSelection(){
        checkout.selectedTipAmount("$5");
        checkout.selectedTipAmountIsDisplayed("$5");
    }

    @Test
    @Title("Green check mark should display upon adding tip")
    @Severity(SeverityLevel.NORMAL)
    @Features("Checkout")
    @Stories("Checkout")
    public void greenCheckMarkUponAddingTipValidation(){
        checkout.selectedTipAmount("$2");
        checkout.clickOnAddTipButton();
        checkout.greenCheckMarkDisplayed();
    }

    @Test
    @Title("Delivery Fee should show $0.00")
    @Severity(SeverityLevel.NORMAL)
    @Features("Checkout")
    @Stories("Checkout")
    public void deliveryFeeAmountValidation(){
        checkout.deliveryFeeIsZero();
    }

    @Test
    @Title("Place Order button should be disabled")
    @Severity(SeverityLevel.NORMAL)
    @Features("Checkout")
    @Stories("Checkout")
    public void placeOrderButtonValidation(){
        checkout.placeOrderButtonIsDisabled();
    }

    @AfterClass
    public static void resetTest(){
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }
}
