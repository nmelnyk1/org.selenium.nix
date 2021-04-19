package com.nix.pages;

import org.openqa.selenium.By;

public class HeaderComponent extends BasePage {
    public final By cartButton = By.xpath("//a[@href='#/cart']");

    public void openCart() {
        findElement(cartButton).click();
    }
}
