package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SidebarPage;
import pages.TransferFundsPage;

public class FundTransferSteps {

    private String transferAmount;
    private String fromAccount;
    private String toAccount;

    @And("user is on the transfer funds page")
    public void userIsOnTransferFundsPage() {
        SidebarPage.clickTransferFundsButton();
    }

    @When("user enters a valid transfer amount of {string}")
    public void userEntersValidTransferAmount(String amount) {
        this.transferAmount = amount;
        TransferFundsPage.enterAmount(amount);
    }

    @And("user selects source account {string} and destination account {string}")
    public void userSelectsDifferentSourceAndDestinationAccounts(String source, String destination) {
        this.fromAccount = source;
        this.toAccount = destination;
        TransferFundsPage.selectFromAccount(source);
        TransferFundsPage.selectToAccount(destination);
    }

    @And("clicks on transfer button")
    public void userClicksOnTransferButton() {
        TransferFundsPage.clickTransfer();
    }

    @Then("transfer confirmation appears with amount {string}, from account {string}, and to account {string}")
    public void transferConfirmationAppears(String expectedAmount, String expectedFromAccount, String expectedToAccount) {
        Assert.assertTrue(
                TransferFundsPage.isTransferSuccessful(),
                "Transfer confirmation was not displayed"
        );

        Assert.assertEquals(
                TransferFundsPage.getAmountResult(),
                "$" + expectedAmount,
                "Transferred amount is incorrect"
        );

        Assert.assertEquals(
                TransferFundsPage.getFromAccountResult(),
                expectedFromAccount,
                "Source account is incorrect"
        );

        Assert.assertEquals(
                TransferFundsPage.getToAccountResult(),
                expectedToAccount,
                "Destination account is incorrect"
        );

        Assert.assertNotEquals(
                TransferFundsPage.getFromAccountResult(),
                TransferFundsPage.getToAccountResult(),
                "Source and destination accounts should be different"
        );
    }
}