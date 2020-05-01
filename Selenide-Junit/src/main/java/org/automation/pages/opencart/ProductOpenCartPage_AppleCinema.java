package com.opencart.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shantonu on 12/14/16.
 * Contributors will add all items
 * todo :
 * See http://demo.opencart.com/index.php?route=product/product&path=20&product_id=42
 * Fillup all findby in all web elements
 * parse the source and get those links
 * complete the write a review function.
 */
public class ProductOpenCartPage_AppleCinema extends OpenCartPageBase {


    @FindBy(how= How.LINK_TEXT, linkText = "Description")
    public WebElement description_link;

    public WebElement description_body;

    public WebElement specification_link;

    public WebElement specification_body;//choose item to validate

    public WebElement review_link;

    public WebElement wishList_link;
    public WebElement compare_link;
    public WebElement brand_link;
    public WebElement avaiability_text;
    public WebElement productCode_text;
    public WebElement productTitle_text;
    public WebElement productPrice;
    public WebElement productTax;
    public WebElement addToCart_button;
    public WebElement quantity_textbox;
    public WebElement continue_review_button;

    public WebElement options_radio;

    public WebElement options_checkboxes;
    //todo other items from right side

    public boolean writeAReview(String name, String review, int rating){

        return false;
    }



}
