package org.automation.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.automation.pages.opencart.HomePage;
import org.automation.pages.opencart.SearchPanel;
import org.automation.pages.opencart.SearchResultPage;
import org.junit.Assert;

/**
 * Created by shantonu on 9/12/16.
 */
public class SearchingSteps extends ScenarioSteps {
    HomePage homePage;
    SearchResultPage resultPage;
    SearchPanel search;

    @Step
    public void openHomePage(String expectedTitle) {
        homePage.open();
        Assert.assertEquals(expectedTitle, homePage.getTitle());
    }

    @Step
    public void search(String serchKey) {
        search.textBox.clear();
        search.textBox.sendKeys(serchKey);
        search.button.click();
        Assert.assertEquals("Search - "+serchKey,homePage.getTitle());
    }
}
