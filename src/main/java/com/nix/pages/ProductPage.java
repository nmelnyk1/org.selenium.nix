package com.nix.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    private final By addToCartButton = By.cssSelector(".add-button");
    private final By backButton = By.cssSelector(".router-link-active");
    private final HeaderComponent header;


    public ProductPage() {
        this.header = new HeaderComponent();
    }

    public void clickAddToCartButton(int count) {
        count = 2;
        for (int i = 0; i < count; i++) {
        findElement(addToCartButton).click();
        }
    }

    public void navigateToCart() {
        header.openCart();
    }

    public void clickBackButton()  {
            findElement(backButton).click();



    }

}
