package com.nix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    private final By tShirtLocator = By.xpath("div[@class='product' and text()='H&M T-Shirt White']");
    private final By cdSuckerLocator = By.xpath("div[@class='product' and text()='Charli XCX - Sucker CD']");
    private final By iPadLocator = By.xpath("div[@class='product' and text()='iPad 4 Mini']");
    private final By productLink = By.xpath(".//div[@class='product']");
    //private final By productPrice = By.xpath(".//span[@class='price']");

    public HomePage(WebDriver browserDriver) {
        super(browserDriver);
    }


    public List<WebElement> getProductNameLinks() {
        wait.until(ExpectedConditions.elementToBeClickable(productLink));
        List<WebElement> productLinks = browser.findElements(productLink);
        return productLinks;
    }
    public void findProduct(){
        WebElement tShirt = browser.findElement(tShirtLocator);
        tShirt.getText();
        browser.navigate().back();
        WebElement cdSucker =browser.findElement(cdSuckerLocator);
        cdSucker.click();
        browser.navigate().back();
        WebElement iPad = browser.findElement(iPadLocator);
        iPad.click();
        browser.navigate().back();
    }

}
