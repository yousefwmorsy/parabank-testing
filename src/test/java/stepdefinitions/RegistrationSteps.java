package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import pages.WelcomePage;
import utils.FakeDataGenerator;


public class RegistrationSteps {

    // Step definitions for User Registration will be implemented here
    @Given("user is on the registration page")
    public void userIsOnRegPage(){
        HomePage.regBtnClick();
    }

    @When("user enters his personal details")
    public void userEntersPersonalDetails(){
        RegistrationPage.enterFirstName(FakeDataGenerator.getName());
        RegistrationPage.enterLastName(FakeDataGenerator.getName());
        RegistrationPage.enterAddress(FakeDataGenerator.getAddress());
        RegistrationPage.enterCity(FakeDataGenerator.getCity());
        RegistrationPage.enterState(FakeDataGenerator.getState());
        RegistrationPage.enterZipCode(FakeDataGenerator.getZipCode());
        RegistrationPage.enterPhoneNumber(FakeDataGenerator.getPhoneNumber());
        RegistrationPage.enterSSN(FakeDataGenerator.getSSN());
        RegistrationPage.enterUsername(FakeDataGenerator.getName());
        String password = FakeDataGenerator.getPassword();
        RegistrationPage.enterPassword(password);
        RegistrationPage.enterConfirmPassword(password);
    }

    @And("clicks on register button")
    public void userClicksOnRegBtn(){
        RegistrationPage.clickRegister();

    }

    @Then("welcome page appears")
    public void welcomePageAppears(){
        Assert.assertTrue(WelcomePage.IsUserRegistered());
    }


}