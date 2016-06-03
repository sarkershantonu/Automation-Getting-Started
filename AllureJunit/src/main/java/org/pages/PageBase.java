package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shantonu on 3/12/16.
 */
public abstract class PageBase {
    protected WebDriver driver = null;

    private PageBase(){}
    public PageBase(WebDriver aDriver){
        this.driver=aDriver;
        init();
    }
    protected void init(){
        PageFactory.initElements(driver, this);
    }
    public String getTitle(){
        return driver.getTitle();
    }

}
