package com.nix.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    private final By addToCartButton = By.cssSelector(".add-button");
    private final HeaderComponent headerComponent;


    public ProductPage() {
        this.headerComponent = new HeaderComponent();
    }

    public void clickAddToCartButton(){
        findElement(addToCartButton).click();
    }
    public void openCart() {
        this.openCart();
    }
}
