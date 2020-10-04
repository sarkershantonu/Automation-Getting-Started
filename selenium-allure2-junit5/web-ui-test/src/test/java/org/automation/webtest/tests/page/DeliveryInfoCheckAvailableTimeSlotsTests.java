package org.automation.webtest.tests.page;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.*;
import com.freshdirect.testing.steps.pages.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class DeliveryInfoCheckAvailableTimeSlotsTests extends TestBase {

    DeliveryInfoCheckAvailableTimeSlots deliveryInfoCheckAvailableTimeSlotsPage;
    DeliveryInfoCheckAvailableTimeSlotsSteps deliveryInfoCheckAvailableTimeSlots;
    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("checkAvailableTimeSlots.userWithoutAddress"));
    }

    @Before
    public void initTest(){
        deliveryInfoCheckAvailableTimeSlotsPage = new DeliveryInfoCheckAvailableTimeSlots(browser);
        deliveryInfoCheckAvailableTimeSlots = new DeliveryInfoCheckAvailableTimeSlotsSteps(deliveryInfoCheckAvailableTimeSlotsPage);
        deliveryInfoCheckAvailableTimeSlots.navigateToDeliveryInfoCheckAvailableTimeSlotsPage();
    }

    @Test
    @Title("Delivery info check available time slots")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void deliveryInfoCheckAvailableTimeSlotsPage(){
        deliveryInfoCheckAvailableTimeSlots.deliveryInfoCheckAvailableTimeSlotsPageTitle();
        deliveryInfoCheckAvailableTimeSlots.deliveryInfoCheckAvailableTimeSlotsPageLoadedText();
    }

    @Test
    @Title("Residential radio button validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void residentialRadioButton(){
        deliveryInfoCheckAvailableTimeSlots.residentialRadioButtonIsDisplayed();
        deliveryInfoCheckAvailableTimeSlots.residentialRadioButtonIsEnabled();
        deliveryInfoCheckAvailableTimeSlots.residentialRadioButtonIsSelected();
    }

    @Test
    @Title("Business or School radio button validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void businessRadioButton(){
        try {
            deliveryInfoCheckAvailableTimeSlots.businessRadioButtonIsDisplayed();
            deliveryInfoCheckAvailableTimeSlots.businessRadioButtonIsEnabled();
            deliveryInfoCheckAvailableTimeSlots.clickOnBusinessRadioButton();
            deliveryInfoCheckAvailableTimeSlots.businessRadioButtonIsSelected();
        } finally {
            deliveryInfoCheckAvailableTimeSlots.clickOnResidentialRadioButton();
        }
    }

    @Test
    @Title("Street address field validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void streetAddressFieldValidation(){
        deliveryInfoCheckAvailableTimeSlots.validateStreetAddressField(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
    }

    @Test
    @Title("Apt field validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void aptFieldValidation(){
        deliveryInfoCheckAvailableTimeSlots.validateAptField(PropertyLoader.getValue("global.residentialAddressApartment"));
    }

    @Test
    @Title("City field validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void cityFieldValidation(){
        deliveryInfoCheckAvailableTimeSlots.validateCityField("Scotch Plains");
    }

    @Test
    @Title("City field takes input")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void cityFieldTakesInput(){
        deliveryInfoCheckAvailableTimeSlots.typeCity(PropertyLoader.getValue("global.residentialAddressCity"));
        deliveryInfoCheckAvailableTimeSlots.cityFieldTakesInput(PropertyLoader.getValue("global.residentialAddressCity"));
    }

    @Test
    @Title("State field validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void stateFieldValidation(){
        deliveryInfoCheckAvailableTimeSlots.validateStateField("NJ");
    }

    @Test
    @Title("State field takes input")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void stateFieldTakesInput(){
        deliveryInfoCheckAvailableTimeSlots.typeState(PropertyLoader.getValue("stateValue.newYork"));
        deliveryInfoCheckAvailableTimeSlots.stateFieldTakesInput(PropertyLoader.getValue("stateValue.newYork"));
    }

    @Test
    @Title("Zip code field validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void zipCodeFieldValidation(){
        deliveryInfoCheckAvailableTimeSlots.validateZipCodeField("07076");
    }

    @Test
    @Title("Zip code field takes input")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void zipCodeFieldTakesInput(){
        deliveryInfoCheckAvailableTimeSlots.typeZipCode(PropertyLoader.getValue("global.residentialAddressZIP"));
        deliveryInfoCheckAvailableTimeSlots.zipCodeFieldTakesInput(PropertyLoader.getValue("global.residentialAddressZIP"));
    }

    @Test
    @Title("Check my address button validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void checkMyAddressButtonValidation(){
        deliveryInfoCheckAvailableTimeSlots.verifyCheckMyAddressButton();
    }

    @Test
    @Title("Street address required error message")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void streetAddressRequiredMessage(){
        deliveryInfoCheckAvailableTimeSlots.clickOnResidentialRadioButton();
        deliveryInfoCheckAvailableTimeSlots.typeApt(PropertyLoader.getValue("global.residentialAddressApartment"));
        deliveryInfoCheckAvailableTimeSlots.typeCity(PropertyLoader.getValue("global.residentialAddressCity"));
        deliveryInfoCheckAvailableTimeSlots.typeState(PropertyLoader.getValue("stateValue.newYork"));
        deliveryInfoCheckAvailableTimeSlots.typeZipCode(PropertyLoader.getValue("global.residentialAddressZIP"));
        deliveryInfoCheckAvailableTimeSlots.clickOnCheckMyAddressButton();
        deliveryInfoCheckAvailableTimeSlots.verifyStreetAddressRequiredErrorMessage();
    }

    //@Test
    @Title("City required error message")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void cityRequiredMessage(){
        deliveryInfoCheckAvailableTimeSlots.clickOnResidentialRadioButton();
        deliveryInfoCheckAvailableTimeSlots.typeStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        deliveryInfoCheckAvailableTimeSlots.typeApt(PropertyLoader.getValue("global.residentialAddressApartment"));
        deliveryInfoCheckAvailableTimeSlots.clearCityField();
        deliveryInfoCheckAvailableTimeSlots.typeState(PropertyLoader.getValue("stateValue.newYork"));
        deliveryInfoCheckAvailableTimeSlots.typeZipCode(PropertyLoader.getValue("global.residentialAddressZIP"));
        deliveryInfoCheckAvailableTimeSlots.clickOnCheckMyAddressButton();
        deliveryInfoCheckAvailableTimeSlots.verifyCityRequiredErrorMessage();
    }

    //@Test
    @Title("State required error message")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void stateRequiredMessage(){
        deliveryInfoCheckAvailableTimeSlots.clickOnResidentialRadioButton();
        deliveryInfoCheckAvailableTimeSlots.typeStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        deliveryInfoCheckAvailableTimeSlots.typeApt(PropertyLoader.getValue("global.residentialAddressApartment"));
        deliveryInfoCheckAvailableTimeSlots.typeCity(PropertyLoader.getValue("global.residentialAddressCity"));
        deliveryInfoCheckAvailableTimeSlots.clearStateField();
        deliveryInfoCheckAvailableTimeSlots.clearZipCodeField();
        deliveryInfoCheckAvailableTimeSlots.typeZipCode(PropertyLoader.getValue("global.residentialAddressZIP"));
        deliveryInfoCheckAvailableTimeSlots.clickOnCheckMyAddressButton();
        deliveryInfoCheckAvailableTimeSlots.verifyStateRequiredErrorMessage();
    }

    @Test
    @Title("Zip code required error message")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void zipCodeRequiredMessage(){
        deliveryInfoCheckAvailableTimeSlots.clickOnResidentialRadioButton();
        deliveryInfoCheckAvailableTimeSlots.typeStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        deliveryInfoCheckAvailableTimeSlots.typeApt(PropertyLoader.getValue("global.residentialAddressApartment"));
        deliveryInfoCheckAvailableTimeSlots.typeCity(PropertyLoader.getValue("global.residentialAddressCity"));
        deliveryInfoCheckAvailableTimeSlots.typeState(PropertyLoader.getValue("stateValue.newYork"));
        deliveryInfoCheckAvailableTimeSlots.clearZipCodeField();
        deliveryInfoCheckAvailableTimeSlots.clickOnCheckMyAddressButton();
        deliveryInfoCheckAvailableTimeSlots.verifyZipCodeRequiredErrorMessage();
    }

    @Test
    @Title("Check delivery address takes to available time slots")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void checkDeliveryAddressTakesToAvailableTimeSlots(){
        deliveryInfoCheckAvailableTimeSlots.fillUpAddressFormAndClickOnCheckMyAddress();
        DeliveryInfoAvailableTimeSlots deliveryInfoAvailableTimeSlotsPage =  new DeliveryInfoAvailableTimeSlots(browser);
        DeliveryInfoAvailableTimeSlotsSteps deliveryInfoAvailableTimeSlots = new DeliveryInfoAvailableTimeSlotsSteps(deliveryInfoAvailableTimeSlotsPage);
        deliveryInfoAvailableTimeSlots.deliveryInfoAvailableTimeSlotsPageLoadedText();
    }
}
