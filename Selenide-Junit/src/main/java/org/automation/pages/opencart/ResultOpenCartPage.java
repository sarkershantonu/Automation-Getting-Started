package org.automation.pages.opencart;


import org.automation.pages.opencart.core.OpenCartPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 6/4/16.
 */
public class ResultOpenCartPage extends OpenCartPageBase {

    @FindBy(xpath = ".//*[@id='content']/p[2]")
    public WebElement invalid_search_result_message;


}
