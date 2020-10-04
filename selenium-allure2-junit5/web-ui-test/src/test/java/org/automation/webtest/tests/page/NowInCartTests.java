package org.automation.webtest.tests.page;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.NowInCart;
import com.freshdirect.testing.pages.singlepages.ProductDetail;
import com.freshdirect.testing.steps.pages.NowInCartPageSteps;
import com.freshdirect.testing.steps.pages.ProductDetailsPageSteps;
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
 * Date: 3/7/2019
 * Time: 3:53 PM
 */

public class NowInCartTests extends TestBase {

    private NowInCart nowInCartPage;
    private NowInCartPageSteps nowInCart;

    @Test
    @Title("PDP Cart Confirmation page")
    @Severity(SeverityLevel.NORMAL)
    @Features("Cart confirmation")
    @Stories("Cart confirmation")
    public void cartConfirmationPage() {
        ProductDetail productDetailsPage =  new ProductDetail(browser);
        ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
        productDetails.navigate(PropertyLoader.getValue("pdpCartConfirm.regularProductUrl"));
        productDetails.clickOnAddToCartButton();
        nowInCartPage = new NowInCart(browser);
        nowInCart = new NowInCartPageSteps(nowInCartPage);
        nowInCart.productDetailsCartConfirmPageTitle();
        nowInCart.productDetailsCartConfirmPageLoadedText();
    }
}
