package org.automation.webtest.tests.page.youraccount;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.pages.YourAccountAddDeliveryAddress;
import com.freshdirect.testing.pages.YourAccountDeliveryAddress;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.pages.YourAccountAddDeliveryAddressSteps;
import com.freshdirect.testing.steps.pages.YourAccountDeliveryAddressSteps;
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
public class YourAccountDeliveryAddressTests extends TestBase {

    private YourAccountDeliveryAddress yourAccountDeliveryAddressPage;
    private YourAccountDeliveryAddressSteps yourAccountDeliveryAddress;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("yourAccountDeliveryAddress.userWithAddress"));
    }

    @Before
    public void initTest() throws InterruptedException {
        yourAccountDeliveryAddressPage = new YourAccountDeliveryAddress(browser);
        yourAccountDeliveryAddress = new YourAccountDeliveryAddressSteps(yourAccountDeliveryAddressPage);
        yourAccountDeliveryAddress.navigateToYourAccountDeliveryAddressPage();
    }

    @Test
    @Title("Your Account delivery address page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Delivery Address")
    @Stories("Your Account")
    public void deliveryAddressPage() {
        yourAccountDeliveryAddress.yourAccountDeliveryAddressPageTitle();
        yourAccountDeliveryAddress.yourAccountDeliveryAddressPageLoadedText();
    }

    @Test
    @Title("Verify add new address button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Delivery Address")
    @Stories("Your Account")
    public void addNewAddressButton() {
        yourAccountDeliveryAddress.verifyAddNewAddressButton();
    }

    @Test
    @Title("Clicking on add new address button takes to add delivery address")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Delivery Address")
    @Stories("Your Account")
    public void clickingAddNewAddressButtonTakesToAddDeliveryAddress() {
        yourAccountDeliveryAddress.clickOnAddNewAddressButton();
        YourAccountAddDeliveryAddress yourAccountAddDeliveryAddressPage = new YourAccountAddDeliveryAddress(browser);
        YourAccountAddDeliveryAddressSteps yourAccountAddDeliveryAddress = new YourAccountAddDeliveryAddressSteps(yourAccountAddDeliveryAddressPage);
        yourAccountAddDeliveryAddress.yourAccountAddDeliveryAddressPageLoadedText();

    }
}
