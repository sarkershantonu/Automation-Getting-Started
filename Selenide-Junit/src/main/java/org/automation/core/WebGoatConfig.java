package org.automation.core;

import com.codeborne.selenide.SelenideConfig;

public class WebGoatConfig  {
    private SelenideConfig config;
    public static final String BASE_URL = "http://127.0.0.1:8080";

    public WebGoatConfig() {
       config = new SelenideConfig();
       config.baseUrl(BASE_URL);
    }
}