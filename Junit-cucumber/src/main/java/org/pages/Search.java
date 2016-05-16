package org.pages;

import lombok.Generated;
import lombok.Getter;
import org.automation.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 5/17/16.
 */
public class Search extends PageBase {
    @FindBy(xpath = "//div[@id='search']/input")
    public WebElement searchTextBox ;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
    private @Getter WebElement searchButton;

    public Search(WebDriver aDriver) {
        super(aDriver);
    }
}
