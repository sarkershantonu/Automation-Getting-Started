package org.automation.webtest.pages;


import org.automation.webtest.actions.CommonActions;
import org.automation.webtest.core.Browser;
import org.automation.webtest.pages.common.FooterArea;
import org.automation.webtest.pages.common.HeaderArea;
import org.automation.webtest.pages.popups.CreateAccountPopup;
import org.automation.webtest.pages.popups.SignInPopup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase extends CommonActions {
    public String name;
    public FooterArea footerArea;
    public HeaderArea headerArea;
    public SignInPopup signInPopup;
    public CreateAccountPopup createAccountPopup;

    public int timeout = 15;

    public PageBase() {
        driver = Browser.getInstance();
        initElement(driver,this);
    }

    public String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return pageUrl;
    }

    public void setUrl(String url) {
        this.pageUrl = url;
    }

    public String pageUrl;
    public String pageLoadedText;


    public PageBase(WebDriver aDriver) {
        this.driver = aDriver;
        initElement(this);
        initStaticItems();
    }

    public void initStaticItems() {
        headerArea = new HeaderArea(this.driver);
        initElement(driver, headerArea);
        footerArea = new FooterArea(this.driver);
        initElement(driver, footerArea);
        signInPopup = new SignInPopup(driver);
        createAccountPopup = new CreateAccountPopup(driver);
    }

    public PageBase verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }

    public String getTitle() {
        holdExecution(1000);
        return driver.getTitle();
    }

    public void print(WebElement element) {
        System.out.println("TAG " + element.getTagName());
        System.out.println("TXT " + element.getText());
        System.out.println("VAL " + element.getAttribute("value"));
        System.out.println("SIZE " + element.getSize().toString());
        System.out.println(element.toString());
    }

    public double getUSDFrom(String givenString) {
        return getDoubleFrom(givenString, "[0-9]+.[0-9]+");
    }

}
