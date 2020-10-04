package org.automation.webtest.pages.popups.checkout;

import org.automation.webtest.pages.popups.PopupBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class FreeDeliveryPassPopup extends PopupBase {
    public int timeout = 15;

    @FindBy(className = "dpn")
    @CacheLookup
    public WebElement popup_freeDpSignUp;

    @FindBy(xpath = "//button[@onclick='getFreeDelivery()']")
    @CacheLookup
    public WebElement btn_start60DayFreeTrial;

    @FindBy(xpath = "//a[text()='No thanks, I hate saving money.']")
    @CacheLookup
    public WebElement lnk_noThanks;

    @FindBy(css = "span[class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    @CacheLookup
    public WebElement btn_closeX;

    public FreeDeliveryPassPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initCheckoutFreeDeliveryPassPopup(){
        initElement(driver,this);
    }
}
