package Adjarabet;

import StepObject.RegistrationSteps;
import Utils.Runner;
import com.codeborne.selenide.commands.As;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class registration extends Runner {

    @Test
    public void Registration() {
        RegistrationSteps steps = new RegistrationSteps();
        steps.GoToRegistrationPage();
        Assert.assertTrue(steps.NewAccountText.isDisplayed());
        steps.ClickContinue();
        Assert.assertTrue(steps.NameCapitalLetter.isDisplayed());
        Assert.assertTrue(steps.SurnameCapitalLetter.isDisplayed());
        Assert.assertTrue(steps.UsernameMinLetter.isDisplayed());
        steps.FillFirstName(FirstNameValue);
        Assert.assertEquals(steps.FirstNameInput.getValue(), FirstNameValue);
        steps.FillLastName(LastNameValue);
        Assert.assertEquals(steps.LastnameInput.getValue(), LastNameValue);
        steps.ChooseGender();
        steps.ChooseCountry(CountryNameValue);
        steps.ChooseCountrySearch(CountryNameValue);
        Assert.assertEquals(steps.CountryDropDown.getText(), CountryNameValue);
        steps.FillPhoneNumber(PhoneNumberValue);
        Assert.assertEquals(steps.PhoneNumberInput.getValue(), PhoneNumberValue);
        steps.ChooseDocumentType();
        steps.ChooseDocumentTypeText();
        steps.FillpersonalId(PersonaIdValue);
        Assert.assertEquals(steps.PersonalIdInput.getValue(), PersonaIdValue );
        steps.FillUsername(UserNameValue);
        Assert.assertEquals(steps.UsernameInput.getValue(), UserNameValue);
        steps.FillPasswor(PasswordValue);
        sleep(1000);
        steps.ClickContinue();
        sleep(2000);
    }
}
