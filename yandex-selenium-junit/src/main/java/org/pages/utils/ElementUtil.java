package org.pages.utils;

import org.automation.exceptions.CannotClickElementException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

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

}
