package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
        ClosePopupButton = $(byXpath("//*[@id=\"root\"]/footer/div[1]/div/div[1]/button")),
        AuthorizationButton = $(byText("ავტორიზაცია")),
        TextetEnter = $(byText("შესვლა")),
        EmailInput = $(byId("Email")),
        PaswordInput = $(byId("Password")),
        LoginButton = $(byXpath("//*[@id=\"Box\"]/form/div[2]/button"));
}
