package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateAccountSuccessPopup extends PopupBase{
    public int timeout = 15;

    @FindBy(id = "signup-success")
    @CacheLookup
    public WebElement successPopup;

    @FindBy(xpath = "//div[@id='sulCont']/descendant::div[@class='form-side-social-header'][1]")
    @CacheLookup
    public WebElement congratsMsg;

    @FindBy(css = "button#social-login-green-button_begin-shopping")
    @CacheLookup
    public WebElement btn_beginShopping;

    public CreateAccountSuccessPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initCreateAccountSuccessPopup(){
         initElement(driver,this);
    }
}
