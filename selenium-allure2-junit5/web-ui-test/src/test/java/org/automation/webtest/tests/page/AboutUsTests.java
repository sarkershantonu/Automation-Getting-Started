package org.automation.webtest.tests.page;
/**
 * Author: Arafat Mamun
 * username: amamun@freshdirect.com
 * Email: arafatmamun@hotmail.com
 * Date: 2/8/2019
 * Time: 2:56 PM
 */

import com.freshdirect.testing.core.DriverWindow;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.*;
import com.freshdirect.testing.steps.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class AboutUsTests extends TestBase {

    private AboutUs aboutUsPage;
    private AboutUsSteps aboutUs;

    @Before
    public void initTest() throws InterruptedException {
        aboutUsPage = new AboutUs(browser);
        aboutUs = new AboutUsSteps(aboutUsPage);
        aboutUs.navigateToAboutUsPage();
    }

    @Test
    @Title("About Us page")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void aboutUsPage() {
        aboutUs.aboutUsPageTitle();
        aboutUs.aboutUsPageLoadedText();
    }

    @Test
    @Title("Careers At Fresh Direct link")
    @Severity(SeverityLevel.NORMAL)
    @Features("Career")
    @Stories("About Us")
    public void careersAtFreshDirectLink() {
        aboutUs.clickOnCareersAtFreshDirectLink();
        aboutUs.switchWindow(DriverWindow.SECOND, false);
        Career careerPage = new Career(browser);
        CareerSteps career = new CareerSteps(careerPage);
        career.careersTitle();
        career.careersLoadedText();
    }

    @Test
    @Title("Fresh Direct Mobile Apps link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void freshDirectMobileAppsLink() {
        aboutUs.clickOnFreshDirectMobileAppsLink();
        OurMobileApps ourMobileAppsPage = new OurMobileApps(browser);
        OurMobileAppsSteps ourMobileApps = new OurMobileAppsSteps(ourMobileAppsPage);
        ourMobileApps.ourMobileAppsPageTitle();
        ourMobileApps.ourMobileAppsPageLoadedText();
    }

    @Test
    @Title("About EBT at Fresh Direct link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void aboutEBTAtFreshDirectLink() {
        aboutUs.clickOnAboutEbtAtFreshDirectLink();
        AboutEBTAtFreshdirect aboutEBTAtFreshdirectPage = new AboutEBTAtFreshdirect(browser);
        AboutEBTAtFreshdirectSteps aboutEBTAtFreshdirect = new AboutEBTAtFreshdirectSteps(aboutEBTAtFreshdirectPage);
        aboutEBTAtFreshdirect.aboutEBTPageTitle();
        aboutEBTAtFreshdirect.aboutEBTPageLoadedText();
    }

    @Test
    @Title("Best Value Icon link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void bestValueIconLink() {
        aboutUs.clickOnBestValueIconLink();
        FreshDeals freshDealsPage = new FreshDeals(browser);
        FreshDealsSteps freshDeals = new FreshDealsSteps(freshDealsPage);
        freshDeals.freshDealsAppsPageTitle();
    }

    @Test
    @Title("Great Cart Starts link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void greatCartStartsLink() {
        aboutUs.clickOnGreatCartStartsLink();
        OurJustFavorites ourJustFavoritesPage = new OurJustFavorites(browser);
        OurJustFavoritesSteps ourJustFavorites = new OurJustFavoritesSteps(ourJustFavoritesPage);
        ourJustFavorites.ourJustFavoritesTitle();
        ourJustFavorites.ourJustFavoritesLoadedText();
    }

    @Test
    @Title("Kitchen Shorts Get Cooking Link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void getCookingLink(){
        aboutUs.clickOnKitchenShortcutsGetCooking();
        Meals mealsPage = new Meals(browser);
        MealsSteps meals = new MealsSteps(mealsPage);
        meals.mealsPageTitle();
        meals.mealsPageLoadedText();
    }

    @Test
    @Title("Join the Fresh Direct team link")
    @Severity(SeverityLevel.NORMAL)
    @Features("Career")
    @Stories("About Us")
    public void joinTheFreshDirectTeamLink() {
        aboutUs.clickOnJoinTheFreshDirectLink();
        aboutUs.switchWindow(DriverWindow.SECOND, false);
        Career careerPage = new Career(browser);
        CareerSteps career = new CareerSteps(careerPage);
        career.careersTitle();
        career.careersLoadedText();
    }

    @Test
    @Title("Feel the win what people love link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void feelTheWinWhatPeopleLoveLink() {
        aboutUs.clickOnFeelTheWinWhatPeopleLoveLink();
        aboutUs.switchWindow(DriverWindow.SECOND, false);
        WhatOurCustomersSaying whatOUrCustomersSayingPage = new WhatOurCustomersSaying(browser);
        WhatOurCustomersSayingSteps whatOUrCustomersSaying = new WhatOurCustomersSayingSteps(whatOUrCustomersSayingPage);
        whatOUrCustomersSaying.whatOurCustomersSayingPageTitle();
        whatOUrCustomersSaying.whatOurCustomersSayingPageLoadedText();
    }

    @Test
    @Title("Short supply chain link opens up blog page")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void shortSupplyLink() {
        aboutUs.clickOnShortSupplyChainLink();
        aboutUs.switchWindow(DriverWindow.SECOND, false);
        MeetTheFisherman meetTheFishermanPage = new MeetTheFisherman(browser);
        MeetTheFishermanSteps meetTheFisherman = new MeetTheFishermanSteps(meetTheFishermanPage);
        meetTheFisherman.meetTheFishermanPageTitle();
        meetTheFisherman.meetTheFishermanPageLoadedText();
    }

    @Test
    @Title("Short supply chain image opens up blog page")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void shortSupplyImage() {
        aboutUs.clickOnShortSupplyChainImage();
        aboutUs.switchWindow(DriverWindow.SECOND, false);
        MeetTheFisherman meetTheFishermanPage = new MeetTheFisherman(browser);
        MeetTheFishermanSteps meetTheFisherman = new MeetTheFishermanSteps(meetTheFishermanPage);
        meetTheFisherman.meetTheFishermanPageTitle();
        meetTheFisherman.meetTheFishermanPageLoadedText();
    }

    @Test
    @Title("If you are not happy, we're not happy image opens up help page")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About Us")
    public void ifYouAreNotHappyImage() {
        aboutUs.clickOnIfYouAreNotHappyImage();
        Help helpPage = new Help(browser);
        HelpPageSteps help = new HelpPageSteps(helpPage);
        help.helpPageTitle();
        help.helpPageLoadedText();
    }

    @After
    public void resetTest(){
        aboutUsPage.closeAllWindowsButFirst(browser);
    }
}
