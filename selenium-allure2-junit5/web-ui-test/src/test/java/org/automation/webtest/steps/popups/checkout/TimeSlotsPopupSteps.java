package org.automation.webtest.steps.popups.checkout;


import org.automation.webtest.config.PropertyLoader;
import org.automation.webtest.core.DataBaseQuery;
import org.automation.webtest.pages.popups.checkout.TimeSlotsPopup;
import org.automation.webtest.steps.StepBase;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;


public class TimeSlotsPopupSteps extends StepBase {
    private TimeSlotsPopup popup;

    public TimeSlotsPopupSteps(TimeSlotsPopup popup){
        this.popup = popup;
    }

    @Step
    public void timeSlotsPopupDisplayed(){
        verifyElementIsDisplayed(popup.popup_timeSlots);
    }

    @Step
    public void timeSlotsPopupNotDisplayed(){
        verifyElementIsNotDisplayed(popup.popup_timeSlots);
    }

    @Step
    public void selectTheFirstAvailableTimeSlot(){
        popup.javaScriptClick(popup.timeSlots_skippedAmAndAlcohol.get(0));
        holdExecution();
    }

    @Step
    public void selectTheLastAvailableTimeSlot(){
        WebElement lastElement = popup.timeSlots_skippedAmAndAlcohol.get(popup.timeSlots_skippedAmAndAlcohol.size() - 1);
        popup.javaScriptClick(lastElement);
        holdExecution();
    }

    @Step
    public void selectAnAlcoholRestrictedTimeSlot(){
        holdExecution();
        popup.javaScriptClick(popup.timeSlots_onlyAlcohol.get(0));
        holdExecution(1000);
    }

    @Step
    public void clickOnCancelButton(){
        popup.click(popup.btn_cancel);
        popup.waitUntilElementIsDisappeared(popup.popup_timeSlots, 3);
    }

    @Step
    public void clickOnDoneButton(){
        popup.click(popup.btn_done);
        holdExecution();
    }

    @Step
    public void clickOnAlcoholDeliveryRestrictionLink(){
        popup.click(popup.lnk_alcoholDeliveryRestriction);
    }

    @Step
    public void verifyTimeSlotsAreAvailableToSelect(){
        verifyElementIsEnabled(popup.timeSlots_skippedAmAndAlcohol.get(0));
    }

    @Step
    public void verifyErrorMsgForUnselectedTimeSlot(){
        verifyElementIsDisplayed(popup.errMsg_timeSlotNotSelected);
    }

    @Step
    public void clickOutSideTimeSlotsPopup(){
        popup.clickOutSideOfAnElement(popup.btn_done, 100, 100);
    }

    @Step
    public String getTextForSelectedTimeSlot(){
        String var = popup.getAttributeValue(popup.selectedTimeSlot, "aria-label");
        String var1 = var.substring(var.indexOf(",")+1);
        String var2 = var1.replaceAll("\\bselected\\b", "");
        String var3 = var2.replaceAll(" +", "");
        return var3.toUpperCase();
    }

    @Step
    public void verifySelectedTimeSlotDisplayedCorrectlyInCheckout(String expected, String actual){
        verify(expected, actual);
    }

    @Step
    public void waitForPopupToBeDisappeared(){
        popup.waitUntilElementIsDisappeared(popup.popup_timeSlots, 3);
    }

    @Step
    public void emptyCart(){
        emptyCartFromViewCart();
    }

    @Step
    public void addAlcohol() {
        addAlcoholToCart(PropertyLoader.getValue("timeSlotsPopup.alcohol"), 3);
    }

    @Step
    public void removeSelectedTimeSlotFromDB(String email){
        DataBaseQuery dataBaseQuery = new DataBaseQuery();
        dataBaseQuery.deselectTimeSlot(email);
        browser.manage().deleteAllCookies();
    }

    @Step
    public void selectTimeslotByIndex(int index){
        popup.javaScriptClick(popup.timeSlots_allInADay.get(index));
        holdExecution();
    }

}
