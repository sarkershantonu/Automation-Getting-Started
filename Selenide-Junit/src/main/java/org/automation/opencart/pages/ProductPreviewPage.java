package org.automation.opencart.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/14/16.
 */
// this will be on the fly item creation.. so all item will be dynamic.. need to make a dom parser.
public class ProductPreviewPage extends PageBase {
    public WebElement tile;
    public WebElement description;
    public WebElement price;
    public WebElement tax;


    public void clickCompareProductLinik(){

    }

    public void clickwishlist(){

    }
    @FindBy(xpath = "")
    public WebElement imageOfProduct;

    @FindBy(xpath = "")
    public WebElement title_text;


    @FindBy(xpath = "")
    public WebElement addTocart_button;

    @FindBy(xpath = "")
    public WebElement wishlist_button;


    public ProductPreviewPage(WebDriver aDriver) {
        super(aDriver);
    }
    public void takeScreenshotOfPage(){}
}
