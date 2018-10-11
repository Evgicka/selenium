package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.System.setProperty;

public class SimpleTest {

    @Test
    public void SimpleTest(){
        setProperty("webdriver.chrome.driver","src//main//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http//epam.github.io/jdi/index.html");
        Assert.assertEquals(driver.getTitle(),"Home Page");
    }
}
