package org.automation.webtest.pages.singlepages;


import org.automation.webtest.pages.PageBase;
import org.automation.webtest.pages.popups.CreateNewOrPendingOrderPopup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ProductDetail extends PageBase {
    public int timeout = 15;
    public CreateNewOrPendingOrderPopup createNewOrPendingOrderPopup;

    @FindBy(xpath = "//nav[@class='leftnav']/descendant::div[@class='backbutton']/button")
    @CacheLookup
    public WebElement btn_leftNavBack;

    @FindBy(id = "pdp-description")
    @CacheLookup
    public WebElement link_description;

    @FindBy(id = "pdp-nutrition")
    @CacheLookup
    public WebElement link_nutrition;

    @FindBy(id = "pdp-allergens")
    @CacheLookup
    public WebElement link_allergens;

    @FindBy(id = "pdp-ingredients")
    @CacheLookup
    public WebElement link_ingredients;

    @FindBy(id = "pdp-recipes")
    @CacheLookup
    public WebElement link_recipes;

    @FindBy(id = "pdp-explanatory")
    @CacheLookup
    public WebElement link_explanatory;

    @FindBy(xpath = "//div[@class='pdp-productName']/h1[@class='pdpTitle']")
    @CacheLookup
    public WebElement productTitle;

    @FindBy(xpath = "//div[@class='pdp-productName']/div[contains(@class, 'transparent white icon-info2-before')]")
    @CacheLookup
    public WebElement icon_details;

    @FindBy(xpath = "//div[@class='prodDetail']/descendant::div[@class='pdp-price']")
    @CacheLookup
    public WebElement productPrice;

    @FindBy(xpath = "//div[@class='prodDetail']/descendant::div[@class='price-deal']")
    @CacheLookup
    public WebElement productPriceDeal;

    @FindBy(id = "pdpatc_qty")
    @CacheLookup
    public WebElement input_productQuantity;

    @FindBy(xpath = "//form[contains(@class,'pdp-productconfig')]/descendant::button[@data-component='quantitybox.dec']")
    @CacheLookup
    public WebElement btn_decrement;

    @FindBy(xpath = "//form[contains(@class,'pdp-productconfig')]/descendant::button[@data-component='quantitybox.inc']")
    @CacheLookup
    public WebElement btn_increment;

    @FindBy(xpath = "//form[contains(@class,'pdp-productconfig')]/descendant::div[@data-component='subtotal']")
    @CacheLookup
    public WebElement subTotal;

    @FindBy(xpath = "//form[contains(@class,'pdp-productconfig')]/descendant::button[@data-component='ATCButton']")
    @CacheLookup
    public WebElement btn_addToCart;

    @FindBy(id = "pdp-atc-addtolist")
    @CacheLookup
    public WebElement btn_addToList;

    public ProductDetail() {
        super();
        initStaticItems();
    }

    public ProductDetail(WebDriver driver) {
        super(driver);
        initStaticItems();
    }

    @Override
    public void initStaticItems() {
        super.initStaticItems();
        createNewOrPendingOrderPopup = new CreateNewOrPendingOrderPopup(driver);
        initElement(driver, createNewOrPendingOrderPopup);

    }

}
