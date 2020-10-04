package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPopup extends PopupBase{
    public WebDriver driver;
    public int timeout = 15;

    @FindBy(xpath = "//div[@id='popupcart']/descendant::tr[@class='cartline']")
    @CacheLookup
    public List<WebElement> productRowInCart;

    @FindBy(xpath = "//div[@id='popupcart']/descendant::div[@class='price']")
    @CacheLookup
    public List<WebElement> productTotalPrice;

    @FindBy(xpath = "//div[@id='popupcart']/descendant::button[@class='remove']")
    @CacheLookup
    public List<WebElement> btn_remove;

    @FindBy(xpath = "//div[@id='popupcart']/descendant::a[@href='/view_cart.jsp']")
    @CacheLookup
    public WebElement link_viewCart;

    public CartPopup(WebDriver driver) {
        super(driver);
    }

    public void initCartPopup(){
        initElement(driver,this);
    }
}
