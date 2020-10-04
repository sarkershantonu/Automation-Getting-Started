package org.automation.webtest.pages.popups.checkout;

import org.automation.webtest.pages.popups.PopupBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AddPaymentPopup extends PopupBase {
    public int timeout = 15;

    @FindBy(id = "addpaymentmethodpopup")
    @CacheLookup
    public WebElement overlay_addPaymentForm;

    @FindBy(id = "CC_cardHolderName")
    @CacheLookup
    public WebElement inp_nameOnCard;

    @FindBy(xpath = "//span[@fdform-error='cardHolderName']")
    @CacheLookup
    public WebElement lbl_nameOnCardError;

    @FindBy(id = "CC_cardBrand")
    @CacheLookup
    public WebElement drpDwn_cardInformation;

    @FindBy(xpath = "//span[@fdform-error='cardBrand']")
    @CacheLookup
    public WebElement lbl_cardInformationError;

    @FindBy(id = "CC_cardNum")
    @CacheLookup
    public WebElement inp_cardNumber;

    @FindBy(xpath = "//span[@fdform-error='cardNum']")
    @CacheLookup
    public WebElement lbl_cardNumberError;

    @FindBy(id = "CC_cardCvv")
    @CacheLookup
    public WebElement inp_CVV;

    @FindBy(xpath = "//span[@fdform-error='csv']")
    @CacheLookup
    public WebElement lbl_CVVError;

    @FindBy(id = "CC_cardMonth")
    @CacheLookup
    public WebElement drpDwn_month;

    @FindBy(xpath = "//span[@fdform-error='cardMonth']")
    @CacheLookup
    public WebElement lbl_monthError;

    @FindBy(id = "CC_cardYear")
    @CacheLookup
    public WebElement drpDwn_year;

    @FindBy(xpath = "//span[@fdform-error='cardYear']")
    @CacheLookup
    public WebElement lbl_yearError;

    @FindBy(id = "CC_bil_country")
    @CacheLookup
    public WebElement drpDwn_billingAddress;

    @FindBy(xpath = "//span[@fdform-error='bil_country']")
    @CacheLookup
    public WebElement lbl_countryError;

    @FindBy(id = "CC_bil_address1")
    @CacheLookup
    public WebElement inp_streetAddress;

    @FindBy(xpath = "//span[@fdform-error='bil_address1']")
    @CacheLookup
    public WebElement lbl_streetAddressError;

    @FindBy(id = "CC_bil_apartment")
    @CacheLookup
    public WebElement inp_apt;

    @FindBy(id = "CC_bil_address2")
    @CacheLookup
    public WebElement inp_addressLineTwo;

    @FindBy(id = "CC_bil_city")
    @CacheLookup
    public WebElement inp_city;

    @FindBy(xpath = "//span[@fdform-error='bil_city']")
    @CacheLookup
    public WebElement lbl_cityError;

    @FindBy(id = "CC_bil_state")
    @CacheLookup
    public WebElement drpDrn_state;

    @FindBy(id = "CC_bil_zipcode")
    @CacheLookup
    public WebElement inp_zipCode;

    @FindBy(xpath = "//span[@fdform-error='bil_zipcode']")
    @CacheLookup
    public WebElement lbl_zipCodeError;

    @FindBy(id = "CC_phone")
    @CacheLookup
    public WebElement inp_billingInquiries;

    @FindBy(xpath = "//span[@fdform-error='phone']")
    @CacheLookup
    public WebElement lbl_billingInquiriesError;

    @FindBy(xpath = "//form[@id='addpaymentmethod_creditcard']/descendant::button[position()=1]")
    @CacheLookup
    public WebElement btn_cancel;

    @FindBy(xpath = "//form[@id='addpaymentmethod_creditcard']/descendant::button[position()=2]")
    @CacheLookup
    public WebElement btn_save;

    @FindBy(xpath = "//input[@id='addpaymentmethod_creditcard_selector']/parent::label")
    @CacheLookup
    public WebElement lbl_creditDebitTab;

    @FindBy(id = "addpaymentmethod_creditcard_selector")
    @CacheLookup
    public WebElement rdoBtn_creditDebitTab;

    @FindBy(xpath = "//input[@id='addpaymentmethod_bank_selector']/parent::label")
    @CacheLookup
    public WebElement lbl_bankTab;

    @FindBy(id = "addpaymentmethod_bank_selector")
    @CacheLookup
    public WebElement rdoBtn_bankTab;

    @FindBy(xpath = "//input[@id='EC_bankAccountType_C']/parent::span")
    @CacheLookup
    public WebElement lbl_checking;

    @FindBy(id = "EC_bankAccountType_C")
    @CacheLookup
    public WebElement rdoBtn_checking;

    @FindBy(xpath = "//input[@id='EC_bankAccountType_S']/parent::span")
    @CacheLookup
    public WebElement lbl_savings;

    @FindBy(id = "EC_bankAccountType_S")
    @CacheLookup
    public WebElement rdoBtn_savings;

    @FindBy(id = "EC_cardHolderName")
    @CacheLookup
    public WebElement inp_nameOnAccount;

    @FindBy(xpath = "//span[@fdform-error='cardHolderName']")
    @CacheLookup
    public WebElement lbl_nameOnAccountError;

    @FindBy(id = "EC_bankName")
    @CacheLookup
    public WebElement inp_bankName;

    @FindBy(xpath = "//span[@fdform-error='bankName']")
    @CacheLookup
    public WebElement lbl_bankNameError;

    @FindBy(id = "EC_cardNum")
    @CacheLookup
    public WebElement inp_accountNumber;

    @FindBy(xpath = "//span[@fdform-error='cardNum']")
    @CacheLookup
    public WebElement lbl_accountNumberError;

    @FindBy(id = "EC_cardNumVerify")
    @CacheLookup
    public WebElement inp_verifyAccountNumber;

    @FindBy(xpath = "//span[@fdform-error='cardNumVerify']")
    @CacheLookup
    public WebElement lbl_verifyAccountNumberError;

    @FindBy(id = "EC_abaRouteNumber")
    @CacheLookup
    public WebElement inp_routingNumber;

    @FindBy(xpath = "//span[@fdform-error='abaRouteNumber']")
    @CacheLookup
    public WebElement lbl_routingNumberError;

    @FindBy(id = "EC_bil_country")
    @CacheLookup
    public WebElement drpDwn_country;

    @FindBy(id = "EC_bil_address1")
    @CacheLookup
    public WebElement inp_streetAddressBank;

    @FindBy(id = "EC_bil_apartment")
    @CacheLookup
    public WebElement inp_aptBank;

    @FindBy(id = "EC_bil_address2")
    @CacheLookup
    public WebElement inp_addressLineTwoBank;

    @FindBy(id = "EC_bil_city")
    @CacheLookup
    public WebElement inp_cityBank;

    @FindBy(id = "EC_bil_state")
    @CacheLookup
    public WebElement drpDrn_stateBank;

    @FindBy(id = "EC_bil_zipcode")
    @CacheLookup
    public WebElement inp_zipCodeBank;

    @FindBy(id = "EC_phone")
    @CacheLookup
    public WebElement inp_billingInquiriesBank;

    @FindBy(id = "EC_terms")
    @CacheLookup
    public WebElement chkBox_acceptAgreement;

    @FindBy(xpath= "//input[@id='EC_terms']/parent::span/label")
    @CacheLookup
    public WebElement lbl_acceptAgreement;

    @FindBy(xpath = "//span[@fdform-error='terms']")
    @CacheLookup
    public WebElement lbl_acceptAgreementError;

    @FindBy(xpath = "//form[@id='addpaymentmethod_bank']/descendant::button[position()=1]")
    @CacheLookup
    public WebElement btn_cancelBank;

    @FindBy(xpath = "//form[@id='addpaymentmethod_bank']/descendant::button[position()=2]")
    @CacheLookup
    public WebElement btn_saveBank;

    public AddPaymentPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initAddPaymentFormPopup(){
        initElement(driver,this);
    }
}
