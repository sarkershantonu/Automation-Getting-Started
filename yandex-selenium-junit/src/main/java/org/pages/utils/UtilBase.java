package org.pages.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * This is mother of all utils
 * Must wired with driver
 * Static method only contains global items, except that all are actually object items.
 * All utils keeping this as base are contextualized on page.
 */
public abstract class UtilBase {

    protected WebDriver driver = null;
    protected JavascriptExecutor executor ;

    public UtilBase(WebDriver aDriver){
        this.driver = aDriver;

    }
}
