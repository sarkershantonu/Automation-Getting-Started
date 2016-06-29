package org.automation.pages.opencart;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

/**
 * Created by shantonu on 6/4/16.
 */
public class SearchResultPage extends PageObject {

    @FindBy(xpath = ".//*[@id='content']/p[2]")
    public WebElementFacade invalid_search_result_message;
}
