package org.automation;

import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 5/6/16.
 */

/**
 * TOdo
 */
public class SearchStepDefination {

    @Given("^I open firefox browser$")
    public void i_open_firefox_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @When("^I type (.+) and press enter$")
    public void i_type_http_demo_opencart_com_and_press_enter(String url) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ;
    }

    @Then("^I can see page loaded with title \"([^\"]*)\"$")
    public void i_can_see_page_loaded_with_title(String arg1) throws Throwable {

    }

    @Then("^I type (.+) in search box  And I click search button$")
    public void i_type_in_Iphone_in_search_box_And_I_click_search_button(String word) throws Throwable {

    }

    @Then("^I can see search results with title \"([^\"]*)\"$")
    public void i_can_see_search_results_with_title(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ;
    }
    
}
