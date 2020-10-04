package org.automation.webtest.pages.popups.checkout;

import org.automation.webtest.pages.popups.PopupBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AddAddressPopup extends PopupBase {
    public int timeout = 15;

    @FindBy(id = "addaddress_home")
    @CacheLookup
    public WebElement overlay_addHomeAddressForm;

    @FindBy(id = "addaddress_office")
    @CacheLookup
    public WebElement overlay_addOfficeAddressForm;

    @FindBy(id = "addaddress_home_label")
    @CacheLookup
    public WebElement btn_residentialAddressTab;

    @FindBy(xpath = "//label[@id='addaddress_home_label']/input")
    @CacheLookup
    public WebElement btn_residentialAddressTabRadioInput;

    @FindBy(id = "addaddress_office_label")
    @CacheLookup
    public WebElement btn_officeAddressTab;

    @FindBy(xpath = "//label[@id='addaddress_office_label']/input")
    @CacheLookup
    public WebElement btn_officeAddressTabRadioInput;

    @FindBy(id = "addaddress_home_nick_name")
    @CacheLookup
    public WebElement inp_residentialAddressNickName;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='nick_name']")
    @CacheLookup
    public WebElement lbl_residentialAddressNickNameError;

    @FindBy(id = "addaddress_home_first_name")
    @CacheLookup
    public WebElement inp_residentialAddressFirstName;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='first_name']")
    @CacheLookup
    public WebElement lbl_residentialAddressFirstNameError;

    @FindBy(id = "addaddress_home_last_name")
    @CacheLookup
    public WebElement inp_residentialAddressLastName;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='last_name']")
    @CacheLookup
    public WebElement lbl_residentialAddressLastNameError;

    @FindBy(id = "addaddress_home_street_address")
    @CacheLookup
    public WebElement inp_residentialAddressStreetAddress;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='street_address']")
    @CacheLookup
    public WebElement lbl_residentialAddressStreetAddressError;

    @FindBy(id = "addaddress_home_apartment")
    @CacheLookup
    public WebElement inp_residentialAddressApartment;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='apartment']")
    @CacheLookup
    public WebElement lbl_residentialAddressApartment;

    @FindBy(id = "addaddress_home_street_address2")
    @CacheLookup
    public WebElement inp_residentialAddressStreetAddressLineTwo;

    @FindBy(id = "addaddress_home_city")
    @CacheLookup
    public WebElement inp_residentialAddressCity;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='city']")
    @CacheLookup
    public WebElement lbl_residentialAddressCityError;

    @FindBy(id = "addaddress_home_state")
    @CacheLookup
    public WebElement cmb_residentialAddressState;

    @FindBy(id = "addaddress_home_zip")
    @CacheLookup
    public WebElement inp_residentialAddressZIP;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='zip']")
    @CacheLookup
    public WebElement lbl_residentialAddressZIPError;

    @FindBy(id = "addaddress_home_phone")
    @CacheLookup
    public WebElement inp_residentialAddressPhoneNumber;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='phone']")
    @CacheLookup
    public WebElement lbl_residentialAddressPhoneNumberError;

    @FindBy(id = "addaddress_home_phone_ext")
    @CacheLookup
    public WebElement inp_residentialAddressPhoneExt;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@fdform-error='phone_ext']")
    @CacheLookup
    public WebElement lbl_residentialAddressPhoneExtError;

    @FindBy(xpath = "//form[@id='addaddress_home']/descendant::span[@class='cssbutton green showaltphone']")
    @CacheLookup
    public WebElement btn_residentialAddressAddAltPhone;

    @FindBy(xpath = "//input[@id='addaddress_home_phone_type_mobile']/ancestor::span/span[@class='fake-radio']")
    @CacheLookup
    public WebElement btn_residentialAddressMobile;

    @FindBy(id = "addaddress_home_phone_type_mobile")
    @CacheLookup
    public WebElement btn_residentialAddressMobileRadioInput;

    @FindBy(xpath = "//input[@id='addaddress_home_phone_type_home']/ancestor::span/span[@class='fake-radio']")
    @CacheLookup
    public WebElement btn_residentialAddressHome;

    @FindBy(id = "addaddress_home_phone_type_home")
    @CacheLookup
    public WebElement btn_residentialAddressHomeRadioInput;

    @FindBy(id = "addaddress_home_phone_type_work")
    @CacheLookup
    public WebElement btn_residentialAddressWorkRadioInput;

    @FindBy(xpath = "//input[@id='addaddress_home_phone_type_work']/ancestor::span/span[@class='fake-radio']")
    @CacheLookup
    public WebElement btn_residentialAddressWork;

    @FindBy(id = "addaddress_home_alt_phone")
    @CacheLookup
    public WebElement inp_residentialAddressAltPhoneNumber;

    @FindBy(id = "addaddress_home_alt_phone_ext")
    @CacheLookup
    public WebElement inp_residentialAddressAltPhoneExt;

    @FindBy(id = "addaddress_home_instructions")
    @CacheLookup
    public WebElement inp_residentialAddressDeliveryInstruction;

    @FindBy(xpath = "//input[@id='addaddress_home_bd_auth_doorman']/ancestor::span/span[@class='fake-radio']")
    @CacheLookup
    public WebElement btn_residentialAddressDoorman;

    @FindBy(id = "addaddress_home_bd_auth_doorman")
    @CacheLookup
    public WebElement btn_residentialAddressDoormanRadioInput;

    @FindBy(xpath = "//input[@id='addaddress_home_bd_auth_doorman']/ancestor::div[@bd-id='doorman']/div[@class='bd-content']")
    @CacheLookup
    public WebElement lbl_residentialAddressDoormanInstruction;

    @FindBy(id = "neighbor")
    @CacheLookup
    public WebElement btn_residentialAddressNeighbourRadioInput;

    @FindBy(xpath = "//input[@id='neighbor']/ancestor::span/span[@class='fake-radio']")
    @CacheLookup
    public WebElement btn_residentialAddressNeighbour;

    @FindBy(xpath = "//form[@id='addaddress_home']/div/button[text()='Cancel']")
    @CacheLookup
    public WebElement btn_residentialAddressCancel;

    @FindBy(xpath = "//form[@id='addaddress_home']/div/button[text()='Save']")
    @CacheLookup
    public WebElement btn_residentialAddressSave;

    @FindBy(id = "addaddress_office_company_name")
    @CacheLookup
    public WebElement inp_officeAddressCompanyName;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='company_name']")
    @CacheLookup
    public WebElement lbl_officeAddressCompanyNameError;

    @FindBy(id = "addaddress_office_first_name")
    @CacheLookup
    public WebElement inp_officeAddressFirstName;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='first_name']")
    @CacheLookup
    public WebElement lbl_officeAddressFirstNameError;

    @FindBy(id = "addaddress_office_last_name")
    @CacheLookup
    public WebElement inp_officeAddressLastName;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='last_name']")
    @CacheLookup
    public WebElement lbl_officeAddressLastNameError;

    @FindBy(id = "addaddress_office_street_address")
    @CacheLookup
    public WebElement inp_officeAddressStreetAddress;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='street_address']")
    @CacheLookup
    public WebElement lbl_officeAddressStreetAddressError;

    @FindBy(id = "addaddress_office_apartment")
    @CacheLookup
    public WebElement inp_officeAddressFloor;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='apartment']")
    @CacheLookup
    public WebElement lbl_officeAddressFloor;

    @FindBy(id = "addaddress_office_street_address2")
    @CacheLookup
    public WebElement inp_officeAddressStreetAddressLineTwo;

    @FindBy(id = "addaddress_office_city")
    @CacheLookup
    public WebElement inp_officeAddressCity;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='city']")
    @CacheLookup
    public WebElement lbl_officeAddressCityError;

    @FindBy(id = "addaddress_office_state")
    @CacheLookup
    public WebElement cmb_officeAddressState;

    @FindBy(id = "addaddress_office_zip")
    @CacheLookup
    public WebElement inp_officeAddressZIP;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='zip']")
    @CacheLookup
    public WebElement lbl_officeAddressZIPError;

    @FindBy(id = "addaddress_office_phone")
    @CacheLookup
    public WebElement inp_officeAddressPhoneNumber;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='phone']")
    @CacheLookup
    public WebElement lbl_officeAddressPhoneNumberError;

    @FindBy(id = "addaddress_office_phone_ext")
    @CacheLookup
    public WebElement inp_officeAddressPhoneExt;

    @FindBy(xpath = "//form[@id='addaddress_office']/descendant::span[@fdform-error='phone_ext']")
    @CacheLookup
    public WebElement lbl_officeAddressPhoneExtError;

    @FindBy(id = "office_instructions")
    @CacheLookup
    public WebElement inp_officeAddressLocationDetails;

    @FindBy(xpath = "//form[@id='addaddress_office']/div/button[text()='Cancel']")
    @CacheLookup
    public WebElement btn_officeAddressCancel;

    @FindBy(xpath = "//form[@id='addaddress_office']/div/button[text()='Save']")
    @CacheLookup
    public WebElement btn_officeAddressSave;


    public AddAddressPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initAddAddressPopup(){
        initElement(driver,this);
    }
}
