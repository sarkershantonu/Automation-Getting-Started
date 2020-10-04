package org.automation.webtest.tests.popup.addpaymentpopup;


import org.automation.webtest.core.TestBase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class AddPaymentWithOrderTest  extends TestBase {

    private Checkout checkoutPage;
    private CheckoutSteps checkout;
    private PayWithPopupSteps payWithPopup;
    private AddPaymentPopupSteps addPaymentPopup;
    private int totalSavedPaymentMethodsBefore;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("payWithPopup.userWithOrder"));
    }

    @Before
    public void initTest(){
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
        checkout.clickOnPaymentMethodEditButton();
        payWithPopup = new PayWithPopupSteps(checkoutPage.payWithPopup);
        totalSavedPaymentMethodsBefore = payWithPopup.getTotalSavedPaymentMethods();
        payWithPopup.clickOnAddMethodButton();
        addPaymentPopup = new AddPaymentPopupSteps(checkoutPage.payWithPopup.addPaymentPopup);
    }

    @Test
    @Title("Add Credit / Debit Card")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add payment method")
    @Stories("Checkout")
    @Issue("APPBUG-6103")
    public void addACreditDebitCard(){
        addPaymentPopup.typeNameOnCard(PropertyLoader.getValue("global.nameOnCard"));
        addPaymentPopup.selectCardInformationDropdown("Discover");
        addPaymentPopup.typeCardNumber(PropertyLoader.getValue("global.cardNumber.discover"));
        addPaymentPopup.typeCVV(PropertyLoader.getValue("global.cvv.discover"));
        addPaymentPopup.selectMonthDropdown(PropertyLoader.getValue("global.month.discover"));
        addPaymentPopup.selectYearDropdown(PropertyLoader.getValue("global.year.discover"));
        addPaymentPopup.selectBillingAddress("USA");
        addPaymentPopup.typeStreetAddress(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addPaymentPopup.typeApt(PropertyLoader.getValue("global.residentialAddressApartment"));
        addPaymentPopup.typeAddressLineTwo(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addPaymentPopup.typeCityField(PropertyLoader.getValue("global.residentialAddressCity"));
        addPaymentPopup.selectState(PropertyLoader.getValue("global.residentialAddressState"));
        addPaymentPopup.typeZipCode(PropertyLoader.getValue("global.residentialAddressZIP"));
        addPaymentPopup.typeBillingInquiriesField(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addPaymentPopup.clickOnSaveButton();
        addPaymentPopup.waitUntilAddPaymentPopupDisappear();
        checkoutPage.payWithPopup.initPayWithPopup();
        int totalSavedPaymentMethodsAfter = payWithPopup.getTotalSavedPaymentMethods();
        payWithPopup.verifyPaymentMethodIsAdded(totalSavedPaymentMethodsBefore + 1, totalSavedPaymentMethodsAfter);
    }

    @Test
    @Title("Add Checking Account")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add payment method")
    @Stories("Checkout")
    @Issue("APPBUG-6103")
    public void addCheckingBankAccount(){
        addPaymentPopup.clickOnBankTab();
        addPaymentPopup.clickOnCheckingRadioButton();
        addPaymentPopup.typeNameOnAccount(PropertyLoader.getValue("global.nameOnCard"));
        addPaymentPopup.typeBankName(PropertyLoader.getValue("global.bankName.checking"));
        addPaymentPopup.typeAccountNumber(PropertyLoader.getValue("global.accountNumber.checking"));
        addPaymentPopup.typeVerifyAccountNumber(PropertyLoader.getValue("global.accountNumber.checking"));
        addPaymentPopup.typeRoutingNumber(PropertyLoader.getValue("global.routingNumber.checking"));
        addPaymentPopup.selectCountry("USA");
        addPaymentPopup.typeStreetAddressBank(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addPaymentPopup.typeAptBank(PropertyLoader.getValue("global.residentialAddressApartment"));
        addPaymentPopup.typeAddressLineTwoBank(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addPaymentPopup.typeCityFieldBank(PropertyLoader.getValue("global.residentialAddressCity"));
        addPaymentPopup.selectStateBank(PropertyLoader.getValue("global.residentialAddressState"));
        addPaymentPopup.typeZipCodeBank(PropertyLoader.getValue("global.residentialAddressZIP"));
        addPaymentPopup.typeBillingInquiriesFieldBank(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addPaymentPopup.clickOnAcceptAgreement();
        addPaymentPopup.clickOnSaveButtonBank();
        addPaymentPopup.waitUntilAddPaymentPopupDisappear();
        checkoutPage.payWithPopup.initPayWithPopup();
        int totalSavedPaymentMethodsAfter = payWithPopup.getTotalSavedPaymentMethods();
        payWithPopup.verifyPaymentMethodIsAdded(totalSavedPaymentMethodsBefore + 1, totalSavedPaymentMethodsAfter);
    }

    @Test
    @Title("Add Saving Account")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Add payment method")
    @Stories("Checkout")
    @Issue("APPBUG-6103")
    public void addSavingBankAccount(){
        addPaymentPopup.clickOnBankTab();
        addPaymentPopup.clickOnSavingsRadioButton();
        addPaymentPopup.typeNameOnAccount(PropertyLoader.getValue("global.nameOnCard"));
        addPaymentPopup.typeBankName(PropertyLoader.getValue("global.bankName.checking"));
        addPaymentPopup.typeAccountNumber(PropertyLoader.getValue("global.accountNumber.checking"));
        addPaymentPopup.typeVerifyAccountNumber(PropertyLoader.getValue("global.accountNumber.checking"));
        addPaymentPopup.typeRoutingNumber(PropertyLoader.getValue("global.routingNumber.checking"));
        addPaymentPopup.selectCountry("USA");
        addPaymentPopup.typeStreetAddressBank(PropertyLoader.getValue("global.residentialAddressStreetAddress"));
        addPaymentPopup.typeAptBank(PropertyLoader.getValue("global.residentialAddressApartment"));
        addPaymentPopup.typeAddressLineTwoBank(PropertyLoader.getValue("global.residentialAddressStreetAddressLineTwo"));
        addPaymentPopup.typeCityFieldBank(PropertyLoader.getValue("global.residentialAddressCity"));
        addPaymentPopup.selectStateBank(PropertyLoader.getValue("global.residentialAddressState"));
        addPaymentPopup.typeZipCodeBank(PropertyLoader.getValue("global.residentialAddressZIP"));
        addPaymentPopup.typeBillingInquiriesFieldBank(PropertyLoader.getValue("global.residentialAddressPhoneNumber"));
        addPaymentPopup.clickOnAcceptAgreement();
        addPaymentPopup.clickOnSaveButtonBank();
        addPaymentPopup.waitUntilAddPaymentPopupDisappear();
        checkoutPage.payWithPopup.initPayWithPopup();
        int totalSavedPaymentMethodsAfter = payWithPopup.getTotalSavedPaymentMethods();
        payWithPopup.verifyPaymentMethodIsAdded(totalSavedPaymentMethodsBefore + 1, totalSavedPaymentMethodsAfter);
    }

    @AfterClass
    public static void resetTest(){
        DataBaseQuery dataBaseQuery = new DataBaseQuery();
        dataBaseQuery.deleteUnselectedPaymentMethods(PropertyLoader.getValue("payWithPopup.userWithOrder"));
        Home homePage = new Home();
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.logOutIfLoggedIn(homePage.headerArea);
    }
}
