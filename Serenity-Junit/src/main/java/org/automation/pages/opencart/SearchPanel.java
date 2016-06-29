package org.automation.pages.opencart;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;



/**
 * Created by shantonu on 5/17/16.
 */
public class SearchPanel extends PageObject  {

    @FindBy(xpath = "//div[@id='search']/input")
    public WebElementFacade textBox ;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
    public WebElementFacade button;

    /*public SearchPanel(WebDriver aDriver) {
        super(aDriver);
    }*/
}
