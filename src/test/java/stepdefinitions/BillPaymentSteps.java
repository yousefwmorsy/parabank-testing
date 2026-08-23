package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.BillPaymentPage;
import pages.SidebarPage;

public class BillPaymentSteps {

    private String payeeAccount;
    private String paymentAmount;
    private String fromAccount;

    @And("user is on the bill payment page")
    public void userIsOnTheBillPaymentPage() {
        SidebarPage.clickBillPayButton();
    }

    @When("user enters valid payee information with name {string}, address {string}, city {string}, state {string}, zip {string}, and phone {string}")
    public void userEntersValidPayeeInformation(String name, String address, String city, String state, String zip, String phone) {
        BillPaymentPage.enterPayeeName(name);
        BillPaymentPage.enterAddress(address);
        BillPaymentPage.enterCity(city);
        BillPaymentPage.enterState(state);
        BillPaymentPage.enterZipCode(zip);
        BillPaymentPage.enterPhoneNumber(phone);
    }

    @And("user enters payee account {string} and amount {string} from account {string}")
    public void userEntersAccountAndAmount(String account, String amount, String source) {
        this.payeeAccount = account;
        this.paymentAmount = amount;
        this.fromAccount = source;
        BillPaymentPage.enterAccountNumber(account);
        BillPaymentPage.enterVerifyAccountNumber(account);
        BillPaymentPage.enterAmount(amount);
        BillPaymentPage.selectFromAccount(source);
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