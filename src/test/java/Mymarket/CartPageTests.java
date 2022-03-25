package Mymarket;

import StepObject.CartSteps;
import Utils.MymarketRunner;
import Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

@Listeners(Utils.TestLister.class)
public class CartPageTests extends MymarketRunner {

    @Test(retryAnalyzer = Retry.class, priority = 0)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Add Product to Cart Check")
    public void addproducttocart() {
        CartSteps steps = new CartSteps();
        //steps.GoToMainPage();
        steps.GoToSearchPage();
        steps.Scroll1();
        steps.ClickOnlineBuy();
        steps.Scroll2();
        steps.ClickAplicationType();
        steps.Scroll3();
        for (int i = 0; i < 5; i++) {
            $(".toggle-cart", i ).click();
        }
        sleep(3000);
        steps.GoToCartPage();
        steps.CartCheckboxvisible();
        Assert.assertEquals($$(".mt-5px").size(),5);
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Description("All product Remove Button Check")
    public void buttoncheck() {
        CartSteps steps = new CartSteps();
        steps.ClickAllCartCheckbox();
        Assert.assertTrue(steps.MarkedRemoveText.isDisplayed());
        steps.ClickAllCartCheckbox();
        Assert.assertTrue(steps.CartClearButton.isDisplayed());
    }

    @Test(retryAnalyzer = Retry.class, priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Empty Cart Check")
    public void CartClearCheck() {
        CartSteps steps = new CartSteps();
        steps.ClickCartClearButton();
        Assert.assertTrue(steps.CartEmptyText.isDisplayed());
    }
}
