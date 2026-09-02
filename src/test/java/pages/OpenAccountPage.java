package pages;

import org.openqa.selenium.By;

public class OpenAccountPage extends BasePage {
    private final static By CREATE_ACCOUNT_BUTTON = By.cssSelector("input[value='Open New Account']");
    private final static By ACCOUNT_CREATION_RESULT = By.id("openAccountResult");
    private final static By ACCOUNT_CREATION_FORM = By.id("openAccountForm");

    public static void clickCreateAccountButton() {
        click(CREATE_ACCOUNT_BUTTON);
    }

    public static boolean isAcccountCreatedSuccessfully() {
        return isElementPresent(ACCOUNT_CREATION_RESULT);
    }

    public static boolean isAccountCreationFormDisplayed() {
        return isElementPresent(ACCOUNT_CREATION_FORM);
    }
}
