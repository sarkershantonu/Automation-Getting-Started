package org.pages;

import lombok.Getter;
import org.automation.PageBase;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 5/16/16.
 */
public class HomePage extends PageBase {
    public HomePage(WebDriver aDriver) {
        super(aDriver);
        search = new SearchPanel(driver);
    }

    private @Getter SearchPanel search;
}
