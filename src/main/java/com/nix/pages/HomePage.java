package com.nix.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public WebDriver driver;


    private final By tShirt = By.xpath("/a[@class=\"title\" and text()=\"iPad 4 Mini\"]");
    private final By cdSucker = By.xpath("/a[@class=\"title\" and text()=\"Charli XCX - Sucker CD\"]");
    private final By iPad = By.xpath("/a[@class=\"title\" and text()=\"iPad 4 Mini\"]");

    private final By cdSuckerLink = By.xpath(".//a[@href=\"#/product/3\"]");
    private final By tShirtLink = By.xpath(".//a[@href=\"#/product/2\"]");
    private final By iPadLink = By.xpath(".//a[@href=\"#/product/1\"]");


    private final By tShirtPrice = By.xpath("//span[@class=\"price\" and  text()=\"$ 500.01\" ]");
    private final By scSuckerPrice = By.xpath("//span[@class=\"price\" and  text()=\"$ 10.99\" ]");
    private final By iPadPrice = By.xpath("//span[@class=\"price\" and  text()=\"$ 19.99\" ]");
    private final HeaderComponent header;

    public HomePage() {

        this.header = new HeaderComponent();
    }

    public void clickProduct() {
        findElement(tShirt).findElement(tShirtLink).click();
        findElement(iPad).findElement(iPadLink).click();
        findElement(cdSucker).findElement(cdSuckerLink).click();
    }

    public HeaderComponent header() {
        return this.header;
    }

    public String getProduct() {
        findElement(tShirt).getText();
        return String.valueOf(tShirt);
    }


}
