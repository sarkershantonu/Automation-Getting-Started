package org.automation.pages.webgoat;

import org.automation.core.WebGoatConfig;
import org.automation.pages.PageBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends PageBase {
    public static String path ="/WebGoat/login";

    public LoginPage load(){
        open(new WebGoatConfig());
        return this;
    }

}
