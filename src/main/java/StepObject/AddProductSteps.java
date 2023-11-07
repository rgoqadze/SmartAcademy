package StepObject;

import PageObject.AddProductPage;
import com.codeborne.selenide.Condition;
import com.github.javafaker.PhoneNumber;
import com.thoughtworks.qdox.model.expression.Add;
import io.qameta.allure.Step;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.time.Duration;

import static DataObject.AddProductData.*;

public class AddProductSteps extends AddProductPage {

    @Step("click add product page")
    public AddProductSteps ClickAddProductButton() {
        AddProductButton.click();
        return this;
    }

    @Step("Choose product sell type")
    public AddProductSteps GoToAddProductPage() {
        AddBuyButton.shouldBe(Condition.visible, Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("Scrool down")
    public AddProductSteps Scroll1() {
        KaButton.shouldBe(Condition.visible,Duration.ofMillis(10000)).scrollIntoView(true);
        return this;
    }

    @Step("Click publis button")
    public AddProductSteps ClickPublishButton() {
        PublishButton.click();
        return this;
    }

    @Step("Scroll up")
    public AddProductSteps Scroll2() {
        AddProducText.scrollIntoView(true);
        return this;
    }

    @Step("Go to main page")
    public AddProductSteps GoMainPage() {
        MainPageButton.click();
        return this;
    }

    @Step("Click category input")
    public AddProductSteps ClickCategoryInpute() {
        CategoryInpute.shouldBe(Condition.visible,Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("Choose category 1")
    public AddProductSteps ChooseCategory1() {
        Category1.click();
        return this;
    }

    @Step("Choose category 2")
    public AddProductSteps ChooseCategory2() {
        Category2.click();
        return this;
    }

    @Step("Choose category 3")
    public AddProductSteps ChooseCategory3() {
        Category3.click();
        return this;
    }

    @Step("product name is - {ProductName}")
    public AddProductSteps SetProductName() {
        AddProductName.setValue(ProductName);
        return this;
    }

    @Step("product price is - 0")
    public AddProductSteps SetPoductPrice() {
        PriceInpute.setValue(String.valueOf(0));
        return this;
    }

    @Step("Delete product price")
    public AddProductSteps DeletePrice() {
        PriceInpute.sendKeys(Keys.BACK_SPACE);
        return this;
    }

    @Step("product price is -{PriceValue}")
    public AddProductSteps SetPoductPrice1() {
        PriceInpute.setValue(String.valueOf(PriceValue));
        return this;
    }

    @Step("Mark online sell")
    public AddProductSteps ClickOnlineSupport() {
        OnlineSupport.click();
        return this;
    }

    @Step("Scroll in to online sell Checkbox")
    public AddProductSteps Scroll3() {
        OnlineSupporText.scrollIntoView(true);
        return this;
    }

    @Step("Product quantity is - {ProductQuantity}")
    public AddProductSteps SetQuantity() {
        QuantityInput.setValue(String.valueOf(ProductQuantity));
        return this;
    }

    @Step("Product weight is - {ProductWeight")
    public AddProductSteps SetWeight() {
        WeightInput.setValue(String.valueOf(ProductWeight));
        return this;
    }

    @Step("Banc account Number is  - {BankAccountNumber}")
    public AddProductSteps SetBankAccount() {
        BancAccountInput.setValue(BankAccountNumber);
        return this;
    }

    @Step("Click location inout")
    public AddProductSteps ChooseLocation() {
        LocationInput.click();
        return this;
    }

    @Step("Choose location")
    public AddProductSteps ChooseLocation1() {
        LocationInput1.click();
        return this;
    }

    @Step("User is - {NameValue}")
    public AddProductSteps SetUser() {
        NameInput.setValue(NameValue);
        return this;
    }

    @Step("PhoneNumber is - {PhoneNumber}")
    public AddProductSteps SetPhone() {
        PhoneNumberInpute.setValue(PhoneNumber);
        return this;
    }

    @Step("Scroll in to atributte")
    public AddProductSteps Scroll4() {
        AtributteText.scrollIntoView(true);
        return this;
    }

    @Step("Click type input")
    public AddProductSteps ChooseType() {
        TypeInput.pressEnter();
        return this;
    }

    @Step("Choose type")
    public AddProductSteps ChooseType1() {
        TypeInput1.click();
        return this;
    }

    @Step("Mark battery option")
    public AddProductSteps ChooseBattery() {
        BateryRadioButton.click();
        return this;
    }

    @Step("mark lighting radio button")
    public AddProductSteps ChooseLightingOption() {
        LightingRadioButton.click();
        return this;
    }

    @Step("Power value is - {PowerValue}")
    public AddProductSteps SetPower() {
        PowerValueInput.setValue(PowerValue);
        return this;
    }

    @Step("product Impedance is - {Impedance}")
    public AddProductSteps SetImpedance() {
        ImpedanceValueInput.setValue(Impedance);
        return this;
    }
}
