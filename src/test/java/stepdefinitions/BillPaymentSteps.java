package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.BillPaymentPage;
import pages.SidebarPage;

public class BillPaymentSteps {
    @And("user is on the bill payment page")
    public void userIsOnTheBillPaymentPage() {
        SidebarPage.clickBillPayButton();
    }

    @When("user enters valid payee information")
    public void userEntersValidPayeeInformation() {
        BillPaymentPage.enterPayeeName("John Doe");
        BillPaymentPage.enterAddress("123 Main Street");
        BillPaymentPage.enterCity("New York");
        BillPaymentPage.enterState("NY");
        BillPaymentPage.enterZipCode("10001");
        BillPaymentPage.enterPhoneNumber("555-1234");
        BillPaymentPage.enterAccountNumber("13344");
        BillPaymentPage.enterVerifyAccountNumber("13344");
        BillPaymentPage.enterAmount("100.00");
        BillPaymentPage.selectFromAccount("13677");
    }

    @And("clicks on send payment button")
    public void clicksOnSendPaymentButton() {
        BillPaymentPage.clickSendPaymentButton();
    }

    @Then("bill payment confirmation appears")
    public void billPaymentConfirmationAppears() {
        Assert.assertTrue(
                BillPaymentPage.isPaymentConfirmationDisplayed());
    }
}