package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class CarouselViewAllPopup extends PopupBase{

    public int timeout = 15;

    @FindBy(xpath = "//div[@id='viewallPopup']/div[@class='fixedPopupContent']")
    @CacheLookup
    public WebElement viewAllPopup;

    @FindBy(xpath = "//div[@id='viewallPopup']/descendant::div[@class='content-header']/descendant::h2[@class='content-title']")
    @CacheLookup
    public WebElement popupHeader;

    @FindBy(xpath = "//div[@id='viewallPopup']/descendant::div[@class='content-header']/descendant::span")
    @CacheLookup
    public WebElement popupBanner;

    public CarouselViewAllPopup(WebDriver driver) {
        super(driver);
    }

    public void initCarouselPopup(){
        initElement(driver,this);
    }

}
