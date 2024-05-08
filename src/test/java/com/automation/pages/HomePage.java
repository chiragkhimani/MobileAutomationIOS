package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='PRODUCTS']")
    WebElement pageTitle;

    public boolean isHomeScreenDisplayed() {
        return pageTitle.isDisplayed();
    }
}
