package com.automation.pages;

import com.automation.utils.DriverUtils;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    AppiumDriver driver;

    public BasePage() {
        driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }

}
