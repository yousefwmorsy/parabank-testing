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

    @Given("user is logged in with username {string} and password {string}")
    public void userIsLoggedInWithCredentials(String username, String password) {
        LoginPage.enterUsername(username);
        LoginPage.enterPassword(password);
        LoginPage.clickLoginButton();
    }
}
