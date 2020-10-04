package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateNewOrPendingOrderPopup extends PopupBase{

    @FindBy(xpath = "//div[@id='ModifyBRDContainer']/descendant::div[contains(@class,'fixedPopupContent')]")
    public List<WebElement> createNewOrPendingOrderPopup;

    @FindBy(xpath = "//div[@id='ModifyBRDContainer']/descendant::div[contains(@class,'fixedPopupContent')]/descendant::button[contains(@class, 'MBRD-neworder create-order-atc')]")
    @CacheLookup
    public WebElement btn_createNewOrder;

    public CreateNewOrPendingOrderPopup(WebDriver driver) {
        super(driver);
    }

    public void initCreateNewOrPendingOrderPopup(){
        initElement(driver,this);
    }

}
