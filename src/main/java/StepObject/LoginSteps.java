package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;


public class LoginSteps extends LoginPage {

    @Step("Close fishing popup")
    public  LoginSteps ClosePopup() {
        ClosePopupButton.click();
        return this;
    }

    @Step("Go to login page")
    public LoginSteps GoToLoginPage() {
        AuthorizationButton.click();
        TextetEnter.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }

    @Step("User name is -{UserNameValue}")
    public LoginSteps FillUsername(String UserNameValue) {
        EmailInput.setValue(UserNameValue);
        return this;
    }

    @Step("Password is - {PasswordValue}")
    public LoginSteps FillPassword(String PasswordValue) {
        PaswordInput.setValue(PasswordValue);
        return this;
    }

    @Step("Click enter button")
    public LoginSteps ClickEnter(){
        LoginButton.click();
        return this;
    }
}
