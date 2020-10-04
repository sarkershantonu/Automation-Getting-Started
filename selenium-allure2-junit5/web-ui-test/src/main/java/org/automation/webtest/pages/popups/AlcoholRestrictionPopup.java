package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AlcoholRestrictionPopup extends PopupBase{
    public int timeout = 15;

    @FindBy(id = "restrictiontimeslot")
    @CacheLookup
    public WebElement popup_alcoholRestriction;

    @FindBy(xpath = "//a[text()='Learn more about alcohol restrictions.']")
    @CacheLookup
    public WebElement lnk_learnMoreAboutAlcoholRestrictions;

    @FindBy(xpath = "//button[text()='Change my Timeslot']")
    @CacheLookup
    public WebElement btn_changeMyTimeSlot;

    @FindBy(xpath = "//button[text()='Remove and Proceed']")
    @CacheLookup
    public WebElement btn_removeAndProceed;

    public AlcoholRestrictionPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initAlcoholRestrictionPopup(){
        initElement(driver,this);
    }
}
