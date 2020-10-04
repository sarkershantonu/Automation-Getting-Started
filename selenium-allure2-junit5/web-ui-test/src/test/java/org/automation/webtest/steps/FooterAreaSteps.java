package org.automation.webtest.steps;

import com.freshdirect.testing.pages.common.FooterArea;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created By: Tanvir Ahmed
 * Date: 3/24/2019
 * Time: 1:05 AM
 */
public class FooterAreaSteps extends StepBase{
    private FooterArea area;

    public FooterAreaSteps(FooterArea area){
        this.area = area;
    }

    @Step
    public void clickOnAboutUsFromFooter(){
        area.click(area.link_AboutUs);
    }

    @Step
    public void clickOnOurMobileAppsFromFooter(){
        area.click(area.link_ourMobileApps);
    }

    @Step
    public void clickOnYourAccountFromFooter(){
        area.click(area.link_yourAccount);
    }

    @Step
    public void clickOnFoodSafetyFromFooter(){
        area.click(area.link_foodSafety);
    }

    @Step
    public void clickOnCareersFromFooter(){
        area.click(area.link_careers);
        holdExecution();
    }

    @Step
    public void clickOnMySaleItemsFromFooter(){
        area.click(area.link_mySaleItems);
    }

    @Step
    public void clickOnSuppliersFromFooter(){
        area.click(area.link_suppliers);
    }

    @Step
    public void clickOnBlogFooter(){
        area.click(area.link_blog);
    }

    @Step
    public void clickOnGiftCardFooter(){
        area.click(area.link_giftCard);
    }

    @Step
    public void clickOnContactUsLinkFromFooter(){
        area.click(area.link_contactUsInFooter);
    }

    @Step
    public void clickOnPrivacyPolicyLink(){
        //area.click(area.lnk_privacyPolicy);
        area.javaScriptClick(area.lnk_privacyPolicy);
    }

    @Step
    public void clickOnCustomerAgreementLink(){
        area.click(area.lnk_customerAgreement);
    }

    public void validateFacebookIcon(){
        String lnk_Href = "http://www.facebook.com/FreshDirect";
        verifyLink(area, area.lnk_facebook, "", lnk_Href);
    }

    public void validateTwitterIcon(){
        String lnk_Href = "http://www.twitter.com/FreshDirect";
        verifyLink(area, area.lnk_twitter, "", lnk_Href);
    }

    public void validatePinterestIcon(){
        String lnk_Href = "http://www.pinterest.com/FreshDirect";
        verifyLink(area, area.lnk_pinterest, "", lnk_Href);
    }

    public void validateYoutubeIcon(){
        String lnk_Href = "http://www.youtube.com/FreshDirect";
        verifyLink(area, area.lnk_youtube, "", lnk_Href);
    }

    public void validateInstagramIcon(){
        String lnk_Href = "https://www.instagram.com/freshdirect";
        verifyLink(area, area.lnk_instagram, "", lnk_Href);
    }

    public void clickOnRequestStoreCredit(){
        area.click(area.link_requestStoreCredit);
    }
}
