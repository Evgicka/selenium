package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class SimpleTest {

    @Test
    public void SimpleTest() {
        setProperty("webdriver.opera.driver", "src//main//resources//operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.manage().window().maximize(); //manage accept to work with another window
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.navigate().to("http//epam.github.io/jdi/index.html");
        Assert.assertEquals(driver.getTitle(), "Home Page");

       // driver.close(); //active close windows, if last window - close browser

        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.cssSelector("[id = Name]")).sendKeys("epam");
        driver.findElement(By.cssSelector("[id = Password]")).sendKeys("1234");
        driver.findElement(By.cssSelector(".login [type = 'submit']")).click();

        //WebElement mainTitle = driver.findElement(By.cssSelector("h3.main-title"));



    }


}
