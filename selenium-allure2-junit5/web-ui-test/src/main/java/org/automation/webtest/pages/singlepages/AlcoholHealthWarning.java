package org.automation.webtest.pages.singlepages;

import org.automation.webtest.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AlcoholHealthWarning extends PageBase {
    public int timeout = 15;

    @FindBy(xpath = "//div[@class='fdwine-continue']/descendant::button[text()='I agree, continue']")
    @CacheLookup
    public WebElement btn_iAgreeContinue;

    public AlcoholHealthWarning() {
        super();
        initStaticItems();
    }

    public AlcoholHealthWarning(WebDriver driver) {
        super(driver);
        initStaticItems();
    }

    @Override
    public void initStaticItems() {
        super.initStaticItems();
        this.title = "FreshDirect - Alcohol Information";
        this.pageLoadedText = "You must be over 21 years of age to purchase alcoholic beverages.";
    }
}
