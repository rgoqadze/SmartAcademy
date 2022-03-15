package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;

import javax.swing.plaf.IconUIResource;
import java.time.Duration;

public class RegistrationSteps extends RegistrationPage {
    public RegistrationSteps GoToRegistrationPage() {
        RegistrationButton.click();
        NewAccountText.shouldBe(Condition.visible, Duration.ofMillis(3000));
        return this;
    }
    public RegistrationSteps ClickContinue() {
        ContinueButton.click();
        NameCapitalLetter.shouldBe(Condition.visible,Duration.ofMillis(3000));

        return this;
    }
    public RegistrationSteps FillFirstName(String FirstNameValue) {
        FirstNameInput.setValue(FirstNameValue);
        return this;
    }
    public RegistrationSteps FillLastName(String LastnameValue) {
        LastnameInput.setValue(LastnameValue);
        return this;
    }
    public RegistrationSteps ChooseGender() {
        GenderRadiobButton.click();
        return this;
    }
    public RegistrationSteps ChooseCountry(String countryNameValue) {
        CountryDropDown.click();
        return this;
    }
    public RegistrationSteps ChooseCountrySearch(String CountryValue) {
       SearchInput.setValue(CountryValue).pressEnter();
        return this;
    }
    public RegistrationSteps FillPhoneNumber(String PhoneNumberValue) {
        PhoneNumberInput.setValue(PhoneNumberValue);
        return this;
    }
    public RegistrationSteps ChooseDocumentType() {
        DocumentType.click();
        return this;
    }
    public RegistrationSteps ChooseDocumentTypeText() {
        DocumentTypeText.click();
        return this;
    }
    public RegistrationSteps FillpersonalId(String PersonaIdValue) {
        PersonalIdInput.setValue(PersonaIdValue);
        return this;
    }
    public RegistrationSteps FillUsername(String UsernnameValue) {
        UsernameInput.setValue(UsernnameValue);
        return this;
    }
    public RegistrationSteps FillPasswor(String PasswordValue) {
        PasswordInput.setValue(PasswordValue);
        return this;
    }







}
