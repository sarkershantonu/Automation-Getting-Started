package org.selenium;

import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 3/12/16.
 */
public abstract class PageBase {
    protected WebDriver driver = null;
    protected PageBase openPage() {
        driver.get(getUrl());
        return this;
    }
    public String getTitle(){

        return driver.getTitle();
    }
    protected abstract String getUrl();
}
