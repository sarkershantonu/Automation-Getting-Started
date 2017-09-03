package org.automation.validation;

import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

/**
 * Created by shantonu on 9/3/17.
 */
public class validator {

    public static void linkValidator(By by, String title){
        $(by).click();
        Assert.assertEquals(title, title());
    }
}
