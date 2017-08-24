package org.automation.opencart.pages;

import org.automation.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by shantonu on 4/3/17.
 */
public class LoginPage extends PageBase {
    private final String pageUrl = "/index.php?route=account/login";
    public LoginPage(WebDriver aDriver) {
        super(aDriver);
    }
    public PageBase submit() {
        clickLoginButton();

        PageFactory.initElements(driver, this);
        return this;
    }
    @FindBy(id = "input-email")
    @CacheLookup
    private WebElement emailAddress;
    @FindBy(id = "input-password")
    @CacheLookup
    private WebElement password;
    private void clickLoginButton() {
    }
    public LoginPage fill() {

        return this;
    }
}
