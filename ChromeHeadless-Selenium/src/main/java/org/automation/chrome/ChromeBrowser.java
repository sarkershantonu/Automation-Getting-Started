package org.automation.chrome;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.automation.chrome.ChromeArgConstants.*;

public class ChromeBrowser {


    public static ChromeOptions setBinary(ChromeOptions options, final String path) {
        options.setBinary(path);//"/usr/bin/google-chrome"
        return options;
    }

    // changed => https://www.selenium.dev/blog/2023/headless-is-going-away/#what-are-the-two-headless-modes
    public static ChromeOptions setHeadless(ChromeOptions options) {
        options.addArguments(ARG_PARAM+HEADLESS+"=new");
        return options;
    }

    public static ChromeOptions acceptsCertificates(ChromeOptions options) {
        options.setAcceptInsecureCerts(true);
        return options;
    }

    public static ChromeOptions enableDebugging(ChromeOptions options, final Long port) {
        options.addArguments(DEBUG + port);
        return options;
    }

    public static ChromeOptions setWindowSize(ChromeOptions options, final Dimension size) {
        options.addArguments(RESOLUTION + size.width + "x" + size.height);
        return options;
    }

    public static ChromeOptions setProxy(ChromeOptions options, Proxy aProxy) {
        options.setCapability("proxy", aProxy);
        return options;
    }

    public static ChromeOptions enableJSrepl(ChromeOptions options) {
        options.addArguments("repl");
        return options;
    }

    public static ChromeOptions getHeadlessOptions() {
        ChromeOptions options = new ChromeOptions();
        //options = setBinary(options, System.getProperty("linux.chrome.bin"));
        options = setHeadless(options);
        options = acceptsCertificates(options);
        options.addArguments(stable_release_mode);
        options.addArguments(disable_gpu);

        return options;
    }

    public static ChromeOptions getUIOptions() {
        ChromeOptions options = new ChromeOptions();
        options = setBinary(options, System.getProperty("linux.chrome.bin"));
        options = acceptsCertificates(options);
        options.addArguments(stable_release_mode);
        options.addArguments(show_fps_counter);
        options.addArguments(no_default_browser_check);
        options.addArguments(incognito);
        options.addArguments(enable_smooth_scrolling);
        options.addArguments(enable_logging);
        options.addArguments(dump_dom);
        options.addArguments(disable_suggestions_ui);
        options.addArguments(disable_single_click_autofill);
        options.addArguments(disable_default_apps);

        return options;
    }


    public static ChromeOptions setExperimentOptions(ChromeOptions options) {
        options.setExperimentalOption("", "");
        return options;
    }


    public static ChromeOptions setArguments(ChromeOptions options) {
        options.addArguments(HEADLESS, DISABLED_GPU, DEBUG);
        return options;
    }




    public static WebDriver getChrome() {
        ChromeOptions options = new ChromeOptions();
        options = setArguments(options);
        //options.addArguments("--no-sandbox");

        Map<String, String> env = new HashMap<String, String>();
        final ChromeDriverService service = new ChromeDriverService.Builder().
                usingAnyFreePort().
                withEnvironment(env).
                withSilent(true).withLogFile(new File(System.getProperty("chrome.log.path"))).build();

        return new ChromeDriver(service, options);

    }
}
