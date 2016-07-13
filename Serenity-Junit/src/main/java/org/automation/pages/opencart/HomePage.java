package org.automation.pages.opencart;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by shantonu on 5/16/16.
 */
@DefaultUrl("https://demo.opencart.com")
public class HomePage extends PageObject {

    @FindBy(xpath = "//div[@id='search']/input")
    public WebElementFacade searchText;

    @FindBy(xpath = "//div[@id='search']/span/button")//property loading or after parsing or static
    public WebElementFacade searchButton;

    public void typeItemForSearch(String keyWord){
        searchText.type(keyWord);

    }
    private void search(){
        searchButton.click();
    }
}
