package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RegistrationPage;
import pages.SidebarPage;
import pages.UpdateContactInfoPage;

public class ProfileUpdateSteps {

    private String firstName, lastName, address, city, state, zip, phone;

    @Given("user is on the update profile page")
    public void userIsOnUpdateProfilePage() {
        SidebarPage.clickUpdateContactInfoButton();
        Assert.assertTrue(UpdateContactInfoPage.isUpdateProfileFormDisplayed(), "User was not redirected to update profile page.");
    }

    @When("user updates contact information with first name {string}, last name {string}, address {string}, city {string}, state {string}, zip {string}, and phone {string}")
    public void userUpdatesContactInformation(String fname, String lname, String addr, String c, String st, String z, String p) {
        firstName = fname;
        lastName = lname;
        address = addr;
        city = c;
        state = st;
        zip = z;
        phone = p;

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
        Assert.assertEquals(UpdateContactInfoPage.getFirstNameValue(), firstName, "First name update unsuccessful.");
        Assert.assertEquals(UpdateContactInfoPage.getLastNameValue(), lastName, "Last name update unsuccessful.");
        Assert.assertEquals(UpdateContactInfoPage.getAddressValue(), address, "Address update unsuccessful.");
        Assert.assertEquals(UpdateContactInfoPage.getCityValue(), city, "City update unsuccessful.");
        Assert.assertEquals(UpdateContactInfoPage.getStateValue(), state, "State update unsuccessful.");
        Assert.assertEquals(UpdateContactInfoPage.getZipCodeValue(), zip, "Zip code update unsuccessful.");
        Assert.assertEquals(UpdateContactInfoPage.getPhoneNumberValue(), phone, "Phone number update unsuccessful.");
    }

}