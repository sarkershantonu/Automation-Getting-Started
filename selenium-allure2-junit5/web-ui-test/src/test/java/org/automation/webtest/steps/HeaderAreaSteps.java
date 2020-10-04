package org.automation.webtest.steps;

import com.freshdirect.testing.pages.common.HeaderArea;
import org.openqa.selenium.Keys;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created By: Tanvir Ahmed
 * Date: 3/21/2019
 * Time: 3:25 PM
 */
public class HeaderAreaSteps extends StepBase{
    private HeaderArea area;

    public HeaderAreaSteps(HeaderArea area) {
        this.area = area;
    }

    @Step
    public void yourFreshDirectPopupIsDisplayed() {
        verifyElementIsDisplayed(area.yourAccountPopup.yourFreshDirectPopup);
    }

    @Step
    public void contactUsOverlayTextHeader() {
        verify(area.contactUsPopup.txt_contactUsPopup, "Chat With Our Service Team");
    }

    @Step
    public void cartPopupIsDisplayed() {
        verifyElementIsDisplayed(area.cartPopup_element);
    }

    @Step
    public void searchFieldIsDisplayed() {
        verifyElementIsDisplayed(area.input_search);
    }

    @Step
    public void searchFieldTakesInput(String productName) {
        verify(area.getAttributeValue(area.input_search, "value"), productName);
    }

    @Step
    public void searchButtonIsDisplayed() {
        verifyElementIsDisplayed(area.btn_searchButton);
    }

    @Step
    public void searchSuggestionPopupDisplayed() {
        verifyElementIsDisplayed(area.searchSuggestionPopup);
    }

    @Step
    public void verifyTextInSearchInputField(String productName) {
        verify(area.getAttributeValue(area.input_search, "value"), productName);
    }

    @Step
    public void signInTextAsLoggedOutUserIsPresent() {
        verify(area.loggedInVerificationText, "Sign in");
    }

    @Step
    public void verifyNumberOfCartItems(int expectedItems) {
        verify(getNumberOfCartItems(), expectedItems);
    }

    @Step
    public void verifyInitialTotalOfCartItemsString() {
        verify(area.getElementText(area.cartItemsTotal), "$0.00");
    }

    @Step
    public void verifyTotalOfCartItems(double expectedTotal) {
        String actualTotalString = String.valueOf(getTotalOfCartItems());
        String expectedTotalString = String.valueOf(expectedTotal);
        verify(actualTotalString, expectedTotalString);
    }

    @Step
    public void searchSuggestionPopupEnabled() {
        verifyElementIsEnabled(area.searchSuggestionPopup);
    }

    @Step
    public void isSuggestedProductListAvailable() {
        isGraterThanZero(area.searchSuggestionList.size());
    }

    @Step
    public void searchButtonIsFieldEnabled() {
        verifyElementIsEnabled(area.btn_searchButton);
    }

    @Step
    public void searchFieldIsFieldEnabled() {
        verifyElementIsEnabled(area.input_search);
    }

    @Step
    public void yourAccountAsLoggedInUserIsPresent() {
        verify(area.loggedInVerificationText, "Your Account");
    }

    @Step
    public void deliveryAddressOverlayIsDisplayed() {
        verifyElementIsDisplayed(area.deliveryAddressOverlay);
    }

    @Step
    public void clickOnSignInFromHeader(){
        area.mouseMoveOnElementAndClick(area.link_signIn);
        holdExecution();
    }

    @Step
    public void writeOnSearchInputBox(String ptoductToSearch){
        //yet to implement
    }

    @Step
    public void clickOnSearchButton(){
        area.click(area.btn_searchButton);
    }

    @Step
    public void clickCreateAccountButton(){
        area.click(area.btn_createAccount);
        holdExecution(750);
    }

    @Step
    public void clickOnContactUsLinkFromHeader(){
        area.click(area.link_contactUsInHeader);
    }

    @Step
    public void clickOnHelpLinkFromHeader(){
        area.click(area.link_helpInHeader);
    }

    @Step
    public void hoverOnDeliveryTimesFromHeader(){
        area.mouseHoverOnElement(area.hover_deliveryTimes);
    }

    @Step
    public void hoverOnCart(){
        area.mouseHoverOnElement(area.hover_cart);
    }

    @Step
    public void typeProductNameInSearchField(String productName){
        area.typeText(area.input_search, productName);
    }

    @Step
    public void clearSearchField(){
        area.clear(area.input_search);
    }

    @Step
    public void hoverOnYourAccountFromHeader(){
        area.mouseHoverOnElement(area.link_signIn);
        area.holdExecution(750);
    }

    @Step
    public void clickOnReOrderButton(){
        area.click(area.btn_reOrder);
    }

    @Step
    public String clickOnAnItemNameFromSuggestion(){
        int indexToClick = (int) Math.floor(area.searchSuggestionList.size() / 2);
        String productName =area.getElementText(area.searchSuggestionList.get(indexToClick));
        area.click(area.searchSuggestionList.get(indexToClick));
        return productName;
    }

    @Step
    public String clickDownArrowKeyToBrowsSuggestList(){
        int indexToClick = (int) Math.floor(area.searchSuggestionList.size() / 2);
        String productName =area.getElementText(area.searchSuggestionList.get(indexToClick));
        int counter = 0;
        while(counter <= indexToClick){
            area.sendKeyBoardEvent(area.input_search, Keys.ARROW_DOWN);
            counter++;
        }
        area.sendKeyBoardEvent(area.input_search, Keys.ENTER);
        return productName;
    }

    @Step
    public String clickUpArrowKeyToBrowsSuggestList(){
        String lastProductNameOnList =area.getElementText(area.searchSuggestionList.get(area.searchSuggestionList.size() -1));
        area.sendKeyBoardEvent(area.input_search, Keys.ARROW_UP);
        return lastProductNameOnList;
    }

    @Step
    public int getNumberOfCartItems(){
        return Integer.valueOf(area.getElementText(area.cartItemsCount));
    }

    @Step
    public double getTotalOfCartItems(){
        return area.getDoubleFrom(area.getElementText(area.cartItemsTotal), "[0-9\\.]+");
    }

    @Step
    public void clickOnFreshDirectLogo(){
        area.click(area.link_freshDirectLogo);
    }

    @Step
    public String getLoggedInVerificationText(){
        return area.getElementText(area.loggedInVerificationText);
    }

}
