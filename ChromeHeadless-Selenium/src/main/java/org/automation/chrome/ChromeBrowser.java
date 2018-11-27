package org.automation.chrome;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.automation.chrome.ChromeArguments.*;

public class ChromeBrowser {


    public static ChromeOptions setBinary(ChromeOptions options, final String path) {
        options.setBinary(path);//"/usr/bin/google-chrome"
        return options;
    }

    public static ChromeOptions setHeadless(ChromeOptions options) {
        options.setHeadless(true);

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
        options = setBinary(options, System.getProperty("linux.chrome.bin"));
        options = setHeadless(options);
        options = acceptsCertificates(options);
        options.addArguments(stable_release_mode);
        options.addArguments(disable_gpu);

        return options;
    }
     public static DesiredCapabilities getDesiredCapabilities() {
	     DesiredCapabilities capabilities = DesiredCapabilities.chrome();
          	ChromeOptions options = new ChromeOptions();
         	options.addArguments("--headless");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);         
          return capabilities;
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

    public static DesiredCapabilities getChromeCapabilities() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        ChromeOptions options = getHeadlessOptions();

        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setPlatform(Platform.LINUX);

        return capabilities;
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
