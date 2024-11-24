package org.automation.tests.opencart;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import org.automation.core.TestBase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by shantonu on 8/14/17.
 */
@ExtendWith({ScreenShooterExtension.class})
public class Searching extends TestBase {
   @RegisterExtension
    public ScreenShooterExtension screenShooter =new ScreenShooterExtension(true).to("target/screenshots");

    @Test
    public void search_AnItem(){
        open("http://demo.opencart.com");
        screenshot("InitialScreenshot");
        $(By.xpath("//div[@id='search']/input")).val("ipod").pressEnter();
        $(By.xpath("//div[@id='search']/span/button")).click();
        Assertions.assertFalse(true);
    }
}

