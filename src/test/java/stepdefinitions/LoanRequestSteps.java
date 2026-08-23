package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RequestLoanPage;
import pages.SidebarPage;

public class LoanRequestSteps {
    @And("user is on the loan request page")
    public void userIsOnRequestLoanPage() {
        SidebarPage.clickRequestLoanButton();
    }

    @When("user enters a loan and down payment amount")
    public void userEntersLoanAndDownPaymentAmount() {
        RequestLoanPage.enterLoanAmount("500");
        RequestLoanPage.enterDownPayment("0");
    }

    @And("selects from a valid account")
    public void userSelectsFromValidAccount() {
        RequestLoanPage.selectFromAccount("15120");
    }

    @And("clicks on apply now button")
    public void userClicksOnApplyNowButton() {
        RequestLoanPage.clickApplyNowButton();
    }

    @Then("loan confirmation appears")
    public void loanConfirmationAppears() {
        Assert.assertTrue(RequestLoanPage.isLoanApprovedMessageDisplayed());
    }
}