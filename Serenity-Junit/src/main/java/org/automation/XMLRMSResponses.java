import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class XMLRMSResponses {

    public static String getActualResponse(String request) {

        try {
            if (StringUtils.equals(getDriver().getTitle(), "")) {
                getDriver().navigate().back();
                getDriver().findElement(By.name("XML")).clear();
            }

            WebElement xmlfield = getDriver().findElement(By.name("XML"));

            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value = arguments[1];", xmlfield, request);
            xmlfield.submit();

            return getDriver().getPageSource();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Test Form Server is not working");
        }
    }
}
