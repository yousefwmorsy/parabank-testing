package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;

public class CommonSteps {
    @Given("user is logged in")
    public void userIsLoggedIn() {
        LoginPage.enterUsername("yousef");
        LoginPage.enterPassword("yousef");
        LoginPage.clickLoginButton();
    }
}
