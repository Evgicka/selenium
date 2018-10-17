package Les3;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.util.concurrent.TimeUnit;


public class SimpleTestPageObject extends TestBase {

    private WebDriver driver ;
    private HomePage homePage;

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        homePage = PageFactory.initElements(driver,HomePage.class);
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        driver.manage().window().maximize(); //manage accept to work with another window
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void afterMethod() {
        driver.close();//active close windows, if last window - close browser

    }


    @Test(groups = "Group1")
    public void SimpleTest() {


        //navigate 2
        driver.navigate().to("https://epam.github.io/JDI/index.html");

        //assert 3
        Assert.assertEquals(driver.getTitle(), "Home Page");


        //
        homePage.login("epam", "1234");



    }

}
