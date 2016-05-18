package org.pages;

import lombok.Getter;
import org.automation.PageBase;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 5/16/16.
 */
public class HomePage extends PageBase {
    private @Getter SearchPanel search;
    public HomePage(WebDriver aDriver) {
        super(aDriver);
        search = new SearchPanel(driver);
    }
}
