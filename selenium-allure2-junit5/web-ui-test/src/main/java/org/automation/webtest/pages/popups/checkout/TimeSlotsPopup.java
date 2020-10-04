package org.automation.webtest.pages.popups.checkout;

import org.automation.webtest.pages.popups.PopupBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class TimeSlotsPopup extends PopupBase {
    public int timeout = 15;

    @FindBy(id = "timeslots_grid")
    @CacheLookup
    public WebElement popup_timeSlots;

    @FindBy(xpath = "//div[@class='tsHeaderE ']")
    @CacheLookup
    public List <WebElement> daysOfTheWeek;

    @FindBy(xpath = "//div[@id='timeslots_grid']/descendant::td[@class='ts_d']/table/descendant::label/descendant::span[not(contains(text(), 'alcohol restricted')) and not(contains(text(), 'am'))]/ancestor::label")
    @CacheLookup
    public List <WebElement> timeSlots_skippedAmAndAlcohol;

    @FindBy(xpath = "//div[@class='tsContent']/descendant::input[@checked='checked']")
    @CacheLookup
    public WebElement selectedTimeSlot;

    @FindBy(xpath = "//div[@id='timeslots_grid']/descendant::td[@class='ts_d']/table/descendant::label/descendant::span[contains(text(), 'alcohol restricted')]/ancestor::label")
    @CacheLookup
    public List <WebElement> timeSlots_onlyAlcohol;

    @FindBy(xpath = "//div[@id='timeslots_grid']/descendant::td[@class='ts_d']/table/descendant::label/descendant::span[not(contains(text(), 'alcohol restricted')) and not(contains(text(), 'am'))]/ancestor::label")
    @CacheLookup
    public List <WebElement> timeSlots_onlyAmAndSkippedAlcohol;

    @FindBy(xpath = "//div[@id='timeslots_grid']/descendant::td[@class='ts_d']/table/descendant::label")
    @CacheLookup
    public List <WebElement> timeSlots_all;

    @FindBy(xpath = "//li[@id='timeslot-tab']/descendant::button[text()='Done ']")
    @CacheLookup
    public WebElement btn_done;

    @FindBy(xpath = "//li[@id='timeslot-tab']/descendant::button[text()='Cancel ']")
    @CacheLookup
    public WebElement btn_cancel;

    @FindBy(xpath = "//td[@class='timeslots_legend_no_alcohol']/a")
    @CacheLookup
    public WebElement lnk_alcoholDeliveryRestriction;

    @FindBy(xpath = "//span[text()='You must select a delivery timeslot. Please select one from below or contact Us for help.']")
    @CacheLookup
    public WebElement errMsg_timeSlotNotSelected;

    @FindBy(xpath = "//div[@id='timeslots_grid']/descendant::a[@class='accessibleOutlineFF' and contains(@aria-label, 'MON')]/ancestor::td[@class='ts_d']/table/descendant::label")
    @CacheLookup
    public  List<WebElement> timeSlots_allInADay;

    public TimeSlotsPopup(WebDriver driver) {
        super(driver);
        initElement(driver,this);
    }

    public void initCheckoutTimeSlotsPopup(){
        initElement(driver,this);
    }
}
