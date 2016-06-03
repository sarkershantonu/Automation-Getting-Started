package org.pages;

/**
 * Created by shantonu on 3/12/16.
 */
import java.util.Map;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage extends PageBase {
    private Map<String, String> data;
    private int timeout = 30;

    @FindBy(css = "a[href='//www.google.pl/intl/en/about.html?fg=1']")
    @CacheLookup
    private WebElement about;

    //@FindBy(xpath = ".//*[@id='gs_htif0']")
    @FindBy(id = "lst-ib")
    @CacheLookup
    private WebElement searchTextBox;

    @FindBy(css = "a.gb_za.gb_ce")
    @CacheLookup
    private WebElement addAShortcut;

    @FindBy(css = "a.gb_Ca.gb_7d.gb_ob")
    @CacheLookup
    private WebElement addAccount;

    @FindBy(css = "a[href='/advanced_search?hl=en-PL&fg=1']")
    @CacheLookup
    private WebElement advancedSearch;

    @FindBy(css = "a[href='//www.google.pl/intl/en/ads/?fg=1']")
    @CacheLookup
    private WebElement advertising;

    @FindBy(css = "a.gb_Cb.gb_Za")
    @CacheLookup
    private WebElement allYourGooglePages;

    @FindBy(id = "gb30")
    @CacheLookup
    private WebElement blogger;

    @FindBy(id = "gb10")
    @CacheLookup
    private WebElement books;

    @FindBy(css = "a[href='//www.google.pl/services/?fg=1']")
    @CacheLookup
    private WebElement business;

    @FindBy(id = "gb24")
    @CacheLookup
    private WebElement calendar;

    @FindBy(css = "a.gb_hb.gb_ce.gb_jb")
    @CacheLookup
    private WebElement change;

    @FindBy(id = "gb53")
    @CacheLookup
    private WebElement contacts;

    @FindBy(id = "gb25")
    @CacheLookup
    private WebElement docs;

    @FindBy(id = "gb49")
    @CacheLookup
    private WebElement drive;

    @FindBy(id = "hotword__chw-oe")
    @CacheLookup
    private WebElement enableOkGoogle;

    @FindBy(css = "a.gb_la.gb_6d")
    @CacheLookup
    private WebElement evenMoreFromGoogle;

    @FindBy(css = "#gbw div div.gb_ab.gb_Ze.gb_R.gb_Xe.gb_2e.gb_T div:nth-of-type(1) div:nth-of-type(2) a.gb_P")
    @CacheLookup
    private WebElement gmail1;

    @FindBy(id = "gb23")
    @CacheLookup
    private WebElement gmail2;

    @FindBy(id = "gb119")
    @CacheLookup
    private WebElement google1;

    @FindBy(id = "logo")
    @CacheLookup
    private WebElement google2;

    @FindBy(css = "#gbw div div.gb_ab.gb_Ze.gb_R.gb_Xe.gb_2e.gb_T div:nth-of-type(2) div:nth-of-type(4) div:nth-of-type(2) div:nth-of-type(1) div.gb_ib div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement googleProfile;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch;

    @FindBy(id = "gb300")
    @CacheLookup
    private WebElement hangouts;

    @FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[href='/history?hl=en-PL&fg=1']")
    @CacheLookup
    private WebElement history;

    @FindBy(name = "btnI")
    @CacheLookup
    private WebElement imFeelingLucky;

    @FindBy(css = "a[href='https://www.google.pl/imghp?hl=en&tab=wi&ei=WVvjVt-kOquxygP-3LPgDA&ved=0EKouCBIoAQ']")
    @CacheLookup
    private WebElement images;

    @FindBy(css = "a[href='//support.google.com/websearch/answer/186645?hl=en-PL']")
    @CacheLookup
    private WebElement learnMore1;

    @FindBy(css = "a[href='https://support.google.com/chrome/?p=ui_hotword_search']")
    @CacheLookup
    private WebElement learnMore2;

    @FindBy(id = "gb8")
    @CacheLookup
    private WebElement maps;

    @FindBy(css = "a.gb_ka.gb_ce")
    @CacheLookup
    private WebElement more;

    @FindBy(id = "gb192")
    @CacheLookup
    private WebElement myAccount1;

    @FindBy(css = "a.gb_Ca.gb_9d.gbp1.gb_ob")
    @CacheLookup
    private WebElement myAccount2;

    @FindBy(id = "hotword__chw-on")
    @CacheLookup
    private WebElement noThanks;

    private final String pageLoadedText = "Screen-reader users, click here to turn off Google Instant";

    private final String pageUrl = "https://www.google.pl";

    @FindBy(id = "gb31")
    @CacheLookup
    private WebElement photos;

    @FindBy(id = "gb78")
    @CacheLookup
    private WebElement play;



    @FindBy(css = "a[href='http://www.google.pl/intl/en/policies/privacy/']")
    @CacheLookup
    private WebElement privacy1;

    @FindBy(css = "a[href='//www.google.pl/intl/en/policies/privacy/?fg=1']")
    @CacheLookup
    private WebElement privacy2;

    @FindBy(css = "#chm div:nth-of-type(2) div:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement restartListening;

    @FindBy(id = "lst-ib")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff1;

    @FindBy(id = "gs_taif0")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff2;

    @FindBy(id = "gs_htif0")
    @CacheLookup
    private WebElement restartListeninghelphotwordDetectionIsOff3;

    @FindBy(css = "a[href='/setprefs?suggon=2&prev=https://www.google.pl/?gfe_rd%3Dcr%26ei%3DWVvjVu7QLqfs8wfTj4KYDg%26gws_rd%3Dssl&sig=0_JBwjkJshfMFQxNZoBRf9lZN2BJk%3D']")
    @CacheLookup
    private WebElement screenreaderUsersClickHereToTurn1;

    @FindBy(id = "csi")
    @CacheLookup
    private WebElement screenreaderUsersClickHereToTurn2;

    //@FindBy(id = "gb1")
    @FindBy(name = "btnG")
   // @CacheLookup
    private WebElement search;

    @FindBy(css = "a[href='//support.google.com/websearch/?p=ws_results_help&hl=en-PL&fg=1']")
    @CacheLookup
    private WebElement searchHelp;

    @FindBy(css = "a[href='https://www.google.pl/preferences?hl=en-PL&fg=1']")
    @CacheLookup
    private WebElement searchSettings;

    @FindBy(id = "_Yvd")
    @CacheLookup
    private WebElement sendFeedback;

    @FindBy(id = "fsettl")
    @CacheLookup
    private WebElement settings;



    @FindBy(id = "gb_71")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "#chm div:nth-of-type(3) div a")
    @CacheLookup
    private WebElement startListeningForOkGoogle;

    @FindBy(css = "a[href='//www.google.pl/intl/en/policies/terms/?fg=1']")
    @CacheLookup
    private WebElement terms;

    @FindBy(id = "gb51")
    @CacheLookup
    private WebElement translate;


    @FindBy(id = "gb36")
    @CacheLookup
    private WebElement youtube;

    public GooglePage() {

    }

    public GooglePage(WebDriver driver) {
        this();
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(pageUrl);
    }

    public GooglePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public GooglePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    public PageBase clickOn(WebElement element){
        element.clear();
        return this;
    }
    public PageBase clickAboutLink() {
        about.click();
        return this;
    }


    public PageBase typeOnSearchText(String text){
        searchTextBox.clear();
        searchTextBox.sendKeys(text);

        return this;
    }


    public PageBase clickAddAShortcutLink() {
        addAShortcut.click();
        return this;
    }

    
    public PageBase clickAddAccountLink() {
        addAccount.click();
        return this;
    }

    
    public PageBase clickAdvancedSearchLink() {
        advancedSearch.click();
        return this;
    }

    
    public PageBase clickAdvertisingLink() {
        advertising.click();
        return this;
    }

    
    public PageBase clickAllYourGooglePagesLink() {
        allYourGooglePages.click();
        return this;
    }

    
    public PageBase clickBloggerLink() {
        blogger.click();
        return this;
    }

    
    public PageBase clickBooksLink() {
        books.click();
        return this;
    }

    
    public PageBase clickBusinessLink() {
        business.click();
        return this;
    }

    
    public PageBase clickCalendarLink() {
        calendar.click();
        return this;
    }

    
    public PageBase clickChangeLink() {
        change.click();
        return this;
    }

    
    public PageBase clickContactsLink() {
        contacts.click();
        return this;
    }

    
    public PageBase clickDocsLink() {
        docs.click();
        return this;
    }

    
    public PageBase clickDriveLink() {
        drive.click();
        return this;
    }

    
    public PageBase clickEnableOkGoogleButton() {
        enableOkGoogle.click();
        return this;
    }

    
    public PageBase clickEvenMoreFromGoogleLink() {
        evenMoreFromGoogle.click();
        return this;
    }

    
    public PageBase clickGmail1Link() {
        gmail1.click();
        return this;
    }

    
    public PageBase clickGmail2Link() {
        gmail2.click();
        return this;
    }

    
    public PageBase clickGoogle1Link() {
        google1.click();
        return this;
    }

    
    public PageBase clickGoogle2Link() {
        google2.click();
        return this;
    }

    
    public PageBase clickGoogleProfileLink() {
        googleProfile.click();
        return this;
    }

    
    public PageBase clickGoogleSearchButton() {
        googleSearch.click();
        return this;
    }

    
    public PageBase clickHangoutsLink() {
        hangouts.click();
        return this;
    }

    
    public PageBase clickHelpLink() {
        help.click();
        return this;
    }

    
    public PageBase clickHistoryLink() {
        history.click();
        return this;
    }

    
    public PageBase clickImFeelingLuckyButton() {
        imFeelingLucky.click();
        return this;
    }

    
    public PageBase clickImagesLink() {
        images.click();
        return this;
    }

    
    public PageBase clickLearnMore1Link() {
        learnMore1.click();
        return this;
    }

    
    public PageBase clickLearnMore2Link() {
        learnMore2.click();
        return this;
    }

    
    public PageBase clickMapsLink() {
        maps.click();
        return this;
    }

    
    public PageBase clickMoreLink() {
        more.click();
        return this;
    }

    
    public PageBase clickMyAccount1Link() {
        myAccount1.click();
        return this;
    }

    
    public PageBase clickMyAccount2Link() {
        myAccount2.click();
        return this;
    }

    
    public PageBase clickNoThanksButton() {
        noThanks.click();
        return this;
    }

    
    public PageBase clickPhotosLink() {
        photos.click();
        return this;
    }

    
    public PageBase clickPlayLink() {
        play.click();
        return this;
    }


    public PageBase clickPrivacy1Link() {
        privacy1.click();
        return this;
    }

    
    public PageBase clickPrivacy2Link() {
        privacy2.click();
        return this;
    }

    
    public PageBase clickRestartListeningLink() {
        restartListening.click();
        return this;
    }

    
    public PageBase clickSearchHelpLink() {
        searchHelp.click();
        return this;
    }

    
    public PageBase clickSearchLink() {
        search.click();
        return this;
    }

    
    public PageBase clickSearchSettingsLink() {
        searchSettings.click();
        return this;
    }

    
    public PageBase clickSendFeedbackLink() {
        sendFeedback.click();
        return this;
    }

    
    public PageBase clickSettingsLink() {
        settings.click();
        return this;
    }

    

    
    public PageBase clickSignOutLink() {
        signOut.click();
        return this;
    }

    
    public PageBase clickStartListeningForOkGoogleLink() {
        startListeningForOkGoogle.click();
        return this;
    }

    
    public PageBase clickTermsLink() {
        terms.click();
        return this;
    }

    
    public PageBase clickTranslateLink() {
        translate.click();
        return this;
    }

    public PageBase clickYoutubeLink() {
        youtube.click();
        return this;
    }

    
    public PageBase fill() {
        setScreenreaderUsersClickHereToTurn2TextareaField();
        setRestartListeninghelphotwordDetectionIsOff1TextField();
        setRestartListeninghelphotwordDetectionIsOff2TextField();
        setRestartListeninghelphotwordDetectionIsOff3TextField();
        return this;
    }

    
    public PageBase fillAndSubmit() {
        fill();
        return submit();
    }

    
    public PageBase setRestartListeninghelphotwordDetectionIsOff1TextField() {
        return setRestartListeninghelphotwordDetectionIsOff1TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_1"));
    }

    
    public PageBase setRestartListeninghelphotwordDetectionIsOff1TextField(String restartListeninghelphotwordDetectionIsOff1Value) {
        restartListeninghelphotwordDetectionIsOff1.sendKeys(restartListeninghelphotwordDetectionIsOff1Value);
        return this;
    }

    
    public PageBase setRestartListeninghelphotwordDetectionIsOff2TextField() {
        return setRestartListeninghelphotwordDetectionIsOff2TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_2"));
    }

    
    public PageBase setRestartListeninghelphotwordDetectionIsOff2TextField(String restartListeninghelphotwordDetectionIsOff2Value) {
        restartListeninghelphotwordDetectionIsOff2.sendKeys(restartListeninghelphotwordDetectionIsOff2Value);
        return this;
    }

    
    public PageBase setRestartListeninghelphotwordDetectionIsOff3TextField() {
        return setRestartListeninghelphotwordDetectionIsOff3TextField(data.get("RESTART_LISTENINGHELPHOTWORD_DETECTION_IS_OFF_3"));
    }

    
    public PageBase setRestartListeninghelphotwordDetectionIsOff3TextField(String restartListeninghelphotwordDetectionIsOff3Value) {
        restartListeninghelphotwordDetectionIsOff3.sendKeys(restartListeninghelphotwordDetectionIsOff3Value);
        return this;
    }

    
    public PageBase setScreenreaderUsersClickHereToTurn1TextareaField() {
        return setScreenreaderUsersClickHereToTurn1TextareaField(data.get("SCREENREADER_USERS_CLICK_HERE_TO_TURN_1"));
    }

    
    public PageBase setScreenreaderUsersClickHereToTurn1TextareaField(String screenreaderUsersClickHereToTurn1Value) {
        screenreaderUsersClickHereToTurn1.click();
        return this;
    }

    
    public PageBase setScreenreaderUsersClickHereToTurn2TextareaField() {
        return setScreenreaderUsersClickHereToTurn2TextareaField(data.get("SCREENREADER_USERS_CLICK_HERE_TO_TURN_2"));
    }

    
    public PageBase setScreenreaderUsersClickHereToTurn2TextareaField(String screenreaderUsersClickHereToTurn2Value) {
        screenreaderUsersClickHereToTurn2.sendKeys(screenreaderUsersClickHereToTurn2Value);
        return this;
    }

    
    public PageBase submit() {
        clickImFeelingLuckyButton();
        GooglePage target = new GooglePage(driver, data, timeout);
        PageFactory.initElements(driver, target);

        return target;
    }

    
    public PageBase verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    
    public PageBase verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }


    public PageBase openPage() {
        return this;
    }

    @Override
    protected String getUrl() {
        return pageUrl;
    }
}
