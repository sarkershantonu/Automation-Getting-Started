package org.automation.webtest.tests.features;


import org.automation.webtest.config.PropertyLoader;
import org.automation.webtest.core.TestBase;
import org.automation.webtest.pages.Home;
import org.automation.webtest.steps.HeaderAreaSteps;
import org.automation.webtest.steps.pages.HomePageSteps;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

import javax.naming.directory.SearchResult;


public class SearchTests extends TestBase {

    Home homePage = new Home(browser);
    HomePageSteps home = new HomePageSteps(homePage);
    private HeaderAreaSteps headerArea = new HeaderAreaSteps(homePage.headerArea);
    private SearchResult searchResultPage = new SearchResult(homePage.driver);
    private SearchResultSteps searchResult = new SearchResultSteps(searchResultPage);

    @Before
    public void initTest() throws InterruptedException {
        home.navigateToHomePage();
    }

    @Test
    @Title("Search a valid product name")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Search")
    @Stories("Search")
    public void searchValidProductName() {
        headerArea.typeProductNameInSearchField(PropertyLoader.getValue("search.validProductName"));
        headerArea.clickOnSearchButton();
        searchResult.searchPageHasSearchResultPatternforValidName(PropertyLoader.getValue("search.validProductName"));
        searchResult.isResultGridAvailable();

    }

    @Test
    @Title("Did you mean? search result.")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Search")
    @Stories("Search")
    public void searchSuggestiveProductName() {
        headerArea.typeProductNameInSearchField(PropertyLoader.getValue("search.suggestiveSearchProductName"));
        headerArea.clickOnSearchButton();
        searchResult.searchResultSuggestionMessage(PropertyLoader.getValue("search.suggestiveSearchProductName"));
        searchResult.searchPageHasSearchResultPatternforIncompleteName();
        searchResult.isResultGridAvailable();
    }

    @Test
    @Title("Invalid product name search result message")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Search")
    @Stories("Search")
    public void searchInvalidProductName() {
        headerArea.typeProductNameInSearchField(PropertyLoader.getValue("search.invalidProductName"));
        headerArea.clickOnSearchButton();
        searchResult.searchResultInvalidMessage();
    }

    @Test
    @Title("Search suggestion popup available")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Search")
    @Stories("Search")
    public void searchSuggestionPopupAvailable() {
        headerArea.typeProductNameInSearchField(PropertyLoader.getValue("search.incompleteProductName"));
        holdExecution(750);
        headerArea.searchSuggestionPopupDisplayed();
        headerArea.searchSuggestionPopupEnabled();
        headerArea.isSuggestedProductListAvailable();
    }

    //@Test
    @Title("Search works for suggested search")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Search")
    @Stories("Search")
    public void searchWorksForSuggestedSearch() {
        headerArea.typeProductNameInSearchField(PropertyLoader.getValue("search.incompleteProductName"));
        holdExecution(1000);
        String itemClicked = headerArea.clickOnAnItemNameFromSuggestion();
        searchResult.searchPageHasSearchResultPatternforValidName(itemClicked);
        holdExecution(10000);
    }

    @Test
    @Title("Search works for suggested search with Keyboard")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Search")
    @Stories("Search")
    public void searchWorksForSuggestedSearchWithKeyboard() {
        headerArea.typeProductNameInSearchField(PropertyLoader.getValue("search.incompleteProductName"));
        holdExecution();
        String itemClicked = headerArea.clickDownArrowKeyToBrowsSuggestList();
        searchResult.searchPageHasSearchResultPatternforValidName(itemClicked);
    }

    @Test
    @Title("Reverse circular search suggestion")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Search")
    @Stories("Search")
    public void reverseCircularSearchSuggestionWithKeyboard() {
        headerArea.typeProductNameInSearchField(PropertyLoader.getValue("search.incompleteProductName"));
        holdExecution();
        String lastProductNameOnList =  headerArea.clickUpArrowKeyToBrowsSuggestList();
        holdExecution(250);
        headerArea.verifyTextInSearchInputField(lastProductNameOnList);
    }
}
