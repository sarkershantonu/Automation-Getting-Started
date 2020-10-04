package org.automation.webtest.tests.page.checkout;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.pages.ViewCart;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.pages.ViewCartPageSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class CheckoutPromoAndGiftTests extends TestBase {
    private ViewCart viewCartPage;
    private ViewCartPageSteps viewCart;


    private Home homePage;
    private HomePageSteps home;
    private Checkout checkoutPage;
    private CheckoutSteps checkout;

    @Before
    public void initTest() throws InterruptedException {
        homePage = new Home(browser);
        home = new HomePageSteps(homePage);
        home.navigateToHomePage();
    }

    @Test
    @Title("Promotional code insufficient product error message")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void applyingValidPromotionalCodeInsufficientCartMessage() {
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("checkout.insufficientCart"));
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
        checkout.typePromotionalCode(PropertyLoader.getValue("global.validPromoCode"));
        checkout.clickOnPromotionalCodeApplyButton();
        checkout.verifyValidPromotionalCodeInsufficientCartErrorMessage();
    }

    /*
    @Test
    @Title("Promotional code is applied when cart has sufficient order amount")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void applyingValidPromotionalCodeForSufficientOrderAmount() {
        try{
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct2"), 2);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.typePromotionalCode(PropertyLoader.getValue("viewCart.validPromoCode"));
            viewCart.clickOnPromotionalCodeApplyButton();
            viewCart.verifyValidPromotionalCodeForSufficientOrderAmount();
        } finally {
            viewCart.resetCart();
        }
    }
    */

    @After
    public void resetTest(){
        checkout.logOutFromHomePage();
    }
}
