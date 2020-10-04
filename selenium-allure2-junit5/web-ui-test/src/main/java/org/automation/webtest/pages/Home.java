package org.automation.webtest.pages;


import org.automation.webtest.pages.popups.CarouselViewAllPopup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Home extends PageBase {
    public int timeout = 15;
    public CarouselViewAllPopup carouselViewAllPopup;

    public int greatCartStartsCarouselTilesDisplayed = 4;
    public int freshDealsCarouselTilesDisplayed = 4;
    public int topRatedProduceCarouselTilesDisplayed = 4;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_prodlist_carstarts']/descendant::h2[@class='content-title']")
    @CacheLookup
    public WebElement greatCartStartsHeader;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_prodlist_carstarts']/descendant::span[@class='content-tittle-text-banner']")
    @CacheLookup
    public WebElement greatCartStartsBanner;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_prodlist_carstarts']/descendant::div[@class='view-all']")
    @CacheLookup
    public WebElement btn_greatCartStartsHeaderViewAll;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_prodlist_carstarts']/descendant::button[@data-component='carousel-prev']")
    @CacheLookup
    public WebElement btn_greatCartStartsPrevious;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_prodlist_carstarts']/descendant::button[@data-component='carousel-next']")
    @CacheLookup
    public WebElement btn_greatCartStartsNext;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_prodlist_carstarts']/descendant::ul[@data-component='carousel-list']/li")
    @CacheLookup
    public List<WebElement> greatCartStartsProductTiles;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_prodlist_carstarts']/descendant::div[@data-component='carousel-view-all']")
    @CacheLookup
    public WebElement btn_greatCartStartsCarouselViewAll;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_freshdeals_prodcar']/descendant::h2[@class='content-title']")
    @CacheLookup
    public WebElement freshDealsHeader;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_freshdeals_prodcar']/descendant::span[@class='content-tittle-text-banner']")
    @CacheLookup
    public WebElement freshDealsBanner;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_freshdeals_prodcar']/descendant::div[@class='view-all']")
    @CacheLookup
    public WebElement btn_freshDealsHeaderViewAll;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_freshdeals_prodcar']/descendant::button[@data-component='carousel-prev']")
    @CacheLookup
    public WebElement btn_freshDealsPrevious;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_freshdeals_prodcar']/descendant::button[@data-component='carousel-next']")
    @CacheLookup
    public WebElement btn_freshDealsNext;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_freshdeals_prodcar']/descendant::ul[@data-component='carousel-list']/li")
    @CacheLookup
    public List<WebElement> freshDealsProductTiles;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_freshdeals_prodcar']/descendant::div[@data-component='carousel-view-all']")
    @CacheLookup
    public WebElement btn_freshDealsCarouselViewAll;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_grn_produce']/descendant::h2[@class='content-title']")
    @CacheLookup
    public WebElement topRatedProduceHeader;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_grn_produce']/descendant::div[@class='view-all']")
    @CacheLookup
    public WebElement btn_topRatedProduceHeaderViewAll;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_grn_produce']/descendant::button[@data-component='carousel-prev']")
    @CacheLookup
    public WebElement btn_topRatedProducePrevious;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_grn_produce']/descendant::button[@data-component='carousel-next']")
    @CacheLookup
    public WebElement btn_topRatedProduceNext;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_grn_produce']/descendant::ul[@data-component='carousel-list']/li")
    @CacheLookup
    public List<WebElement> topRatedProduceProductTiles;

    @FindBy(xpath = "//div[@class='content']/descendant::div[@id='m_grn_produce']/descendant::div[@data-component='carousel-view-all']")
    @CacheLookup
    public WebElement btn_topRatedProduceCarouselViewAll;

    public Home() {
        super();
        initStaticItems();
    }

    public Home(WebDriver driver) {
        super(driver);
        initStaticItems();
    }

   @Override
    public void initStaticItems() {
        super.initStaticItems();
        carouselViewAllPopup = new CarouselViewAllPopup(driver);
        initElement(this.driver, carouselViewAllPopup);
        this.pageUrl= "/index.jsp?serviceType=HOME" ;
        this.title = "Online Grocery Delivery & Online Grocery Shopping | FreshDirect";
        this.pageLoadedText = "Our secret to adding the perfect amount of spice is with chili-infused simple syrup, then adding in chopped chili for an extra bit of color and flavor";
    }

}