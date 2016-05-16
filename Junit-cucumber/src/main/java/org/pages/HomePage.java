package org.pages;

import lombok.Getter;
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
        searchPanel = new Search(driver);
    }

    private @Getter Search searchPanel;
}
