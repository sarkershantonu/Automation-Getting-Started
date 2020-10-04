package org.automation.webtest.pages.common;


import org.automation.webtest.actions.CommonActions;
import org.automation.webtest.pages.popups.CreateAccountPopup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class FooterArea extends CommonActions {
    public CreateAccountPopup createAccountPopup;

    public Map<String, String> data;
    public WebDriver driver;
    public int timeout = 15;

    @FindBy(css = "a[href='/category.jsp?catId=mobile&trk=bnav']")
    public WebElement link_ourMobileApps;

    @FindBy(css = "a[href='/browse.jsp?id=about_overview']")
    public WebElement link_AboutUs;

    @FindBy(css = "a[href='/your_account/manage_account.jsp']")
    public WebElement link_yourAccount;

    @FindBy(css = "a[href='/category.jsp?catId=food_safety_freshdirect&trk=bnav']")
    public WebElement link_foodSafety;

    @FindBy(xpath = "//div[@class='gnav-footer shadow-below']/a[@href='http://jobs.jobvite.com/careers/fresh-direct/jobs']")
    public WebElement link_careers;

    @FindBy(xpath = "//div[@class='gnav-footer shadow-below']/descendant::a[@href='/favorite.jsp?trk=bnav']")
    public WebElement link_mySaleItems;

    @FindBy(xpath = "//div[@class='gnav-footer shadow-below']/descendant::a[@href='https://app.rangeme.com/suppliers/register/freshdirect']")
    public WebElement link_suppliers;

    @FindBy(xpath = "//div[@class='gnav-footer shadow-below']/descendant::a[@href='http://blog.freshdirect.com/']")
    public WebElement link_blog;

    @FindBy(xpath = "//div[@class='gnav-footer shadow-below']/descendant::a[@href='/gift_card/purchase/landing.jsp?trk=bnav']")
    public WebElement link_giftCard;

    @FindBy(xpath = "//div[contains(@class,'globalfooter')]/descendant::a[contains(text(),'Contact Us')]")
    public WebElement link_contactUsInFooter;

    @FindBy(css = "a[href='/help/privacy_policy.jsp']")
    public WebElement lnk_privacyPolicy;

    @FindBy(css = "a[href='/help/terms_of_service.jsp']")
    public WebElement lnk_customerAgreement;

    @FindBy(xpath = "//div[@id='socialFooterStatic']/a[position()=1]")
    public WebElement lnk_facebook;

    @FindBy(xpath = "//div[@id='socialFooterStatic']/a[position()=2]")
    public WebElement lnk_twitter;

    @FindBy(xpath = "//div[@id='socialFooterStatic']/a[position()=3]")
    public WebElement lnk_pinterest;

    @FindBy(xpath = "//div[@id='socialFooterStatic']/a[position()=4]")
    public WebElement lnk_youtube;

    @FindBy(xpath = "//div[@id='socialFooterStatic']/a[position()=5]")
    public WebElement lnk_instagram;

    @FindBy(xpath = "//div[@class='gnav-footer shadow-below']/descendant::a[@href='/help/index.jsp?trk=bnav']")
    public WebElement link_requestStoreCredit;


    public FooterArea(WebDriver driver){
        this.driver = driver;
        createAccountPopup = new CreateAccountPopup(driver);
        initElement(driver, createAccountPopup);
    }


    public void initFooter(FooterArea footerArea){
        initElement(driver, footerArea);
    }

}
