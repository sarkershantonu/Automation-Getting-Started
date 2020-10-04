package org.automation.webtest.steps;


import org.automation.webtest.config.AppConstants;
import org.automation.webtest.core.TestBase;
import org.automation.webtest.pages.Home;
import org.automation.webtest.pages.common.HeaderArea;
import org.automation.webtest.steps.pages.HomePageSteps;
import org.automation.webtest.steps.popups.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

import static org.automation.webtest.config.AppConstants.PAGE_TIMEOUT;

public abstract class StepBase extends TestBase {

    public void isGraterThanZero(int val) {
        verifyTrue("Product List is not available", val > 0);
    }

    @Step
    public void navigate(String pageUrl) {
        browser.get(System.getProperty("app.url") + pageUrl);
    }

    public void isListAvailable(int listSize) {
        isGraterThanZero(listSize);
    }

    @Step
    public void checkPageTitle(String title) {
        verify("Title MissMatch", title, browser.getTitle());
    }

    @Step
    public void checkPageUrl(String url) {
        verify("Page Url MissMatch", System.getProperty("app.url")+url, browser.getCurrentUrl());
    }

    @Step
    public void verifyAlertMessage(String expectedText) {
        verify(browser.switchTo().alert().getText(), expectedText);
    }

    @Step
    public void verifyPageLoadedText(String pageLoadedText) {
        (new WebDriverWait(browser, PAGE_TIMEOUT)).until(
                new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver d) {
                        return d.getPageSource().contains(pageLoadedText);
                    }
                });
    }

    public void resetCart(HeaderArea area) {
        HeaderAreaSteps headerArea = new HeaderAreaSteps(area);
        if (headerArea.getNumberOfCartItems() > 0) {
            headerArea.hoverOnCart();
            holdExecution();
            CartPopupSteps cartPopup = new CartPopupSteps(area.cartPopup);
            cartPopup.removeAllFromCart();
        }
    }

    @Step
    public void verifyElementIsEnabled(WebElement element) {
        verifyTrue("Element is not Enabled", element.isEnabled());
    }

    //todo arafat
    @Step
    public void contactUsOverlayTextFooter() {
        // verify(footerArea.contactUsPopup.contactUsPopupTest, "Chat With Our Service Team");
    }

    @Step
    public void verifyElementIsNotDisplayed(WebElement element) {
        verifyFalse("Element is displayed", element.isDisplayed());
    }

    @Step
    public void verifyElementIsDisabled(WebElement element) {
        verifyFalse("Element is not Disabled", element.isEnabled());
    }

    @Step
    public void verifyElementIsDisplayed(WebElement element) {
        verifyTrue("Element is not displayed", element.isDisplayed());
    }

    @Step
    public void verifyElementIsSelected(WebElement element) {
        verifyTrue("Element is not selected", element.isSelected());
    }

    @Step
    public void verifyElementIsNotSelected(WebElement element) {
        verifyFalse("Element is selected", element.isSelected());
    }

    public void logOutIfLoggedIn(HeaderArea area) {
        HeaderAreaSteps headerArea = new HeaderAreaSteps(area);
        if (headerArea.getLoggedInVerificationText().equals("Your Account")) {
            headerArea.hoverOnYourAccountFromHeader();
            holdExecution(250);
            YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(area.yourAccountPopup);
            yourAccountPopup.clickOnSignOutButton();
            holdExecution();
        }
    }

    public void signInWith(HeaderArea area, String username) {
        HeaderAreaSteps headerArea = new HeaderAreaSteps(area);
        headerArea.clickOnSignInFromHeader();
        SignInPopupSteps signInPopup = new SignInPopupSteps(area.signInPopup);
        signInPopup.typeEmailAddress(username);
        signInPopup.typePassword(AppConstants.PASSWORD);
        signInPopup.clickSignInButton();
        signInPopup.waitUntilSignInPopupDisappears();
        holdExecution(750);
    }

    public void fillUpFormAndCreateNewResidentialAccount(HeaderArea area) {
        HeaderAreaSteps headerArea = new HeaderAreaSteps(area);
        headerArea.clickCreateAccountButton();
        CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(area.createAccountPopup);
        createAccountPopup.typeEmailAddress(uniqueUserName());
        createAccountPopup.typePassword(AppConstants.PASSWORD);
        createAccountPopup.clickOnCreateAccountButton();
        createAccountPopup.waitUntilCreateAccountButtonDisappears();
    }

    public void createNewResidentialAccount(HeaderArea area) {
        HeaderAreaSteps headerArea = new HeaderAreaSteps(area);
        headerArea.clickCreateAccountButton();
        CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(area.createAccountPopup);
        createAccountPopup.typeEmailAddress(uniqueUserName());
        createAccountPopup.typePassword(AppConstants.PASSWORD);
        createAccountPopup.clickOnCreateAccountButton();
        createAccountPopup.waitUntilCreateAccountButtonDisappears();
        CreateAccountSuccessPopupSteps createAccountSuccessPopup = new CreateAccountSuccessPopupSteps(area.createAccountSuccessPopup);
        createAccountSuccessPopup.waitUntilCreateAccountSuccessPopupAppears();
        createAccountSuccessPopup.clickOnBeginShoppingButton();
    }

    public void logOutFromHomePage() {
        holdExecution();
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        HeaderAreaSteps headerArea = new HeaderAreaSteps(homePage.headerArea);
        headerArea.hoverOnYourAccountFromHeader();
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        homePage.headerArea.yourAccountPopup.initElement();
        yourAccountPopup.clickOnSignOutButton();
    }

    public void signInFromHomePageWith(String userName){
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        signInWith(homePage.headerArea, userName);
    }

    @Step
    private void verifyInputFieldTakesInput(String actualValue, String inputToVerify){
        verify(inputToVerify, actualValue);
    }

    public void verifyFormInputField(PopupBase popup, WebElement element, String inputToVerify){
        verifyElementIsDisplayed(element);
        verifyElementIsEnabled(element);
        popup.typeTextWithoutClear(element, inputToVerify);
        verifyInputFieldTakesInput(popup.getAttributeValue(element, "value"), inputToVerify);
    }


    @Step
    private void verifyButtonText(String actualValue, String inputToVerify){
        verify(inputToVerify, actualValue);
    }



    private String formatPhoneNumber(String phoneNumber){
        String expectedPhoneNumberFormet = "(";
        for(int index = 0; index < phoneNumber.length(); index++) {
            String temp =  String.valueOf(phoneNumber.charAt(index));
            if(index == 3){
                temp = ") " + temp;
            } else if(index == 6){
                temp = " " + temp;
            }
            expectedPhoneNumberFormet += temp;
        }
        return expectedPhoneNumberFormet;
    }

    @Step
    public void verifyPhoneNumberFieldInput(String actualPhoneNumber, String expectedPhoneNumber){
        verify(expectedPhoneNumber, actualPhoneNumber);
    }


}
