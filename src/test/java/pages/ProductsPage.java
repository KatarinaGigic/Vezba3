package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By shoppingCart = By.cssSelector(".shopping_cart_link");

    String productNameXpath = "//div[@class='inventory_item_name' and contains(text(),'$$')]";
    String productPriceXpath = "//div[@class='inventory_item_name' and contains(text(),'$$')]/../../..//div[@class='inventory_item_price']";
    String productAddBtnXpath = "//div[@class='inventory_item_name' and contains(text(),'$$')]/../../..//button[text()='Add to cart']";
    String productRemoveBtnXpath = "//div[@class='inventory_item_name' and contains(text(),'$$')]/../../..//button[text()='Remove']";

    public void addProduct(String productName) throws InterruptedException {
        clickElement(By.xpath(productAddBtnXpath.replace("$$", productName)));
        Thread.sleep(500);
    }

    public void removeProduct(String productName) throws InterruptedException {
        clickElement(By.xpath(productRemoveBtnXpath.replace("$$", productName)));
        Thread.sleep(500);
    }

    public String getPrice(String productName) {
        if (driver.findElements(By.xpath(productPriceXpath.replace("$$", productName))).size() > 0) {
            return driver.findElement(By.xpath(productPriceXpath.replace("$$", productName))).getText();
        } else {
            //click next page
            return "0";
    }
}
    public void clickShoppingCart(){
      clickElement(shoppingCart);
    }
}



