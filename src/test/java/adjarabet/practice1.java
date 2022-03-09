package adjarabet;

import Utils.Runner1;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class practice1 extends Runner1 {
    @Test(priority = 0)

    //პირველი დავალება

    public void eliteelEctronics() {

        $(".btn-register").click();
        sleep(2000);
        Assert.assertTrue($(byText("სწრაფი რეგისტრაცია")).isDisplayed());
        $("#firstName").setValue("რეზო");
        Assert.assertEquals($("#firstName").getValue(), "რეზო");
        $("#lastName").setValue("გოქაძე");
        Assert.assertEquals($("#lastName").getValue(), "გოქაძე");
        $("#email").setValue("rezogoqadze@gmail.com");
        Assert.assertEquals($("#email").getValue(), "rezogoqadze@gmail.com");
        $("#password").setValue("123456");
        $("#confirmPassword").setValue("123456");
        Assert.assertTrue($(byClassName("btn-darkred")).isDisplayed());
    }


    // მეორე დავალება

//    @Test(priority = 1)
//    public void elitElectronics1(){
//        $(".btn-register").click();
//        $(".registration-titles").shouldBe(Condition.visible,Duration.ofMillis(3000));
//        $(".btn-disabled").shouldBe(Condition.visible);
//        $("#firstName").click();
//        $("#lastName").click();
//        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
//        $("#email").click();
//        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
//        $("#password").click();
//        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
//        $("#confirmPassword").click();
//        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
//        $("#firstName").click();
//        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
//        $("#email").setValue("2343546544");
//        for(int i =0; i < 11; i++){
//        $("#email").sendKeys(Keys.BACK_SPACE);}
//        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
//        $("#email").setValue("test");
//        for(int i =0; i < 11; i++){
//            $("#email").sendKeys(Keys.BACK_SPACE);}
//        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
//        $("#email").setValue("test@");
//        for(int i =0; i < 11; i++){
//            $("#email").sendKeys(Keys.BACK_SPACE);}
//        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
//        $("#email").setValue("test@gmail");
//        for(int i =0; i < 11; i++){
//            $("#email").sendKeys(Keys.BACK_SPACE);}
//        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
//        $("#email").setValue("test@gmail.");
//        for(int i =0; i < 11; i++){
//            $("#email").sendKeys(Keys.BACK_SPACE);}
//        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
//        $("#password").setValue("12345");
//        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
//        $("#password").setValue("123456");
//        $("#confirmPassword").setValue("654321");
//        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
//        sleep(4000);
//}
}
