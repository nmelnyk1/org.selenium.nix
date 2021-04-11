package AutomationSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Cart {

    @Test
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://skyronic.github.io/vue-spa ");
        WebElement product = driver.findElement(By.xpath("//a[@class='title' and text()='iPad 4 Mini']"));

        product.click();
        WebElement cart = driver.findElement(By.xpath("//button[@class=\"add-button\" and text()=\"Add to cart\"]"));
        cart.click();


        System.out.println("Closing Browser");
        driver.quit();
    }

}
