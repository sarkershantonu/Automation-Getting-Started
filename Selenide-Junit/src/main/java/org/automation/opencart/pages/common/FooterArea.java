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
    @FindBy(css = "/index.php?route=account/voucher")
    
    public String giftVoucersLink;

    @FindBy(css = "/index.php?route=affiliate/account")
    
    public String affiliatesLink;
    @FindBy(css = "/index.php?route=product/special")
    
    public String specialsLink;

    @FindBy(css = "a[title='My Account")
    
    public String myAccountLink;
    @FindBy(css = "#column-right div.list-group a:nth-of-type(7)")
    
    public String orderHistoryLink;
    @FindBy(id = "wishlist-total")
    

    public String wishListLink;
    @FindBy(css = "#column-right div.list-group a:nth-of-type(12)")
    
    public String newsLetterLink;

    public String copyright;

    //this

}
