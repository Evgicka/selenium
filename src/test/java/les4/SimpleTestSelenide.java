
package les4;

import base.SelenideTestBase;
import base.TestBase;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.lang.System.setProperty;
import static org.testng.Assert.assertEquals;

public class SimpleTestSelenide extends SelenideTestBase {

    @Test
    public void SimpleTest1() {
        //1
        open("https://epam.github.io/JDI/index.html");


        //3
        assertEquals(getWebDriver().getTitle(), "Home Page");

        //4
        $(".profile-photo").click();
        $("[id = Name]").sendKeys("epam");
        $("[id = Password]").sendKeys("1234");
        $(".login [type = 'submit']").click();
        //5
        SelenideElement mainTitle = $("h3.main-title");
        mainTitle.shouldBe(visible);
        mainTitle.shouldHave(text("EPAM FRAMEWORK WISHES…"));

        //6
        $$(By.xpath("")).shouldHaveSize(4);//for collections
        $$(By.xpath("")).shouldBe(CollectionCondition.sizeLessThan(5));//for collections



        //driver.close(); //active close windows, if last window - close browser


    }
}
