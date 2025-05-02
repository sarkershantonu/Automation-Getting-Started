package org.automation.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class DummyTest {

    @Test
    public void testMe(){
        open("http://demo.opencart.com");
        screenshot("InitialScreenshot");
        $(By.xpath("//div[@id='search']/input")).val("ipod").pressEnter();
        $(By.xpath("//div[@id='search']/span/button")).click();
        Assertions.assertFalse(true);
    }

}
