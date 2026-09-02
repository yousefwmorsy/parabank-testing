package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SidebarPage;
import pages.LoginPage;

public class LogoutSteps {

    @And("user logs out")
    public void userLogsOut() {
        SidebarPage.clickLogOutButton();
        loginFieldsAreVisible();
    }

    @Then("login fields are visible")
    public void loginFieldsAreVisible() {
        Assert.assertTrue(LoginPage.isUsernameFieldDisplayed(), "Username field not visible after logout");
        Assert.assertTrue(LoginPage.isPasswordFieldDisplayed(), "Password field not visible after logout");
    }
}
