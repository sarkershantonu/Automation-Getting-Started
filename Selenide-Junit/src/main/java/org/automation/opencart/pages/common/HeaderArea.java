package org.automation.opencart.pages.common;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/14/16.
 * todo => get all the link locators
 */
public class HeaderArea extends PageBase {


    @FindBy(css = "#logo a")
    
    private WebElement opencartLogo;

    @FindBy(css = "a[title='Checkout']")
    
    public WebElement checkoutLink;
    @FindBy(css = "a[title='Shopping Cart']")
    
    public WebElement shoppingCartLink;

    public WebElement Link;
    public WebElement siteMapLink;
    public WebElement brandsLink;
    public WebElement giftVoucersLink;
    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=affiliate/account']")
    
    public WebElement affiliatesLink;
    public WebElement specialsLink;
    @FindBy(css = ".account-login div:nth-of-type(2) ul.breadcrumb li:nth-of-type(2) a")
    
    public WebElement myAccountLink;
    public WebElement orderHistoryLink;

    @FindBy(id = "wishlist-total")
    
    public WebElement wishList0Link;
    public WebElement newsLetterLink;

    @FindBy(name = "USD")
    
    private WebElement usd;

    @FindBy(name = "EUR")
    
    private WebElement euro;

    @FindBy(css = "button.btn.btn-link.dropdown-toggle")
    
    private WebElement currency;


    @FindBy(name = "search")
    
    private WebElement yourShoppingCartIsEmpty;


    
}
