package org.automation.webtest.tests.popup.addaddress;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.popups.AddAddressPopupSteps;
import com.freshdirect.testing.steps.popups.checkout.DeliverToPopupSteps;
import org.junit.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created By: Tanvir Ahmed
 * Date: 4/4/2019
 * Time: 3:31 PM
 */
public class AddResidentialAddressPopupFormErrorTests extends TestBase {
    private Checkout checkoutPage;
    private CheckoutSteps checkout;
    private AddAddressPopupSteps addAddressPopup;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("addAddressPopup.formFieldErrorTestUser"));
    }

    @Before
    public void initTest(){
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
        //checkout.clickOnAddAnAddressButton(); // once 1 address is added it changes the full flow
        checkout.clickOnDeliveryAddressEditButton();
        DeliverToPopupSteps deliverToPopup  = new DeliverToPopupSteps(checkoutPage.deliverToPopup);
        deliverToPopup.clickOnAddAddressButton();
        addAddressPopup = new AddAddressPopupSteps(checkoutPage.deliverToPopup.addAddressPopup);
    }

    @Test
    @Title("Residential address Nick name field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressNickNameFieldError(){
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyAddressNickNameRequiredErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address First name field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressFirstNameFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyFirstNameRequiredErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address Last name field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressLastNameFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyLastNameRequiredErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address Street address field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressLStreetAddressAddressFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyStreetAddressRequiredErrorMessageForResidentialAddress();
    }

    @Ignore("Not Implemented yet")
    @Test
    @Title("Residential address Apartment field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressApartmentFieldError(){
        //todo
        // implement for an address where apt number is required
    }


    @Test
    @Title("Residential address City field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressCityFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyCityRequiredErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address ZIP field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressZIPFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyZIPRequiredErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address Phone Number field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneNumberFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyPhoneNumberRequiredErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address Invalid Phone Number Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressInvalidPhoneNumberFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressInvalidPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyValidPhoneNumberRequiredErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address Phone Ext field Invalid Format error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneExtFieldError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressInvalidPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyPhoneExtFormatErrorMessageForResidentialAddress();
    }

    @Test
    @Title("Residential address Phone Ext field max length error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneExtFieldMaxLengthError(){
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressInvalidMaxPhoneExt"));
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.clickOnResidentialAddressSaveButton();
        addAddressPopup.verifyPhoneExtMaxLengthErrorMessageForResidentialAddress();
    }

    @AfterClass
    public static void resetTest(){
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }

}
