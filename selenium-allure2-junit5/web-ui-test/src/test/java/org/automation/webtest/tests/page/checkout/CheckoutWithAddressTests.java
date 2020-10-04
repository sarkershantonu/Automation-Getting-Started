package org.automation.webtest.tests.page.checkout;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.DriverWindow;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.*;
import com.freshdirect.testing.pages.popups.checkout.PayWithPopup;
import com.freshdirect.testing.steps.pages.*;
import com.freshdirect.testing.steps.popups.checkout.DeliverToPopupSteps;
import com.freshdirect.testing.steps.popups.checkout.FreeDeliveryPassPopupSteps;
import com.freshdirect.testing.steps.popups.checkout.PayWithPopupSteps;
import com.freshdirect.testing.steps.popups.checkout.TimeSlotsPopupSteps;
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
 * Created By: Tanvir Ahmed
 * Date: 4/5/2019
 * Time: 1:26 PM
 */
public class CheckoutWithAddressTests extends TestBase {
    private Checkout checkoutPage;
    private CheckoutSteps checkout;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("checkout.userWithAddress"));
    }

    @Before
    public void initTest() throws InterruptedException {
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
    }

    @Test
    @Title("Clicking on delivery address Edit button opens up Deliver To popup")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void editAddressButtonOpensDeliverToPopup(){
        checkout.clickOnDeliveryAddressEditButton();
        DeliverToPopupSteps deliverToPopup = new DeliverToPopupSteps(checkoutPage.deliverToPopup);
        deliverToPopup.deliverToPopupDisplayed();
    }

    @Test
    @Title("Clicking on Select a Time button opens up time slots popup")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void selectATimeButtonOpensTimeSlotsForm(){
        checkout.clickOnSelectATimeButton();
        TimeSlotsPopupSteps timeSlotsPopup = new TimeSlotsPopupSteps(checkoutPage.timeSlotsPopup);
        timeSlotsPopup.timeSlotsPopupDisplayed();
    }

    @Test
    @Title("Clicking on payment method Edit button opens up Pay with popup")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Checkout")
    public void editPaymentMethodButtonOpensPayWithPopup(){
        checkout.clickOnPaymentMethodEditButton();
        PayWithPopup popup = new PayWithPopup(browser);
        PayWithPopupSteps payWithPopup = new PayWithPopupSteps(popup);
        payWithPopup.payWithPopupDisplayed();
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
    @Title("Delivery fee Free link opens up DP signup popup")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Checkout")
    @Stories("Checkout")
    public void freeLinkOpensUpDpSignUpPopup(){
        checkout.clickOnDpFreeLink();
        FreeDeliveryPassPopupSteps freeDpPopup = new FreeDeliveryPassPopupSteps(checkoutPage.freeDeliveryPassPopup);
        freeDpPopup.freeDpPopupDisplayed();
    }

    @AfterClass
    public static void resetTest(){
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }
}
