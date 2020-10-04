package org.automation.webtest.pages.popups.checkout;


import org.automation.webtest.pages.popups.PopupBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class Free60DayTrialSuccessPopup extends PopupBase {
    public int timeout = 15;

    @FindBy(className = "dpn-success")
    @CacheLookup
    public WebElement popup_free60DayTrialSuccess;

    @FindBy(xpath = "//a[text()='Start Saving']")
    @CacheLookup
    public WebElement lnk_startSaving;

    @FindBy(xpath = "//div[@class='dpn-success-setting']/descendant::a")
    @CacheLookup
    public WebElement lnk_deliveryPassSettings;

    public Free60DayTrialSuccessPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initCheckoutFree60DayTrialSuccessPopup(){
        initElement(driver,this);
    }
}
