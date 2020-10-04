package org.automation.webtest.tests.page.checkout;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.*;
import com.freshdirect.testing.steps.pages.*;
import org.junit.After;
import org.junit.Before;
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
public class CheckoutAddTipTests extends TestBase {
    private Home homePage;
    private HomePageSteps home;
    private Checkout checkoutPage;
    private CheckoutSteps checkout;

    @Before
    public void initTest() throws InterruptedException {
        homePage = new Home(browser);
        home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("checkout.userWithAddress"));
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
    }

    @Test
    @Title("Add Tip button becomes disabled Tip Added button upon tip amount selection")
    @Severity(SeverityLevel.NORMAL)
    @Features("Tip")
    @Stories("Checkout")
    public void validateTipAddedButtonIsDisabledUponTipSelection(){
        checkout.addTipButtonEnabled();
        checkout.selectedTipAmount("$2");
        checkout.clickOnAddTipButton();
        holdExecution();
        checkout.tipAddedButtonDisabled();
    }

    @Test
    @Title("Validate tip added to the order total")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Tip")
    @Stories("Checkout")
    public void tipAddedToOrderTotalValidation(){
        double beforeAddingTip = checkout.orderTotal();
        double tipAmount = 2;
        checkout.selectedTipAmount("$2");
        checkout.clickOnAddTipButton();
        holdExecution();
        checkoutPage.initElement();
        double afterAddingTip = checkout.orderTotal();
        checkout.tipAmountAddedToOrderTotal(beforeAddingTip, tipAmount, afterAddingTip);
    }


    @After
    public void resetTest(){
        checkout.logOutFromHomePage();
    }

}
