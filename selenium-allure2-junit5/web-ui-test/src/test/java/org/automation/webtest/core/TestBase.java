package org.automation.webtest.core;

import org.automation.webtest.config.PropertyLoader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.events.StepFinishedEvent;
import ru.yandex.qatools.allure.events.StepStartedEvent;
import ru.yandex.qatools.allure.experimental.LifecycleListener;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;


public class TestBase extends LifecycleListener {

    protected String getLastExecutedTestName() {
        return currentTestName.getMethodName();
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

    public String uniqueUserName() {
        String timeStamp = new SimpleDateFormat("MM.dd.HH.mm.ss").format(new Date());
        String userName = "test" + timeStamp + "@fdui.com";
        return userName;
    }
    public void verify(String message, int expected, int actual) {
        assertEquals(message, expected, actual);
    }

    public void verify(String message, double expected, double actual) {
        assertEquals(message, expected, actual, Double.valueOf(System.getProperty("delta")));
    }

    public void verify(double expected, double actual) {
        assertEquals(expected, actual, Double.valueOf(System.getProperty("delta")));

    }

    public void verify(String expected, String actual) {
        verify("String miss matched", expected, actual);
    }

    @Step
    public void verify(int actual, int expected) {
        verify("Count miss matched", expected, actual);
    }

    public void verify(WebElement elementToExtractText, String expected) {
        verify(expected, elementToExtractText.getText());
    }

    protected void verify(String message, BigInteger expected, BigInteger actual) {

            if (null == expected) {
                verifyNull(message, actual);
            } else {
                assertEquals(message, expected.longValue(), actual.longValue());
            }
    }

    protected void verify(String message, BigDecimal expected, BigDecimal actual) {
        if (null == expected) {
            verifyNull(message, actual);
        } else {
            assertEquals(message, expected.longValue(), actual.longValue());
        }
    }

    protected void verify(String message, BigDecimal expected, BigDecimal actual, double precision) {
        if (null == expected) {
            verifyNull(message, actual);
        } else {
            assertEquals(message, expected.doubleValue(), actual.doubleValue(), precision);
        }
    }

    protected void verify(String message, LocalDate expected, LocalDate actual, boolean withTime) {

        if (null == expected) {
            verifyNull(message, actual);
        } else {

            if (withTime) {
                assertEquals(message, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(expected),
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(actual));
            } else {
                assertEquals(message, new SimpleDateFormat("MM-dd-YYYY").format(expected),
                        new SimpleDateFormat("MM-dd-YYYY").format(actual));
            }
        }

    }

    protected void verify(String message, Date expected, Date actual) {
        verify(message, expected, actual, false);
    }

    protected void verify(String message, Date expected, Date actual, boolean withTime) {
        if (null == expected) {
            verifyNull(message, actual);
        } else {

            if (withTime) {
                assertEquals(message, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(expected),
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(actual));
            } else {
                assertEquals(message, new SimpleDateFormat("MM/dd/YYYY").format(expected),
                        new SimpleDateFormat("MM/dd/YYYY").format(actual));
            }
        }

    }

    protected void verify(String message, long expected, long actual) {
            assertEquals(message, expected, actual);
    }


    protected void verify(String message, double expected, double actual, double precision) {

            assertEquals(message, expected, actual, precision);

    }

    protected void verify(String message, Long expected, Long actual) {
            if (null == expected) {
                verifyNull(message, actual);
            } else {
                assertEquals(message, expected, actual);
            }

    }

    protected void verify(String message, String expected, String actual) {
        if (null == expected) {
            verifyNotNull(message, actual);
        } else {
            if (null == actual) {
                new AssertionError(message + " >> NULL");
            }
            assertEquals(message, expected, actual);
        }
    }

    protected void verify(String message, Object expected, Object actual) {
        if (null == expected) {
            verifyNotNull(message, actual);
        } else {
            assertEquals(message, expected, actual);
        }

    }

    protected void verifyNotNull(String message, Object notNullObject) {
            assertNotNull(message, notNullObject);
    }

    protected void verifyNull(String message, Object nullObject) {
            assertNull(message, nullObject);
    }

    protected void verifyTrue(String message, boolean condition) {
        assertTrue(message, condition);
    }

    protected void verifyFalse(String message, boolean condition) {
            assertFalse(message, condition);
    }

    private Deque<String> names = new LinkedList<>();
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    protected static WebDriver browser;
    protected static String baseUrl;

    //@Rule
    //public ErrorCollector errorCollector = new ErrorCollector();

    @Rule
    public TestWatcher testLogs = new LoggingRule(logger);

    @Rule
    public TestWatcher screenshotTaker = new ScreenShotTaker((TakesScreenshot) browser);

    public TestBase() {

    }

    @Step
    public void patternMatcher(String expectedPattern, String actualString) {
        Pattern pattern = Pattern.compile(expectedPattern);
        Matcher matcher = pattern.matcher(actualString);
        verifyTrue("Given pattern did not match!", matcher.matches());
    }

    @Step
    public void verifyAlertIsPresent(boolean notPresent) {
        verifyTrue("No alert is present", notPresent);
    }

    public void assertFail(String message) {
        fail(message);
    }

    @Step
    public void verifyAlertIsNotPresent(boolean present) {
        verifyFalse("Alert is present", present);
    }

    @Step
    public void switchWindow(DriverWindow windowIndex, boolean closeCurrentWindow) {
        Set<String> availableWindows = browser.getWindowHandles();
        List<String> windowsList = new ArrayList<>(availableWindows);
        if (closeCurrentWindow)
            browser.close();
        if (windowIndex.index < windowsList.size()) {
            browser.switchTo().window(windowsList.get(windowIndex.index));
        } else {
            fail("Window is not available");
        }
    }

    @AfterClass
    public static void cleanupClass() {
        Browser.close();
    }

    @Override
    public void fire(StepStartedEvent event) {
        names.push(event.getName());
        logger.info(getOffset() + "@Step:" + names.getFirst());
    }

    @Override
    public void fire(StepFinishedEvent event) {
        logger.info(getOffset() + "@Step done " + names.poll());
    }

    @Rule
    public TestName currentTestName = new TestName();

    @BeforeClass
    public static void initForAllClasses() throws IOException {
        PropertyLoader.loadProperties();
        browser = Browser.getInstance();
        baseUrl = System.getProperty("app.url");
    }

    private String getOffset() {
        return new String(new char[names.size() == 0 ? 0 : names.size() - 1]).replaceAll("\0", "   ");
    }

    public static void print(WebElement element) {
        System.out.println("TAG : " + element.getTagName());
        System.out.println("TXT :" + element.getText());
        System.out.println("VAL  :" + element.getAttribute("value"));
        System.out.println("SIZE :" + element.getSize().toString());
        System.out.println("Element :" + element.toString());
        System.out.println("Cont  :" + element.getCssValue("content"));
    }

    public void testTextField(final WebElement element, final String expectedResult){

        verifyTrue("Element is not displayed", element.isDisplayed());
        assertTrue("Element is not enabled", element.isEnabled());
        element.clear();
        element.sendKeys(expectedResult);
        assertEquals("String miss matched", expectedResult, element.getAttribute("value"));
    }
}
