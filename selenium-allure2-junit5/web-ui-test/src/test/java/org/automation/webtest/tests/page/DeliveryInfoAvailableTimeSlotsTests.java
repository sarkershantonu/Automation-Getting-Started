package org.automation.webtest.tests.page;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.DeliveryInfoAvailableTimeSlots;
import com.freshdirect.testing.pages.DeliveryInfoCheckAvailableTimeSlots;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.steps.pages.DeliveryInfoAvailableTimeSlotsSteps;
import com.freshdirect.testing.steps.pages.DeliveryInfoCheckAvailableTimeSlotsSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class DeliveryInfoAvailableTimeSlotsTests extends TestBase {
    DeliveryInfoCheckAvailableTimeSlots deliveryInfoCheckAvailableTimeSlotsPage;
    DeliveryInfoCheckAvailableTimeSlotsSteps deliveryInfoCheckAvailableTimeSlots;
    DeliveryInfoAvailableTimeSlots deliveryInfoAvailableTimeSlotsPage;
    DeliveryInfoAvailableTimeSlotsSteps deliveryInfoAvailableTimeSlots;
    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("availableTimeSlots.userWithoutAddress"));
    }

    @Before
    public void initTest(){
        deliveryInfoCheckAvailableTimeSlotsPage = new DeliveryInfoCheckAvailableTimeSlots(browser);
        deliveryInfoCheckAvailableTimeSlots = new DeliveryInfoCheckAvailableTimeSlotsSteps(deliveryInfoCheckAvailableTimeSlotsPage);
        deliveryInfoCheckAvailableTimeSlots.navigateToDeliveryInfoCheckAvailableTimeSlotsPage();
        deliveryInfoCheckAvailableTimeSlots.fillUpAddressFormAndClickOnCheckMyAddress();
        deliveryInfoAvailableTimeSlotsPage = new DeliveryInfoAvailableTimeSlots(browser);
        deliveryInfoAvailableTimeSlots = new DeliveryInfoAvailableTimeSlotsSteps(deliveryInfoAvailableTimeSlotsPage);
    }

    @Test
    @Title("Delivery info available time slots page")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void deliveryInfoAvailableTimeSlotsPage(){
        deliveryInfoAvailableTimeSlots.deliveryInfoAvailableTimeSlotsPageTitle();
        deliveryInfoAvailableTimeSlots.deliveryInfoAvailableTimeSlotsPageLoadedText();
    }

    @Test
    @Title("Change Address link takes back address form")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void changeAddressLinkTakesBackToForm(){
        deliveryInfoAvailableTimeSlots.clickOnChangeAddressLink();
        deliveryInfoCheckAvailableTimeSlotsPage.initElement();
        deliveryInfoCheckAvailableTimeSlots.deliveryInfoCheckAvailableTimeSlotsPageLoadedText();
    }

    @Test
    @Title("Delivery info available time slots has time slots")
    @Severity(SeverityLevel.NORMAL)
    @Features("Time slots")
    @Stories("Delivery Info")
    public void deliveryTimeSlotsAvailable(){
        deliveryInfoAvailableTimeSlots.verifyDeliveryTimeslotsIsAvailable();
    }
}
