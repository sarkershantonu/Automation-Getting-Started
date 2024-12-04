package org.automation.core;

import com.codeborne.selenide.*;
import org.openqa.selenium.MutableCapabilities;

public class WebGoatConfig implements Config {
    public final String BASE_URL="http://127.0.0.1:8080";

    @Override
    public String browser() {
        return "";
    }

    @Override
    public boolean headless() {
        return false;
    }

    @Override
    public String remote() {
        return "";
    }

    @Override
    public String browserSize() {
        return "";
    }

    @Override
    public String browserVersion() {
        return "";
    }

    @Override
    public String browserPosition() {
        return "";
    }

    @Override
    public boolean webdriverLogsEnabled() {
        return false;
    }

    @Override
    public String browserBinary() {
        return "";
    }

    @Override
    public String pageLoadStrategy() {
        return "";
    }

    @Override
    public long pageLoadTimeout() {
        return 0;
    }

    @Override
    public MutableCapabilities browserCapabilities() {
        return null;
    }

    @Override
    public String baseUrl() {
        return "";
    }

    @Override
    public long timeout() {
        return 0;
    }

    @Override
    public long pollingInterval() {
        return 0;
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
        return "";
    }

    @Override
    public String downloadsFolder() {
        return "";
    }

    @Override
    public String reportsUrl() {
        return "";
    }

    @Override
    public boolean fastSetValue() {
        return false;
    }

    @Override
    public TextCheck textCheck() {
        return null;
    }

    @Override
    public SelectorMode selectorMode() {
        return null;
    }

    @Override
    public AssertionMode assertionMode() {
        return null;
    }

    @Override
    public FileDownloadMode fileDownload() {
        return null;
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
