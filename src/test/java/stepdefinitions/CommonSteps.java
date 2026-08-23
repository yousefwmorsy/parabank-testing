package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class CommonSteps {
    @Given("user is logged in")
    public void userIsLoggedIn() {
        LoginPage.enterUsername("john");
        LoginPage.enterPassword("demo");
        LoginPage.clickLoginButton();
    }
}
