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
 * Time: 3:32 PM
 */
public class AddOfficeAddressPopupFormErrorTests extends TestBase {

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
        checkout.holdExecution();
        DeliverToPopupSteps deliverToPopup  = new DeliverToPopupSteps(checkoutPage.deliverToPopup);
        deliverToPopup.clickOnAddAddressButton();
        addAddressPopup = new AddAddressPopupSteps(checkoutPage.deliverToPopup.addAddressPopup);
        addAddressPopup.clickOnOfficeAddressTab();
    }

    @Test
    @Title("Office address Company name field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressCompanyNameFieldError(){
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyCompanyNameRequiredErrorMessageForOfficeAddress();
    }

    @Test
    @Title("Office address First name field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressFirstNameField(){
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyFirstNameRequiredErrorMessageForOfficeAddress();
    }

    @Test
    @Title("Office address Last name field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressLastNameFieldError(){
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyLastNameRequiredErrorMessageForOfficeAddress();
    }

    @Test
    @Title("Office address Street address field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressStreetAddressFieldError(){
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyStreetAddressRequiredErrorMessageForOfficeAddress();
    }

    @Ignore("Not Implemented yet")
    @Test
    @Title("Office address Floor field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressFloorField(){
        //todo
        // implement for an address where apt number is required
    }



    @Test
    @Title("Office address City field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressCityFieldError(){
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyCityRequiredErrorMessageForOfficeAddress();
    }

    @Test
    @Title("Office address ZIP field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressZIPFieldError(){
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyZIPRequiredErrorMessageForOfficeAddress();
    }

    @Test
    @Title("Office address Phone Number field Blank Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressPhoneNumberField(){
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyPhoneNumberRequiredErrorMessageForOfficeAddress();
    }

    @Test
    @Title("Office address Invalid Phone Number field Error message")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressInvalidPhoneNumberField(){
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressInvalidPhoneNumber"));
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.clickOnOfficeAddressSaveButton();
        addAddressPopup.verifyInvalidPhoneNumberRequiredErrorMessageForOfficeAddress();
    }

    @AfterClass
    public static void resetTest(){
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }
}
