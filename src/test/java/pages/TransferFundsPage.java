package pages;

import org.openqa.selenium.By;

public class TransferFundsPage extends BasePage {

    private static final By AMOUNT =
            By.id("amount");

    private static final By FROM_ACCOUNT =
            By.id("fromAccountId");

    private static final By TO_ACCOUNT =
            By.id("toAccountId");

    private static final By TRANSFER_BUTTON =
            By.cssSelector("#transferForm input[type='submit']");

    private static final By TRANSFER_RESULT =
            By.id("showResult");

    private static final By AMOUNT_RESULT =
            By.id("amountResult");

    private static final By FROM_ACCOUNT_RESULT =
            By.id("fromAccountIdResult");

    private static final By TO_ACCOUNT_RESULT =
            By.id("toAccountIdResult");


    public static void enterAmount(String amount) {
        enterText(AMOUNT, amount);
    }


    public static void selectFromAccount(String account) {
        dropdownSelect(FROM_ACCOUNT, account);
    }


    public static void selectToAccount(String account) {
        dropdownSelect(TO_ACCOUNT, account);
    }


    public static void clickTransfer() {
        click(TRANSFER_BUTTON);
    }


    public static boolean isTransferSuccessful() {
        return isElementPresent(TRANSFER_RESULT);
    }


    public static String getAmountResult() {
        return getText(AMOUNT_RESULT);
    }


    public static String getFromAccountResult() {
        return getText(FROM_ACCOUNT_RESULT);
    }


    public static String getToAccountResult() {
        return getText(TO_ACCOUNT_RESULT);
    }
}