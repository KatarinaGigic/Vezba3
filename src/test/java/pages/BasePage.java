package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    By menu = By.cssSelector("#react-burger-menu-btn");

    public void  openMenu(){
       clickElement(menu);
    }
    public void clickElement(WebElement element){
        element.click();
    }
    public void clickElement(By by){
       driver.findElement(by).click();
    }
}
