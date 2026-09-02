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
        Assert.assertTrue(RequestLoanPage.isRequestLoanFormDisplayed(), "User was not redirected to request loan page.");
    }

    @When("user enters loan amount {string} and down payment {string}")
    public void userEntersLoanAndDownPaymentAmount(String loan, String downPaymentAmount) {
        RequestLoanPage.enterLoanAmount(loan);
        RequestLoanPage.enterDownPayment(downPaymentAmount);
    }

    @And("selects account {string} for the loan")
    public void userSelectsFromValidAccount(String account) {
        RequestLoanPage.selectFromAccount(account);
    }

    @And("clicks on apply now button")
    public void userClicksOnApplyNowButton() {
        RequestLoanPage.clickApplyNowButton();
    }

    @Then("loan confirmation appears")
    public void loanConfirmationAppears() {
        Assert.assertTrue(RequestLoanPage.isLoanApprovedMessageDisplayed(), "Loan approval message is not displayed.");
    }
}