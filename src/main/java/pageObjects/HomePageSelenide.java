package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;

public class HomePageSelenide {

    @FindBy(css = ".profile-photo")
    public SelenideElement profileButton;

    @FindBy(css = "[id = Name]")
    public SelenideElement login;

    @FindBy(css = "[id = Password]")
    public SelenideElement password;

    @FindBy(css = "[type = 'submit']")
    public SelenideElement submit;

    public void openPage(){
        open("https://epam.github.io/JDI/index.html");

    }


    public void login(String name, String password){
        profileButton.click();
        login.sendKeys(name);
    }


}
