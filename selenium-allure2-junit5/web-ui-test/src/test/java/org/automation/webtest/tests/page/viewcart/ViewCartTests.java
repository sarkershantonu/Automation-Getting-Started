package org.automation.webtest.tests.page.viewcart;

import com.freshdirect.testing.config.AppConstants;
import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.ViewCart;
import com.freshdirect.testing.pages.singlepages.ProductDetail;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.ProductDetailsPageSteps;
import com.freshdirect.testing.steps.pages.ViewCartPageSteps;
import com.freshdirect.testing.steps.popups.CreateAccountPopupSteps;
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
 * Date: 3/8/2019
 * Time: 3:57 PM
 */

public class ViewCartTests extends TestBase {
    private ViewCart viewCartPage;
    private ViewCartPageSteps viewCart;

    @Test
    @Title("View Cart page")
    @Severity(SeverityLevel.BLOCKER)
    @Features("View Cart")
    @Stories("View Cart")
    public void viwCartPage() {
        viewCartPage = new ViewCart(browser);
        viewCart = new ViewCartPageSteps(viewCartPage);
        viewCart.navigateToViewCartPage();
        viewCart.viewCartPageTitle();
        viewCart.viewCartPageLoadedText();

    }

    @Test
    @Title("Empty Cart Button opens Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void emptyCartButtonOpensAlert() {
        try {
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct1"), 5);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.clickOnEmptyCartButton();
            viewCart.verifyEmptyCartAlertIsPresent();
            viewCart.emptyCartAlertText();
        } finally {
            viewCartPage.resetAlert();
            viewCart.resetCart();
        }
    }

    @Test
    @Title("User can dismiss the alert message")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void emptyCartButtonOpensAlertDismiss() {
        try {
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct2"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.clickOnEmptyCartButton();
            viewCart.holdExecution();
            viewCart.dismissEmptyCartAlert();
            viewCart.verifyEmptyCartAlertIsNotPresent();
        } finally {
            viewCartPage.resetAlert();
            viewCart.resetCart();
        }
    }

    @Test
    @Title("Anon user: Dismissal of alert message does not affect viewCartPage")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void emptyCartButtonAlertDismissHasNoEffectForAnonUser() {
        try {
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct1"), 5);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            String subTotalBefore = viewCart.getCartHeaderOrderSubTotalString();
            viewCart.clickOnEmptyCartButton();
            viewCart.holdExecution();
            viewCart.dismissEmptyCartAlert();
            viewCart.holdExecution(2250);
            viewCartPage.initElement();
            String subtotalAfter = viewCart.getCartHeaderOrderSubTotalString();
            viewCart.verifySubtotalStringsAreEqual(subTotalBefore);
        } finally {
            viewCartPage.resetAlert();
            viewCart.resetCart();
        }
    }

