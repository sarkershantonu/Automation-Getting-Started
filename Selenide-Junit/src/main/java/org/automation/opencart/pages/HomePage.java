package org.automation.opencart.pages;

import org.automation.core.CompletePage;
import org.automation.core.PageBase;
import org.automation.pages.common.FooterArea;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 5/16/16.
 */
public class HomePage extends PageBase implements CompletePage {
    public SearchPanel search;

    public FooterArea footer;
    public HomePage(WebDriver aDriver) {
        super(aDriver);
        search = new SearchPanel(driver);
        footer = new FooterArea(driver);
    }

    public HomePage open(String url){
        driver.get(url);
        return this;
    }

    public PageBase load() {
        driver.get(getUrl());
        return this;
    }
}
