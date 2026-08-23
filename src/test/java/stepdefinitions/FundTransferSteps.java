package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SidebarPage;
import pages.TransferFundsPage;

public class FundTransferSteps {



    @And("user is on the transfer funds page")
    public void userIsOnTransferFundsPage() {
        SidebarPage.clickTransferFundsButton();
    }


    @When("user enters a valid transfer amount")
    public void userEntersValidTransferAmount() {
        TransferFundsPage.enterAmount("550");
    }


    @And("user selects different source and destination accounts")
    public void userSelectsDifferentSourceAndDestinationAccounts() {
        TransferFundsPage.selectFromAccount("14121");
        TransferFundsPage.selectToAccount("13344");
    }


    @And("clicks on transfer button")
    public void userClicksOnTransferButton() {

        TransferFundsPage.clickTransfer();

    }


    @Then("transfer confirmation appears")
    public void transferConfirmationAppears() {

        Assert.assertTrue(
                TransferFundsPage.isTransferSuccessful(),
                "Transfer confirmation was not displayed"
        );

        Assert.assertEquals(
                TransferFundsPage.getAmountResult(),
                "$550.00",
                "Transferred amount is incorrect"
        );

        Assert.assertEquals(
                TransferFundsPage.getFromAccountResult(),
                "14121",
                "Source account is incorrect"
        );

        Assert.assertEquals(
                TransferFundsPage.getToAccountResult(),
                "13344",
                "Destination account is incorrect"
        );

        Assert.assertNotEquals(
                TransferFundsPage.getFromAccountResult(),
                TransferFundsPage.getToAccountResult(),
                "Source and destination accounts should be different"
        );
    }
}