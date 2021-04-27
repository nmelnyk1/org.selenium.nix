package com.nix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class CartPage extends BasePage {

    private final By totalPrice = By.xpath("//tr[@class='total']/td[last()]");
    private final By productQuatityLocator =By.xpath( "//*[not(@class)]/td[2]");
    private final By productPerUnit = By.xpath("//*[not(@class)]/td[3]");

    private final String productNamestr = "//tr/td/a[text()='%s']";
    //private final String productPricestr = "//span[@class='price' and contains(text(), '%s')]";

    String quantityText = findElement(productQuatityLocator).getText();
    String perUnitText = findElement(productPerUnit).getText();
    String[] quantityNum = quantityText.split(" ");
    String[] perUnitNum = perUnitText.split("");
    int quantity = Integer.parseInt(Arrays.toString(quantityNum).replaceAll("\\D", ""));
    int perUnit = Integer.parseInt(Arrays.toString(perUnitNum).replaceAll("\\D", ""));

    public String getProductName(String firstProductName) {
        return findElement(By.xpath(String.format(productNamestr, firstProductName))).getText();
    }
    public int getTotal(int total) {
        return total = quantity *perUnit;
    }

}

