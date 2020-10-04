package org.automation.webtest.tests.page.checkout;

import com.freshdirect.testing.config.PropertyLoader;
import com.freshdirect.testing.core.TestBase;
import com.freshdirect.testing.pages.Checkout;
import com.freshdirect.testing.pages.Home;
import com.freshdirect.testing.pages.ViewCart;
import com.freshdirect.testing.steps.pages.CheckoutSteps;
import com.freshdirect.testing.steps.pages.HomePageSteps;
import com.freshdirect.testing.steps.pages.ViewCartPageSteps;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

public class CheckoutCartDetailsTests extends TestBase {
    private Checkout checkoutPage;
    private CheckoutSteps checkout;

    @BeforeClass
    public static void setupTest() throws InterruptedException {
        Home homePage = new Home(browser);
        HomePageSteps home = new HomePageSteps(homePage);
        home.navigateToHomePage();
        home.signInWith(homePage.headerArea, PropertyLoader.getValue("checkout.cartDetails"));
    }

    @Before
    public void initTest() throws InterruptedException {
        checkoutPage = new Checkout(browser);
        checkout = new CheckoutSteps(checkoutPage);
        checkout.navigateToCheckoutPage();
    }

    @Test
    @Title("Checkout page has modify cart button")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void modifyCartButton() {
        checkout.verifyModifyCartButton();
    }

    @Test
    @Title("Clicking on modify cart button takes to view cart page")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void clickingModifyCartButton() {
        checkout.clickOnModifyCartButton();
        ViewCart viewCartPage = new ViewCart(browser);
        ViewCartPageSteps viewCart = new ViewCartPageSteps(viewCartPage);
        viewCart.viewCartPageLoadedText();
    }

    @Test
    @Title("FD Wines and Spirits list section is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void fdWinesAndSpiritsListSegment() {
        checkout.verifyFdWinesAndSpiritsListSection();
    }

    @Test
    @Title("FD Wines and Spirits sub total section is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void verifyFdWinesAndSpiritsSubTotalSection() {
        checkout.verifyFdWinesAndSpiritsSubTotalSection();
    }

    @Test
    @Title("Non wines and Spirits section is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void verifyNonWinesAndSpiritsSection() {
        checkout.verifyNonFdWinesAndSpiritsSection();
    }

    @Test
    @Title("Wines and Spirits section subtotal label")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void verifyWinesAndSpiritsSectionSubtotalLabel() {
        checkout.winesAndSpiritsSubtotalLabel();
    }

    @Test
    @Title("Wines and Spirits section tax label")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void verifyWinesAndSpiritsSectionTaxLabel() {
        checkout.winesAndSpiritsTaxLabel();
    }

    @Test
    @Title("Non Wines and Spirits section subtotal label")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void verifyNonWinesAndSpiritsSectionSubtotalLabel() {
        checkout.nonWinesAndSpiritsSubtotalLabel();
    }

    @Test
    @Title("Non Wines and Spirits section tax label")
    @Severity(SeverityLevel.CRITICAL)
    @Features("Promotional code")
    @Stories("Checkout")
    public void verifyNonWinesAndSpiritsSectionTaxLabel() {
        checkout.nonWinesAndSpiritsTaxLabel();
    }
}
