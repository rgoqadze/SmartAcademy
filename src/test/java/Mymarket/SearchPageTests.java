package Mymarket;

import StepObject.SearchSteps;
import Utils.MymarketRunner;
import Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.SearchPageData.MaxPriceValue;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Utils.TestLister.class)
public class SearchPageTests extends MymarketRunner {

    @Test(retryAnalyzer = Retry.class, priority = 0)
    @Severity(SeverityLevel.NORMAL)
    @Description("Location Filter Check")
    public void SearchLocation() {
        SearchSteps steps = new SearchSteps();
        //steps.ClosePopup();
        steps.GoToSearchPage();
        steps.Scroll();
        sleep(5000);
        steps.ClickLocation();
        steps.ChooseLocation();
        sleep(3000);
        steps.ClickCard();
        Assert.assertTrue(steps.LocationOnDetialPage.isDisplayed());
    }

    @Test(retryAnalyzer = Retry.class, priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("OnlineShop and Shop Filter")
    public void SearchOnlineShop() {
        SearchSteps steps = new SearchSteps();
        steps.GoToSearchPage();
        steps.Scroll();
        steps.ClickOnlineBuy();
        steps.ClickShopButton();
        Assert.assertTrue(steps.CartButton.isDisplayed());

    }
    @Test(retryAnalyzer = Retry.class, priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Price Filter Check")
    public void MaxPriceChek() {
        SearchSteps steps = new SearchSteps();
        steps.Scroll();
        steps.FillMaxPriceInput(MaxPriceValue);
        sleep(5000);
        int PriceValue = $$(".text-dark").size();
        for (int i = 0; i < PriceValue; i++) {
            $$(".text-dark").get(i).getText();
            Assert.assertNotEquals(MaxPriceValue, PriceValue);
        }
    }
    }

