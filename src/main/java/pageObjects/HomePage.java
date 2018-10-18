package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(css = ".profile-photo")
    public WebElement profileButton;

    @FindBy(css = "[id = Name]")
    public WebElement login;

    @FindBy(css = "[id = Password]")
    public WebElement password;

    @FindBy(css = "[type = 'submit']")
    public WebElement submit;

    public void login(String name, String password){
        profileButton.click();
        login.sendKeys(name);
    }


}
