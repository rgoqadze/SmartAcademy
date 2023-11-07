package StepObject;

import PageObject.SearchPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$;

public class SearchSteps extends SearchPage {

    @Step("Close fishing popup")
    public  SearchSteps ClosePopup() {
        ClosePopupButton.click();
        return this;
    }

    @Step("Go to search page")
    public SearchSteps GoToSearchPage() {
        SearchButton.click();
        return this;
    }

    @Step("scroll in to online buy")
    public SearchSteps Scroll() {
        Onlinebuy.scrollIntoView(true);
        return this;
    }

    @Step("Click location input")
    public SearchSteps ClickLocation() {
        LocationInpute.click();
        return this;
    }

    @Step("Choose location")
    public SearchSteps ChooseLocation() {
        LocationtValue.click();
        LocationtValue.shouldBe(Condition.visible,Duration.ofMillis(5000));
        return this;
    }

    @Step("Click product card")
    public SearchSteps ClickCard() {
        SearchPageCard.click();
        LocationOnDetialPage.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }

    @Step("Clic online buy radiobutton")
    public SearchSteps ClickOnlineBuy() {
        OnlineBuyButton.click();
        return this;
    }

    @Step("Click shop filter radio button")
    public SearchSteps ClickShopButton() {
        ShopButton.click();
        CartButton.shouldBe(Condition.visible,Duration.ofMillis(4000));
        return this;
    }

    @Step("Fill max price value input")
    public SearchSteps FillMaxPriceInput(int MaxPriceValue) {
    PricetoInput.setValue(String.valueOf(String.valueOf(MaxPriceValue)));
    return this;
    }

}
