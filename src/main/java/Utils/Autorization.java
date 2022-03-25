package Utils;

import StepObject.LoginSteps;
import Utils.MymarketRunner;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.LoginInformation.PasswordValue;
import static DataObject.LoginInformation.UserNameValue;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Utils.TestLister.class)
public class Autorization extends MymarketRunner {
    @Test(retryAnalyzer = Retry.class)
    public void login() {
        LoginSteps steps = new LoginSteps();
        steps.ClosePopup();
        steps.GoToLoginPage();
        Assert.assertTrue(steps.TextetEnter.isDisplayed());
        steps.FillUsername(UserNameValue);
        steps.FillPassword(PasswordValue);
        steps.ClickEnter();


    }

}
