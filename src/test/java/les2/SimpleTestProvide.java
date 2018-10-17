package les2;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTestProvide extends TestBase {


    @Test//(dataProvider = "simpleDataProvider", dataProviderClass = DataProvider.class)
    public void SimpleTest() {
//1


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //manage accept to work with another window
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        //2
        driver.navigate().to("https://epam.github.io/JDI/index.html");

        //3
        Assert.assertEquals(driver.getTitle(), "Home Page");

        //4
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.cssSelector("[id = Name]")).sendKeys("epam");
        driver.findElement(By.cssSelector("[id = Password]")).sendKeys("1234");
        driver.findElement(By.cssSelector(".login [type = 'submit']")).click();

        //5
        driver.close(); //active close windows, if last window - close browser


    }


}

