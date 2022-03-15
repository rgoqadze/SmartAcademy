package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
        RegistrationButton = $(byAttribute("data-id","register-btn")),
        NewAccountText = $(byText("შექმენი ახალი ანგარიში")),
        ContinueButton = $(byText("გაგრძელება")),
        NameCapitalLetter = $(byText("სახელი უნდა იწყებოდეს მხოლოდ ასოთი")),
        SurnameCapitalLetter = $(byText("გვარი უნდა იწყებოდეს მხოლოდ ასოთი")),
        UsernameMinLetter = $(byText("მომხმარებლის სახელი უნდა შეიცავდეს მიინიმუმ ერთ ლათინურ ასოს")),
        FirstNameInput = $(byAttribute("data-id","signUpFormFirstOfThree_firstname")),
        LastnameInput = $(byAttribute("data-id","signUpFormFirstOfThree_lastname")),
        GenderRadiobButton = $(byText("მამრობითი")),
        CountryDropDown = $(byText("ანდორა")),
        SearchInput = $(byAttribute("placeholder","ძებნა")),
        PhoneCountryCode = $(byText("+376")),
        PhoneNumberInput = $(byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")),
        DocumentType = $(byAttribute("data-id","signUpFormFirstOfThree_documentType")),
        DocumentTypeText = $(byText("პირადობის მოწმობა")),
        PersonalIdInput = $(byAttribute("data-id","signUpFormFirstOfThree_personalId")),
        UsernameInput = $(byAttribute("data-id","signUpFormFirstOfThree_username")),
        PasswordInput = $(byAttribute("data-id","signUpFormFirstOfThree_password"));
}
