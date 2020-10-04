package org.automation.webtest.steps.popups.checkout;

import org.automation.webtest.pages.popups.checkout.PayWithPopup;
import org.automation.webtest.steps.StepBase;
import ru.yandex.qatools.allure.annotations.Step;


public class PayWithPopupSteps extends StepBase {
    private PayWithPopup popup;

    public PayWithPopupSteps(PayWithPopup popup){
        this.popup = popup;
    }

    @Step
    public void payWithPopupDisplayed(){
        verifyElementIsDisplayed(popup.popup_payWith);
    }

    public void validateDoneButton(){
        verifyButton(popup, popup.btn_done, "Done");
    }

    public void validateCancelButton(){
        verifyButton(popup, popup.btn_cancel, "Cancel");
    }

    public void validateAddMethodButton(){
        verifyButton(popup, popup.btn_addMethod, "Add\nMethod");
    }

    @Step
    public void clickOnAddMethodButton(){
        popup.click(popup.btn_addMethod);
    }

    @Step
    public  int getTotalSavedPaymentMethods(){
        return popup.paymentMethodList.size();
    }

    @Step
    public void verifyPaymentMethodIsAdded(int totalPaymentMethodsBefore, int totalPaymentMethodsAfter){
        verify(totalPaymentMethodsAfter, totalPaymentMethodsBefore);
    }
}
