package org.automation.webtest.pages.popups.checkout;

import org.automation.webtest.pages.popups.PopupBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class PayWithPopup extends PopupBase {
    public int timeout = 15;
    public AddPaymentPopup addPaymentPopup;

    @FindBy(css = "div#payment-tab-content form")
    @CacheLookup
    public WebElement popup_payWith;

    @FindBy(xpath = "//div[@id='payment-tab-content']/descendant::button[@data-component='addpaymentmethodbutton']")
    @CacheLookup
    public WebElement btn_addMethod;

    @FindBy(xpath = "//li[@id='payment-tab']/descendant::button[contains(@class,'cancel-button')]")
    @CacheLookup
    public WebElement btn_cancel;

    @FindBy(xpath = "//li[@id='payment-tab']/descendant::button[contains(@class,'close-button')]")
    @CacheLookup
    public WebElement btn_done;

    @FindBy(xpath = "//div[@id='payment-tab-content']/descendant::input[starts-with(@id,'payment_')]/ancestor::div[@class='drawer__item']")
    public List<WebElement> paymentMethodList;

    public PayWithPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
        initStaticItems();
    }

    public void initPayWithPopup(){
        initElement(driver,this);
        initStaticItems();
    }

    public void initStaticItems(){
        addPaymentPopup = new AddPaymentPopup(driver);
        initElement(driver, addPaymentPopup);
    }
}
