package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class SwaglabsTests extends BaseTest {

    @BeforeMethod
    public  void  setup(){
     baseSetup();
    }

    @AfterMethod
    public void tearDown(){
    baseTearDown();
    }


    @Test
    public void login() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("standard_user","secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.addProduct("Sauce Labs Onesie");
        productsPage.addProduct("Test.allTheThings() T-Shirt (Red)");

        productsPage.removeProduct("Sauce Labs Onesie");
        productsPage.removeProduct("Test.allTheThings() T-Shirt (Red)");

       Assert.assertEquals(productsPage.getPrice("Proizvod 1"),"0");
       Assert.assertEquals(productsPage.getPrice("Sauce Labs Onesie"),"$7.99");

       productsPage.openMenu();
  }

}
