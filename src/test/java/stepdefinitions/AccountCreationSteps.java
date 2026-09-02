package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.OpenAccountPage;
import pages.RegistrationPage;
import pages.SidebarPage;

public class AccountCreationSteps {
    @When("user clicks create new account")
    public void userClicksCreateNewAccount() {
        OpenAccountPage.clickCreateAccountButton();
    }
    @Then("account creation confirmation appears")
    public void accountCreationConfirmationAppears() {
        Assert.assertTrue(OpenAccountPage.isAcccountCreatedSuccessfully());
    }
    @And("user is on the account creation page")
    public void userIsOnTheAccountCreationPage() {
        SidebarPage.clickOpenNewAccountButton();
        Assert.assertTrue(OpenAccountPage.isAccountCreationFormDisplayed(), "Account creation page is not displayed");
    }
}