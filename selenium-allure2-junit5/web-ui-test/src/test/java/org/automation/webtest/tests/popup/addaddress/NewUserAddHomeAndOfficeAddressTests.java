package org.automation.webtest.tests.popup.addaddress;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.pages.singlepages.ProductDetail;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.pages.ProductDetailsPageSteps;
import com.freshdirect.testing.steps.popups.AddAddressPopupSteps;
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
 * User Name: amamaun@freshdirect.com
 * Email: arafatmamun@hotmail.com
 * Date: 4/11/2019
 * Time: 9:32 AM
 */
public class NewUserAddHomeAndOfficeAddressTests extends TestBase {

    private Checkout checkoutPage;
    private CheckoutSteps checkout;
    private AddAddressPopupSteps addAddressPopup;

    @Before
    public void initTest() throws InterruptedException {
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.createNewResidentialAccount(homePage.headerArea);
        ProductDetail productDetailsPage = new ProductDetail(browser);
        ProductDetailsPageSteps productDetails = new ProductDetailsPageSteps(productDetailsPage);
        productDetails.addRegularProductToCart(PropertyLoader.getValue("addAccountPopup.regularProduct"), 20);
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
        checkout.clickOnAddAnAddressButton();
        addAddressPopup = new AddAddressPopupSteps(checkoutPage.addAddressPopup);
    }


    @Test
    @Title("User can add a residential address")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressCanBeAdded(){
        addAddressPopup.fillUpResidentialAddressForm();
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.waitUntilAddHomeAddressPopupDisappear();
        checkoutPage.initElement();
        checkout.verifyDeliveryAddressEditButtonDisplayed();
    }

    @Test
    @Title("User can add a office address")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressCanBeAdded(){
        addAddressPopup.clickOnOfficeAddressTab();
        addAddressPopup.fillUpOfficeAddressForm();
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.waitUntilAddOfficeAddressPopupDisappear();
        checkoutPage.initElement();
        checkout.verifyDeliveryAddressEditButtonDisplayed();
    }

    @After
    public void resetTest(){
        checkout.logOutFromHomePage();
    }

}
