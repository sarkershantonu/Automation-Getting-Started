package org.automation.pages.opencart.common;

import org.automation.pages.opencart.core.OpenCartPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shantonu on 12/28/16.
 */
public class Menu extends OpenCartPageBase {



    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=20']")
  
    public WebElement desktop;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=20_26']")
  
    public WebElement pc;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=20_27']")
  
    public WebElement mac;


    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18']")
  
    public WebElement laptop_notebook;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_46']")
  
    public WebElement laptop_notebook_macs;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_45']")
  
    public WebElement laptop_notebook_windows;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_46']")
  
    public WebElement macs;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=18_45']")
  
    public WebElement windows;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25']")
  
    public WebElement components;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_29']")
  
    public WebElement components_mice_trackballs;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_28']")
  
    public WebElement components_monitors;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_30']")
  
    public WebElement components_printers;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_31']")
  
    public WebElement components_scanners;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=25_32']")
  
    public WebElement components_webCam;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=57']")
  
    public WebElement tablets;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=17']")
  
    public WebElement software;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=24']")
  
    public WebElement phone_pda;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=33']")
  
    public WebElement cameras;

    @FindBy(css = "a[href='https://demo.opencart.com/index.php?route=product/category&path=34']")
  
    public WebElement mp3_players;
}
