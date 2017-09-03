package org.automation.opencart.pages.common;

import org.automation.core.PageBase;
import static org.automation.util.CssHelper.getLinkCSS;
import org.openqa.selenium.support.FindBy;

public class FooterArea extends PageBase {

    public String opencart_css= getLinkCSS(base_url);
    public String aboutUsLink_css=getLinkCSS(base_url+"/index.php?route=information/information&information_id=4");
    public String deliveryInfoLink_css =getLinkCSS(base_url+ "/index.php?route=information/information&information_id=6");
    public String privacyPolicyLink_css =  getLinkCSS(base_url+"/index.php?route=information/information&information_id=3");
    public String termsAndConditionLink_css =getLinkCSS(base_url +"/index.php?route=information/information&information_id=5") ;
    public String contactUsLink_css = getLinkCSS(base_url + "/index.php?route=information/contact");
    public String returnsLink_css=getLinkCSS(base_url + "/index.php?route=account/return/add");
    public String siteMapLink_css=getLinkCSS(base_url +"/index.php?route=information/sitemap");
    public String brandsLink_css=getLinkCSS(base_url +"/index.php?route=product/manufacturer");
    public String giftVoucersLink_css = getLinkCSS(base_url +"/index.php?route=account/voucher");
    public String affiliatesLink_css=getLinkCSS(base_url +"/index.php?route=affiliate/account");
    public String specialsLink_css = getLinkCSS(base_url +"/index.php?route=product/specia");

    @FindBy(css = "a[title='My Account")
    public String myAccountLink_css=getLinkCSS(base_url +"");
    @FindBy(css = "#column-right div.list-group a:nth-of-type(7)")
    
    public String orderHistoryLink_css=getLinkCSS(base_url +"");
    public String wishListLink_css=getLinkCSS(base_url +"/index.php?route=account/wishlist");
    public String newsLetterLink_css=getLinkCSS(base_url +"/index.php?route=account/newsletter");

    public String copyright_xpath="html/body/footer/div/p";

    //this

}
