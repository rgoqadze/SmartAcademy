package Mymarket;

import PageObject.AddProductPage;
import StepObject.AddProductSteps;
import StepObject.LoginSteps;
import Utils.MymarketRunner;
import Utils.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import java.time.Duration;

import static DataObject.LoginInformation.PasswordValue;
import static DataObject.LoginInformation.UserNameValue;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Utils.TestLister.class)
public class AddProductPageTests extends MymarketRunner {
    @Test(retryAnalyzer = Retry.class, priority = 0)
    @Severity(SeverityLevel.MINOR)
    @Description("Add Product Page Validations Check")
    public void AddProductPageValidations() {
        AddProductSteps steps = new AddProductSteps();
        AddProductPage asserts = new AddProductPage();
        steps.ClickAddProductButton();
        steps.GoToAddProductPage();
        steps.Scroll1();
        steps.ClickPublishButton();
        Assert.assertTrue(asserts.InputNamError.isDisplayed());
        Assert.assertTrue(asserts.InputLocationError.isDisplayed());
        Assert.assertTrue(asserts.InputUserError.isDisplayed());
        Assert.assertTrue(asserts.InputPhoneError.isDisplayed());
        Assert.assertTrue(asserts.InputCategoryError.isDisplayed());
        steps.Scroll2();
        sleep(3000);
        steps.GoMainPage();

    }

    @Test(retryAnalyzer = Retry.class, priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add product and onlinesell button Check")
    public void AddProduct() {
        AddProductSteps steps = new AddProductSteps();
        AddProductPage asserts = new AddProductPage();
        steps.GoMainPage();
        steps.ClickAddProductButton();
        steps.GoToAddProductPage();
        steps.ClickCategoryInpute();
        steps.ChooseCategory1();
        steps.ChooseCategory2();
        steps.ChooseCategory3();
        steps.SetProductName();
        steps.SetPoductPrice();
        Assert.assertFalse(asserts.OnlineSupporText.isDisplayed());
        steps.DeletePrice();
        steps.SetPoductPrice1();
        sleep(2000);
        Assert.assertTrue(asserts.OnlineSupporText.isDisplayed());
        steps.Scroll3();
        steps.ClickOnlineSupport();
        steps.SetQuantity();
        steps.SetWeight();
        steps.SetBankAccount();
        steps.ChooseLocation();
        steps.ChooseLocation1();
        steps.SetUser();
        steps.SetPhone();
        steps.Scroll4();
        steps.ChooseType();
        sleep(2000);
        steps.ChooseType1();
        steps.ClickPublishButton();
        sleep(2000);
        Assert.assertTrue(asserts.PhoneNumberCheck.isDisplayed());
    }


}
