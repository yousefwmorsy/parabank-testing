package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HomePage;
import pages.RegistrationPage;
import pages.WelcomePage;


public class RegistrationSteps {

    // Step definitions for User Registration will be implemented here
    @Given("user is on the registration page")
    public void userIsOnRegPage(){
        HomePage.regBtnClick();
    }

    @When("user enters his personal details")
    public void userEntersPersonalDetails(){
        RegistrationPage.enterFirstName("John");
        RegistrationPage.enterLastName("Doe");
        RegistrationPage.enterAddress("123 Main Street");
        RegistrationPage.enterCity("Dallas");
        RegistrationPage.enterState("Texas");
        RegistrationPage.enterZipCode("75001");
        RegistrationPage.enterPhoneNumber("123-456-7890");
        RegistrationPage.enterSSN("123-45-6789");
        RegistrationPage.enterUsername("john_doe_" + System.currentTimeMillis());
        RegistrationPage.enterPassword("Pass@1234");
        RegistrationPage.enterConfirmPassword("Pass@1234");
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