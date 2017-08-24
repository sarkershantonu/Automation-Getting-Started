package org.automation.opencart.pages.common;

import org.automation.opencart.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/28/16.
 */
public class Menu extends PageBase {



    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=20']")
    @CacheLookup
    public WebElement desktop;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=20_26']")
    @CacheLookup
    public WebElement pc;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=20_27']")
    @CacheLookup
    public WebElement mac;


    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18']")
    @CacheLookup
    public WebElement laptop_notebook;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_46']")
    @CacheLookup
    public WebElement laptop_notebook_macs;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_45']")
    @CacheLookup
    public WebElement laptop_notebook_windows;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_46']")
    @CacheLookup
    public WebElement macs;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_45']")
    @CacheLookup
    public WebElement windows;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25']")
    @CacheLookup
    public WebElement components;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_29']")
    @CacheLookup
    public WebElement components_mice_trackballs;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_28']")
    @CacheLookup
    public WebElement components_monitors;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_30']")
    @CacheLookup
    public WebElement components_printers;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_31']")
    @CacheLookup
    public WebElement components_scanners;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_32']")
    @CacheLookup
    public WebElement components_webCam;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=57']")
    @CacheLookup
    public WebElement tablets;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=17']")
    @CacheLookup
    public WebElement software;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=24']")
    @CacheLookup
    public WebElement phone_pda;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=33']")
    @CacheLookup
    public WebElement cameras;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=34']")
    @CacheLookup
    public WebElement mp3_players;
}
