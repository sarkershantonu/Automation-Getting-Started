package org.automation.webtest.tests.page.viewcart;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.ViewCart;
import com.freshdirect.testing.pages.singlepages.ProductDetail;
import com.freshdirect.testing.steps.pages.ProductDetailsPageSteps;
import com.freshdirect.testing.steps.pages.ViewCartPageSteps;
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
 * Date: 4/3/2019
 * Time: 3:33 PM
 */

public class ViewCartPromoCodeTests extends TestBase {
    private ViewCart viewCartPage;
    private ViewCartPageSteps viewCart;


    @Test
    @Title("View Cart Page has promotional code field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void viewCartHasPromotionalCodeField() {
        viewCartPage = new ViewCart(browser);
        viewCart = new ViewCartPageSteps(viewCartPage);
        viewCart.navigateToViewCartPage();
        viewCart.promotionalCodeFieldDisplayed();
        viewCart.promotionalCodeFieldEnabled();
        viewCart.typePromotionalCode(System.getProperty("global.validPromoCode"));
        viewCart.promotionalCodeFieldTakesInput(System.getProperty("global.validPromoCode"));
    }

    @Test
    @Title("View Cart Page promotional code field takes input")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void viewCartPromotionalCodeFieldTakesInput() {
        viewCartPage = new ViewCart(browser);
        viewCart = new ViewCartPageSteps(viewCartPage);
        viewCart.navigateToViewCartPage();
        viewCart.typePromotionalCode(System.getProperty("global.validPromoCode"));
        viewCart.promotionalCodeFieldTakesInput(System.getProperty("global.validPromoCode"));
    }

    @Test
    @Title("View Cart Page has promotional code apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void viewCartHasPromotionalCodeApplyButton() {
        viewCartPage = new ViewCart(browser);
        viewCart = new ViewCartPageSteps(viewCartPage);
        viewCart.navigateToViewCartPage();
        viewCart.promotionalCodeApplyButtonDisplayed();
        viewCart.promotionalCodeApplyButtonDisabled();
    }

    @Test
    @Title("Typing valid promotional code enables apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void typingValidPromotionalCodeEnablesPromotionalCodeApplyButton() {
        viewCartPage = new ViewCart(browser);
        viewCart = new ViewCartPageSteps(viewCartPage);
        viewCart.navigateToViewCartPage();
        viewCart.typePromotionalCode(System.getProperty("global.validPromoCode"));
        viewCart.promotionalCodeApplyButtonEnabled();
    }

    @Test
    @Title("Promotional code insufficient product error message")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void applyingValidPromotionalCodeInsufficientCartMessage() {
        try{
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct1"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.typePromotionalCode(PropertyLoader.getValue("global.validPromoCode"));
            viewCart.clickOnPromotionalCodeApplyButton();
            viewCart.verifyValidPromotionalCodeInsufficientCartErrorMessage();
        } finally {
            viewCart.resetCart();
        }
    }

    @Test
    @Title("Invalid promotional code error message")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("View Cart")
    public void applyingInValidPromotionalCodeErrorMessage() {
        try{
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct1"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.typePromotionalCode(PropertyLoader.getValue("global.invalidPromoCode"));
            viewCart.clickOnPromotionalCodeApplyButton();
            viewCart.verifyInvalidPromotionalCodeIErrorMessage(PropertyLoader.getValue("global.invalidPromoCode"));
        } finally {
            viewCart.resetCart();
        }
    }

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
            viewCart.typePromotionalCode(PropertyLoader.getValue("global.validPromoCode"));
            viewCart.clickOnPromotionalCodeApplyButton();
            viewCart.verifyValidPromotionalCodeForSufficientOrderAmount();
        } finally {
            viewCart.resetCart();
        }
    }
}
