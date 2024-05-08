package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open application")
    public void user_open_application() {
        loginPage.openApplication();
    }

    @Then("verify user is on login screen")
    public void verify_user_is_on_login_screen() {
        Assert.assertTrue(loginPage.isLoginScreenDisplay());
    }

    @When("user login with username {string} and password {string}")
    public void user_login_with_username_and_password(String username, String password) {
        loginPage.doLogin(username, password);
    }



}
