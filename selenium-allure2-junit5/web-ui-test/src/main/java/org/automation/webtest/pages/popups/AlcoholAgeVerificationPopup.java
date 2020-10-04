package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AlcoholAgeVerificationPopup extends PopupBase{
    public int timeout = 15;

    @FindBy(xpath = "//form[@id='ageverification']/ancestor::div[@class='ec-popup restrictionpopup']")
    @CacheLookup
    public WebElement popup_alcoholAgeVerification;

    @FindBy(xpath = "//div[@class='ageverification__verifybox']/descendant::label")
    @CacheLookup
    public WebElement chkbox_ageVerification;

    @FindBy(xpath = "//div[@class='ageverification__buttons']/descendant::button[text()='Save']")
    @CacheLookup
    public WebElement btn_save;

    @FindBy(xpath = "//span[text()='Remove alcohol from my cart and proceed']")
    @CacheLookup
    public WebElement lnk_removeAlcoholFromMyCartAndProceed;

    @FindBy(xpath = "//span[text()='This information is required!']")
    @CacheLookup
    public WebElement errorMsg_thisInformationIsRequired;

    public AlcoholAgeVerificationPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initAlcoholAgeVerificationPopup(){
        initElement(driver,this);
    }
}
