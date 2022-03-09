package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Runner1 {
    @BeforeTest
    public static void eege() {
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://ee.ge");
    }

    @AfterClass
    public static void tearDown(){
        closeWebDriver();
    }
}
