package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SidebarPage;
import pages.LoginPage;

public class LogoutSteps {

    @When("user logs out")
    public void userLogsOut() {
        SidebarPage.clickLogOutButton();
    }

    @Then("login fields are visible")
    public void loginFieldsAreVisible() {
        Assert.assertTrue(LoginPage.isUsernameFieldDisplayed(), "Username field should be visible after logout");
        Assert.assertTrue(LoginPage.isPasswordFieldDisplayed(), "Password field should be visible after logout");
    }
}
