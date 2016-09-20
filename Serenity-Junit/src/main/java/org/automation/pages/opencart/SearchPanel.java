package org.automation.pages.opencart;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shantonu on 5/17/16.
 */
public class SearchPanel extends PageObject {
protected static Logger logger = LoggerFactory.getLogger(PaginationPage.class);
    @FindBy(xpath = "//div[@id='search']/input")
    public WebElementFacade textBox ;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
    public WebElementFacade button;

    public SearchPanel(WebDriver aDriver) {// no need this
        super(aDriver);
    }
}
