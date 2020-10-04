package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class CreateAccountPopup  extends PopupBase{

    public CreateAccountSuccessPopup createAccountSuccessPopup;
    public int timeout = 15;

    @FindBy(xpath = "//div[@class='form-side-social']/div[@class='form-side-social-header']")
    @CacheLookup
    public WebElement createAccountPopupText;

    @FindBy(css = "div#ajaxpopup button.qs-popup-close-icon")
    @CacheLookup
    public WebElement btn_closeCreateAccountPopup;

    @FindBy(xpath = "//form[@id='litesignup']/ancestor::div[contains(@class,'qs-popup-content')]/parent::div[contains(@class,'fixedPopupContent')]")
    public WebElement createAccountPopup;

    @FindBy(id = "email")
    @CacheLookup
    public WebElement emailField;

    @FindBy(css = "[placeholder='Password']")
    @CacheLookup
    public WebElement passwordField;

    @FindBy(css = "input#signupbtn")
    @CacheLookup
    public WebElement btn_createAccount;

    @FindBy(xpath = "//div[@class='bottom-links']//a[text()='Sign In']")
    @CacheLookup
    public WebElement lnk_signIn;

    @FindBy(id = "email-error")
    @CacheLookup
    public WebElement lbl_emailError;

    @FindBy(id = "password1-error")
    @CacheLookup
    public WebElement passwordBlankError;

    @FindBy(xpath = "//div[@class='bottom-contents']//a[text()='Customer Agreement']")
    @CacheLookup
    public WebElement link_customerAgreement;

    @FindBy(xpath = "//div[@id='form_feilds']//a[contains(text(),'Privacy Policy')]")
    @CacheLookup
    public WebElement link_privacyPolicy;

    @FindBy(xpath = "//div[@id='social_login_demo']/iframe")
    @CacheLookup
    public WebElement frame_socialLogin;

    @FindBy(id = "button_google")
    @CacheLookup
    public WebElement btn_google;

    @FindBy(id = "provider_google")
    @CacheLookup
    public WebElement btnArea_google;

    @FindBy(id = "button_facebook")
    @CacheLookup
    public WebElement btn_facebook;

    @FindBy(id = "provider_facebook")
    @CacheLookup
    public WebElement btnArea_facebook;

    @FindBy(xpath = "//input[@id='sul_type_fields_CORPORATE']/following-sibling::label[@for='sul_type_fields_CORPORATE']")
    @CacheLookup
    public WebElement radioBtn_businessOrSchool;

    @FindBy(id = "sul_type_fields_CORPORATE")
    @CacheLookup
    public WebElement radioBtnArea_businessOrSchool;

    @FindBy(xpath = "//input[@id='sul_type_fields_HOME']/following-sibling::label[@for='sul_type_fields_HOME']")
    @CacheLookup
    public WebElement radioBtn_home;

    @FindBy(id = "sul_type_fields_HOME")
    @CacheLookup
    public WebElement radioBtnArea_home;

    @FindBy(css = "input[placeholder='Company Name']")
    @CacheLookup
    public WebElement companyNameField;

    @FindBy(css = "div#companyName-error")
    @CacheLookup
    public WebElement errorCompanyName;

    @FindBy(css = "input#firstName")
    @CacheLookup
    public WebElement firstNameField;

    @FindBy(css = "div#firstName-error")
    @CacheLookup
    public WebElement errorFirstName;

    @FindBy(css = "input#lastName")
    @CacheLookup
    public WebElement lastNameField;

    @FindBy(css = "div#lastName-error")
    @CacheLookup
    public WebElement errorLastName;

    @FindBy(xpath = "//input[@id='workPhone']")
    @CacheLookup
    public WebElement workPhoneField;

    @FindBy(css = "input#zipCode")
    @CacheLookup
    public WebElement zipCodeField;

    @FindBy(css = "div#zipCode-error")
    @CacheLookup
    public WebElement errorZipCode;

    @FindBy(css = "input#email")
    @CacheLookup
    public WebElement officeEmailField;

    @FindBy(css = "#email-error")
    @CacheLookup
    public WebElement errorOfficeEmailField;

    @FindBy(css = "input#password1")
    @CacheLookup
    public WebElement officePasswordField;

    @FindBy(css = "#password1-error")
    @CacheLookup
    public WebElement errorOfficePasswordField;

    @FindBy(css = "a[href*='user_agreement']")
    @CacheLookup
    public WebElement link_officeCustomerAgreement;

    @FindBy(xpath = "//div[@id='form_feilds']//a[contains(text(),'Privacy Policy')]")
    @CacheLookup
    public WebElement link_officePrivacyPolicy;

    @FindBy(css = "input.butText.social-login-continue-button")
    @CacheLookup
    public WebElement btn_officeCreateAccount;

    public CreateAccountPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
        createAccountSuccessPopup = new CreateAccountSuccessPopup(driver);
        //initElement(driver, createAccountSuccessPopup);
    }

    public void initCreateAccountPopup(){
        initElement(driver,this);
    }

}
