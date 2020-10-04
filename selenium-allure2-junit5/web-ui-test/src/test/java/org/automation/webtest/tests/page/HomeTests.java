package org.automation.webtest.tests.page;

import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.popups.CarouselViewAllPopupSteps;
import org.junit.Before;
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
 * Date: 3/4/2019
 * Time: 3:27 PM
 */

public class HomeTests extends TestBase {
    private Home homePage;
    private HomePageSteps home;

    @Before
    public void initTest() throws InterruptedException {
        homePage = new Home(browser);
        home = new HomePageSteps(homePage);
        home.navigateToHomePage();
    }

    @Test
    @Title("Great Cart Starts Carousel")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void greatCartStartCarouselCarousel(){
        home.greatCartStartsCarouselHeader();
        home.greatCartStartsCarouselBanner();
        home.greatCartStartsCarouselViewAllButtonIsDisplayed();
        home.greatCartStartsCarouselViewAllButtonIsEnabled();
        home.greatCartStartsCarouselProductTile();
        home.greatCartStartsCarouselPreviousButtonIsDisplayed();
        home.greatCartStartsCarouselPreviousButtonIsEnabled();
        home.greatCartStartsCarouselNextButtonIsDisplayed();
        home.greatCartStartsCarouselNextButtonIsEnabled();
        home.greatCartStartsCarouselHasTilesDisplayed();
    }

    @Test
    @Title("Great Cart Starts Carousel Next Button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void greatCartStartCarouselNextButton(){
        home.clickOnGreatCartStartsNextButton();
        holdExecution();
        home.greatCartStartsCarouselHasNextTilesDisplayed();
    }

    @Test
    @Title("Great Cart Starts Carousel Previous Button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void greatCartStartCarouselPreviousButton(){
        home.clickOnGreatCartStartsNextButton();
        home.clickOnGreatCartStartsNextButton();
        home.clickOnGreatCartStartsPreviousButton();
        home.greatCartStartsCarouselHasNextTilesDisplayed();
    }

    @Test
    @Title("Great Cart Starts View all button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void greatCartStartCarouselHeaderViewAllButton(){
        home.clickOnGreatCartStartsHeaderViewAllButton();
        CarouselViewAllPopupSteps carouselViewAllPopup =  new CarouselViewAllPopupSteps(homePage.carouselViewAllPopup);
        carouselViewAllPopup.carouselViewAllPopupDisplayed();
        carouselViewAllPopup.greatCartStartsCarouselViewAllPopupHeader();
        carouselViewAllPopup.greatCartStartsCarouselViewAllPopupBanner();
    }

    @Test
    @Title("Fresh Deals Carousel")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void freshDealsCarouselCarousel(){
        home.freshDealsCarouselHeader();
        home.freshDealsCarouselBanner();
        home.freshDealsCarouselViewAllButtonIsDisplayed();
        home.freshDealsCarouselViewAllButtonIsEnabled();
        home.freshDealsCarouselProductTile();
        home.freshDealsCarouselPreviousButtonIsDisplayed();
        home.freshDealsCarouselPreviousButtonIsEnabled();
        home.freshDealsCarouselNextButtonIsDisplayed();
        home.freshDealsCarouselNextButtonIsEnabled();
        home.freshDealsCarouselHasTilesDisplayed();
    }

    @Test
    @Title("Fresh Deals Carousel Next Button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void freshDealsCarouselNextButton(){
        home.clickOnFreshDealsNextButton();
        home.freshDealsCarouselHasNextTilesDisplayed();
    }

    /*
    this must have at least 8+ products in it
     */
    @Test
    @Title("Fresh Deals Carousel Previous Button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void freshDealsCarouselPreviousButton(){
        home.clickOnFreshDealsNextButton();
        home.clickOnFreshDealsNextButton();
        home.clickOnFreshDealsPreviousButton();
        home.freshDealsCarouselHasNextTilesDisplayed();
    }

    @Test
    @Title("Fresh Deals View all button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void freshDealsCarouselHeaderViewAllButton(){
        home.clickOnFreshDealsHeaderViewAllButton();
        CarouselViewAllPopupSteps carouselViewAllPopup =  new CarouselViewAllPopupSteps(homePage.carouselViewAllPopup);
        carouselViewAllPopup.carouselViewAllPopupDisplayed();
        carouselViewAllPopup.freshDealsCarouselViewAllPopupHeader();
        carouselViewAllPopup.freshDealsCarouselViewAllPopupBanner();
    }

    @Test
    @Title("Top Rated Produce Carousel")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void topRatedProduceCarouselCarousel(){
        home.topRatedProduceCarouselHeader();
        home.topRatedProduceCarouselViewAllButtonIsDisplayed();
        home.topRatedProduceCarouselViewAllButtonIsEnabled();
        home.topRatedProduceCarouselProductTile();
        home.topRatedProduceCarouselPreviousButtonIsDisplayed();
        home.topRatedProduceCarouselPreviousButtonIsEnabled();
        home.topRatedProduceCarouselNextButtonIsDisplayed();
        home.topRatedProduceCarouselNextButtonIsEnabled();
        home.topRatedProduceCarouselHasTilesDisplayed();
    }

    @Test
    @Title("Top Rated Produce Carousel Next Button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void topRatedProduceCarouselNextButton(){
        home.clickOnTopRatedProduceNextButton();
        home.topRatedProduceCarouselHasNextTilesDisplayed();
    }

    @Test
    @Title("Top Rated Produce Carousel Previous Button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void topRatedProduceCarouselPreviousButton(){
        home.clickOnTopRatedProduceNextButton();
        home.clickOnTopRatedProducePreviousButton();
        home.topRatedProduceCarouselHasCurrentTilesDisplayed();
    }

    @Test
    @Title("Top Rated Produce View all button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Home Page Carousel")
    @Stories("Home Page")
    public void topRatedProduceCarouselHeaderViewAllButton(){
        home.clickOnTopRatedProduceHeaderViewAllButton();
        CarouselViewAllPopupSteps carouselViewAllPopup =  new CarouselViewAllPopupSteps(homePage.carouselViewAllPopup);
        carouselViewAllPopup.carouselViewAllPopupDisplayed();
        carouselViewAllPopup.topRatedProduceCarouselViewAllPopupHeader();
    }
}
