package com.nix.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    WebDriver browser;
    WebDriverWait wait;

    public BasePage(WebDriver browserDriver) {
        browser = browserDriver;
        //wait for page to load
        wait = new WebDriverWait(browser, 10);

    }
}





