package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {
    public SelenideElement
        MainPageButton = $(".svg-i logo-i"),
        SearchButton = $(byAttribute("type","submit")),
        OnlineBuyText = $(byText("ონლაინ ყიდვა")),
        OnlineBuyButton = $(byAttribute("for","radio-os-1-1")),
        AplicationType = $(byText("განცხადების ტიპი")),
        TypeRadioButton = $(byAttribute("for","radio-pt-2-3")),
        FiltersText = $(byText("ფილტრები")),
        CartButton = $(".toggle-cart"),
        CartPageButton = $(byXpath("//*[@id=\"root\"]/header/div/div/div/div/ul/li[2]")),
        CartCheckbox = $(".mt-5px"),
        AllCartCheckbox =  $("#check-prs"),
        MarkedRemoveText = $(byText("მონიშნულების წაშლა")),
        CartClearButton = $(byText("კალათის გასუფთავება")),
        CartEmptyText = $(".empty-state-title");






}
