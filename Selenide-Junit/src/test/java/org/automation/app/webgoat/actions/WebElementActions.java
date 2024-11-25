package org.automation.app.webgoat.actions;

import com.codeborne.selenide.ClickOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

/***
 * List of all action performable to an web element.
 * If you webpage has custom right click context menu, include event here
 * if you want to restrict certain action perform to web element, perform here
 */
public class WebElementActions {
    private final By by;

    public WebElementActions(By by) {
        this.by = by;
    }
    public WebElement click(){
        $(this.by).click();
        return $(this.by);
    }
    public WebElement doubleClick(){
        $(this.by).doubleClick();
        return $(this.by);
    }
    public WebElement doubleClickWithOptions(ClickOptions options){
        $(this.by).doubleClick(options);
        return $(this.by);
    }
    public WebElement rightClick(){
        $(this.by).contextClick();
        return $(this.by);
    }
}
