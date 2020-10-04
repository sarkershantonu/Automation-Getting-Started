package org.automation.webtest.tests.page;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.NowInCart;
import com.freshdirect.testing.pages.singlepages.ProductDetail;
import com.freshdirect.testing.steps.HeaderAreaSteps;
import com.freshdirect.testing.steps.pages.NowInCartPageSteps;
import com.freshdirect.testing.steps.pages.ProductDetailsPageSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by: Arafat Mamun
 * User Name: amamun
 * Email: arafatmamun@hotmail.com
 * Date: 3/6/2019
 * Time: 1:18 PM
 */

public class ProductDetailTests extends TestBase {

    private ProductDetail productDetailsPage;
    private ProductDetailsPageSteps productDetails;

    @Before
    public void initTest() throws InterruptedException{
        productDetailsPage = new ProductDetail(browser);
        productDetails = new ProductDetailsPageSteps(productDetailsPage);
    }

    @Test
    @Title("Initial Quantity for regular product")
    @Severity(SeverityLevel.NORMAL)
    @Features("Product Details")
    @Stories("Product Details")
    public void regularProductInitialQuantity() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        productDetails.verifyProductQuantityInputBoxValue(1);
    }

    @Test
    @Title("Plus button increases regular product quantity")
    @Severity(SeverityLevel.NORMAL)
    @Features("Product Details")
    @Stories("Product Details")
    public void regularProductQuantityIncrement() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        int currentQuantity = productDetails.getProductQuantityInputBoxValue();
        productDetails.clickOnIncrementButton(2);
        productDetails.verifyProductQuantityInputBoxValue(currentQuantity + 2);
    }

    @Test
    @Title("Product quantity increment by increase button increases sub total")
    @Severity(SeverityLevel.NORMAL)
    @Features("Product Details")
    @Stories("Product Details")
    public void productQuantityIncreasedByIncrementButtonIncreaseSubtotal() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        int currentQuantity = productDetails.getProductQuantityInputBoxValue();
        double currentSubTotal = productDetails.getSubTotal();
        double unitPrice = (double)(currentSubTotal / currentQuantity);
        productDetails.clickOnIncrementButton(4);
        productDetails.verifyUpdatedSubTotal((double)(unitPrice * (currentQuantity + 4)));
    }

    @Test
    @Title("Minus button decreases regular product quantity")
    @Severity(SeverityLevel.NORMAL)
    @Features("Product Details")
    @Stories("Product Details")
    public void regularProductQuantityDecrement() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        int currentQuantity = productDetails.getProductQuantityInputBoxValue();
        productDetails.clickOnIncrementButton(4);
        currentQuantity += 4;
        productDetails.clickOnDecrementButton(1);
        currentQuantity -=1;
        productDetails.verifyProductQuantityInputBoxValue(currentQuantity);
    }

    @Test
    @Title("Product quantity decrement by decrease button decreases sub total")
    @Severity(SeverityLevel.NORMAL)
    @Features("Product Details")
    @Stories("Product Details")
    public void productQuantityDecreasedByDecrementButtonDecreaseSubtotal() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        int currentQuantity = productDetails.getProductQuantityInputBoxValue();
        double currentSubTotal = productDetails.getSubTotal();
        double unitPrice = (double)(currentSubTotal / currentQuantity);
        int newQuantity = 0;
        productDetails.clickOnIncrementButton(5);
        newQuantity = currentQuantity + 5;
        productDetails.clickOnDecrementButton(2);
        newQuantity -= 2;
        productDetails.verifyUpdatedSubTotal((double)(unitPrice * newQuantity));
    }

    @Test
    @Title("Change input box product quantity")
    @Severity(SeverityLevel.NORMAL)
    @Features("Product Details")
    @Stories("Product Details")
    public void regularProductInputBoxQuantityChange() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        int currentQuantity = productDetails.getProductQuantityInputBoxValue();
        productDetails.typeQuantity(7);
        productDetails.verifyProductQuantityInputBoxValue(7);
    }

    @Test
    @Title("Product quantity changing by typing in input box update subtotal")
    @Severity(SeverityLevel.NORMAL)
    @Features("Product Details")
    @Stories("Product Details")
    public void productQuantityChangingByInputBoxUpdateSubtotal() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        int currentQuantity = productDetails.getProductQuantityInputBoxValue();
        double currentSubTotal = productDetails.getSubTotal();
        double unitPrice = (double)(currentSubTotal / currentQuantity);
        productDetails.typeQuantity(5);
        productDetails.verifyUpdatedSubTotal((double)(unitPrice * 5));
    }

    @Test
    @Title("Add to Cart from PDP takes to now in cart")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add to Cart")
    @Stories("Product Details")
    public void pdpAddToCartTakesToNowInCart() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        String productTitle = productDetails.getProductTitle();
        productDetails.clickOnIncrementButton(5);
        double subTotal = productDetails.getSubTotal();
        productDetails.clickOnAddToCartButton();
        NowInCart nowInCartPage = new NowInCart(browser);
        NowInCartPageSteps nowInCart = new NowInCartPageSteps(nowInCartPage);
        nowInCart.verifyProductName(productTitle);
        nowInCart.verifyEstimatedPrice(subTotal);
    }

    @Test
    @Title("Add to Cart from PDP updates in header cart")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add to Cart")
    @Stories("Product Details")
    public void productDetailsPageAddToCartHeaderCart() {
        productDetails.navigate(PropertyLoader.getValue("pdp.regularProductUrl"));
        productDetails.clickOnIncrementButton(4);
        double subTotal = productDetails.getSubTotal();
        productDetails.clickOnAddToCartButton();
        holdExecution(750);
        HeaderAreaSteps header = new HeaderAreaSteps(productDetailsPage.headerArea);
        header.verifyNumberOfCartItems(5);
        header.verifyTotalOfCartItems(subTotal);
    }

    @After
    public void resetTest(){
        productDetails.resetCart(productDetailsPage.headerArea);
    }

}
