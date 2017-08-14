package org.automation.opencart;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by shantonu on 8/14/17.
 */
public class Searching {

    @Test
    public void search_AnItem(){
        open("http://demo.opencart.com");
        $(By.xpath("//div[@id='search']/input")).val("ipod").pressEnter();
        $(By.xpath("//div[@id='search']/span/button")).click();

    }
}
