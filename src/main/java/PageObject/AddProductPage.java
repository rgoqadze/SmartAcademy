package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AddProductPage {
    public SelenideElement
            AddProductButton = $(".add-statement-btn"),
            AddBuyButton = $(".add-btns-custom",0),
            CategoryInpute = $(byXpath("//*[@id=\"CatID\"]/div/div/div[1]/div[2]/div")),
            Category1 = $(byText("ტექნიკა")),
            Category2 = $(byText("აუდიო, ვიდეო, ფოტოტექნიკა")),
            Category3 = $(byText("დინამიკები")),
            AddProductName = $(byName("Title_4")),
            PriceInpute = $(byName("Price")),
            OnlineSupporText = $(byText("მსურს ნივთის ონლაინ გაყიდვა")),
            OnlineSupport = $(byXpath("//*[@id=\"root\"]/main/div/div/div/div[2]/form/div/div[1]/div[3]/div[3]/div/input")),
            QuantityInput = $(byName("Quantity")),
            WeightInput = $(byName("Weight")),
            BancAccountInput = $(byName("BankAccount")),
            LocationInput = $(byXpath("//*[@id=\"LocID\"]/div/div/div/div[2]")),
            LocationInput1 = $(byText("თბილისი")),
            NameInput = $(byName("User")),
            PhoneNumberInpute = $(byName("Phone")),
            UserAdressInput = $(byName("UserAddressID")),
            TypeInput = $(byXpath("/html/body/div[1]/main/div/div/div/div[2]/form/div/div[1]/div[5]/div[1]/div/div/div")),
            TypeInput1 = $(byText("სახლის აუდიო სისტემა")),
            BateryRadioButton = $("#radio-5039-1"),
            LightingRadioButton = $("#radio-5035-0"),
            PowerValueInput = $("#text-409-1"),
            ImpedanceValueInput = $("#text-403-1"),
            QuantitySelect = $(byName("Attr-197")),
            KaButton = $(".en-flag-i"),
            PublishButton = $(byText("გამოქვეყნება")),
            InputNamError = $(byText("მიუთითე დასახელება")),
            InputLocationError = $(byText("მიუთითე ნივთის ადგილმდებარეობა")),
            InputUserError = $(byText("მიუთითე სახელი")),
            InputPhoneError = $(byText("მიუთითე ტელეფონი")),
            InputCategoryError = $(byText("მიუთითე კატეგორია")),
            AddProducText = $(byText("განცხადების დამატება")),
            MainPageButton = $(byXpath("//*[@id=\"root\"]/header/div/div/div/div/div/div/a/i")),
            PhoneNumberCheck = $(byText("დაადასტურე ტელეფონის ნომერი")),
            AtributteText = $(byText("ძირითადი მახასიათებლები"));

}
