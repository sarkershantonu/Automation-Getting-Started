package org.automation.pages.webgoat;

import com.codeborne.selenide.SelenideConfig;
import org.automation.core.WebGoatConfig;
import org.automation.pages.PageBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends PageBase {
    public static String path ="/WebGoat/login";

    public LoginPage load(){
        open(WebGoatConfig);
        open(WebGoatConfig.BASE_URL+path);
        return this;
    }

    public static void main(String[] args) {
        new LoginPage().load();
    }
}
