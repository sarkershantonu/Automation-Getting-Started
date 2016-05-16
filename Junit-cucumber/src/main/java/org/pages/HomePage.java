package org.pages;

import org.automation.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 5/16/16.
 */
public class HomePage extends PageBase {
    public HomePage(WebDriver aDriver) {
        super(aDriver);
    }
    @FindBy(xpath = "")
    public WebElement searchTextBox;

    @FindBy(xpath = "")//property loading or after parsing or static
    public WebElement searchButton;


}
