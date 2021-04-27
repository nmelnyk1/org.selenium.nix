package com.nix.pages;


import com.nix.core.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    private final WebDriver driver = Driver.getDriver();


    public BasePage() {
    }

    protected WebDriverWait getDriverWait() {
        return new WebDriverWait(driver, 10);
    }

    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    protected WebDriver getDriver() {
        return driver;
    }
}





