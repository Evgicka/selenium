package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePageSelenide {

    @FindBy(css = ".profile-photo")
    public SelenideElement profileButton;

    @FindBy(css = "[id = Name]")
    public SelenideElement login;

    @FindBy(css = "[id = Password]")
    public SelenideElement password;

    @FindBy(css = "[type = 'submit']")
    public SelenideElement submit;

    public void login(String name, String password){
        profileButton.click();
        login.sendKeys(name);
    }


}
