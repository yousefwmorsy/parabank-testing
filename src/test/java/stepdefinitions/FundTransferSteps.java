package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.BasePage;
import pages.HomePage;
import pages.TransferFundsPage;

public class FundTransferSteps {

    @And("user is on the transfer funds page")
    public void userIsOnTransferFundsPage() {

        HomePage.transferFundsClick();

    }


    @When("user enters a valid transfer amount")
    public void userEntersValidTransferAmount() {

        TransferFundsPage.enterAmount("550");

    }


    @And("user selects different source and destination accounts")
    public void userSelectsDifferentSourceAndDestinationAccounts() {

        TransferFundsPage.selectFromAccount("13677");


        TransferFundsPage.selectToAccount("13899");

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
                "13677",
                "Source account is incorrect"
        );

        Assert.assertEquals(
                TransferFundsPage.getToAccountResult(),
                "13899",
                "Destination account is incorrect"
        );

        Assert.assertNotEquals(
                TransferFundsPage.getFromAccountResult(),
                TransferFundsPage.getToAccountResult(),
                "Source and destination accounts should be different"
        );
    }
}