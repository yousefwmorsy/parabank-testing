package pages;

import org.openqa.selenium.By;

public class BillPaymentPage extends BasePage {

    private static final By PAYEE_NAME = By.cssSelector("input[name='payee.name']");
    private static final By ADDRESS = By.cssSelector("input[name='payee.address.street']");
    private static final By CITY = By.cssSelector("input[name='payee.address.city']");
    private static final By STATE = By.cssSelector("input[name='payee.address.state']");
    private static final By ZIP_CODE = By.cssSelector("input[name='payee.address.zipCode']");
    private static final By PHONE_NUMBER = By.cssSelector("input[name='payee.phoneNumber']");
    private static final By ACCOUNT_NUMBER = By.cssSelector("input[name='payee.accountNumber']");
    private static final By VERIFY_ACCOUNT_NUMBER = By.cssSelector("input[name='verifyAccount']");
    private static final By AMOUNT = By.cssSelector("input[name='amount']");
    private static final By FROM_ACCOUNT = By.cssSelector("select[name='fromAccountId']");
    private static final By SEND_PAYMENT_BUTTON = By.cssSelector("input[value='Send Payment']");
    private static final By PAYMENT_CONFIRMATION = By.id("billpayResult");
    private static final By BILL_PAYMENT_FORM = By.id("billpayForm");

    public static void enterPayeeName(String name) {
        enterText(PAYEE_NAME, name);
    }

    public static void enterAddress(String address) {
        enterText(ADDRESS, address);
    }

    public static void enterCity(String city) {
        enterText(CITY, city);
    }

    public static void enterState(String state) {
        enterText(STATE, state);
    }

    public static void enterZipCode(String zipCode) {
        enterText(ZIP_CODE, zipCode);
    }

    public static void enterPhoneNumber(String phoneNumber) {
        enterText(PHONE_NUMBER, phoneNumber);
    }

    public static void enterAccountNumber(String accountNumber) {
        enterText(ACCOUNT_NUMBER, accountNumber);
    }

    public static void enterVerifyAccountNumber(String accountNumber) {
        enterText(VERIFY_ACCOUNT_NUMBER, accountNumber);
    }

    public static void enterAmount(String amount) {
        enterText(AMOUNT, amount);
    }

    public static void selectFromAccount(String account) {
        dropdownSelect(FROM_ACCOUNT, account);
    }

    public static void clickSendPaymentButton() {
        click(SEND_PAYMENT_BUTTON);
    }

    public static boolean isPaymentConfirmationDisplayed() {
        return isElementPresent(PAYMENT_CONFIRMATION);
    }

    public static boolean isBillPaymentFormDisplayed() {
        return isElementPresent(BILL_PAYMENT_FORM);
    }
}
