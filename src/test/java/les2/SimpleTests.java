package les2;

import base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class SimpleTests extends testBase {

    private WebDriver driver;


    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //manage accept to work with another window
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);



    }

    @AfterMethod
    public void afterMethod(){
        driver.close();//active close windows, if last window - close browser

    }



    @Test(groups = "Group1")
    public void SimpleTest() {



        //navigate 2
        driver.navigate().to("https://epam.github.io/JDI/index.html");

        //assert 3
        Assert.assertEquals(driver.getTitle(), "Home Page");

        //login 4
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.cssSelector("[id = Name]")).sendKeys("epam");
        driver.findElement(By.cssSelector("[id = Password]")).sendKeys("1234");
        driver.findElement(By.cssSelector(".login [type = 'submit']")).click();





    }

}
