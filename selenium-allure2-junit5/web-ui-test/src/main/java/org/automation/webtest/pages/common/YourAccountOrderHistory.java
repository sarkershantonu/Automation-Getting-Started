package org.automation.webtest.pages.common;


import org.automation.webtest.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourAccountOrderHistory extends PageBase {
    public int timeout = 15;

    @FindBy(xpath = "//td[@class='order_history_table_id']")
    @CacheLookup
    public List <WebElement> allOrders;

    public YourAccountOrderHistory() {
        super();
        initStaticItems();
    }

    public YourAccountOrderHistory(WebDriver driver) {
        super(driver);
        initStaticItems();
    }

    @Override
    public void initStaticItems() {
        super.initStaticItems();
        this.pageUrl = "/your_account/order_history.jsp";
        this.title = "Your Orders | FreshDirect";
    }
}
