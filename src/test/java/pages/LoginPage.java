package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By username = By.cssSelector("#user-name");
    By password = By.cssSelector("#password");
    By login = By.cssSelector("#login-button");


    public void login(String usernameValue, String passwordValue){

    enterUsername(usernameValue);
    enterPassword(passwordValue);
    clickLogin();
    }
    public void enterUsername(String usernameValue) {
        driver.findElement(username).sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }
    public void clickLogin() {
       clickElement(login);
    }

}
