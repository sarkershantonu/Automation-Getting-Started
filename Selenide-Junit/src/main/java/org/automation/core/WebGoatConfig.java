package org.automation.core;

import com.codeborne.selenide.*;
import org.openqa.selenium.MutableCapabilities;

import static com.codeborne.selenide.FileDownloadMode.HTTPGET;
import static com.codeborne.selenide.SelectorMode.CSS;
import static com.codeborne.selenide.TextCheck.PARTIAL_TEXT;

public class WebGoatConfig implements Config {
    public static final String BASE_URL="http://127.0.0.1:8080";

    @Override
    public String browser() {
        return "chrome";
    }

    @Override
    public boolean headless() {
        return false;
    }

    @Override
    public String remote() {
        return "No";
    }

    @Override
    public String browserSize() {
        return "1920x1080";
    }

    @Override
    public String browserVersion() {
        return "";//any
    }

    @Override
    public String browserPosition() {
        return "";//maximize
    }

    @Override
    public boolean webdriverLogsEnabled() {
        return false;
    }

    @Override
    public String browserBinary() {
        return "";//default
    }

    @Override
    public String pageLoadStrategy() {
        return "";
    }

    @Override
    public long pageLoadTimeout() {
        return 5;
    }

    @Override
    public MutableCapabilities browserCapabilities() {
        return null;
    }

    @Override
    public String baseUrl() {
        return "http://127.0.0.1:8080";
    }

    @Override
    public long timeout() {
        return 15;
    }

    @Override
    public long pollingInterval() {
        return 1;
    }

    @Override
    public boolean holdBrowserOpen() {
        return false;
    }

    @Override
    public boolean reopenBrowserOnFail() {
        return false;
    }

    @Override
    public boolean clickViaJs() {
        return false;
    }

    @Override
    public boolean screenshots() {
        return false;
    }

    @Override
    public boolean savePageSource() {
        return false;
    }

    @Override
    public String reportsFolder() {
        return "./reports";
    }

    @Override
    public String downloadsFolder() {
        return "./reports/downloads";
    }

    @Override
    public String reportsUrl() {
        return "./reports/html/";
    }

    @Override
    public boolean fastSetValue() {
        return false;
    }

    @Override
    public TextCheck textCheck() {
        return PARTIAL_TEXT;
    }

    @Override
    public SelectorMode selectorMode() {
        return CSS;
    }

    @Override
    public AssertionMode assertionMode() {
        return AssertionMode.SOFT;
    }

    @Override
    public FileDownloadMode fileDownload() {
        return HTTPGET;
    }

    @Override
    public boolean proxyEnabled() {
        return false;
    }

    @Override
    public String proxyHost() {
        return "";
    }

    @Override
    public int proxyPort() {
        return 0;
    }

    @Override
    public long remoteReadTimeout() {
        return 0;
    }

    @Override
    public long remoteConnectionTimeout() {
        return 0;
    }
}
