package org.automation.webtest.steps.pages;


import org.automation.webtest.pages.Home;
import org.automation.webtest.pages.popups.CarouselViewAllPopup;
import org.automation.webtest.steps.StepBase;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePageSteps extends StepBase {
    private Home page;
    private CarouselViewAllPopup carouselViewAllPopup;

    public HomePageSteps(Home page){
        this.page = page;
        this.carouselViewAllPopup = page.carouselViewAllPopup;
    }

    @Step
    public void navigateToHomePage(){
        navigate(page.pageUrl);
        holdExecution(250);
    }

    @Step
    public void greatCartStartsCarouselHasNextTilesDisplayed() {
        for (int index = page.greatCartStartsCarouselTilesDisplayed; index < page.greatCartStartsCarouselTilesDisplayed * 2 && index < page.greatCartStartsProductTiles.size(); index++) {
            verifyElementIsDisplayed(page.greatCartStartsProductTiles.get(index));
        }
    }

    @Step
    public void topRatedProduceCarouselProductTile() {
        isListAvailable(page.topRatedProduceProductTiles.size());
    }

    @Step
    public void topRatedProduceCarouselPreviousButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_topRatedProducePrevious);
    }

    @Step
    public void topRatedProduceCarouselPreviousButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_topRatedProducePrevious);
    }

    @Step
    public void freshDealsCarouselNextButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_freshDealsNext);
    }

    @Step
    public void freshDealsCarouselHasTilesDisplayed() {
        int actual = 0;
        for (int index = 0; index < page.freshDealsProductTiles.size(); index++)
            if (page.freshDealsProductTiles.get(index).isDisplayed())
                actual++;
        verify(actual, page.freshDealsCarouselTilesDisplayed);
    }

    @Step
    public void greatCartStartsCarouselNextButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_greatCartStartsNext);
    }

    @Step
    public void greatCartStartsCarouselNextButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_greatCartStartsNext);
    }

    @Step
    public void greatCartStartsCarouselHasTilesDisplayed() {
        int actual = 0;
        for (int index = 0; index < page.greatCartStartsProductTiles.size(); index++) {
            if (page.greatCartStartsProductTiles.get(index).isDisplayed()) {
                actual++;
            }
        }
        verify(actual, page.greatCartStartsCarouselTilesDisplayed);
    }

    @Step
    public void greatCartStartsCarouselViewAllButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_greatCartStartsHeaderViewAll);
    }

    @Step
    public void freshDealsCarouselHeader() {
        verify(page.freshDealsHeader, "FRESH DEALS");
    }

    @Step
    public void freshDealsCarouselBanner() {
        verify(page.freshDealsBanner, "Big savings on expertly-curated seasonal items and your favorite brands.");
    }

    @Step
    public void freshDealsCarouselViewAllButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_freshDealsHeaderViewAll);
    }

    @Step
    public void freshDealsCarouselViewAllButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_freshDealsHeaderViewAll);
    }

    @Step
    public void freshDealsCarouselProductTile() {
        isListAvailable(page.freshDealsProductTiles.size());
    }

    @Step
    public void freshDealsCarouselPreviousButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_freshDealsPrevious);
    }

    @Step
    public void freshDealsCarouselPreviousButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_freshDealsPrevious);
    }

    @Step
    public void freshDealsCarouselNextButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_freshDealsNext);
    }

    @Step
    public void freshDealsCarouselHasNextTilesDisplayed() {
        for (int index = page.freshDealsCarouselTilesDisplayed; index < page.freshDealsCarouselTilesDisplayed * 2 && index < page.freshDealsProductTiles.size(); index++) {
            verifyElementIsDisplayed(page.freshDealsProductTiles.get(index));
        }
    }

    @Step
    public void topRatedProduceCarouselHeader() {
        verify(page.topRatedProduceHeader, "TOP-RATED PRODUCE");
    }

    @Step
    public void topRatedProduceCarouselViewAllButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_topRatedProduceHeaderViewAll);
    }

    @Step
    public void topRatedProduceCarouselHasCurrentTilesDisplayed() {
        for (int index = 0; index < page.topRatedProduceCarouselTilesDisplayed && index < page.topRatedProduceProductTiles.size(); index++) {
            verifyElementIsDisplayed(page.topRatedProduceProductTiles.get(index));
        }
    }

    @Step
    public void topRatedProduceCarouselViewAllButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_topRatedProduceHeaderViewAll);
    }

    @Step
    public void topRatedProduceCarouselNextButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_topRatedProduceNext);
    }

    @Step
    public void topRatedProduceCarouselNextButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_topRatedProduceNext);
    }

    @Step
    public void topRatedProduceCarouselHasNextTilesDisplayed() {
        for (int index = page.topRatedProduceCarouselTilesDisplayed; index < page.topRatedProduceCarouselTilesDisplayed * 2 && index < page.topRatedProduceProductTiles.size(); index++) {
            verifyElementIsDisplayed(page.topRatedProduceProductTiles.get(index));
        }
    }

    @Step
    public void greatCartStartsCarouselViewAllButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_greatCartStartsHeaderViewAll);
    }

    @Step
    public void greatCartStartsCarouselProductTile() {
        isListAvailable(page.greatCartStartsProductTiles.size());
    }

    @Step
    public void greatCartStartsCarouselPreviousButtonIsDisplayed() {
        verifyElementIsDisplayed(page.btn_greatCartStartsPrevious);
    }

    @Step
    public void greatCartStartsCarouselPreviousButtonIsEnabled() {
        verifyElementIsEnabled(page.btn_greatCartStartsPrevious);
    }

    @Step
    public void greatCartStartsCarouselBanner() {
        verify(page.greatCartStartsBanner, "Jumpstart your cart with everyday essentials and must-have items.");
    }

    public void setCarouselViewAllPopup(CarouselViewAllPopup carouselViewAllPopup) {
        this.carouselViewAllPopup = carouselViewAllPopup;
    }

    @Step
    public void greatCartStartsCarouselViewAllPopupHeader(){
        verify(page.carouselViewAllPopup.popupHeader, "GREAT CART STARTS");
    }

    @Step
    public void carouselViewAllPopupDisplayed(){
        verifyElementIsDisplayed(carouselViewAllPopup.viewAllPopup);
    }

    @Step
    public void greatCartStartsCarouselViewAllPopupBanner(){
        verify(carouselViewAllPopup.popupBanner, "Jumpstart your cart with everyday essentials and must-have items.");
    }

    @Step
    public void topRatedProduceCarouselHasTilesDisplayed(){
        int actual = 0;
        for(int index =0; index < page.topRatedProduceProductTiles.size(); index++){
            if(page.topRatedProduceProductTiles.get(index).isDisplayed()){
                actual++;
            }
        }
        verify(actual, page.topRatedProduceCarouselTilesDisplayed);
    }

    @Step
    public void greatCartStartsCarouselHeader(){
        verify(page.greatCartStartsHeader, "GREAT CART STARTS");
    }

    @Step
    public void freshDealsCarouselViewAllPopupHeader(){
        verify(carouselViewAllPopup.popupHeader, "FRESH DEALS");
    }

    @Step
    public void freshDealsCarouselViewAllPopupBanner(){
        verify(carouselViewAllPopup.popupBanner, "Big savings on expertly curated seasonal items and favorite brands.");
    }

    @Step
    public void topRatedProduceCarouselViewAllPopupHeader(){
        verify(carouselViewAllPopup.popupHeader, "TOP-RATED PRODUCE");
    }

    @Step
    public void clickOnGreatCartStartsNextButton(){
        page.click(page.btn_greatCartStartsNext);
        holdExecution();
    }

    @Step
    public void clickOnGreatCartStartsPreviousButton(){
        page.click(page.btn_greatCartStartsPrevious);
        holdExecution();
    }

    @Step
    public void clickOnGreatCartStartsHeaderViewAllButton(){
        page.click(page.btn_greatCartStartsHeaderViewAll);
    }

    @Step
    public void clickOnGreatCartStartsCarouselViewAllButton(){
        page.click(page.btn_greatCartStartsCarouselViewAll);
    }

    @Step
    public void clickOnFreshDealsNextButton(){
        page.click(page.btn_freshDealsNext);
        holdExecution();
    }

    @Step
    public void clickOnFreshDealsPreviousButton(){
        page.click(page.btn_freshDealsPrevious);
        holdExecution();
    }

    @Step
    public void clickOnFreshDealsHeaderViewAllButton(){
        page.click(page.btn_freshDealsHeaderViewAll);
    }

    @Step
    public void clickOnFreshDealsCarouselViewAllButton(){
        page.click(page.btn_freshDealsCarouselViewAll);
    }

    @Step
    public void clickOnTopRatedProduceNextButton(){
        page.click(page.btn_topRatedProduceNext);
        holdExecution();
    }

    @Step
    public void clickOnTopRatedProducePreviousButton(){
        page.click(page.btn_topRatedProducePrevious);
        holdExecution();
    }

    @Step
    public void clickOnTopRatedProduceHeaderViewAllButton(){
        page.click(page.btn_topRatedProduceHeaderViewAll);
    }

    @Step
    public void clickOnTopRatedProduceCarouselViewAllButton(){
        page.click(page.btn_topRatedProduceCarouselViewAll);
    }

    @Step
    public void addAlcoholAndNavigateToCheckout(String product, int quantity){
        addAlcoholToCartAndNavigateToCheckout(product, quantity);
    }

}
