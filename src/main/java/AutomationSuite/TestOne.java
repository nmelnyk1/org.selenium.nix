package AutomationSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOne {

     public static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nmelnyk\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void assertURL(){
     driver.get("https://staging.orbusdevelopment.com/");
     String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);

        Assert.assertEquals("https://staging.orbusdevelopment.com/", actualURL);
        System.out.println("Test Passed");
    }
    @AfterClass
    public static void closeBrowser(){
        driver.close();
    }
}
