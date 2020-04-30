package com.opencart.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 4/3/17.
 */
public class LoginOpenCartPage extends OpenCartPageBase {
    private final String pageUrl = "/index.php?route=account/login";

    @FindBy(id = "input-email")
    @CacheLookup
    private WebElement emailAddress;
    @FindBy(id = "input-password")
    @CacheLookup
    private WebElement password;
    private void clickLoginButton() {
    }
    public LoginOpenCartPage fill() {

        return this;
    }
}
