package org.automation;



import cucumber.api.java.en.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.SystemClock;
import org.pages.HomePage;
import org.pages.SearchResultPage;
/**
 * Created by shantonu on 5/6/16.
 */

/**
 * TOdo
 */
public class SearchStepDefination {
    private WebDriver driver;
    private HomePage home;
    private SearchResultPage resultPage;
    private long start, end;

    @BeforeClass
    public static void init(){

    }

    @After
    public void finish(){

        System.out.println("I was called ");
    }
    @Given("^I open (.+) browser$")
    public void i_open_browser(String nameOfBrowser) throws Throwable {
       driver = Browser.getInstance(nameOfBrowser);
    }

    @When("^I type (.+) and press enter$")
    public void i_type_http_demo_opencart_com_and_press_enter(String url) throws Throwable {
        home = new HomePage(driver);
        //home.setUrl(url); =>
        start = System.currentTimeMillis();
        home.open(url);
    }

    @Then("^I can see page loaded with title \"([^\"]*)\"$")
    public void i_can_see_page_loaded_with_title(String arg1) throws Throwable {
        Assert.assertEquals(arg1,home.getTitle());
    }

    @Then("^I can see invalid search title with \"([^\"]*)\" and message \"([^\"]*)\"$")
    public void i_can_see_invalid_search_title_with_and_message(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1,resultPage.getTitle());
        Assert.assertEquals(arg2, resultPage.invalid_search_result_message.getText());
        end= System.currentTimeMillis();
    }

    @Then("^I can see search results with title \"([^\"]*)\"$")
    public void i_can_see_search_results_with_title(String arg1) throws Throwable {
        Assert.assertEquals(arg1,resultPage.getTitle());
        end= System.currentTimeMillis();
    }
/* => this only takes a word
    @And("^I type (.+) in search box And I click search button$")
    public void i_type_in_Iphone_in_search_box_And_I_click_search_button(String word) throws Throwable {
        home.search.textBox.clear();
        home.search.textBox.sendKeys(word);
        home.search.button.click();
        resultPage = new SearchResultPage(driver);
    }
*/
    @And("^I type \"([^\"]*)\" in search box And I click search button$")
    public void i_type_in_Iphone_in_search_box_And_I_click_search(String word) throws Throwable {

        home.search.textBox.clear();
        home.search.textBox.sendKeys(word);
        home.search.button.click();
        resultPage = new SearchResultPage(driver);
    }



    @And("^I can see the search should not take more than (\\d+) second$")
    public void i_can_see_the_search_should_not_take_more_than_second(int arg1) throws Throwable {
        Assert.assertTrue((end-start)<(arg1*1000));
    }

    @Then("^I quit browser$")
    public void i_quit_browser() throws Throwable {
        ScreenshotUtil.takeFullScreen("endingtests"+System.currentTimeMillis(),driver);
        Browser.close();
    }
}
