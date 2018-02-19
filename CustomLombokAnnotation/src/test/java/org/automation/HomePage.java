package org.automation;


import org.automation.annotations.Click;
import org.automation.annotations.Type;
import org.openqa.selenium.WebElement;

public class HomePage {


    @Click//this will create a method click_search_btn() which will invoke clicking
    public WebElement search_btn;

    @Type//this will create a method type_search_txt(CharacterSequence characters)
    public WebElement search_txt;
}
