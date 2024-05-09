package com.automation.pages;

import com.automation.utils.DriverUtils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    AppiumDriver driver;

    public BasePage() {
        driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void slowSendKeys(WebElement element, String text){
        for(char c : text.toCharArray()){
            element.sendKeys(String.valueOf(c));
        }
    }



}
