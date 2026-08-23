package pages;

import org.openqa.selenium.By;

public class OpenAccountPage extends BasePage {
    private final static By CREATE_ACCOUNT_BUTTON = By.cssSelector("input[value='Open New Account']");
    private final static By ACCOUNT_CREATION_RESULT = By.id("openAccountResult");

    public static void clickCreateAccountButton() {
        click(CREATE_ACCOUNT_BUTTON);
    }

    public static boolean isAcccountCreatedSuccessfully() {
        return isElementPresent(ACCOUNT_CREATION_RESULT);
    }
}
