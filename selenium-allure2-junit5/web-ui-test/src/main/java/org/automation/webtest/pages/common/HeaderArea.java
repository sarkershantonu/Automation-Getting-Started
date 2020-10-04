package org.automation.webtest.pages.common;


import org.automation.webtest.actions.CommonActions;
import org.automation.webtest.pages.popups.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class HeaderArea extends CommonActions {

    public SignInPopup signInPopup;
    public CreateAccountPopup createAccountPopup;
    public YourAccountPopup yourAccountPopup;
    public CartPopup cartPopup;
    public ContactUsPopup contactUsPopup;
    public CreateAccountSuccessPopup createAccountSuccessPopup;

    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;

    @FindBy(xpath = "//div[contains(@class, 'globalnav_top')]/descendant::a[@href='/index.jsp?serviceType=HOME']")
    public WebElement link_freshDirectLogo;

    @FindBy(id = "locabar_user_trigger")
    public WebElement link_signIn;

    @FindBy(xpath = "//div[@class='popupcontentoverlay'][position()=3]")
    public WebElement lnk_signInBlocker;

    @FindBy(id = "topSearchField")
    public WebElement input_search;

    @FindBy(id = "topInputFindButton_fdx")
    public WebElement btn_searchButton;

    @FindBy(id = "topnavitem_signup")
    public WebElement btn_createAccount;

    @FindBy(css = "#topnavitem_chat a")
    public WebElement link_contactUsInHeader;

    @FindBy(css = "#topnavitem_help a")
    public WebElement link_helpInHeader;

    @FindBy(id = "locabar_addresses_trigger")
    public  WebElement hover_deliveryTimes;

    @FindBy(id = "locabar_addresses")
    public WebElement deliveryAddressOverlay;

    @FindBy(xpath = "//div[@id='locabar_popupcart_trigger']/parent::div")
    public WebElement hover_cart;

    @FindBy(id = "popupcart")
    public  WebElement cartPopup_element;

    @FindBy(xpath = "//div[@id='locabar_user_trigger']/descendant::div[@class='locabar-user-action']/strong")
    public  WebElement loggedInVerificationText;

    @FindBy(css = "div#topnavitem_reorder a")
    public WebElement btn_reOrder;

    @FindBy(id = "ui-id-6")
    public WebElement searchSuggestionPopup;


    @FindBy(xpath = "//li[@class='ui-menu-item']/div[contains(@id, 'ui-id-')]")
    public List<WebElement> searchSuggestionList;

    @FindBy(xpath = "//a[@id='popup_cart']/descendant::div[@class='locabar-circle-cont locabar-popupcart-count']")
    public WebElement cartItemsCount;

    @FindBy(xpath = "//a[@id='popup_cart']/descendant::div[@class='locabar-popupcart-total']")
    public WebElement cartItemsTotal;


    public HeaderArea(WebDriver driver) {
        this.driver = driver;

        signInPopup = new SignInPopup(driver);
        initElement(driver, signInPopup);
        createAccountPopup = new CreateAccountPopup(driver);
        initElement(driver, createAccountPopup);
        yourAccountPopup = new YourAccountPopup(driver);
        initElement(driver, yourAccountPopup);
        cartPopup = new CartPopup(driver);
        initElement(driver, cartPopup);
        contactUsPopup = new ContactUsPopup(driver);
        initElement(driver, contactUsPopup);
        createAccountSuccessPopup = new CreateAccountSuccessPopup(driver);
    }

    private HeaderArea(){}

    public void initHeader(HeaderArea headerArea){
        initElement(driver, headerArea);
    }

}
