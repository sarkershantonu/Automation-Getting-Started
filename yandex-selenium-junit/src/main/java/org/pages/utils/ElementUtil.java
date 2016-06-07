package org.pages.utils;

import org.automation.Browser;
import org.automation.exceptions.CannotClickElementException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.*;

/**
 * Created by shantonu on 6/6/16.
 * this class is responsible for all utilitie for yandex element based pages.
 */
public class ElementUtil extends UtilBase {

    public ElementUtil(WebDriver aDriver) {
        super(aDriver);
    }
    public void scrollDown(TypifiedElement element) {
        try {
            executor.executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
        } catch (WebDriverException var2) {
            ;
        }

    }

    public void click(TypifiedElement element) throws CannotClickElementException {
        try {
            executor.executeScript("arguments[0].click();", new Object[]{element});
        } catch (WebDriverException var3) {
            String text = element.toString() + " :" + var3.getMessage();

            throw new CannotClickElementException(text);
        }
    }

    public boolean isHorizontalScrollbarPresent(TypifiedElement element) {
        long clientWidth = ((Long) executor.executeScript("return arguments[0].clientWidth", new Object[]{element})).longValue();
        long scrollWidth = ((Long)executor.executeScript("return arguments[0].scrollWidth", new Object[]{element})).longValue();
        return clientWidth < scrollWidth;
    }

    public boolean isElementPresent(HtmlElement element) {
        if(element != null && element.getWrappedElement() != null) {
            return true;
        } else {

            return false;
        }
    }

    public void typeUnchecked(TextInput element, CharSequence... charSequences) {


        try {
            element.clear();
            element.sendKeys(charSequences);
        } catch (Exception var3) {

        }

    }
    public String getAttribute(WebElement webElement, String attribute) {
        String attributeValue = "";

        try {
            attributeValue = webElement.getAttribute(attribute);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return attributeValue;
    }
    public boolean isRadioChecked(WebElement radio) {
        return getAttribute(radio, "checked") != null;
    }
    public boolean isRadioChecked(Radio radio) {
        return radio.getWrappedElement() != null && isRadioChecked(radio.getWrappedElement());
    }
    public boolean isRadioEnabled(WebElement radio) {
        return getAttribute(radio, "disabled") == null;
    }
    public  boolean isRadioEnabled(Radio radio) {
        return radio.getWrappedElement() != null && isRadioEnabled(radio.getWrappedElement());
    }
    public boolean isElementVisible(TypifiedElement typifiedElement) {
        return isElementVisible((TypifiedElement)typifiedElement, 20);
    }
    public boolean isElementVisible(TypifiedElement element, int newTimeOut) {

        return isElementVisible((WebElement)element.getWrappedElement(), newTimeOut);
    }
    public boolean isFilledWithThatTextAlready(TextInput element, String text) {
        return element.getText().equals(text);
    }
    public boolean isFilledWithThatTextAlready(Select element, String text) {
        try {
            return element.getFirstSelectedOption().getText().equals(text);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isFilledWithThatValueAlready(Select element, String value) {
        try {
            return element.getFirstSelectedOption().getAttribute("value").equals(value);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setSelectByValueUnchecked(Select select, String value) {
        try {
            select.selectByValue(value);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void setSelectByIndex(Select select, int index) {
        try {
            select.selectByIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void setSelectByValue(Select select, String value) {

        if(!select.getOptions().isEmpty()) {
            if(!isFilledWithThatValueAlready(select, value)) {
                setSelectByValueUnchecked(select, value);
            }
        } else {

        }

    }

    public boolean isElementVisible(WebElement webElement, int newTimeOut) {
        WebDriverWait wait = Browser.setWebDriverWait(newTimeOut);
        try {
            wait.until(ExpectedConditions.visibilityOf(webElement));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public void type(TextInput element, CharSequence... charSequences) {
        String textValue = "";
        CharSequence[] arr$ = charSequences;
        int len$ = charSequences.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            CharSequence charValue = arr$[i$];
            textValue = textValue + charValue;
        }
        if(isElementVisible((TypifiedElement)element) && !isFilledWithThatTextAlready(element, textValue)) {
            typeUnchecked(element, charSequences);
        }

    }

}
