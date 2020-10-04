package org.automation.webtest.tests.page;

import com.freshdirect.testing.core.DriverWindow;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.*;
import com.freshdirect.testing.pages.popups.ContactUsPopup;
import com.freshdirect.testing.pages.popups.CreateAccountPopup;
import com.freshdirect.testing.steps.FooterAreaSteps;
import com.freshdirect.testing.steps.pages.*;
import com.freshdirect.testing.steps.popups.ContactUsPopupSteps;
import com.freshdirect.testing.steps.popups.CreateAccountPopupSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by: Arafat Mamun
 * User Name: amamun
 * Email: arafatmamun@hotmail.com
 * Date: 2/11/2019
 * Time: 4:02 PM
 */
@Issue(value = "120")
public class FooterTests extends TestBase {
    private Home homePage;
    private HomePageSteps home;
    private FooterAreaSteps footerArea;

    @Before
    public void initTest() throws InterruptedException{
        homePage = new Home(browser);
        home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        footerArea = new FooterAreaSteps(homePage.footerArea);
    }

    @Test
    @Title("About Us page")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Links")
    @Stories("About Us")
    public void aboutUsPage() {
        footerArea.clickOnAboutUsFromFooter();
        holdExecution(250);
        AboutUs aboutUsPage = new AboutUs(browser);
        AboutUsSteps aboutUs = new AboutUsSteps(aboutUsPage);
        aboutUs.aboutUsPageTitle();
        aboutUs.aboutUsPageLoadedText();
    }

    @Test
    @Title("Fresh Direct Mobile Apps link")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Links")
    @Stories("About Us")
    public void freshDirectMobileAppsLink() {
        footerArea.clickOnOurMobileAppsFromFooter();
        holdExecution(750);
        OurMobileApps ourMobileAppsPage = new OurMobileApps(browser);
        OurMobileAppsSteps ourMobileApps = new OurMobileAppsSteps(ourMobileAppsPage);
        ourMobileApps.ourMobileAppsPageTitle();
        ourMobileApps.ourMobileAppsPageLoadedText();
    }

    @Test
    @Title("Your account from footer opens create account popup when user is not logged in")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Links")
    @Stories("Footer Navigation")
    public void yourAccountLinkOpensCreateAccountPopupWhenUserNotLoggedIn(){
        footerArea.clickOnYourAccountFromFooter();
        CreateAccountPopup popup = new CreateAccountPopup(browser);
        CreateAccountPopupSteps createAccountPopup = new CreateAccountPopupSteps(popup);
        createAccountPopup.createAccountPopupHasExpectedText();
    }

    @Test
    @Title("Food Safety link from footer")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Links")
    @Stories("Footer Navigation")
    public void foodSafetyLink(){
        footerArea.clickOnFoodSafetyFromFooter();
        FoodSafety foodSafetyPage = new FoodSafety(browser);
        FoodSafetySteps foodSafety = new FoodSafetySteps(foodSafetyPage);
        foodSafety.foodSafetyPageTitle();
        foodSafety.foodSafetyPageLoadedText();
    }

    @Test
    @Title("Careers link from footer")
    @Severity(SeverityLevel.NORMAL)
    @Features("Career")
    @Stories("Footer Navigation")
    public void careersAtFreshDirectLink() {
        footerArea.clickOnCareersFromFooter();
        switchWindow(DriverWindow.SECOND, false);
        Career careerPage = new Career(browser);
        CareerSteps career = new CareerSteps(careerPage);
        career.careersTitle();
        career.careersLoadedText();
    }

    @Test
    @Title("Contact Us links opens overlay")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void contactUsLinkOpensOverlay(){
        footerArea.clickOnContactUsLinkFromFooter();
        ContactUsPopup popup = new ContactUsPopup(browser);
        ContactUsPopupSteps contactUsPopup = new ContactUsPopupSteps(popup);
        contactUsPopup.contactUsOverlayText();
    }

    @Test
    @Title("Home: Privacy Policy link validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validatePrivacyPolicyLink(){
        footerArea.clickOnPrivacyPolicyLink();
        PrivacyPolicy privacyPolicyPage = new PrivacyPolicy(browser);
        PrivacyPolicySteps privacyPolicy = new PrivacyPolicySteps(privacyPolicyPage);
        privacyPolicy.privacyPolicyPageLoadedText();
    }

    @Test
    @Title("Home: Customer Agreement link validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validateCustomerAgreementLink(){
        footerArea.clickOnCustomerAgreementLink();
        CustomerAgreement customerAgreementPage = new CustomerAgreement(browser);
        CustomerAgreementSteps customerAgreement = new CustomerAgreementSteps(customerAgreementPage);
        customerAgreement.customerAgreementPageLoadedText();
    }

    @Test
    @Title("Home: facebook link validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validateFacebookLink(){
        footerArea.validateFacebookIcon();
    }

    @Test
    @Title("Home: twitter link validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validateTwitterLink(){
        footerArea.validateTwitterIcon();
    }

    @Test
    @Title("Home: Pinterest link validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validatePinterestLink(){
        footerArea.validatePinterestIcon();
    }

    @Test
    @Title("Home: Youtube link validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validateYoutubeLink(){
        footerArea.validateYoutubeIcon();
    }

    @Test
    @Title("Home: Instagram link validation")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validateInstagramLink(){
        footerArea.validateYoutubeIcon();
    }

    @Test
    @Title("Request a Store Credit")
    @Severity(SeverityLevel.NORMAL)
    @Features("Footer Tests")
    @Stories("Footer Navigation")
    public void validateRequestStoreCreditLink(){
        footerArea.clickOnRequestStoreCredit();
        Help helpPage = new Help(browser);
        HelpPageSteps help = new HelpPageSteps(helpPage);
        help.helpPageTitle();
        help.helpPageLoadedText();
    }

    @After
    public void resetTest(){
        homePage.closeAllWindowsButFirst(browser);
    }

}
