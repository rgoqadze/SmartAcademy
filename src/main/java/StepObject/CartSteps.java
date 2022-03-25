package StepObject;

import PageObject.CartPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.C;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$;

public class CartSteps extends CartPage {

    @Step("Go to main page")
    public CartSteps GoToMainPage(){
        MainPageButton.click();
        return this;
    }

    @Step("Go to search page")
    public CartSteps GoToSearchPage() {
        SearchButton.click();
        return this;
    }

    @Step("Scroll in to online buy filter")
    public CartSteps Scroll1() {
        OnlineBuyText.scrollIntoView(true);
        return this;
    }

    @Step("click online buy filter radio button")
    public CartSteps ClickOnlineBuy(){
        OnlineBuyButton.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("Scroll in to aplication type filter")
    public CartSteps Scroll2(){
        AplicationType.scrollIntoView(true);
        return this;
    }

    @Step("click aplication type filter radio button")
    public CartSteps ClickAplicationType(){
        TypeRadioButton.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("scroll in to up")
    public CartSteps Scroll3() {
        FiltersText.scrollIntoView(true);
        return this;
    }

    @Step("Go to cart page")
    public CartSteps GoToCartPage() {
        CartPageButton.click();
        return this;
    }

    @Step("Check products in cart")
    public CartSteps CartCheckboxvisible() {
        CartCheckbox.shouldBe(Condition.visible,Duration.ofMillis(5000));
        return this;
    }

    @Step("Mark all product in cart")
    public CartSteps ClickAllCartCheckbox() {
        AllCartCheckbox.click();
        return this;
    }

    @Step("Clear cart page")
    public CartSteps ClickCartClearButton() {
        CartClearButton.click();
        return this;
    }
}
