package com.nix.pages;

import com.nix.core.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BasePage {


    private WebDriver driver = Driver.getDriver();

    protected WebElement findElement(By locator){
        return driver.findElement(locator);
    }
    protected WebDriverWait getWait(){
        return new WebDriverWait(driver,100);
    }
    protected WebDriver getDriver(){
        return driver;
    }



}
