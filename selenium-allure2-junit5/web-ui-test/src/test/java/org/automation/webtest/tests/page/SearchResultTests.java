package org.automation.webtest.tests.page;

import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.SearchResult;
import com.freshdirect.testing.steps.pages.SearchResultSteps;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by: Arafat Mamun
 * User Name: amamun
 * Email: arafatmamun@hotmail.com
 * Date: 3/6/2019
 * Time: 11:52 AM
 */

@Ignore("No Test written yet")
public class SearchResultTests extends TestBase {
    private SearchResult searchResultPage;
    private SearchResultSteps searchResult;

    @Before
    public void initTest() throws InterruptedException {
        searchResultPage = new SearchResult(browser);
        searchResult = new SearchResultSteps(searchResultPage);
    }

    @Ignore("not implemented yet")
    @Test
    @Title("Clicking on product tile takes user to product details page")
    @Severity(SeverityLevel.NORMAL)
    @Features("Search Result")
    @Stories("Search")
    public void clickingOnProductTile() {
        //todo
    }
}
