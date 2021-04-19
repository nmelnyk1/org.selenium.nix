package com.nix.pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private  final By productName = By.xpath("./th[text()=\"Name\"]");
    private final By productQuantity = By.xpath("./th[text()=\"Quantity\"]");
    private final By productPerUnit = By.xpath("./th[text()=\"Per unit\"]");
    public String getProductName() {
        findElement(productName).getText();
        return String.valueOf(productName);
    }
}
