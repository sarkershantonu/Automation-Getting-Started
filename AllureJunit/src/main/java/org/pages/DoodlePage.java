package org.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 3/12/16.
 */
public class DoodlePage extends PageBase{
    @Override
    protected String getUrl() {
        return "https://www.google.com/doodles";
    }
    public DoodlePage(WebDriver driver){
        this.driver = driver;
    }
}
