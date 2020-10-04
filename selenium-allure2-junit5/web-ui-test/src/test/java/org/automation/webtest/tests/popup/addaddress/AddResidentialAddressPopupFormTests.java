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
 * Time: 3:31 PM
 */
public class AddResidentialAddressPopupFormTests extends TestBase {
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
    }

    @Test
    @Title("Residential address Nick name field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressNickNameField(){
        addAddressPopup.residentialAddressNickNameFieldIsDisplayed();
        addAddressPopup.residentialAddressNickNameFieldIsEnabled();
        addAddressPopup.typeResidentialAddressNickName(PropertyLoader.getValue("global.residentialAddressNickName"));
        addAddressPopup.residentialAddressNickNameFieldTakesInput(PropertyLoader.getValue("global.residentialAddressNickName"));
    }

    @Test
    @Title("Residential address First name field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressFirstNameField(){
        addAddressPopup.residentialAddressFirstNameFieldIsDisplayed();
        addAddressPopup.residentialAddressFirstNameFieldIsEnabled();
        addAddressPopup.typeResidentialAddressFirstName(PropertyLoader.getValue("global.residentialAddressFirstName"));
        addAddressPopup.residentialAddressFirstNameFieldTakesInput(PropertyLoader.getValue("global.residentialAddressFirstName"));
    }

    @Test
    @Title("Residential address Last name field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressLastNameField(){
        addAddressPopup.residentialAddressLastNameFieldIsDisplayed();
        addAddressPopup.residentialAddressLastNameFieldIsEnabled();
        addAddressPopup.typeResidentialAddressLastName(PropertyLoader.getValue("global.residentialAddressLastName"));
        addAddressPopup.residentialAddressLastNameFieldTakesInput(PropertyLoader.getValue("global.residentialAddressLastName"));
    }

    @Test
    @Title("Residential address Street address field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressLStreetAddressAddressField(){
        addAddressPopup.residentialAddressStreetAddressFieldIsDisplayed();
        addAddressPopup.residentialAddressStreetAddressFieldIsEnabled();
        addAddressPopup.typeResidentialAddressStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addAddressPopup.residentialAddressStreetAddressFieldTakesInput(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
    }

    @Test
    @Title("Residential address Apartment field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressApartmentField(){
        addAddressPopup.residentialAddressApartmentFieldIsDisplayed();
        addAddressPopup.residentialAddressApartmentFieldIsEnabled();
        addAddressPopup.typeResidentialAddressApartment(PropertyLoader.getValue("global.residentialAddressApartment"));
        addAddressPopup.residentialAddressApartmentFieldTakesInput(PropertyLoader.getValue("global.residentialAddressApartment"));
    }

    @Test
    @Title("Residential address Street address line two field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressStreetAddressLineTwoField(){
        addAddressPopup.residentialAddressStreetAddressLineTwoFieldIsDisplayed();
        addAddressPopup.residentialAddressStreetAddressLineTwoFieldIsEnabled();
        addAddressPopup.typeResidentialAddressStreetAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addAddressPopup.residentialAddressStreetAddressLineTwoFieldTakesInput(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
    }

    @Test
    @Title("Residential address City field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressCityField(){
        addAddressPopup.residentialAddressCityFieldIsDisplayed();
        addAddressPopup.residentialAddressCityFieldIsEnabled();
        addAddressPopup.typeResidentialAddressCity(PropertyLoader.getValue("global.residentialAddressCity"));
        addAddressPopup.residentialAddressCityFieldTakesInput(PropertyLoader.getValue("global.residentialAddressCity"));
    }

    @Test
    @Title("Residential address State dropdown is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressStateDropdown(){
        addAddressPopup.residentialAddressStateDropdownIsDisplayed();
        addAddressPopup.residentialAddressStateDropdownIsEnabled();
        addAddressPopup.residentialAddressStateDropdownDefaultValue(PropertyLoader.getValue("stateValue.newYork"));
    }

    @Test
    @Title("Residential address State dropdown value is changeable")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressStateDropdownValueCanBeChanged(){
        addAddressPopup.selectResidentialAddressState(PropertyLoader.getValue("stateName.virginia"));
        addAddressPopup.residentialAddressStateDropdownChanges(PropertyLoader.getValue("stateValue.virginia"));
    }

    @Test
    @Title("Residential address ZIP field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressZIPField(){
        addAddressPopup.residentialAddressZIPFieldIsDisplayed();
        addAddressPopup.residentialAddressZIPFieldIsEnabled();
        addAddressPopup.typeResidentialAddressZIP(PropertyLoader.getValue("global.residentialAddressZIP"));
        addAddressPopup.residentialAddressZIPFieldTakesInput(PropertyLoader.getValue("global.residentialAddressZIP"));
    }

    @Test
    @Title("Residential address Phone Number field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneNumberField(){
        addAddressPopup.residentialAddressPhoneNumberFieldIsDisplayed();
        addAddressPopup.residentialAddressPhoneNumberFieldIsEnabled();
        addAddressPopup.typeResidentialAddressPhoneNumber(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addAddressPopup.residentialAddressPhoneNumberFieldTakesInput(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
    }

    @Test
    @Title("Residential address Phone Ext field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneExtField(){
        addAddressPopup.residentialAddressPhoneExtFieldIsDisplayed();
        addAddressPopup.residentialAddressPhoneExtFieldIsEnabled();
        addAddressPopup.typeResidentialAddressPhoneExt(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
        addAddressPopup.residentialAddressPhoneExtFieldTakesInput(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
    }

    @Test
    @Title("Residential address Mobile Radio Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneMobileRadioButton() {
        addAddressPopup.residentialAddressPhoneMobileRadioButtonIsDisplayed();
        addAddressPopup.residentialAddressPhoneMobileRadioButtonIsEnabled();
        addAddressPopup.residentialAddressPhoneMobileRadioButtonIsNotSelected();
        addAddressPopup.clickOnResidentialAddressPhoneMobileRadioButton();
        addAddressPopup.residentialAddressPhoneMobileRadioButtonIsSelected();
    }

    @Test
    @Title("Residential address Home Radio Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneHomeRadioButton() {
        addAddressPopup.residentialAddressPhoneHomeRadioButtonIsDisplayed();
        addAddressPopup.residentialAddressPhoneHomeRadioButtonIsEnabled();
        addAddressPopup.residentialAddressPhoneHomeRadioButtonIsNotSelected();
        addAddressPopup.clickOnResidentialAddressPhoneHomeRadioButton();
        addAddressPopup.residentialAddressPhoneHomeRadioButtonIsSelected();
    }

    @Test
    @Title("Residential address Work Radio Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressPhoneWorkRadioButton() {
        addAddressPopup.residentialAddressPhoneWorkRadioButtonIsDisplayed();
        addAddressPopup.residentialAddressPhoneWorkRadioButtonIsEnabled();
        addAddressPopup.residentialAddressPhoneWorkRadioButtonIsNotSelected();
        addAddressPopup.clickOnResidentialAddressPhoneWorkRadioButton();
        addAddressPopup.residentialAddressPhoneWorkRadioButtonIsSelected();
    }

    @Test
    @Title("Residential address Delivery Instructions field is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressDeliveryInstructionField(){
        addAddressPopup.residentialAddressDeliveryInstructionFieldIsDisplayed();
        addAddressPopup.residentialAddressDeliveryInstructionFieldIsEnabled();
        addAddressPopup.typeResidentialAddressDeliveryInstruction(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        addAddressPopup.residentialAddressDeliveryInstructionFieldTakesInput(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
    }

    @Test
    @Title("Residential address leave with doorman Radio Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressDoormanRadioButton() {
        addAddressPopup.residentialAddressDoormanRadioButtonIsDisplayed();
        addAddressPopup.residentialAddressDoormanRadioButtonIsEnabled();
        addAddressPopup.residentialAddressDoormanRadioButtonIsNotSelected();
        addAddressPopup.clickOnResidentialAddressDoormanRadioButton();
        addAddressPopup.residentialAddressDoormanRadioButtonIsSelected();
    }

    @Test
    @Title("Residential address leave with doorman Radio Button instruction")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressDoormanRadioButtonInstruction() {
        addAddressPopup.clickOnResidentialAddressDoormanRadioButton();
        addAddressPopup.residentialAddressDoormanRadioButtonInstruction();
    }

    @Test
    @Title("Residential address leave with neighbour Radio Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressNeighbourRadioButton() {
        addAddressPopup.residentialAddressNeighbourRadioButtonIsDisplayed();
        addAddressPopup.residentialAddressNeighbourRadioButtonIsEnabled();
        addAddressPopup.residentialAddressNeighbourRadioButtonIsNotSelected();
        addAddressPopup.clickOnResidentialAddressNeighbourRadioButton();
        addAddressPopup.residentialAddressNeighbourRadioButtonIsSelected();
    }

    @Test
    @Title("Residential address Cancel Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressCancleButton() {
        addAddressPopup.residentialAddressCancelButtonIsDisplayed();
        addAddressPopup.residentialAddressCancelButtonIsEnabled();
    }

    @Test
    @Title("Residential address Cancel Button closes popup")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressCancelButtonClosesPopup() {
        addAddressPopup.clickOnResidentialAddressCancelButton();
        addAddressPopup.isAddAddressPopupNotDisplayed();
    }

    @Test
    @Title("Residential address save Button is available")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Checkout")
    @Stories("Add residential address")
    public void residentialAddressSaveButton() {
        addAddressPopup.residentialAddressSaveButtonIsDisplayed();
        addAddressPopup.residentialAddressSaveButtonIsEnabled();
    }

    @AfterClass
    public static void resetTest(){
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }

}
