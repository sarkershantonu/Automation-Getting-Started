package org.selenium;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartHomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;



    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=4']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(1) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(2) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart2;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(3) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart3;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(4) div.product-thumb.transition div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement addToCart4;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=affiliate/account']")
    @CacheLookup
    private WebElement affiliates;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(3) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement appleCinema301;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(3) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement appleCinema302;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/manufacturer']")
    @CacheLookup
    private WebElement brands;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=33']")
    @CacheLookup
    private WebElement cameras;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(4) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement canonEos5d1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(4) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement canonEos5d2;

    @FindBy(css = "a[title='Checkout']")
    @CacheLookup
    private WebElement checkout;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(3) a.dropdown-toggle")
    @CacheLookup
    private WebElement components;

    @FindBy(css = ".common-home footer div.container div.row div:nth-of-type(2) ul.list-unstyled li:nth-of-type(1) a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "button.btn.btn-link.dropdown-toggle")
    @CacheLookup
    private WebElement currency;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=6']")
    @CacheLookup
    private WebElement deliveryInformation;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(1) a.dropdown-toggle")
    @CacheLookup
    private WebElement desktops;

    @FindBy(name = "EUR")
    @CacheLookup
    private WebElement euro;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/voucher']")
    @CacheLookup
    private WebElement giftVouchers;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(2) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement iphone1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(2) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement iphone2;

    @FindBy(css = "a[href='index.php?route=product/product&path=57&product_id=49']")
    @CacheLookup
    private WebElement iphone6;

    @FindBy(css = "button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle")
    @CacheLookup
    private WebElement items0000;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(2) a.dropdown-toggle")
    @CacheLookup
    private WebElement laptopsNotebooks;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/login']")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=20_27']")
    @CacheLookup
    private WebElement mac1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(1) div.product-thumb.transition div:nth-of-type(1) a")
    @CacheLookup
    private WebElement macbook1;

    @FindBy(css = "#content div:nth-of-type(2) div:nth-of-type(1) div.product-thumb.transition div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement macbook2;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=18_46']")
    @CacheLookup
    private WebElement macs0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_29']")
    @CacheLookup
    private WebElement miceAndTrackballs0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_28']")
    @CacheLookup
    private WebElement monitors2;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(8) a.dropdown-toggle")
    @CacheLookup
    private WebElement mp3Players;

    @FindBy(css = "a[title='My Account']")
    @CacheLookup
    private WebElement myAccount1;

    @FindBy(css = ".common-home footer div.container div.row div:nth-of-type(4) ul.list-unstyled li:nth-of-type(1) a")
    @CacheLookup
    private WebElement myAccount2;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/newsletter']")
    @CacheLookup
    private WebElement newsletter;

    @FindBy(css = "#slideshow0 ul.flex-direction-nav li:nth-of-type(2) a.flex-next")
    @CacheLookup
    private WebElement next1;

    @FindBy(css = "#carousel0 ul.flex-direction-nav li:nth-of-type(2) a.flex-next")
    @CacheLookup
    private WebElement next2;

    @FindBy(css = "a[href='http://www.opencart.com']")
    @CacheLookup
    private WebElement opencart;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/order']")
    @CacheLookup
    private WebElement orderHistory;

    private final String pageLoadedText = "Powered by an Intel Core 2 Duo processor at speeds up to 2";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=20_26']")
    @CacheLookup
    private WebElement pc0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=24']")
    @CacheLookup
    private WebElement phonesPdas;

    @FindBy(name = "GBP")
    @CacheLookup
    private WebElement poundSterling;

    @FindBy(css = "#slideshow0 ul.flex-direction-nav li:nth-of-type(1) a.flex-prev")
    @CacheLookup
    private WebElement previous1;

    @FindBy(css = "#carousel0 ul.flex-direction-nav li:nth-of-type(1) a.flex-prev")
    @CacheLookup
    private WebElement previous2;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_30']")
    @CacheLookup
    private WebElement printers0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=3']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/register']")
    @CacheLookup
    private WebElement register;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=account/return/add']")
    @CacheLookup
    private WebElement returns;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_31']")
    @CacheLookup
    private WebElement scanners0;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(3) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllComponents;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(1) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllDesktops;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(2) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllLaptopsNotebooks;

    @FindBy(css = "#menu div:nth-of-type(2) ul.nav.navbar-nav li:nth-of-type(8) div.dropdown-menu a.see-all")
    @CacheLookup
    private WebElement seeAllMp3Players;

    @FindBy(css = "a[title='Shopping Cart']")
    @CacheLookup
    private WebElement shoppingCart;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/sitemap']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=17']")
    @CacheLookup
    private WebElement software;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/special']")
    @CacheLookup
    private WebElement specials;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=57']")
    @CacheLookup
    private WebElement tablets;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=information/information&information_id=5']")
    @CacheLookup
    private WebElement termsConditions;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_43']")
    @CacheLookup
    private WebElement test110;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_44']")
    @CacheLookup
    private WebElement test120;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_47']")
    @CacheLookup
    private WebElement test150;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_48']")
    @CacheLookup
    private WebElement test160;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_49']")
    @CacheLookup
    private WebElement test170;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_50']")
    @CacheLookup
    private WebElement test180;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_51']")
    @CacheLookup
    private WebElement test190;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_52']")
    @CacheLookup
    private WebElement test200;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_53']")
    @CacheLookup
    private WebElement test210;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_54']")
    @CacheLookup
    private WebElement test220;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_55']")
    @CacheLookup
    private WebElement test230;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_56']")
    @CacheLookup
    private WebElement test240;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_38']")
    @CacheLookup
    private WebElement test40;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_37']")
    @CacheLookup
    private WebElement test50;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_39']")
    @CacheLookup
    private WebElement test60;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_40']")
    @CacheLookup
    private WebElement test70;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_41']")
    @CacheLookup
    private WebElement test80;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=34_42']")
    @CacheLookup
    private WebElement test90;

    @FindBy(name = "USD")
    @CacheLookup
    private WebElement usDollar;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=25_32']")
    @CacheLookup
    private WebElement webCameras0;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=product/category&path=18_45']")
    @CacheLookup
    private WebElement windows0;

    @FindBy(css = ".common-home footer div.container div.row div:nth-of-type(4) ul.list-unstyled li:nth-of-type(3) a")
    @CacheLookup
    private WebElement wishList;

    @FindBy(id = "wishlist-total")
    @CacheLookup
    private WebElement wishList0;

    @FindBy(name = "search")
    @CacheLookup
    private WebElement yourShoppingCartIsEmpty;

    @FindBy(css = "a[href='http://demo.opencart.com/index.php?route=common/home']")
    @CacheLookup
    private WebElement yourStore;



    public CartHomePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CartHomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public CartHomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    public CartHomePage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    
    public CartHomePage clickAddToCart1Button() {
        addToCart1.click();
        return this;
    }

    
    public CartHomePage clickAddToCart2Button() {
        addToCart2.click();
        return this;
    }

    
    public CartHomePage clickAddToCart3Button() {
        addToCart3.click();
        return this;
    }

    
    public CartHomePage clickAddToCart4Button() {
        addToCart4.click();
        return this;
    }

    
    public CartHomePage clickAffiliatesLink() {
        affiliates.click();
        return this;
    }

    
    public CartHomePage clickAppleCinema301Link() {
        appleCinema301.click();
        return this;
    }

    
    public CartHomePage clickAppleCinema302Link() {
        appleCinema302.click();
        return this;
    }

    
    public CartHomePage clickBrandsLink() {
        brands.click();
        return this;
    }

    
    public CartHomePage clickCamerasLink() {
        cameras.click();
        return this;
    }

    
    public CartHomePage clickCanonEos5d1Link() {
        canonEos5d1.click();
        return this;
    }

    
    public CartHomePage clickCanonEos5d2Link() {
        canonEos5d2.click();
        return this;
    }

    
    public CartHomePage clickCheckoutLink() {
        checkout.click();
        return this;
    }

    
    public CartHomePage clickComponentsLink() {
        components.click();
        return this;
    }

    
    public CartHomePage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    
    public CartHomePage clickCurrencyButton() {
        currency.click();
        return this;
    }

    
    public CartHomePage clickDeliveryInformationLink() {
        deliveryInformation.click();
        return this;
    }

    
    public CartHomePage clickDesktopsLink() {
        desktops.click();
        return this;
    }

    
    public CartHomePage clickEuroButton() {
        euro.click();
        return this;
    }

    
    public CartHomePage clickGiftVouchersLink() {
        giftVouchers.click();
        return this;
    }

    
    public CartHomePage clickIphone1Link() {
        iphone1.click();
        return this;
    }

    
    public CartHomePage clickIphone2Link() {
        iphone2.click();
        return this;
    }

    
    public CartHomePage clickIphone6Link() {
        iphone6.click();
        return this;
    }

    
    public CartHomePage clickItems000Button0() {
        items0000.click();
        return this;
    }

    
    public CartHomePage clickLaptopsNotebooksLink() {
        laptopsNotebooks.click();
        return this;
    }


    public CartHomePage clickLoginLink() {
        login.click();
        return this;
    }

    
    public CartHomePage clickMac1Link() {
        mac1.click();
        return this;
    }

    
    public CartHomePage clickMacbook1Link() {
        macbook1.click();
        return this;
    }

    
    public CartHomePage clickMacbook2Link() {
        macbook2.click();
        return this;
    }

    
    public CartHomePage clickMacs0Link() {
        macs0.click();
        return this;
    }

    
    public CartHomePage clickMiceAndTrackballs0Link() {
        miceAndTrackballs0.click();
        return this;
    }

    
    public CartHomePage clickMonitors2Link() {
        monitors2.click();
        return this;
    }

    
    public CartHomePage clickMp3PlayersLink() {
        mp3Players.click();
        return this;
    }

    
    public CartHomePage clickMyAccount1Link() {
        myAccount1.click();
        return this;
    }

    
    public CartHomePage clickMyAccount2Link() {
        myAccount2.click();
        return this;
    }

    
    public CartHomePage clickNewsletterLink() {
        newsletter.click();
        return this;
    }

    
    public CartHomePage clickNext1Link() {
        next1.click();
        return this;
    }

    
    public CartHomePage clickNext2Link() {
        next2.click();
        return this;
    }

    
    public CartHomePage clickOpencartLink() {
        opencart.click();
        return this;
    }

    
    public CartHomePage clickOrderHistoryLink() {
        orderHistory.click();
        return this;
    }

    
    public CartHomePage clickPc0Link() {
        pc0.click();
        return this;
    }

    
    public CartHomePage clickPhonesPdasLink() {
        phonesPdas.click();
        return this;
    }

    
    public CartHomePage clickPoundSterlingButton() {
        poundSterling.click();
        return this;
    }

    
    public CartHomePage clickPrevious1Link() {
        previous1.click();
        return this;
    }

    
    public CartHomePage clickPrevious2Link() {
        previous2.click();
        return this;
    }

    
    public CartHomePage clickPrinters0Link() {
        printers0.click();
        return this;
    }

    
    public CartHomePage clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    
    public CartHomePage clickRegisterLink() {
        register.click();
        return this;
    }

    
    public CartHomePage clickReturnsLink() {
        returns.click();
        return this;
    }

    
    public CartHomePage clickScanners0Link() {
        scanners0.click();
        return this;
    }

    
    public CartHomePage clickSeeAllComponentsLink() {
        seeAllComponents.click();
        return this;
    }

    
    public CartHomePage clickSeeAllDesktopsLink() {
        seeAllDesktops.click();
        return this;
    }

    
    public CartHomePage clickSeeAllLaptopsNotebooksLink() {
        seeAllLaptopsNotebooks.click();
        return this;
    }

    
    public CartHomePage clickSeeAllMp3PlayersLink() {
        seeAllMp3Players.click();
        return this;
    }

    
    public CartHomePage clickShoppingCartLink() {
        shoppingCart.click();
        return this;
    }

    
    public CartHomePage clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    
    public CartHomePage clickSoftwareLink() {
        software.click();
        return this;
    }

    
    public CartHomePage clickSpecialsLink() {
        specials.click();
        return this;
    }

    
    public CartHomePage clickTabletsLink() {
        tablets.click();
        return this;
    }

    
    public CartHomePage clickTermsConditionsLink() {
        termsConditions.click();
        return this;
    }

    
    public CartHomePage clickTest110Link() {
        test110.click();
        return this;
    }

    
    public CartHomePage clickTest120Link() {
        test120.click();
        return this;
    }

    
    public CartHomePage clickTest150Link() {
        test150.click();
        return this;
    }

    
    public CartHomePage clickTest160Link() {
        test160.click();
        return this;
    }

    
    public CartHomePage clickTest170Link() {
        test170.click();
        return this;
    }

    
    public CartHomePage clickTest180Link() {
        test180.click();
        return this;
    }

    
    public CartHomePage clickTest190Link() {
        test190.click();
        return this;
    }

    
    public CartHomePage clickTest200Link() {
        test200.click();
        return this;
    }

    
    public CartHomePage clickTest210Link() {
        test210.click();
        return this;
    }

    
    public CartHomePage clickTest220Link() {
        test220.click();
        return this;
    }

    
    public CartHomePage clickTest230Link() {
        test230.click();
        return this;
    }

    
    public CartHomePage clickTest240Link() {
        test240.click();
        return this;
    }

    
    public CartHomePage clickTest40Link() {
        test40.click();
        return this;
    }

    
    public CartHomePage clickTest50Link() {
        test50.click();
        return this;
    }

    
    public CartHomePage clickTest60Link() {
        test60.click();
        return this;
    }

    
    public CartHomePage clickTest70Link() {
        test70.click();
        return this;
    }

    
    public CartHomePage clickTest80Link() {
        test80.click();
        return this;
    }

    
    public CartHomePage clickTest90Link() {
        test90.click();
        return this;
    }

    
    public CartHomePage clickUsDollarButton() {
        usDollar.click();
        return this;
    }

    
    public CartHomePage clickWebCameras0Link() {
        webCameras0.click();
        return this;
    }

    
    public CartHomePage clickWindows0Link() {
        windows0.click();
        return this;
    }

    
    public CartHomePage clickWishList0Link() {
        wishList0.click();
        return this;
    }

    
    public CartHomePage clickWishListLink() {
        wishList.click();
        return this;
    }

    
    public CartHomePage clickYourStoreLink() {
        yourStore.click();
        return this;
    }

    
    public CartHomePage fill() {
        setYourShoppingCartIsEmptyTextField();
        return this;
    }

    
    public CartHomePage fillAndSubmit() {
        fill();
        return submit();
    }

    
    public CartHomePage setYourShoppingCartIsEmptyTextField() {
        return setYourShoppingCartIsEmptyTextField(data.get("YOUR_SHOPPING_CART_IS_EMPTY"));
    }

    
    public CartHomePage setYourShoppingCartIsEmptyTextField(String yourShoppingCartIsEmptyValue) {
        yourShoppingCartIsEmpty.sendKeys(yourShoppingCartIsEmptyValue);
        return this;
    }

    
    public CartHomePage submit() {
        clickCurrencyButton();
        return this;
    }

    
    public CartHomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    
    public CartHomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

