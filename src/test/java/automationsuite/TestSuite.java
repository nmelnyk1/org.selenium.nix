package automationsuite;

import com.nix.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSuite {

    @Test
    public void AddToCartTest() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(browser, 10);
        browser.manage().window().maximize();
        browser.get("https://skyronic.github.io/vue-spa/#/");


        HomePage homePage = new HomePage(browser);
        homePage.getProductNameLinks();
        homePage.findProduct();

        ProductPage productPage = new ProductPage(browser);
        productPage.clickAddToCartButton();

        CartPage cartPage = new CartPage(browser);
        cartPage.getQuantity();
        cartPage.clickProceedToCheckoutButton();

        //??
        /*String actualProduct=;
        String expectedProduct ="H&M T-Shirt White";
        Assert.assertEquals();*/


        browser.quit();
    }
}