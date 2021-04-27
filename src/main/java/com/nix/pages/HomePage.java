package com.nix.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By productLink = By.xpath(".//a[@class='title']");

    private final String productXpathstr = "//a[@class='title' and contains(text(),'%s')]";


    public String getProductName(String selectedProductName) {
        return findElement(By.xpath(String.format(productXpathstr,selectedProductName))).getText();
    }
// no default value, but look for some hack (String ...)
    public void clickProduct(String productName) {
        findElement(By.xpath(String.format(productXpathstr, productName))).click();
    }



}
