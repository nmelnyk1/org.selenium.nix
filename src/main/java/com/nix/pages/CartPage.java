package com.nix.pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private final By totalPrice = By.xpath("//tr[@class='total']/td[last()]");
    private final By productQuatityLocator = By.xpath("//*[not(@class)]/td[2]");
    private final By productPerUnit = By.xpath("//*[not(@class)]/td[3]");

    private final String productNamestr = "//tr/td/a[text()='%s']";
    //private final String productPricestr = "//span[@class='price' and contains(text(), '%s')]";


    public String getProductNameCart(String firstProductName) {
        return findElement(By.xpath(String.format(productNamestr, firstProductName))).getText();
    }


    public double getTotalPrice() {
        String quantityText = findElement(productQuatityLocator).getText();
        String perUnitText = findElement(productPerUnit).getText();

        String[] quantityNum = quantityText.split(" ");
        String[] perUnitNum = perUnitText.split("");

        double quantity = Double.parseDouble(quantityNum[1]);
        int perUnit = Integer.parseInt(perUnitText);

        return quantity * perUnit;
    }
}

