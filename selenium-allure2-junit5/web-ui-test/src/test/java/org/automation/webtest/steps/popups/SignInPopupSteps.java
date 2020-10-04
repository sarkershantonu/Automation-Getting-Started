package org.automation.webtest.steps.popups;


import org.automation.webtest.pages.popups.SignInPopup;
import org.automation.webtest.steps.StepBase;
import ru.yandex.qatools.allure.annotations.Step;

public class SignInPopupSteps extends StepBase {
    private SignInPopup popup;

    public SignInPopupSteps(SignInPopup popup) {
        this.popup = popup;
    }

    public void setSignInPopup(SignInPopup signInPopup) {
        this.popup = signInPopup;
    }

    @Step
    public void popUpCloseButtonIsDisplayed(){
        verifyElementIsDisplayed(popup.btn_popUpClose);
    }

    @Step
    public void passwordFieldDisplayed(){
        verifyElementIsDisplayed(popup.passwordField);
    }

    @Step
    public void signInPopupIsNotDisplayed(){
        verifyElementIsNotDisplayed(popup.signInPopup);
    }

    @Step
    public void signInButtonDisplayed(){
        verifyElementIsDisplayed(popup.btn_signIn);
    }

    @Step
    public void emailRequiredErrorMessage(){
        verify(popup.lbl_emailError, "Required");
    }

    @Step
    public void emailIncompleteErrorMessage(){
        verify(popup.lbl_emailError, "Incomplete e-mail Address");
    }

    @Step
    public void googleButtonIsDisplayed(){
        verifyElementIsDisplayed(popup.btnArea_google);
    }

    @Step
    public void googleButtonIsEnabled(){
        verifyElementIsEnabled(popup.btn_google);
    }

    @Step
    public void facebookButtonIsDisplayed(){
        verifyElementIsDisplayed(popup.btnArea_facebook);
    }

    @Step
    public void facebookButtonIsEnabled(){
        verifyElementIsEnabled(popup.btnArea_facebook);
    }

    @Step
    public void passwordRequiredErrorMessage(){
        verify(popup.passwordBlankError, "Required");
    }

    @Step
    public void signInButtonIsEnabled(){
        verifyElementIsEnabled(popup.btn_signIn);
    }

    @Step
    public void signInButtonIsDisabled(){
        verifyElementIsDisabled(popup.btn_signIn);
    }

    @Step
    public void popUpCloseButtonIsEnabled(){
        verifyElementIsEnabled(popup.btn_popUpClose);
    }

    @Step
    public void passwordFieldEnabled(){
        verifyElementIsEnabled(popup.passwordField);
    }

    @Step
    public void signInPopupDisplayed(){
        verifyElementIsDisplayed(popup.signInPopup);
    }

    @Step
    public void passwordFieldTakesInput(String password) {
        verify(popup.getAttributeValue(popup.passwordField, "value"), password);
    }

    @Step
    public void emailFieldDisplayed(){
        verifyElementIsDisplayed(popup.emailField);
    }

    @Step
    public void emailFieldEnabled(){
        verifyElementIsEnabled(popup.emailField);
    }

    @Step
    public void emailFieldTakesInput(String email) {
        verify(popup.getAttributeValue(popup.emailField, "value"), email);
    }

    @Step
    public void signInOverlayHasExpectedText(){
        verify(popup.signInPopupHeader, "Sign in with email:");
    }

    @Step
    public void clickOnEmailField(){
        popup.click(popup.emailField);
    }

    @Step
    public void typeEmailAddress(String email){
        //popup.typeText(popup.emailField, email);
        popup.javaScriptTypeText(popup.emailField, email);
    }

    @Step
    public void clearEmailField(){
        popup.clear(popup.emailField);
    }

    @Step
    public void clickOnPasswordField(){
        popup.click(popup.passwordField);
    }

    @Step
    public void typePassword(String password){
        //typeText(passwordField, password);
        popup.typeTextWithoutClick(popup.passwordField, password);
    }

    @Step
    public void clearPasswordField(){
        popup.clear(popup.passwordField);
    }

    @Step
    public void clickSignInButton(){
        //click(btn_signIn);
        popup.javaScriptClick(popup.btn_signIn);
    }

    @Step
    public void clickOnPopUpCloseButton(){
        popup.click(popup.btn_popUpClose);
    }

    @Step
    public void clickOnCreateAccountFromSignInPopup(){
        //click(link_createAccount);
        popup.javaScriptClick(popup.link_createAccount);
    }

    @Step
    public void switchToSocialLoginFrame(){
        popup.switchFrame(popup.frame_socialLogin);
    }

    @Step
    public void waitUntilSignInPopupDisappears(){
        popup.waitUntilElementIsDisappeared(popup.signInPopup, 5);
    }

    @Step
    public void signInWith(String username, String password){
        typeEmailAddress(username);
        typePassword(password);
        clickSignInButton();
        waitUntilSignInPopupDisappears();
    }
}
