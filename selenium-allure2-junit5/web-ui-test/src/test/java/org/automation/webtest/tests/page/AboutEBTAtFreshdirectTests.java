package org.automation.webtest.tests.page;

import com.freshdirect.testing.core.DriverWindow;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.*;
import com.freshdirect.testing.steps.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created By: Tanvir Ahmed
 * Date: 2/19/2019
 * Time: 10:58 AM
 */
public class AboutEBTAtFreshdirectTests extends TestBase {
    private AboutEBTAtFreshdirect aboutEBTAtFreshdirectPage;
    private AboutEBTAtFreshdirectSteps aboutEBTAtFreshdirect;

    @Before
    public void initTest() throws InterruptedException {
        aboutEBTAtFreshdirectPage = new AboutEBTAtFreshdirect(browser);
        aboutEBTAtFreshdirect = new AboutEBTAtFreshdirectSteps(aboutEBTAtFreshdirectPage);
        aboutEBTAtFreshdirect.navigateToAboutEBTPage();
    }

    @Test
    @Title("FAQs link redirects to help page")
    @Severity(SeverityLevel.NORMAL)
    @Features("FAQ")
    @Stories("About EBT")
    public void aboutEBTAtFreshdirectFAQLink() {
        aboutEBTAtFreshdirect.clickOnFAQLink();
        FAQ faqPage = new FAQ(browser);
        FAQSteps faq = new FAQSteps(faqPage);
        faq.faqPageTitle();
        faq.faqPageLoadedText();
    }

    @Test
    @Title("USDA link redirects to USDA page")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About EBT")
    public void usdaLink() {
        aboutEBTAtFreshdirect.clickOnUSDALink();
        aboutEBTAtFreshdirect.holdExecution(1000);
        aboutEBTAtFreshdirect.switchWindow(DriverWindow.SECOND, false);
        USDAWebsite page = new USDAWebsite(browser);
        USDAWebsiteSteps usdaWebsite = new USDAWebsiteSteps(page);
        usdaWebsite.usdaWebsitePageTitle();
        usdaWebsite.usdaWebsitePageLoadedText();
    }

    @Test
    @Title("Satisfaction Guarantee Link opens up Satisfaction Guarantee page")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About EBT")
    public void satisfactionGuaranteeLink() {
        aboutEBTAtFreshdirect.clickOnSatisfactionGuaranteeLink();
        aboutEBTAtFreshdirect.holdExecution(1000);
        aboutEBTAtFreshdirect.switchWindow(DriverWindow.SECOND, false);
        SatisfactionGuarantee page = new SatisfactionGuarantee(browser);
        SatisfactionGuaranteeSteps satisfactionGuarantee = new SatisfactionGuaranteeSteps(page);
        satisfactionGuarantee.satisfactionGuaranteePageTitle();
        satisfactionGuarantee.satisfactionGuaranteePageLoadedText();
    }

    @Test
    @Title("Get help link redirects to Help page")
    @Severity(SeverityLevel.NORMAL)
    @Features("Help")
    @Stories("About EBT")
    public void getHelpLink() {
        aboutEBTAtFreshdirect.clickOnGetHelpLink();
        Help helpPage = new Help(browser);
        HelpPageSteps help = new HelpPageSteps(helpPage);
        help.helpPageTitle();
        help.helpPageLoadedText();
    }

    @Ignore("U card external link is disabled")
    @Test
    @Issue("AUTOFOOD-2942")
    @Title("UCard Chase url opens up Chase Ucard center page")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About EBT")
    public void uCardChaseUrlLink() {
        aboutEBTAtFreshdirect.clickOnUcardChaseURL();
        aboutEBTAtFreshdirect.holdExecution(750);
        aboutEBTAtFreshdirect.switchWindow(DriverWindow.SECOND, false);
        UCardChase uCardChasePage = new UCardChase(browser);
        UCardChaseSteps uCardChase = new UCardChaseSteps(uCardChasePage);
        uCardChase.uCardChasePageTitle();
        uCardChase.uCardChasePageLoadedText();
    }

    @Test
    @Title("Customer Agreement Link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About EBT")
    public void customerAgreementLink() {
        aboutEBTAtFreshdirect.clickOnCustomerAgreementLink();
        CustomerAgreement customerAgreementPage = new CustomerAgreement(browser);
        CustomerAgreementSteps customerAgreement = new CustomerAgreementSteps(customerAgreementPage);
        customerAgreement.customerAgreementPageTitle();
        customerAgreement.customerAgreementPageLoadedText();
    }

    @Test
    @Title("Privacy policy Link")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About EBT")
    public void privacyPolicyLink() {
        aboutEBTAtFreshdirect.clickOnPrivacyPolicyLink();
        PrivacyPolicy privacyPolicyPage = new PrivacyPolicy(browser);
        PrivacyPolicySteps privacyPolicy = new PrivacyPolicySteps(privacyPolicyPage);
        privacyPolicy.privacyPolicyPageTitle();
        privacyPolicy.privacyPolicyPageLoadedText();
    }

    @Test
    @Title("Espanol button")
    @Severity(SeverityLevel.NORMAL)
    @Features("About Us")
    @Stories("About EBT")
    public void espanolButton() {
        aboutEBTAtFreshdirect.clickOnEspanolButton();
        AboutUsEspanol aboutUsEspanolPage = new AboutUsEspanol(browser);
        AboutUsEspanolSteps aboutUsEspanol = new AboutUsEspanolSteps(aboutUsEspanolPage);
        aboutUsEspanol.aboutUsEspanolPageTitle();
        aboutUsEspanol.aboutUsEspanolPageLoadedText();
    }

    @After
    public void resetTest(){
        aboutEBTAtFreshdirectPage.closeAllWindowsButFirst(browser);
    }
}
