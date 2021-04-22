package com.nix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {

    private final By addToCartButton = By.cssSelector(".add-button");


    public ProductPage (WebDriver browserDriver){
        super(browserDriver);
        browser=browserDriver;
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
    }
    public void clickAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton));
        WebElement addCartButton = browser.findElement(addToCartButton);
        addCartButton.click();
    }
}
