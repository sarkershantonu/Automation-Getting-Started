package org.automation.webtest.tests.popup;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;


public class YourAccountPopupForNewUserTests extends TestBase {

    private Home homePage;
    private HomePageSteps home;
    private static String userId = PropertyLoader.getValue("yourAccountPopup.newUser");

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, userId);
    }

    @Before
    public void initTest() throws InterruptedException {
        homePage = new Home(browser);
        HeaderAreaSteps headerArea = new HeaderAreaSteps(homePage.headerArea);
        headerArea.hoverOnYourAccountFromHeader();
        holdExecution();
    }

    @Test
    @Title("Sign out from your account popup")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void hoverOnYourAccountAsSignedInUserOpensYourFreshDirectPopup(){
        HeaderAreaSteps headerArea = new HeaderAreaSteps(homePage.headerArea);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        try {
            yourAccountPopup.clickOnSignOutButton();
            headerArea.signInTextAsLoggedOutUserIsPresent();
        } finally {
            headerArea.signInWith(homePage.headerArea, userId);
        }
    }

    @Test
    @Title("View time slots link takes to Delivery Info page to check available time slots for any address")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void viewTimeSlotsLinkValidation(){
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnViewTimeSlotsLink();
        DeliveryInfoCheckAvailableTimeSlots deliveryInfo = new DeliveryInfoCheckAvailableTimeSlots(browser);
        DeliveryInfoCheckAvailableTimeSlotsSteps deliveryInfoCheckAvailableTimeSlots = new DeliveryInfoCheckAvailableTimeSlotsSteps(deliveryInfo);
        deliveryInfoCheckAvailableTimeSlots.deliveryInfoCheckAvailableTimeSlotsPageTitle();
    }

    @Test
    @Title("Your Top Items link takes to Your Top Items page with no products")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void yourTopItemsLinkValidation(){
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnYourTopItemsLink();
        YourTopItems page = new YourTopItems(browser);
        YourTopItemsSteps yourTopItems = new YourTopItemsSteps(page);
        yourTopItems.yourTopItemsPageTitle();
    }

    @Test
    @Title("Shop Past Orders link takes to Your Past Orders page with no products")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void shopPastOrdersLinkValidation(){
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnShopPastOrdersLink();
        YourPastOrders page = new YourPastOrders(browser);
        YourPastOrdersSteps yourPastOrders = new YourPastOrdersSteps(page);
        yourPastOrders.yourPastOrdersPageTitle();
    }

    @Test
    @Title("DeliveryPass link takes to DeliveryPass Free trial page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void deliveryPassLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnDeliveryPassLink();
        DeliveryPassFreeTrial page = new DeliveryPassFreeTrial(browser);
        DeliveryPassFreeTrialSteps deliveryPassFreeTrial = new DeliveryPassFreeTrialSteps(page);
        deliveryPassFreeTrial.deliveryPassFreeTrialPageUrl();
    }

    @Test
    @Title("Shopping Lists link takes to Your Shopping Lists page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void shoppingListsLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnShoppingListsLink();
        YourShoppingLists page = new YourShoppingLists(browser);
        YourShoppingListsSteps yourShoppingLists = new YourShoppingListsSteps(page);
        yourShoppingLists.yourShoppingListsPageTitle();
    }

    @Test
    @Title("Delivery Info link takes to Delivery Info About FreshDirect Home Delivery page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void deliveryInfoLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnDeliveryInfoLink();
        DeliveryInfoAboutFDHomeDelivery page = new DeliveryInfoAboutFDHomeDelivery(browser);
        DeliveryInfoAboutFDHomeDeliverySteps deliveryInfoAboutFDHomeDelivery = new DeliveryInfoAboutFDHomeDeliverySteps(page);
        deliveryInfoAboutFDHomeDelivery.deliveryInfoAboutFDHomeDeliveryPageTitle();
    }

    @Test
    @Title("Help link takes to Help page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void helpLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnHelpLink();
        Help page = new Help(browser);
        HelpPageSteps help = new HelpPageSteps(page);
        help.helpPageTitle();
    }

    @Test
    @Title("Account Preferences link takes to Your Account Preferences page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void accountPreferencesLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnAccountPreferencesLink();
        YourAccountPreferences page = new YourAccountPreferences(browser);
        YourAccountPreferencesSteps yourAccountPreferences = new YourAccountPreferencesSteps(page);
        yourAccountPreferences.yourAccountPreferencesPageTitle();
    }

    @Test
    @Title("Delivery Addresses link takes to Your Account Delivery Addresses page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void deliveryAddressesLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnDeliveryAddressesLink();
        YourAccountDeliveryAddress page = new YourAccountDeliveryAddress(browser);
        YourAccountDeliveryAddressSteps yourAccountDeliveryAddress = new YourAccountDeliveryAddressSteps(page);
        yourAccountDeliveryAddress.yourAccountDeliveryAddressPageTitle();
    }

    @Test
    @Title("Payment Methods link takes to Your Account Payment Methods page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void paymentMethodsLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnPaymentMethodsLink();
        YourAccountPaymentMethods page = new YourAccountPaymentMethods(browser);
        YourAccountPaymentMethodsSteps yourAccountPaymentMethods = new YourAccountPaymentMethodsSteps(page);
        yourAccountPaymentMethods.yourAccountPaymentMethodsPageTitle();
    }

    @Test
    @Title("Order History link takes to Your Account page with no orders")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void orderHistoryLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnOrderHistoryLink();
        YourAccountOrderHistory page = new YourAccountOrderHistory(browser);
        YourAccountOrderHistorySteps yourAccountOrderHistory = new YourAccountOrderHistorySteps(page);
        yourAccountOrderHistory.yourAccountOrderHistoryPageTitle();
    }

    @Test
    @Title("Store Credits link takes to FreshDirect Account Credits page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void storeCreditsLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnStoreCreditsLink();
        FreshDirectAccountCredits page = new FreshDirectAccountCredits(browser);
        FreshDirectAccountCreditsSteps freshDirectAccountCredits = new FreshDirectAccountCreditsSteps(page);
        freshDirectAccountCredits.freshDirectAccountCreditsPageTitle();
    }

    @Test
    @Title("Gift Cards link takes to Your Account Gift Cards page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Your Account")
    @Stories("Header Navigation")
    public void giftCardsLinkValidation(){
        Home homePage = new Home(browser);
        HeaderArea header = new HeaderArea(browser);
        YourAccountPopupSteps yourAccountPopup = new YourAccountPopupSteps(homePage.headerArea.yourAccountPopup);
        yourAccountPopup.clickOnGiftCardsLink();
        YourAccountGiftCards page = new YourAccountGiftCards(browser);
        YourAccountGiftCardsSteps yourAccountGiftCards = new YourAccountGiftCardsSteps(page);
        yourAccountGiftCards.yourAccountGiftCardsPageTitle();
    }

    @After
    public void resetTest(){
        homePage = new Home(browser);
        home = new HomePageSteps(homePage);
        home.navigateToHomePage();
    }
}
