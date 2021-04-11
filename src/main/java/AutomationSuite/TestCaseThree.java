package AutomationSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseThree {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmelnyk\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.w3schools.com/cssref/sel_element_element.asp");
        Assert.assertTrue(true);
        System.out.println(driver.findElement(By.cssSelector("div[class=\"w3-example\"]")).isSelected());
        driver.quit();
    }
}