package org.pages;

import org.automation.CompletePage;
import org.automation.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by shantonu on 6/4/16.
 */
public class SearchResultPage extends PageBase implements CompletePage{
    public SearchResultPage(WebDriver aDriver) {
        super(aDriver);
    }
    @FindBy(xpath = ".//*[@id='content']/p[2]")
    public WebElement invalid_search_result_message;

    public PageBase load() {
        driver.get(getUrl());
        return this;
    }
}
