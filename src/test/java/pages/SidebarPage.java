package pages;

import org.openqa.selenium.By;

public class SidebarPage extends BasePage {
    private final static By OPEN_NEW_ACCOUNT_BUTTON = By.linkText("Open New Account");
    private final static By ACCOUNT_OVERVIEW_BUTTON = By.linkText("Accounts Overview");
    private final static By TRANSFER_FUNDS_BUTTON = By.linkText("Transfer Funds");
    private final static By BILL_PAY_BUTTON = By.linkText("Bill Pay");
    private final static By FIND_TRANSACTIONS_BUTTON = By.linkText("Find Transactions");
    private final static By UPDATE_CONTACT_INFO_BUTTON = By.linkText("Update Contact Info");
    private final static By REQUEST_LOAN_BUTTON = By.linkText("Request Loan");
    private final static By LOGOUT_BUTTON = By.linkText("Log Out");

    public static void clickOpenNewAccountButton() {
        click(OPEN_NEW_ACCOUNT_BUTTON);
    }

    public static void clickAccountOverviewButton() {
        click(ACCOUNT_OVERVIEW_BUTTON);
    }

    public static void clickTransferFundsButton() {
        click(TRANSFER_FUNDS_BUTTON);
    }

    public static void clickBillPayButton() {
        click(BILL_PAY_BUTTON);
    }

    public static void clickFindTransactionsButton() {
        click(FIND_TRANSACTIONS_BUTTON);
    }

    public static void clickUpdateContactInfoButton() {
        click(UPDATE_CONTACT_INFO_BUTTON);
    }

    public static void clickRequestLoanButton() {
        click(REQUEST_LOAN_BUTTON);
    }

    public static void clickLogOutButton() {
        click(LOGOUT_BUTTON);
    }
}
