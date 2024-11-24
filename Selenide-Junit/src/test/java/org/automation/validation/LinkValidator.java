package org.automation.validation;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class LinkValidator {
    private final String css;

    public LinkValidator(String css) {
        this.css = css;
    }
    public boolean isTitle(final String expectedTitleText){
        $(By.cssSelector(this.css)).click();
        return expectedTitleText.equals(title());
    }
}
