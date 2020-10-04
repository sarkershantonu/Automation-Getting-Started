package org.automation.webtest.steps.popups;


import org.automation.webtest.pages.popups.CartPopup;
import org.automation.webtest.steps.StepBase;
import ru.yandex.qatools.allure.annotations.Step;



public class CartPopupSteps extends StepBase {
    private CartPopup popup;

    public CartPopupSteps(CartPopup popup){
        this.popup = popup;
    }

    @Step
    public void removeAllFromCart(){
        for(int index = 0; index < popup.productRowInCart.size(); index++){
            popup.mouseHoverOnElement(popup.productRowInCart.get(index));
            popup.click(popup.btn_remove.get(index));
            holdExecution(75);
        }
        holdExecution(3000);
    }

    @Step
    public void clickOnViewCart(){
        popup.click(popup.link_viewCart);
    }
}
