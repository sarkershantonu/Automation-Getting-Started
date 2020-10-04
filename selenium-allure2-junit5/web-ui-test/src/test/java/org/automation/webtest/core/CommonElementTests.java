package org.automation.webtest.core;

import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CommonElementTests {

    public static  void testTextField(final WebElement element, final String expectedResult){
        assertTrue("Element is not displayed", element.isDisplayed());
        assertTrue("Element is not enabled", element.isEnabled());
        element.clear();
        element.sendKeys(expectedResult);
        assertEquals("String miss matched", expectedResult, element.getAttribute("value"));
    }
}
