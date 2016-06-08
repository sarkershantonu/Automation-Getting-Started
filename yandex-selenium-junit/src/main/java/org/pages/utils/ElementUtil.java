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
    public void click(TypifiedElement element) {

        if(isElementVisible(element)) {
            try {
                element.getWrappedElement().click();
            } catch (Exception var2) {
                click(element);
            }
        }

    }
    public void click(WebElement element) throws CannotClickElementException {
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
    public static boolean isElementPresent(TypifiedElement element) {
        if(element != null && element.getWrappedElement() != null) {
            return true;
        } else {
            return false;
        }
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
    public  boolean isElementVisible(HtmlElement htmlElement, int newTimeOut) {

        return isElementVisible((WebElement)htmlElement.getWrappedElement(), newTimeOut);
    }

    public boolean isElementVisible(HtmlElement element) {
        return isElementVisible((HtmlElement)element, 20);
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

    public void setSelectByValueUnchecked(Select select, String value) {
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
    public void typeUnchecked(TextInput element, CharSequence... charSequences) {
        try {
            element.clear();
            element.sendKeys(charSequences);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public  void inputFile(FileInput element, String fileName) {
        String textValue = "";
        if(isElementPresent((TypifiedElement)element)) {
            try {
                element.setFileToUpload(fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void waitForDisappear(TypifiedElement shouldDisappearElement) {
        while(isElementVisible(shouldDisappearElement)) {
           Browser.pause(1);
        }
    }
    public  String getText(TextInput element) {
        return !isElementPresent((TypifiedElement)element)?"":element.getText();
    }

    public  String getText(TextBlock element) {
        return !isElementPresent((TypifiedElement)element)?"":element.getText();
    }
    public String getAttribute(TypifiedElement element, String attribute) {

        return !isElementPresent(element)?"":getAttribute((WebElement)element.getWrappedElement(), attribute);
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
    public String getAttribute(HtmlElement element, String attribute) {
        return !isElementPresent(element)?"":getAttribute((WebElement)element.getWrappedElement(), attribute);
    }
    
}
