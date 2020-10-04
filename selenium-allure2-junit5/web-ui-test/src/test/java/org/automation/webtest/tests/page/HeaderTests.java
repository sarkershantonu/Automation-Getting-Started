package org.automation.webtest.tests.page;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Help;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.pages.popups.ContactUsPopup;
import com.freshdirect.testing.pages.popups.CreateAccountPopup;
import com.freshdirect.testing.pages.popups.SignInPopup;
import com.freshdirect.testing.pages.popups.YourAccountPopup;
import com.freshdirect.testing.steps.HeaderAreaSteps;
import com.freshdirect.testing.steps.pages.HelpPageSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.popups.ContactUsPopupSteps;
import com.freshdirect.testing.steps.popups.CreateAccountPopupSteps;
import com.freshdirect.testing.steps.popups.SignInPopupSteps;
import com.freshdirect.testing.steps.popups.YourAccountPopupSteps;
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
 * User Name: amamun
 * Email: arafatmamun@hotmail.com
 * Date: 2/11/2019
 * Time: 1:05 PM
 */
public class HeaderTests extends TestBase {
    private Home homePage;
    private HomePageSteps home;
    private HeaderAreaSteps headerArea;

    @Before
    public void initTest() throws InterruptedException {
        homePage = new Home(browser);
        home = new HomePageSteps(homePage);
        headerArea = new HeaderAreaSteps(homePage.headerArea);
    }

    @Test
    @Title("Sign In link opens Sign In overlay")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void signInLinkOpensSignInOverlay(){
        home.navigateToHomePage();
        headerArea.clickOnSignInFromHeader();
        SignInPopup popup = new SignInPopup(browser);
        SignInPopupSteps signInPopup = new SignInPopupSteps(popup);
        signInPopup.signInPopupDisplayed();
        signInPopup.signInOverlayHasExpectedText();
    }

    @Test
    @Title("Create Account button opens Sign In overlay")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void createAccountButtonOpensOverlay(){
        home.navigateToHomePage();
        headerArea.clickCreateAccountButton();
        CreateAccountPopup popup = new CreateAccountPopup(browser);
        CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(popup);
        createAccountPopup.createAccountPopupHasExpectedText();
    }

    @Test
    @Title("Contact Us links opens overlay")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void contactUsLinkOpensOverlay(){
        home.navigateToHomePage();
        headerArea.clickOnContactUsLinkFromHeader();
        ContactUsPopup popup = new ContactUsPopup(browser);
        ContactUsPopupSteps contactUsPopup = new ContactUsPopupSteps(popup);
        contactUsPopup.contactUsOverlayText();
    }

    @Test
    @Title("Help link open help page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void helpLinkOpensHelpPage(){
        home.navigateToHomePage();
        headerArea.clickOnHelpLinkFromHeader();
        Help helpPage = new Help(browser);
        HelpPageSteps help = new HelpPageSteps(helpPage);
        help.helpPageTitle();
        help.helpPageLoadedText();
    }

    @Test
    @Title("Hover on delivery times open About Delivery overlay")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void hoverOnDeliveryTimesOpensOverlay(){
        home.navigateToHomePage();
        headerArea.hoverOnDeliveryTimesFromHeader();
        holdExecution();
        headerArea.deliveryAddressOverlayIsDisplayed();
    }

    @Test
    @Title("Hover on Cart opens cart overlay")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void hoverOnCartOpensOverlay(){
        home.navigateToHomePage();
        headerArea.hoverOnCart();
        holdExecution(750);
        headerArea.cartPopupIsDisplayed();
    }

    @Test
    @Title("Header has search field")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void headerHasSearchField() {
        home.navigateToHomePage();
        headerArea.searchFieldIsDisplayed();
        headerArea.searchFieldIsFieldEnabled();
        headerArea.typeProductNameInSearchField("avocado");
        headerArea.searchFieldTakesInput("avocado");
    }

    @Test
    @Title("Header has search button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void headerHasSearchButton() {
        home.navigateToHomePage();
        headerArea.searchButtonIsDisplayed();
        headerArea.searchButtonIsFieldEnabled();
    }

    @Test
    @Title("Reorder opens create account popup when user is not logged in")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void reorderOpensCreateAccountPopupWhenUserNotLoggedIn(){
        home.navigateToHomePage();
        headerArea.clickOnReOrderButton();
        CreateAccountPopup popup = new CreateAccountPopup(browser);
        CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(popup);
        createAccountPopup.createAccountPopupHasExpectedText();
    }

    @Test
    @Title("Hover on header your account as Signed In User opens your account popup")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void hoverOnYourAccountAsSignedInUserOpensYourFreshDirectPopup(){
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("signIn.validUserName"));
        headerArea.hoverOnYourAccountFromHeader();
        holdExecution();
        headerArea.hoverOnYourAccountFromHeader();
        YourAccountPopup popup = new YourAccountPopup(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(popup);
        yourAccountPopup.yourFreshDirectPopupIsDisplayed();
    }

    @Test
    @Title("Initial cart items count")
    @Severity(SeverityLevel.NORMAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void initialCartItemsCount(){
        home.navigateToHomePage();
        headerArea.verifyNumberOfCartItems(0);
    }

    @Test
    @Title("Initial cart items total")
    @Severity(SeverityLevel.NORMAL)
    @Features("Header Tests")
    @Stories("Header Navigation")
    public void initialCartItemsTotal(){
        home.navigateToHomePage();
        headerArea.verifyInitialTotalOfCartItemsString();
    }

    @After
    public void resetTest(){
        home.logOutIfLoggedIn(homePage.headerArea);
    }
}
