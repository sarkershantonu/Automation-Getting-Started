package org.automation.webtest.steps.popups;


import org.automation.webtest.pages.popups.YourAccountPopup;
import org.automation.webtest.steps.StepBase;
import ru.yandex.qatools.allure.annotations.Step;


public class YourAccountPopupSteps extends StepBase {
    private YourAccountPopup popup;

    public YourAccountPopupSteps(YourAccountPopup popup){
        this.popup = popup;
    }

    @Step
    public void clickOnSignOutButton(){
        popup.javaScriptClick(popup.btn_signOut);
        holdExecution(750);
    }

    @Step
    public void yourFreshDirectPopupIsDisplayed(){
        verifyElementIsDisplayed(popup.yourFreshDirectPopup);
    }

    @Step
    public void clickOnViewTimeSlotsLink(){
        popup.javaScriptClick(popup.lnk_viewTimeSlots);
        holdExecution();
    }

    @Step
    public void clickOnYourTopItemsLink(){
        popup.javaScriptClick(popup.lnk_yourTopItems);
        holdExecution();
    }

    @Step
    public void clickOnShopPastOrdersLink(){
        popup.javaScriptClick(popup.lnk_shopPastOrders);
        holdExecution();
    }

    @Step
    public void clickOnDeliveryPassLink(){
        popup.javaScriptClick(popup.lnk_deliveryPass);
        holdExecution();
    }

    @Step
    public void clickOnShoppingListsLink(){
        popup.javaScriptClick(popup.lnk_shoppingList);
        holdExecution();
    }

    @Step
    public void clickOnDeliveryInfoLink(){
        popup.javaScriptClick(popup.lnk_deliveryInfo);
        holdExecution();
    }

    @Step
    public void clickOnHelpLink(){
        popup.javaScriptClick(popup.lnk_help);
        holdExecution();
    }

    @Step
    public void clickOnAccountPreferencesLink(){
        popup.javaScriptClick(popup.lnk_accountPreferences);
        holdExecution();
    }

    @Step
    public void clickOnDeliveryAddressesLink(){
        popup.javaScriptClick(popup.lnk_deliveryAddresses);
        holdExecution();
    }

    @Step
    public void clickOnPaymentMethodsLink(){
        popup.javaScriptClick(popup.lnk_paymentMethods);
        holdExecution();
    }

    @Step
    public void clickOnOrderHistoryLink(){
        popup.javaScriptClick(popup.lnk_orderHistory);
        holdExecution();
    }

    @Step
    public void clickOnStoreCreditsLink(){
        popup.javaScriptClick(popup.lnk_storeCredits);
        holdExecution();
    }

    @Step
    public void clickOnGiftCardsLink(){
        popup.javaScriptClick(popup.lnk_giftCards);
        holdExecution();
    }

}
