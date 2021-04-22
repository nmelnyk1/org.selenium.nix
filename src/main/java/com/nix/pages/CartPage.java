package com.nix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {


    private final By totalQuantity = By.xpath(".//th[text()='Quantity']");
    private final By checkoutButton = By.xpath("//button[@class='checkout-button']");

    public CartPage(WebDriver browserDriver){
        super(browserDriver);
wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButton));
    }


    public int getQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(totalQuantity));
        String numProductsLabelText = browser.findElement(totalQuantity).getText();
        int spaceLocation = numProductsLabelText.indexOf(" ");
        int numProducts = Integer.parseInt(numProductsLabelText.substring(0, spaceLocation));
        return numProducts;
    }
    public void clickProceedToCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        WebElement proceedToCheckoutButton = browser.findElement(checkoutButton);
        proceedToCheckoutButton.click();
    }
    }

