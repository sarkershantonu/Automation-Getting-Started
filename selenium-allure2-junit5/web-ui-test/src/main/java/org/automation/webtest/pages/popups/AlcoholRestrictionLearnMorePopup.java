package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AlcoholRestrictionLearnMorePopup extends PopupBase{
    public int timeout = 15;

    @FindBy(xpath = "//div[@data-show='restriction_learnmore']")
    @CacheLookup
    public WebElement popup_alcoholRestrictionLearnMore;

    @FindBy(xpath = "//div[@class='restrictionpopup__learnmoretitle']/descendant::button")
    @CacheLookup
    public WebElement btn_back;

    public AlcoholRestrictionLearnMorePopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initAlcoholRestrictionLearnMorePopup(){
        initElement(driver,this);
    }
}
