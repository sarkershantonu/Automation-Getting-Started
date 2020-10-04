package org.automation.webtest.tests.popup.addaddress;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.popups.AddAddressPopupSteps;
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
 * Created By: Tanvir Ahmed
 * Date: 4/4/2019
 * Time: 3:32 PM
 */
public class AddOfficeAddressPopupFormTests extends TestBase {

    private Checkout checkoutPage;
    private CheckoutSteps checkout;
    private AddAddressPopupSteps addAddressPopup;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("addAddressPopup.formFieldTestUser"));
    }

    @Before
    public void initTest(){
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
        checkout.clickOnAddAnAddressButton();
        addAddressPopup = new AddAddressPopupSteps(checkoutPage.addAddressPopup);
        addAddressPopup.clickOnOfficeAddressTab();
    }

    @Test
    @Title("Office address Company name field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressCompanyNameField(){
        addAddressPopup.officeAddressCompanyNameFieldIsDisplayed();
        addAddressPopup.officeAddressCompanyNameFieldIsEnabled();
        addAddressPopup.typeOfficeAddressCompanyName(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
        addAddressPopup.officeAddressCompanyNameFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressCompanyName"));
    }

    @Test
    @Title("Office address First name field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressFirstNameField(){
        addAddressPopup.officeAddressFirstNameFieldIsDisplayed();
        addAddressPopup.officeAddressFirstNameFieldIsEnabled();
        addAddressPopup.typeOfficeAddressFirstName(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
        addAddressPopup.officeAddressFirstNameFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressFirstName"));
    }

    @Test
    @Title("Office address Last name field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressLastNameField(){
        addAddressPopup.officeAddressLastNameFieldIsDisplayed();
        addAddressPopup.officeAddressLastNameFieldIsEnabled();
        addAddressPopup.typeOfficeAddressLastName(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
        addAddressPopup.officeAddressLastNameFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressLastName"));
    }

    @Test
    @Title("Office address Street address field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressLStreetAddressAddressField(){
        addAddressPopup.officeAddressStreetAddressFieldIsDisplayed();
        addAddressPopup.officeAddressStreetAddressFieldIsEnabled();
        addAddressPopup.typeOfficeAddressStreetAddress(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
        addAddressPopup.officeAddressStreetAddressFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddress"));
    }

    @Test
    @Title("Office address Floor field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressFloorField(){
        addAddressPopup.officeAddressFloorFieldIsDisplayed();
        addAddressPopup.officeAddressFloorFieldIsEnabled();
        addAddressPopup.typeOfficeAddressFloor(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
        addAddressPopup.officeAddressFloorFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressFloor"));
    }

    @Test
    @Title("Office address Street address line two field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressStreetAddressLineTwoField(){
        addAddressPopup.officeAddressStreetAddressLineTwoFieldIsDisplayed();
        addAddressPopup.officeAddressStreetAddressLineTwoFieldIsEnabled();
        addAddressPopup.typeOfficeAddressStreetAddressLineTwo(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
        addAddressPopup.officeAddressStreetAddressLineTwoFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressStreetAddressLineTwo"));
    }

    @Test
    @Title("Office address City field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressCityField(){
        addAddressPopup.officeAddressCityFieldIsDisplayed();
        addAddressPopup.officeAddressCityFieldIsEnabled();
        addAddressPopup.typeOfficeAddressCity(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
        addAddressPopup.officeAddressCityFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressCity"));
    }

    @Test
    @Title("Office address State dropdown is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressStateDropdown(){
        addAddressPopup.officeAddressStateDropdownIsDisplayed();
        addAddressPopup.officeAddressStateDropdownIsEnabled();
        addAddressPopup.officeAddressStateDropdownDefaultValue(PropertyLoader.getValue("stateValue.newYork"));
    }

    @Test
    @Title("Office address State dropdown value is changeable")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressStateDropdownValueCanBeChanged(){
        addAddressPopup.selectOfficeAddressState(PropertyLoader.getValue("stateName.virginia"));
        addAddressPopup.officeAddressStateDropdownChanges(PropertyLoader.getValue("stateValue.virginia"));
    }

    @Test
    @Title("Office address ZIP field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressZIPField(){
        addAddressPopup.officeAddressZIPFieldIsDisplayed();
        addAddressPopup.officeAddressZIPFieldIsEnabled();
        addAddressPopup.typeOfficeAddressZIP(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
        addAddressPopup.officeAddressZIPFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressZIP"));
    }

    @Test
    @Title("Office address Phone Number field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressPhoneNumberField(){
        addAddressPopup.officeAddressPhoneNumberFieldIsDisplayed();
        addAddressPopup.officeAddressPhoneNumberFieldIsEnabled();
        addAddressPopup.typeOfficeAddressPhoneNumber(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
        addAddressPopup.officeAddressPhoneNumberFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneNumber"));
    }

    @Test
    @Title("Office address Phone Ext field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressPhoneExtField(){
        addAddressPopup.officeAddressPhoneExtFieldIsDisplayed();
        addAddressPopup.officeAddressPhoneExtFieldIsEnabled();
        addAddressPopup.typeOfficeAddressPhoneExt(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
        addAddressPopup.officeAddressPhoneExtFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressPhoneExt"));
    }

    @Test
    @Title("Office address Delivery Instructions field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressDeliveryInstructionField(){
        addAddressPopup.officeAddressLocationDetailsFieldIsDisplayed();
        addAddressPopup.officeAddressLocationDetailsFieldIsEnabled();
        addAddressPopup.typeOfficeAddressLocationDetails(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
        addAddressPopup.officeAddressLocationDetailsFieldTakesInput(PropertyLoader.getValue("addAddressPopup.officeAddressLocationDetails"));
    }

    @Test
    @Title("Office address Cancel Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressCancelButton() {
        addAddressPopup.officeAddressCancelButtonIsDisplayed();
        addAddressPopup.officeAddressCancelButtonIsEnabled();
    }

    @Test
    @Title("Office address Cancel Button closes popup")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressCancelButtonClosesPopup() {
        addAddressPopup.clickOnOfficeAddressCancelButton();
        addAddressPopup.isAddAddressPopupNotDisplayed();
    }

    @Test
    @Title("Office address save Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add office address")
    public void officeAddressSaveButton() {
        addAddressPopup.officeAddressSaveButtonIsDisplayed();
        addAddressPopup.officeAddressSaveButtonIsEnabled();
    }

    @AfterClass
    public static void resetTest(){
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }
}
