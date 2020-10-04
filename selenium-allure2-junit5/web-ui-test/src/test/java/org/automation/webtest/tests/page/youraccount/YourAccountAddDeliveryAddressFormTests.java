package org.automation.webtest.tests.page.youraccount;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.pages.YourAccountAddDeliveryAddress;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.pages.YourAccountAddDeliveryAddressSteps;
import org.junit.Before;
import org.junit.BeforeClass;
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
 * Date: 6/12/2019
 * Time: 2:23 PM
 */
public class YourAccountAddDeliveryAddressFormTests extends TestBase {

    private YourAccountAddDeliveryAddress yourAccountAddDeliveryAddressPage;
    private YourAccountAddDeliveryAddressSteps yourAccountAddDeliveryAddress;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("yourAccountAddDeliveryAddress.userWithAddress"));
    }

    @Before
    public void initTest() throws InterruptedException {
        yourAccountAddDeliveryAddressPage = new YourAccountAddDeliveryAddress(browser);
        yourAccountAddDeliveryAddress = new YourAccountAddDeliveryAddressSteps(yourAccountAddDeliveryAddressPage);
        yourAccountAddDeliveryAddress.navigateToYourAccountAddDeliveryAddressPage();
    }

    @Test
    @Title("Your Account delivery address page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void AddDeliveryAddressPage() {
        yourAccountAddDeliveryAddress.yourAccountAddDeliveryAddressPageTitle();
        yourAccountAddDeliveryAddress.yourAccountAddDeliveryAddressPageLoadedText();
    }

    @Test
    @Title("Address nick name field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void addressNickNameField() {
        yourAccountAddDeliveryAddress.verifyAddressNickNameField(PropertyLoader.getValue("global.residentialAddressNickName"));
    }

    @Test
    @Title("First name field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void firstNameField() {
        yourAccountAddDeliveryAddress.verifyFirstNameField(PropertyLoader.getValue("global.residentialAddressFirstName"));
    }

    @Test
    @Title("Last name field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void lastNameField() {
        yourAccountAddDeliveryAddress.verifyLastNameField(PropertyLoader.getValue("global.residentialAddressLastName"));
    }

    @Test
    @Title("Residential radio button validation")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void residentialRadioButton(){
        yourAccountAddDeliveryAddress.residentialRadioButtonIsDisplayed();
        yourAccountAddDeliveryAddress.residentialRadioButtonIsEnabled();
        yourAccountAddDeliveryAddress.residentialRadioButtonIsSelected();
    }

    @Test
    @Title("Business or School radio button validation")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void businessRadioButton(){
        try {
            yourAccountAddDeliveryAddress.businessRadioButtonIsDisplayed();
            yourAccountAddDeliveryAddress.businessRadioButtonIsEnabled();
            yourAccountAddDeliveryAddress.clickOnBusinessRadioButton();
            yourAccountAddDeliveryAddress.businessRadioButtonIsSelected();
        } finally {
            yourAccountAddDeliveryAddress.clickOnResidentialRadioButton();
        }
    }

    @Test
    @Title("Street Address field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void streetAddressField() {
        yourAccountAddDeliveryAddress.verifyStreetAddressField(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
    }

    @Test
    @Title("Apt field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void aptField() {
        yourAccountAddDeliveryAddress.verifyAptField(PropertyLoader.getValue("global.residentialAddressApartment"));
    }

    @Test
    @Title("Address Line Two field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void addressLineTwoField() {
        yourAccountAddDeliveryAddress.verifyAddressLineTwoField(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
    }

    @Test
    @Title("City field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void cityField() {
        yourAccountAddDeliveryAddress.verifyCityField(PropertyLoader.getValue("global.residentialAddressCity"));
    }

    @Test
    @Title("State field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void stateField() {
        yourAccountAddDeliveryAddress.verifyStateField(PropertyLoader.getValue("stateValue.newYork"));
    }

    @Test
    @Title("Zip Code field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void zipCodeField() {
        yourAccountAddDeliveryAddress.verifyZipCodeField(PropertyLoader.getValue("global.residentialAddressZIP"));
    }

    @Test
    @Title("Contact number field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void contactField() {
        yourAccountAddDeliveryAddress.verifyContactField(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
    }

    @Test
    @Title("Contact number ext field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void contactNoExtField() {
        yourAccountAddDeliveryAddress.verifyContactNoExtField(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
    }

    @Test
    @Title("Alt Contact number field")
    @Severity(SeverityLevel.NORMAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void altContactField() {
        yourAccountAddDeliveryAddress.verifyAltContactField(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
    }

    @Test
    @Title("Alt Contact number ext field")
    @Severity(SeverityLevel.NORMAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void altContactNoExtField() {
        yourAccountAddDeliveryAddress.verifyAltContactNoExtField(PropertyLoader.getValue("global.residentialAddressPhoneExt"));
    }

    @Test
    @Title("Delivery instructions field")
    @Severity(SeverityLevel.NORMAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void deliveryInstructionsField() {
        yourAccountAddDeliveryAddress.validateDeliveryInstructionsField("none");
    }

    @Test
    @Title("Delivery instructions field takes input")
    @Severity(SeverityLevel.NORMAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void deliveryInstructionsFieldInput() {
        yourAccountAddDeliveryAddress.typeDeliveryInstructions(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
        yourAccountAddDeliveryAddress.deliveryInstructionsFieldTakesInput(PropertyLoader.getValue("global.residentialAddressDeliveryInstruction"));
    }

    @Test
    @Title("Cancel Button")
    @Severity(SeverityLevel.NORMAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void cancelButton() {
        yourAccountAddDeliveryAddress.verifyCancelButton();
    }

    @Test
    @Title("Save Button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add Delivery Address")
    @Stories("Your Account")
    public void saveButton() {
        yourAccountAddDeliveryAddress.verifySaveButton();
    }
}
