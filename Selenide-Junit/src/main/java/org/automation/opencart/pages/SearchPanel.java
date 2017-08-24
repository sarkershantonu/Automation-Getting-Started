package org.automation.opencart.pages;


import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 5/17/16.
 * todo item added for all locators
 */
public class SearchPanel extends PageBase {

    @FindBy(xpath = "//div[@id='search']/input")
    public WebElement textBox ;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
    public WebElement button;

    public SearchPanel(WebDriver aDriver) {
        super(aDriver);
    }


    @FindBy(xpath = "")
    public WebElement searchResult_text;

    @FindBy(xpath = "")
    public WebElement searchCriteria_text;

    @FindBy(xpath = "")
    public WebElement serchKeywordTextBox;

    @FindBy(xpath = "")
    public WebElement calatagoryCombo;

    @FindBy(xpath = "")
    public WebElement searchInSub_checkBox;

    @FindBy(xpath = "")
    public WebElement searchInDescription_checkBox;

    @FindBy(xpath = "")
    public WebElement searchButton;

    @FindBy(xpath = "")
    public WebElement searchResult_title_text;

    @FindBy(xpath = "")
    public WebElement sortBy_text;

    @FindBy(xpath = "")
    public WebElement sortByCombo;

    @FindBy(xpath = "")
    public WebElement show_text;

    @FindBy(xpath = "")
    public WebElement showCombo;

    @FindBy(xpath = "")
    public WebElement productCompare_text;

    @FindBy(xpath = "")
    public WebElement productThumbrnelbutton_grid;

    @FindBy(xpath = "")
    public WebElement getProductThumbrnelbutton_list;

    @FindBy(xpath = "")
    public WebElement resultThumbnail_2;

    @FindBy(xpath = "")
    public WebElement resultThumbnail_3;
    @FindBy(xpath = "")
    public WebElement resultThumbnail_4;
    @FindBy(xpath = "")
    public WebElement resultThumbnail_1;

}
