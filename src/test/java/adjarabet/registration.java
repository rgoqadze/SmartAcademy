package adjarabet;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class registration {
    @Test
    public void registrationtest(){
        Configuration.browser= "Chrome";
        Configuration.browserSize= "1920x1080";
        open("https://www.adjarabet.com/ka");
        $(byAttribute("data-id","register-btn")).click();
        $(byText("შექმენი ახალი ანგარიში")).shouldBe(Condition.visible, Duration.ofMillis(5000));
        $(byText("გაგრძელება")).click();
        $(byText("სახელი უნდა იწყებოდეს მხოლოდ ასოთი")).shouldBe(Condition.visible,Duration.ofMillis(3000));
        $(byText("გვარი უნდა იწყებოდეს მხოლოდ ასოთი")).shouldBe(Condition.visible,Duration.ofMillis(3000));
        $(byText("მომხმარებლის სახელი უნდა შეიცავდეს მიინიმუმ ერთ ლათინურ ასოს")).shouldBe(Condition.visible,Duration.ofMillis(3000));
        $(byAttribute("data-id","signUpFormFirstOfThree_firstname")).setValue("rezo");
        $(byAttribute("data-id","signUpFormFirstOfThree_lastname")).setValue("gokadze");
        $(byText("მამრობითი")).click();
        $(byAttribute("data-id","signUpFormFirstOfThree_country")).click();
        $(byAttribute("placeholder","ძებნა")).setValue("ანდორა").pressEnter();
        $(byText("+376")).shouldBe(Condition.visible,Duration.ofMillis(2000));
        $(byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).setValue("45678778");
        $(byAttribute("data-id","signUpFormFirstOfThree_documentType")).click();
        $(byText("პირადობის მოწმობა")).click();
        $(byAttribute("data-id","signUpFormFirstOfThree_personalId")).setValue("35345646");
        $(byAttribute("data-id","signUpFormFirstOfThree_username")).setValue("andora12");
        $(byAttribute("data-id","signUpFormFirstOfThree_password")).setValue("Smartacademy12");
        $(byAttribute("class","_s_mt-5")).click();
        sleep(10000);

    }
}
