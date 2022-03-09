package adjarabet;

import Utils.Runner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class registration extends Runner {
    @Test
    public void registrationtest(){

        SoftAssert soft = new SoftAssert();

        $(byAttribute("data-id","register-btn")).click();
        soft.assertTrue($(byText("შექმენი ახალი ანგარიში")).isDisplayed());
        $(byText("გაგრძელება")).click();
        soft.assertTrue($(byText("სახელი უნდა იწყებოდეს მხოლოდ ასოთი")).isDisplayed());
        soft.assertTrue($(byText("გვარი უნდა იწყებოდეს მხოლოდ ასოთი")).isDisplayed());
        soft.assertTrue($(byText("მომხმარებლის სახელი უნდა შეიცავდეს მიინიმუმ ერთ ლათინურ ასოს")).isDisplayed());
        $(byAttribute("data-id","signUpFormFirstOfThree_firstname")).setValue("rezo");
        soft.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_firstname")).getValue(),"rezo");
        $(byAttribute("data-id","signUpFormFirstOfThree_lastname")).setValue("gokadze");
        soft.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_lastname")).getValue(),"gokadze");
        $(byText("მამრობითი")).click();
        $(byAttribute("data-id","signUpFormFirstOfThree_country")).click();
        $(byAttribute("placeholder","ძებნა")).setValue("ანდორა").pressEnter();
        soft.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_country")).getText(),"ანდორა");
        soft.assertTrue($(byText("+376")).isDisplayed());
        $(byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).setValue("45678778");
        soft.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).getValue(),"45678778");
        $(byAttribute("data-id","signUpFormFirstOfThree_documentType")).click();
        $(byText("პირადობის მოწმობა")).click();
        $(byAttribute("data-id","signUpFormFirstOfThree_personalId")).setValue("35345646");
        soft.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_personalId")).getValue(),"35345646");
        $(byAttribute("data-id","signUpFormFirstOfThree_username")).setValue("andora12");
        soft.assertEquals($(byAttribute("data-id","signUpFormFirstOfThree_username")).getValue(),"andora12");
        $(byAttribute("data-id","signUpFormFirstOfThree_password")).setValue("Smartacademy12");
        sleep(1000);
        $(byAttribute("class","_s_mt-5")).click();
        sleep(1000);
        soft.assertAll();
    }
}