    @Test
    @Title("Logged in user: Dismissal of alert message does not affect viewCartPage")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void emptyCartButtonAlertDismissHasNoEffectForLoggedInUser() {
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser"));
            String subTotalBefore = viewCart.getCartHeaderOrderSubTotalString();
            viewCart.clickOnEmptyCartButton();
            viewCart.holdExecution();
            viewCart.dismissEmptyCartAlert();
            viewCart.holdExecution(2250);
            viewCartPage.initElement();
            viewCart.verifySubtotalStringsAreEqual(subTotalBefore);
        } finally {
            viewCartPage.resetAlert();
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Anon user: Accepting alert message remove everything from viewCartPage")
    @Severity(SeverityLevel.NORMAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void acceptingEmptyCartButtonAlertRemovesAllProductsForAnonUser() {
        try{
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct1"), 5);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct2"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.clickOnEmptyCartButton();
            viewCart.holdExecution();
            viewCart.acceptEmptyCartAlert();
            viewCart.holdExecution(2000);
            viewCartPage.initElement();
            viewCart.verifyCartIsEmpty();
        } finally {
            viewCartPage.resetAlert();
            viewCart.resetCart();
        }
    }

    @Test
    @Title("Logged in user: Accepting alert message remove everything from viewCartPage")
    @Severity(SeverityLevel.NORMAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void acceptingEmptyCartButtonAlertRemovesAllProductsForLoggedInUser() {
        try{
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct1"), 5);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct2"), 1);
            productDetails.signInWith(productDetailsPage.headerArea, PropertyLoader.getValue("viewCart.userName"));
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.clickOnEmptyCartButton();
            viewCart.holdExecution();
            viewCart.acceptEmptyCartAlert();
            viewCart.holdExecution(2000);
            viewCart.verifyCartIsEmpty();
        } finally {
            viewCartPage.resetAlert();
            viewCart.resetCart();
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Anon user: Clicking on top checkout button opens create account popup")
    @Severity(SeverityLevel.NORMAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void clickingOnTopCheckoutOpensCreateAccountPopup() {
        try {
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct2"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.holdExecution();
            viewCart.clickOnCheckoutFromCartHeader();
            CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(viewCartPage.createAccountPopup);
            createAccountPopup.createAccountPopupHasExpectedText();
            viewCart.refreshViewCartPage();
        } finally {
            viewCart.resetCart();
        }
    }

    @Test
    @Title("Anon user: Top checkout Create account popup takes to checkout after creating account")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void topCheckoutButtonCreateAccountPopup() {
        try {
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct3"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.clickOnCheckoutFromCartHeader();
            CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(viewCartPage.createAccountPopup);
            createAccountPopup.typeUniqueEmailAddress();
            createAccountPopup.typePassword(AppConstants.PASSWORD);
            createAccountPopup.clickOnCreateAccountButton();
            //createAccountPopup.waitUntilCreateAccountButtonDisappears();
            Checkout checkoutPage = new Checkout(browser);
            CheckoutSteps checkout = new CheckoutSteps(checkoutPage);
            checkout.checkoutPageTitle();
            checkout.holdExecution(750);
        } finally {
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Logged in user: Clicking on top checkout button takes to checkout page")
    @Severity(SeverityLevel.NORMAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void clickingOnTopCheckoutTakesToCheckoutPage() {
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser"));
            viewCart.clickOnCheckoutFromCartHeader();
            Checkout checkoutPage = new Checkout(browser);
            CheckoutSteps checkout = new CheckoutSteps(checkoutPage);
            checkout.checkoutPageTitle();
            checkout.checkoutPageLoadedText();
        } finally {
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Anon user: Clicking on bottom checkout button opens create account popup")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void clickingOnContentCheckoutOpensCreateAccountPopup() {
        try {
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct2"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.clickOnCheckoutFromCartContent();
            CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(viewCartPage.createAccountPopup);
            viewCartPage.createAccountPopup.initElement();
            createAccountPopup.createAccountPopupHasExpectedText();
            viewCart.refreshViewCartPage();
        } finally {
            viewCart.resetCart();
        }
    }

    @Test
    @Title("Anon user: Bottom checkout Create account popup takes to checkout after creating account")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void contentCheckoutButtonCreateAccountPopup() {
        try{
            ProductDetail productDetailsPage = new ProductDetail(browser);
            ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
            productDetails.addRegularProductToCart(PropertyLoader.getValue("viewCart.regularProduct3"), 1);
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.clickOnCheckoutFromCartContent();
            CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(viewCartPage.createAccountPopup);
            createAccountPopup.typeUniqueEmailAddress();
            createAccountPopup.typePassword(AppConstants.PASSWORD);
            createAccountPopup.clickOnCreateAccountButton();
            //createAccountPopup.waitUntilCreateAccountButtonDisappears();
            viewCart.holdExecution();
            Checkout checkoutPage = new Checkout(browser);
            CheckoutSteps checkout = new CheckoutSteps(checkoutPage);
            checkout.checkoutPageTitle();
        } finally {
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Logged in user: Clicking on bottom checkout button takes to checkout page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void clickingOnBottomCheckoutTakesToCheckoutPage() {
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.holdExecution();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser"));
            viewCart.clickOnCheckoutFromCartContent();
            viewCart.holdExecution();
            Checkout checkoutPage = new Checkout(browser);
            CheckoutSteps checkout = new CheckoutSteps(checkoutPage);
            checkout.checkoutPageTitle();
            checkout.checkoutPageLoadedText();
        } finally {
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Product quantity can be increased by increment button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void productQuantityCanBeIncreasedByIncrementButton() {
        int productIndex = 0;
        int changeBy= 2;
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser2"));
            int currentQuantity = viewCart.getProductQuantityInputBoxValueByIndex(productIndex);
            viewCart.clickOnIncrementButtonByIndex(productIndex, changeBy);
            viewCart.holdExecution();
            viewCart.verifyProductQuantityInputBoxValueByIndex(productIndex, currentQuantity + changeBy);
        } finally{
            viewCart.holdExecution();
            viewCart.clickOnDecrementButtonByIndex(productIndex, changeBy);
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Product quantity increment by increase button increases sub total")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void productQuantityIncreasedByIncrementButtonIncreaseSubtotal() {
        int productIndex = 0;
        int changeBy = 2;
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser2"));
            int beforeQuantity = viewCart.getProductQuantityInputBoxValueByIndex(productIndex);
            double beforeTotal = viewCart.getSpecificItemTotalPriceByIndex(productIndex);
            double beforeUnitPrice = (double)(beforeTotal / beforeQuantity);
            double beforeSubtotal = viewCart.getCartHeaderSubtotal();
            viewCart.clickOnIncrementButtonByIndex(productIndex, changeBy);
            viewCart.holdExecution(1000);
            viewCartPage.initElement();
            double expectedSubtotal = beforeSubtotal = Math.round((beforeSubtotal + (beforeUnitPrice * changeBy)) * 100.00) / 100.00;
            viewCart.verifySubtotalsAreEqual(expectedSubtotal);
        } finally{
            viewCart.clickOnDecrementButtonByIndex(productIndex, changeBy);
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Product quantity can be decreased by decrement")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void productQuantityCanBeDecreasedByDecrementButton() {
        int productIndex = 1;
        int changeBy = 2;
        try {
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser2"));
            int currentQuantity = viewCart.getProductQuantityInputBoxValueByIndex(productIndex);
            viewCart.clickOnDecrementButtonByIndex(productIndex, changeBy);
            viewCart.verifyProductQuantityInputBoxValueByIndex(productIndex, currentQuantity - changeBy);
        } finally {
            viewCart.clickOnIncrementButtonByIndex(productIndex, changeBy);
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Product quantity decrement by decrease button decreases sub total")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void productQuantityDecreasedByDecrementButtonDecreaseSubtotal() {
        int productIndex = 1;
        int changeBy= 2;
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser2"));
            int beforeQuantity = viewCart.getProductQuantityInputBoxValueByIndex(productIndex);
            double beforeTotal = viewCart.getSpecificItemTotalPriceByIndex(productIndex);
            double beforeUnitPrice = (double)(beforeTotal / beforeQuantity);
            double beforeSubtotal = viewCart.getCartHeaderSubtotal();
            viewCart.clickOnDecrementButtonByIndex(productIndex, changeBy);
            viewCart.holdExecution(1000);
            viewCartPage.initElement();
            double expectedSubtotal = Math.round((beforeSubtotal - (beforeUnitPrice * changeBy)) * 100.00) / 100.00;
            viewCart.verifySubtotalsAreEqual(expectedSubtotal);
        } finally{
            viewCart.clickOnIncrementButtonByIndex(productIndex, changeBy);
            viewCart.logOutFromHomePage();
        }
    }


    @Test
    @Title("Product quantity can be changed by typing in input box")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void productQuantityCanBeChangedByInputBox() {
        int productIndex = 2;
        int typeQuantity= 5;
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser2"));
            viewCart.typeQuantity(productIndex, typeQuantity);
            viewCartPage.initElement();
            viewCart.verifyProductQuantityInputBoxValueByIndex(productIndex, typeQuantity);
        } finally{
            viewCart.typeQuantity(productIndex, 7);
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Product quantity changing by typing in input box update subtotal")
    @Severity(SeverityLevel.CRITICAL)
    @Features("View Cart")
    @Stories("View Cart")
    public void productQuantityChangingByInputBoxUpdateSubtotal() {
        int productIndex = 2;
        int typeQuantity= 5;
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.itemsInCartUser2"));
            int beforeQuantity = viewCart.getProductQuantityInputBoxValueByIndex(productIndex);
            double beforeTotal = viewCart.getSpecificItemTotalPriceByIndex(productIndex);
            double beforeUnitPrice = (double)(beforeTotal / beforeQuantity);
            double beforeSubtotal = viewCart.getCartHeaderSubtotal();
            viewCart.typeQuantity(productIndex, typeQuantity);
            viewCartPage.initElement();
            double expectedSubtotal = Math.round((beforeSubtotal + (beforeUnitPrice * (typeQuantity - beforeQuantity) )) * 100.00) / 100.00;
            viewCart.verifySubtotalsAreEqual(expectedSubtotal);
        } finally{
            viewCart.holdExecution();
            viewCart.typeQuantity(productIndex, 7);
            viewCart.holdExecution();
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Logged in user: View viewCartPage has gift card field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Gift Card")
    @Stories("View Cart")
    public void viewCartHasGiftCardCodeFieldForLoggedInUser() {
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.giftCardUser"));
            viewCart.giftCardFieldDisplayed();
            viewCart.giftCardFieldEnabled();
            viewCart.typeGiftCardNumber(System.getProperty("global.validGiftCardNumber"));
            viewCart.giftCardFieldTakesInput(System.getProperty("global.validGiftCardNumber"));
        } finally{
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Logged in user: View viewCartPage has gift card apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Gift Card")
    @Stories("View Cart")
    public void viewCartHasGiftCardApplyButtonForLoggedInUser() {
        try {
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.giftCardUser"));
            viewCart.giftCardApplyButtonDisplayed();
            viewCart.giftCardApplyButtonDisabled();
        } finally{
            viewCart.logOutFromHomePage();
        }
    }

    @Test
    @Title("Logged in user: Typing valid gift card enables apply button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Gift Card")
    @Stories("View Cart")
    public void typingValidGiftCardNumberEnablesGiftCardApplyButtonForLoggedInUser() {
        try{
            viewCartPage = new ViewCart(browser);
            viewCart = new ViewCartPageSteps(viewCartPage);
            viewCart.navigateToViewCartPage();
            viewCart.signInWith(viewCartPage.headerArea, PropertyLoader.getValue("viewCart.giftCardUser"));
            viewCart.typeGiftCardNumber(PropertyLoader.getValue("global.validGiftCardNumber"));
            viewCart.giftCardApplyButtonEnabled();
        } finally{
            viewCart.logOutFromHomePage();
        }
    }
}
