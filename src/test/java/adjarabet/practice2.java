package adjarabet;

import Utils.Runner1;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.As;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class practice2 extends Runner1 {

    @Test()
    public void elitElectronics1() {
        $(".btn-register").click();
        sleep(2000);
        Assert.assertTrue($(byText("სწრაფი რეგისტრაცია")).isDisplayed());
        Assert.assertTrue($(byClassName("btn-disabled")).isDisplayed());
        $("#firstName").click();
        $("#lastName").click();
        Assert.assertTrue($(byText("სახელი სავალდებულოა")).isDisplayed());
        $("#email").click();
        Assert.assertTrue($(byText("გვარი სავალდებულოა")).isDisplayed());
        $("#password").click();
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $("#confirmPassword").click();
        Assert.assertTrue($(byText("პაროლი სავალდებულოა.")).isDisplayed());
        $("#firstName").click();
        Assert.assertTrue($(byText("პაროლის გამეორება სავალდებულოა")).isDisplayed());
        $("#email").setValue("2343546544");
        for (int i = 0; i < 11; i++) {
            $("#email").sendKeys(Keys.BACK_SPACE);
        }
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $("#email").setValue("test");
        for (int i = 0; i < 11; i++) {
            $("#email").sendKeys(Keys.BACK_SPACE);
        }
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $("#email").setValue("test@");
        for (int i = 0; i < 11; i++) {
            $("#email").sendKeys(Keys.BACK_SPACE);
        }
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $("#email").setValue("test@gmail");
        for (int i = 0; i < 11; i++) {
            $("#email").sendKeys(Keys.BACK_SPACE);
        }
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $("#email").setValue("test@gmail.");
        for (int i = 0; i < 11; i++) {
            $("#email").sendKeys(Keys.BACK_SPACE);
        }
        Assert.assertTrue($(byText("ელ. ფოსტა სავალდებულოა")).isDisplayed());
        $("#password").setValue("12345");
        Assert.assertTrue($(byText("პაროლი სავალდებულოა.")).isDisplayed());
        $("#password").setValue("123456");
        $("#confirmPassword").setValue("654321");
        Assert.assertTrue($(byText("პაროლის გამეორება სავალდებულოა")).isDisplayed());
        sleep(4000);
    }
}
