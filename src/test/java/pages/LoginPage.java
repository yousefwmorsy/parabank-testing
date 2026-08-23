package pages;

import org.openqa.selenium.By;

public class LoginPage extends HomePage {
    private final static By USERNAME_FIELD = By.cssSelector("input[name='username']");
    private final static By PASSWORD_FIELD = By.cssSelector("input[name='password']");
    private final static By LOGIN_BUTTON = By.cssSelector("input[value='Log In']");

    public static void enterUsername(String userName){
        enterText(USERNAME_FIELD, userName);
    }

    public static void enterPassword(String password){
        enterText(PASSWORD_FIELD, password);
    }

    public static void clickLoginButton(){
        click(LOGIN_BUTTON);
    }

    public static boolean isUsernameFieldDisplayed() {
        return isElementPresent(USERNAME_FIELD);
    }

    public static boolean isPasswordFieldDisplayed() {
        return isElementPresent(PASSWORD_FIELD);
    }
}
