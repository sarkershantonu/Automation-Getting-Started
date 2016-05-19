package org.pages;

import org.automation.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 5/17/16.
 */
public class SearchPanel extends PageBase {
    @FindBy(xpath = "//div[@id='search']/input")
   public WebElement textBox ;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
   public WebElement button;

    public SearchPanel(WebDriver aDriver) {
        super(aDriver);
    }
}
