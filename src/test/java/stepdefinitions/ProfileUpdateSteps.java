package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SidebarPage;
import pages.UpdateContactInfoPage;
import utils.FakeDataGenerator;

public class ProfileUpdateSteps {

    private String firstName, lastName, address, city, state, zip, phone;

    @Given("user is on the update profile page")
    public void userIsOnUpdateProfilePage() {
        SidebarPage.clickUpdateContactInfoButton();
    }

    @When("user updates contact information")
    public void userUpdatesContactInformation() {
        firstName = FakeDataGenerator.getName();
        lastName = FakeDataGenerator.getName();
        address = FakeDataGenerator.getAddress();
        city = FakeDataGenerator.getCity();
        state = FakeDataGenerator.getState();
        zip = FakeDataGenerator.getZipCode();
        phone = FakeDataGenerator.getPhoneNumber();

        UpdateContactInfoPage.enterFirstName(firstName);
        UpdateContactInfoPage.enterLastName(lastName);
        UpdateContactInfoPage.enterAddress(address);
        UpdateContactInfoPage.enterCity(city);
        UpdateContactInfoPage.enterState(state);
        UpdateContactInfoPage.enterZipCode(zip);
        UpdateContactInfoPage.enterPhoneNumber(phone);
    }

    @And("clicks update profile")
    public void clicksUpdateProfile() {
        UpdateContactInfoPage.clickUpdateProfileButton();
    }

    @Then("the updated information is saved")
    public void theUpdatedInformationIsSaved() {
        Assert.assertEquals(UpdateContactInfoPage.getFirstNameValue(), firstName);
        Assert.assertEquals(UpdateContactInfoPage.getLastNameValue(), lastName);
        Assert.assertEquals(UpdateContactInfoPage.getAddressValue(), address);
        Assert.assertEquals(UpdateContactInfoPage.getCityValue(), city);
        Assert.assertEquals(UpdateContactInfoPage.getStateValue(), state);
        Assert.assertEquals(UpdateContactInfoPage.getZipCodeValue(), zip);
        Assert.assertEquals(UpdateContactInfoPage.getPhoneNumberValue(), phone);
    }

}