package org.automation.webtest.pages.singlepages;


import org.automation.webtest.pages.PageBase;
import org.openqa.selenium.WebDriver;


public class AlcoholRestriction extends PageBase {
    public int timeout = 15;

    public AlcoholRestriction() {
        super();
        initStaticItems();
    }

    public AlcoholRestriction(WebDriver driver) {
        super(driver);
        initStaticItems();
    }

    @Override
    public void initStaticItems() {
        super.initStaticItems();
        this.title = "Alcohol Restriction";
    }
}
