package org.automation.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.automation.steps.SearchingSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 9/15/16.
 */
@RunWith(SerenityRunner.class)
public class TestOpenCart {
    @Managed(uniqueSession = true, clearCookies = ClearCookiesPolicy.Never)
    WebDriver driver;

    @Steps
    SearchingSteps search;

    @Test
    public void search_an_item(){
        search.openHomePage("Your Store");
        search.search("iphone");
    }

}
