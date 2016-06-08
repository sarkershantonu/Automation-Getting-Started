package org.pages.utils;

import org.automation.Browser;
import org.automation.RandomizeHelper;
import org.automation.exceptions.CannotClickElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.element.*;

import java.util.ArrayList;
import java.util.Iterator;

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
    public  void waitForAjaxComplete(int waitTime) {


        try {
            Browser.setWebDriverWait(waitTime).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return Boolean.valueOf(isAjaxComplete());
                }
            });
        } catch (Exception var2) {
            ;
        }

    }
    public boolean isAjaxComplete() {
        try {
            return ((Boolean)Browser.getJSexcutor().executeScript("return $.active == 0", new Object[0])).booleanValue();
        } catch (WebDriverException e) {
            e.printStackTrace();
            return true;
        }
    }
    public static Boolean isPageLoaded() {
        try {
            return ((Boolean)Browser.getJSexcutor().executeScript("return document.readyState", new Object[0]).equals("complete"));
        } catch (WebDriverException var1) {
            return Boolean.valueOf(true);
        }
    }
    public static void waitForPageLoaded() {
        try {
            Browser.setWebDriverWait(20).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return isPageLoaded();
                }
            });
        } catch (Exception var1) {
            ;
        }

    }
    public  String getText(TextInput element) {
        return !isElementPresent((TypifiedElement)element)?"":element.getText();
    }
    public  String getText(WebElement element) {
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
    public void setSelectByText(Select select, String text) {

        if(!select.getOptions().isEmpty() && !text.equals("_ignore_")) {
            if(!text.isEmpty() && !text.equals("_any_")) {
                if(!isFilledWithThatTextAlready(select, text)) {
                    setSelectByTextUnchecked(select, text);
                }
            } else {
                setSelectByIndex(select, RandomizeHelper.getInt(1, select.getOptions().size() - 1).intValue());
            }

        }
    }
    public boolean setSelectByContainedText(Select select, String text) {

        boolean isOptionExist = false;
        ArrayList<String> optionTextAsList = new ArrayList();

        for(WebElement option : select.getOptions()){
            if(getText((WebElement)option).contains(text)) {
                optionTextAsList.add(getText((WebElement)option));
            }
        }
        if(!optionTextAsList.isEmpty()) {
            setSelectByText(select, RandomizeHelper.getRandomItem(optionTextAsList));
            isOptionExist = true;
        }

        return isOptionExist;
    }
    public void setSelectByTextUnchecked(Select select, String text) {
        try {
            select.selectByVisibleText(text);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    public  String getFieldValue(String label) {
        return getText((WebElement)getFieldByLabel(label));
    }

    public  String getFieldValueLink(String label) {
        return getText((WebElement)getFieldByLabel(label).findElement(By.xpath("./a")));
    }

    /**
     * This is fully page dependent,
     * TOdo => adopt with opencart
     * @param label
     * @return
     */
    public  WebElement getFieldByLabel(String label) {
        return driver.findElement(By.xpath("(.//p[@class=\'label\'][contains(text(), \"" + label + "\")]" + "//ancestor::div[@class=\'inputcontainer\']" + "//p[@class=\'field\'])[1]"));
    }
 // TOdo => adopt with opencart
    public  WebElement getTableRowByLabel(String label) {
        return driver.findElement(By.xpath(".//*[contains(text(), \"" + label + "\")]" + "//ancestor::tr"));
    }
    public  void typeAutoComplete(TextInput txtInput, String value) {

        typeAutoComplete(txtInput, value, 2);
    }
    public  void typeAutoComplete(TextInput txtInput, String value, int timeOut) {
        if(value.isEmpty()) {
            txtInput.clear();
        } else if(!getText(txtInput).equals(value)) {
            type(txtInput, new CharSequence[]{value});
            waitForAjaxComplete(timeOut);

            try {
                click(txtInput.getWrappedElement().findElement(By.xpath("./parent::div//li[contains(text(), \"" + value + " (\") or contains(text(), \"" + value + ",\")]")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    public  String getDefaultParamIfEmpty(String param) {
        return param.isEmpty()?"Select an option...":param;
    }

    public  WebElement getTableCheckboxByLabel(String name) {
        WebElement webElement = null;

        try {
            webElement = getTableRowByLabel(name).findElement(By.xpath(".//img[contains(@id, \'checkbox\')]"));
        } catch (NoSuchElementException e) {
          e.printStackTrace();
        }
        return webElement;
    }
    // TOdo => adopt with opencart
    public  String getTextInputValueByLabel(String label) {
        TextInput textInput = new TextInput(driver.findElement(By.xpath(".//label[text()=\'" + label + "\']//parent::div//following-sibling::div//input")));
        return getText(textInput);
    }
    // TOdo => adopt with opencart
    public  String getSelectedOptionBylabel(String label) {
        Select select = new Select(driver.findElement(By.xpath(".//label[contains(.,\'" + label + "\')]//parent::div[1]//following-sibling::div[1]//ul//select|.//label[text()=\'" + label + "\']//parent::div//following-sibling::div//div//select")));
        return select.getFirstSelectedOption().getText();
    }
    // TOdo => adopt with opencart
    public  void setSelectedOptionByTextAndLabel(String text, String label) {
        Select select = new Select(driver.findElement(By.xpath(".//label[text()=\'" + label + "\']//parent::div//following-sibling::div//div//select")));
        setSelectByText(select, text);
    }
}
