package pages;

import org.openqa.selenium.By;

public class RequestLoanPage extends BasePage {
    private static final By LOAN_AMOUNT = By.id("amount");
    private static final By DOWN_PAYMENT = By.id("downPayment");
    private static final By FROM_ACCOUNT = By.id("fromAccountId");
    private static final By APPLY_NOW_BUTTON = By.cssSelector("input[value='Apply Now']");
    private static final By LOAN_CONFIRMATION = By.id("requestLoanResult");
    private static final By LOAN_PROVIDER_NAME = By.id("loanProviderName");
    private static final By RESPONSE_DATE = By.id("responseDate");
    private static final By LOAN_STATUS = By.id("loanStatus");
    private static final By NEW_ACCOUNT_ID = By.id("newAccountId");
    private static final By LOAN_APPROVED_MESSAGE = By.id("loanRequestApproved");
    private static final By REQUEST_LOAN_FORM = By.id("requestLoanForm");

    public static void enterLoanAmount(String amount) {
        enterText(LOAN_AMOUNT, amount);
    }

    public static void enterDownPayment(String downPayment) {
        enterText(DOWN_PAYMENT, downPayment);
    }

    public static void selectFromAccount(String account) {
        dropdownSelect(FROM_ACCOUNT, account);
    }

    public static void clickApplyNowButton() {
        click(APPLY_NOW_BUTTON);
    }

    public static boolean isLoanConfirmationDisplayed() {
        return isElementPresent(LOAN_CONFIRMATION);
    }

    public static String getLoanProviderName() {
        return getText(LOAN_PROVIDER_NAME);
    }

    public static String getResponseDate() {
        return getText(RESPONSE_DATE);
    }

    public static String getLoanStatus() {
        return getText(LOAN_STATUS);
    }

    public static String getNewAccountId() {
        return getText(NEW_ACCOUNT_ID);
    }

    public static boolean isLoanApprovedMessageDisplayed() {
        return isElementPresent(LOAN_APPROVED_MESSAGE);
    }

    public static boolean isRequestLoanFormDisplayed() {
        return isElementPresent(REQUEST_LOAN_FORM);
    }
}
