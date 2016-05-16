package org.automation;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.pages.HomePage;

/**
 * Created by shantonu on 5/6/16.
 */

/**
 * TOdo
 */
public class SearchStepDefination {
    private WebDriver driver;
    private HomePage home;

    @BeforeClass
    public static void init(){

    }

    @Given("^I open (.+) browser$")
    public void i_open_firefox_browser(String nameOfBrowser) throws Throwable {
       driver = Browser.getInstance(nameOfBrowser);
    }

    @When("^I type (.+) and press enter$")
    public void i_type_http_demo_opencart_com_and_press_enter(String url) throws Throwable {
        home = new HomePage(driver);
        home.setUrl(url);
       home.load();
    }

    @Then("^I can see page loaded with title \"([^\"]*)\"$")
    public void i_can_see_page_loaded_with_title(String arg1) throws Throwable {
        Assert.assertEquals(arg1,home.getTitle());
    }

    @Then("^I type (.+) in search box  And I click search button$")
    public void i_type_in_Iphone_in_search_box_And_I_click_search_button(String word) throws Throwable {

        home.getSearchPanel().searchTextBox.clear();
        home.getSearchPanel().searchTextBox.sendKeys(word);
        home.getSearchPanel().getSearchButton().click();

    }

    @Then("^I can see search results with title \"([^\"]*)\"$")
    public void i_can_see_search_results_with_title(String arg1) throws Throwable {
        Assert.assertEquals(arg1, home.getTitle());
    }
    @Then("^I quit browser$")
    public void i_quit_browser() throws Throwable {
        driver.close();
    }
}
