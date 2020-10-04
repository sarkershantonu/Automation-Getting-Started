package org.automation.webtest.tests.page.deliverto;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.popups.checkout.DeliverToPopupSteps;
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
 * Date: 4/18/2019
 * Time: 2:08 PM
 */
public class DeliverToWithMultipleAddressTests extends TestBase {

    private Checkout checkoutPage;
    private CheckoutSteps checkout;
    private DeliverToPopupSteps deliverToPopup;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("deliverToPopup.multipleAddressUser"));
    }

    @Before
    public void initTest(){
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
        checkout.clickOnDeliveryAddressEditButton();
        deliverToPopup = new DeliverToPopupSteps(checkoutPage.deliverToPopup);
    }

    @Test
    @Title("Deliver to popup has Done button")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Edit address")
    @Stories("Checkout")
    public void deliverToPopupDoneButton(){
        deliverToPopup.doneButtonIsDisplayed();
        deliverToPopup.doneButtonIsEnabled();
    }

    @Test
    @Title("Deliver to popup has Cancel button")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Edit address")
    @Stories("Checkout")
    public void deliverToPopupCancelButton(){
        deliverToPopup.cancelButtonIsDisplayed();
        deliverToPopup.cancelButtonIsEnabled();
    }

    @Test
    @Title("Deliver to popup has Cancel button Closes popup")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Edit address")
    @Stories("Checkout")
    public void deliverToPopupCancelButtonClosesPopup(){
        deliverToPopup.clickOnCancelButton();
        checkout.verifyDeliveryAddressEditButtonDisplayed();
    }

    @Test
    @Title("Deliver to popup has Add Address button")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Edit address")
    @Stories("Checkout")
    public void deliverToPopupAddAddressButton(){
        deliverToPopup.addAddressButtonIsDisplayed();
        deliverToPopup.addAddressButtonIsEnabled();
    }

    @AfterClass
    public static void resetTest(){
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }
}
