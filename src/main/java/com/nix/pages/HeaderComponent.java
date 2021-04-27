package com.nix.pages;

import org.openqa.selenium.By;

public class HeaderComponent extends BasePage {
    private final By cartButton = By.xpath("//a[@href='#/cart']");
    //private final By homePage = By.


    public void openCart() {
        findElement(cartButton).click();
    }

    /*public void openHomePage(){

    }*/
}
