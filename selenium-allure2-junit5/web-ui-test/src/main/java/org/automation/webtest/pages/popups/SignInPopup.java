package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


// its an individual page, but generating as a popup
public class SignInPopup  extends PopupBase{
    public int timeout = 15;

    @FindBy(className = "form-side-social-header")
    @CacheLookup
    public WebElement signInPopupHeader;

    @FindBy(id = "email")
    @CacheLookup
    public WebElement emailField;

    @FindBy(id = "password")
    @CacheLookup
    public WebElement passwordField;

    @FindBy(id = "signinbtn")
    @CacheLookup
    public WebElement btn_signIn;

    @FindBy(xpath = "//div[@id='ajaxpopup']/descendant::div[@class='qs-popup-header']/button[@class='qs-popup-close-icon']")
    @CacheLookup
    public WebElement btn_popUpClose;

    @FindBy(xpath = "//form[@id='fd_login']/ancestor::div[@class='qs-popup-content']/parent::div[@class='fixedPopupContent']")
    @CacheLookup
    public WebElement signInPopup;

    @FindBy(id = "social_login_signup_link")
    @CacheLookup
    public WebElement link_createAccount;

    @FindBy(id = "email-error")
    @CacheLookup
    public WebElement lbl_emailError;

    @FindBy(id="password-error")
    @CacheLookup
    public WebElement passwordBlankError;

    @FindBy(id = "button_facebook")
    @CacheLookup
    public WebElement btn_facebook;

    @FindBy(id = "provider_facebook")
    @CacheLookup
    public WebElement btnArea_facebook;

    @FindBy(id = "button_google")
    @CacheLookup
    public WebElement btn_google;

    @FindBy(id = "provider_google")
    @CacheLookup
    public WebElement btnArea_google;

    @FindBy(xpath = "//div[@id='social_login_demo']/iframe")
    @CacheLookup
    public WebElement frame_socialLogin;
    
    public SignInPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initSignInPopup(){
         initElement(driver,this);
    }

}
