package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    public SelenideElement
        ClosePopupButton = $(byXpath("//*[@id=\"root\"]/footer/div[1]/div/div[1]/button")),
        SearchButton = $(byAttribute("type","submit")),
        Onlinebuy = $(byText("ონლაინ ყიდვა")),
        LocationInpute = $(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div[1]/div/div")),
        LocationtValue = $(byText("აბაშა")),
        SearchPageCard = $(".d-block",8),
        LocationOnDetialPage = $(byText("აბაშა")),
        OnlineBuyButton = $("#radio-os-1-1"),
        ShopButton = $("#radio-pt-2-3"),
        CartButton = $(".toggle-cart"),
        PricetoInput = $(byName("PriceTo"));



}
