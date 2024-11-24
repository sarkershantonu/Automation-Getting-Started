package org.automation.validation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

/**
 * Created by shantonu on 9/3/17.
 */
public class validator {

    public static void linkValidator(By by, String title){
        $(by).click();
        Assertions.assertEquals(title, title());
    }

    public static void link(By by, String title){
        $(by).click();
        Assertions.assertEquals(title, title());
    }
}
