package Utils;

import StepObject.LoginSteps;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import static DataObject.LoginInformation.PasswordValue;
import static DataObject.LoginInformation.UserNameValue;
import static com.codeborne.selenide.Selenide.open;

public class MymarketRunner {
    @BeforeTest
    public static void setupmymarket() {
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.mymarket.ge/ka/");
        LoginSteps steps = new LoginSteps();
        steps.ClosePopup();
        steps.GoToLoginPage();
        Assert.assertTrue(steps.TextetEnter.isDisplayed());
        steps.FillUsername(UserNameValue);
        steps.FillPassword(PasswordValue);
        steps.ClickEnter();
    }
}
