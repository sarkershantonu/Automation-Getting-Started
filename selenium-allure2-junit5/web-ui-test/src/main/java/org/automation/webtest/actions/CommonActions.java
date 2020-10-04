package org.automation.webtest.actions;


import org.automation.webtest.config.PropertyLoader;
import org.automation.webtest.core.Browser;
import org.automation.webtest.core.DriverWindow;
import org.automation.webtest.pages.PageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CommonActions {

    public WebDriver driver;

    public CommonActions(){

    }

    public CommonActions(WebDriver driver){
        this.driver =  driver;
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public void initElement() {
        PageFactory.initElements(driver, this);
    }
    public <T extends PageBase> void initElement(T t) {
        PageFactory.initElements(driver, t);
    }
    public  <T> T initElement(WebDriver driver, T t) {
        this.driver = driver;
        PageFactory.initElements(driver, t);
        return t;
    }

    public void click(WebElement element) {
        element.click();
    }

    @Step
    public void typeText(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void clear(WebElement element) {
        element.clear();
    }

    public void closeAllWindowsButFirst(WebDriver driver) {
        Set<String> availableWindows = driver.getWindowHandles();
        List<String> windowsList = new ArrayList<>(availableWindows);

        if (windowsList.size() > 1) {
            for (int index = 1; index < windowsList.size(); index++) {
                driver.switchTo().window(windowsList.get(index));
                driver.close();
            }
            driver.switchTo().window(windowsList.get(DriverWindow.FIRST.index));
        }
    }

    @Step
    public void waitUntilElementIsDisappeared(WebElement element, long maxWaitTimeInSecond) {
        if (!element.equals(null) && element.isDisplayed() == true) {
            WebDriverWait wait = new WebDriverWait(driver, maxWaitTimeInSecond);
            wait.until(ExpectedConditions.invisibilityOf(element));
        }
    }

    public void pageRefresh() {
        driver.navigate().refresh();
    }

    @Step
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    @Step
    public void waitUntilElementIsDisplayed(WebElement element, long maxWaitTimeInSecond) {
        if (!element.equals(null)) {
            WebDriverWait wait = new WebDriverWait(driver, maxWaitTimeInSecond);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
    }

    public void sendKeyBoardEvent(WebElement element, Keys keyboardEvent) {
        element.sendKeys(keyboardEvent);
    }

    @Step
    public void pressEnterKeyFromKeyBoard(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }

    @Step
    public void clearWithBackspaceAndType(WebElement element, String text) {
        element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(text);
    }

    @Step
    public void switchFrame(WebElement frameLocator) {
        driver.switchTo().frame(frameLocator);
    }

    @Step
    public void switchBackToDefaultContent(){
        driver.switchTo().defaultContent();
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException notPresent) {
            return false;
        }
    }

    public void resetAlert() {
        if (isAlertPresent()) {
            driver.switchTo().alert().dismiss();
        }
    }

    @Step
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }


    @Step
    public void javaScriptClick(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();", element);
    }

    public String getElementText(WebElement element){
        return element.getText();
    }

    @Step
    public void mouseHoverOnElement(WebElement elementToHover){
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).build().perform();
    }

    public double getDoubleFrom(String givenString, String pattern) {
        double value = 0.0;
        Matcher matcher = Pattern.compile(pattern).matcher(givenString);
        if (matcher.find()) {
            value = Double.parseDouble(matcher.group(0));
        }
        return value;
    }

    //@Step
    public String getAttributeValue(WebElement element, String attributeName){
        return element.getAttribute(attributeName);
    }

    @Step
    public void clickByJS(WebElement aWebElement) {
        String script = "";//todo
        Browser.getJs().executeAsyncScript(script);

    }

    @Step
    public void javaScriptTypeText(WebElement element, String text) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].value='" + text + "';", element);
    }

    @Step
    public void typeTextWithoutClick(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    @Step
    public void typeTextWithoutClear(WebElement element, String text) {
        element.click();
        element.sendKeys(text);
    }

    @Step
    public void typeTextWithoutClickAndClear(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void holdExecution(long millisecond){
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void holdExecution(){
        try {
            Thread.sleep(PropertyLoader.getValueAsLong("step.default.wait"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void dropdownSelectByIndex(WebElement element, int index){
        Select dropdown = new Select(element);
        dropdown.selectByIndex(index);
    }

    public void dropdownSelectByValue(WebElement element, String value){
        Select dropdown = new Select(element);
        dropdown.selectByValue(value);
    }

    public void dropdownSelectByVisibleText(WebElement element, String visibleText){
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(visibleText);
    }

    public String dropdownFirstSelectedOptionText(WebElement element){
        Select dropdown = new Select(element);
        return dropdown.getFirstSelectedOption().getText();
    }

    public void clickOutSideOfAnElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 10, 10).click().build().perform();
    }

    public void clickOutSideOfAnElement(WebElement element, int x, int y) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    @Step
    public void waitUntilElementIsClickable(WebElement element, long maxWaitTimeInSecond) {
        if (!element.equals(null)) {
            WebDriverWait wait = new WebDriverWait(driver, maxWaitTimeInSecond);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        }
    }

    @Step
    public void mouseMoveOnElementAndClick(WebElement elementToClick){
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToClick).click().build().perform();
    }

    public String psudoElementBefore(WebElement element){
        String pseudo = ((JavascriptExecutor)driver)
                .executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('content');",element).toString();
        return pseudo;
    }

    public String psudoElementAfter(WebElement element){
        String pseudo = ((JavascriptExecutor)driver)
                .executeScript("return window.getComputedStyle(arguments[0], ':after').getPropertyValue('content');",element).toString();
        return pseudo;
    }
}
