package org.automation.webtest.pages.popups.checkout;

import org.automation.webtest.pages.popups.PopupBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class DeliverToPopup extends PopupBase {
    public int timeout = 15;
    public AddAddressPopup addAddressPopup;

    @FindBy(css = "div#address-tab-content form")
    @CacheLookup
    public WebElement popup_deliverTo;

    @FindBy(xpath = "//li[@id='address-tab']/descendant::button[contains(text(),'Cancel')]")
    @CacheLookup
    public WebElement btn_cancel;

    @FindBy(xpath = "//li[@id='address-tab']/descendant::button[contains(text(),'Done')]")
    @CacheLookup
    public WebElement btn_done;

    @FindBy(xpath = "//div[@id='address-tab-content']/descendant::button[@data-component='addaddressbutton']")
    @CacheLookup
    public WebElement btn_addAddress;

    @FindBy(className = "drawer__item")
    public List<WebElement> addressList;

    @FindBy(xpath = "//div[@class='drawer__item']/descendant::button[@data-action='deleteDeliveryAddressMethod']")
    @CacheLookup
    public List<WebElement> btn_delete;

    @FindBy(xpath = "//div[@class='drawer__item']/descendant::button[@data-action='getDeliveryAddressMethod']")
    @CacheLookup
    public List<WebElement> btn_edit;

    @FindBy(xpath = "//div[@class='drawer__item']/input[contains(@id,'address')]")
    @CacheLookup
    public List<WebElement> rdoBtn_addressSelect;

    @FindBy(xpath = "//div[@class='drawer__item']/descendant::input[contains(@id,'address') and not(@checked)]")
    @CacheLookup
    public List<WebElement> rdoBtn_addressSelectUnChecked;

    @FindBy(xpath = "//div[@class='drawer__item']/descendant::input[contains(@id,'address') and @checked]")
    @CacheLookup
    public WebElement rdoBtn_addressSelectChecked;

    @FindBy(xpath = "//input[contains(@id,'address_') and @checked]/ancestor::div[@class='drawer__item']/div/p[@class='drawer__item__title']")
    @CacheLookup
    public  WebElement lbl_selectedAddressNickName;

    @FindBy(xpath = "//input[contains(@id,'address_') and @checked]/ancestor::div[@class='drawer__item']/descendant::button[@data-action='deleteDeliveryAddressMethod']")
    @CacheLookup
    public  WebElement btn_selectedAddressDelete;

    @FindBy(xpath = "//input[contains(@id,'address_') and @checked]/ancestor::div[@class='drawer__item']/descendant::button[@data-action='getDeliveryAddressMethod']")
    @CacheLookup
    public  WebElement btn_selectedAddressEdit;

    @FindBy(xpath = "//input[contains(@id,'address_')]/ancestor::div[@class='drawer__item']/div/p[@class='drawer__item__title' and contains(text(), 'Test Default Address')]")
    @CacheLookup
    public WebElement lbl_testDefaultAddressNickName;

    @FindBy(xpath = "//p[@class='drawer__item__title' and contains(text(), 'Test Default Address')]/ancestor::div[@class='drawer__item']/descendant::input/parent::span")
    @CacheLookup
    public WebElement rdoBtn_testDefaultAddress;

    @FindBy(xpath = "//p[@class='drawer__item__title' and contains(text(), 'My Residential Address')]/ancestor::div[@class='drawer__item']/descendant::button[@data-action='deleteDeliveryAddressMethod']")
    @CacheLookup
    public WebElement btn_deleteMyResidentialAddress;

    @FindBy(id = "confirmpopup")
    @CacheLookup
    public WebElement popup_addressDeleteConfirmation;

    @FindBy(xpath = "//div[@id='confirmpopup']/descendant::div[@class='buttons']/button[position()=1]")
    @CacheLookup
    public WebElement btn_deleteConfirmationDelete;

    @FindBy(xpath = "//div[@id='confirmpopup']/descendant::div[@class='buttons']/button[position()=2]")
    @CacheLookup
    public WebElement btn_deleteConfirmationCancel;


    public DeliverToPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
        initStaticItems();
    }

    public void initDeliverToPopup(){
        initElement(driver,this);
        initStaticItems();
    }

    public void initStaticItems(){
        addAddressPopup = new AddAddressPopup(driver);
        initElement(driver, addAddressPopup);
    }
}
