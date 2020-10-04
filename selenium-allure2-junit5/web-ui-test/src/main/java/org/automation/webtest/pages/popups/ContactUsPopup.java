package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ContactUsPopup extends PopupBase{

    public int timeout = 15;

    @FindBy(xpath = "//div[@class='chat-cont']/div[@class='chat-header']")
    @CacheLookup
    public WebElement txt_contactUsPopup;

    public ContactUsPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initContactUsPopup(){
        initElement(driver,this);
    }

}
