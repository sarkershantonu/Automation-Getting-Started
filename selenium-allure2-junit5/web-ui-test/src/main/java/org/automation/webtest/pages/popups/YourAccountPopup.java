package org.automation.webtest.pages.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class YourAccountPopup extends PopupBase{

    public int timeout = 15;

    @FindBy(id = "locabar_user")
    @CacheLookup
    public WebElement yourFreshDirectPopup;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::a[contains(text(), 'Sign out')]")
    @CacheLookup
    public WebElement btn_signOut;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='View Timeslots']")
    @CacheLookup
    public WebElement lnk_viewTimeSlots;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Your Top Items']")
    @CacheLookup
    public WebElement lnk_yourTopItems;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Shop Past Orders']")
    @CacheLookup
    public WebElement lnk_shopPastOrders;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='DeliveryPass']")
    @CacheLookup
    public WebElement lnk_deliveryPass;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Shopping Lists']")
    @CacheLookup
    public WebElement lnk_shoppingList;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Delivery Info']")
    @CacheLookup
    public WebElement lnk_deliveryInfo;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Help']")
    @CacheLookup
    public WebElement lnk_help;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Account Preferences']")
    @CacheLookup
    public WebElement lnk_accountPreferences;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Delivery Addresses']")
    @CacheLookup
    public WebElement lnk_deliveryAddresses;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Payment Methods']")
    @CacheLookup
    public WebElement lnk_paymentMethods;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Order History']")
    @CacheLookup
    public WebElement lnk_orderHistory;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Store Credits']")
    @CacheLookup
    public WebElement lnk_storeCredits;

    @FindBy(xpath = "//div[@id='locabar_user']/descendant::div[@class='section-line']/a[text()='Gift Card Balance']")
    @CacheLookup
    public WebElement lnk_giftCards;

    public YourAccountPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initYourAccountPopup(){
        initElement(driver,this);
    }

}
