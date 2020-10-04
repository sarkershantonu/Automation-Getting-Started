package org.automation.webtest.pages.singlepages;

import org.automation.webtest.model.DepartmentParameter;
import org.automation.webtest.pages.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Department extends PageBase {

    @FindBy(xpath = "/html/body/section/section[4]/section/div[10]/div/section[1]/div[2]/div[1]/a/div[2]")
    public WebElement first_;

    public Department setURLParameter(final DepartmentParameter parameters){
        this.setUrl("/browse.jsp?" + parameters.toString());
        return this;
    }

    public Department(WebDriver driver) {
        super(driver);
    }
}
