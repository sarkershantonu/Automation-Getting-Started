package org.automation.webtest.tests.features;


import org.automation.webtest.config.AppConstants;
import org.automation.webtest.config.PropertyLoader;
import org.automation.webtest.core.TestBase;
import org.automation.webtest.pages.Home;
import org.automation.webtest.pages.popups.SignInPopup;
import org.automation.webtest.steps.HeaderAreaSteps;
import org.automation.webtest.steps.pages.HomePageSteps;
import org.automation.webtest.steps.popups.SignInPopupSteps;
import org.automation.webtest.suits.SignInFeatureTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;



public class SignInTests extends TestBase {
    private Home homePage;
    private HomePageSteps home;
    private HeaderAreaSteps headerArea;

    @Before
    public void initTest() throws InterruptedException {
        homePage = new Home(browser);
        home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        headerArea = new HeaderAreaSteps(homePage.headerArea);
        headerArea.clickOnSignInFromHeader();
    }

    @Test
    @Category(SignInFeatureTest.class)
    @Title("Sign in with valid username and globalValidPassword")
    @Severity(SeverityLevel.BLOCKER)
    @Features("Sign In")
    @Stories("FD SIGN IN")
    public void signInWithValidCredentials() {
        SignInPopup popup = new SignInPopup(browser);
        SignInPopupSteps signInPopup = new SignInPopupSteps(popup);
        signInPopup.typeEmailAddress(PropertyLoader.getValue("signIn.validUserName"));
        signInPopup.typePassword(AppConstants.PASSWORD);
        signInPopup.clickSignInButton();
        signInPopup.waitUntilSignInPopupDisappears();
        headerArea.yourAccountAsLoggedInUserIsPresent();
    }

    @After
    public void resetTest(){
        home.logOutIfLoggedIn(homePage.headerArea);
    }

}
