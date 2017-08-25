package org.automation.opencart.pages;


import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 6/4/16.
 */
public class ResultPage extends PageBase {

    @FindBy(xpath = ".//*[@id='content']/p[2]")
    public WebElement invalid_search_result_message;


}
