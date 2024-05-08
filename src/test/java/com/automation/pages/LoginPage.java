package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "test-Username")
    WebElement usernameInput;

    @FindBy(id = "test-Password")
    WebElement passwordInput;

    @FindBy(id = "test-LOGIN")
    WebElement loginBtn;

    public void openApplication() {
        // Intentionally blank for future use
    }

    public boolean isLoginScreenDisplay() {
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
