package pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage{
    private final static By REGISTER_BTN = By.cssSelector("input[type=\"submit\"][value=\"Register\"]");

    private final static By FIRST_NAME_TB = By.id("customer.firstName");

    private final static By LAST_NAME_TB = By.id("customer.lastName");

    private final static By ADDRESS_TB = By.id("customer.address.street");

    private final static By CITY_TB = By.id("customer.address.city");

    private final static By STATE_TB = By.id("customer.address.state");

    private final static By ZIP_CODE_TB = By.id("customer.address.zipCode");

    private final static By PHONE_NO_TB = By.id("customer.phoneNumber");

    private final static By SSN_TB = By.id("customer.ssn");

    private final static By USERNAME_TB = By.id("customer.username");

    private final static By PASSWORD_TB = By.id("customer.password");

    private final static By CONFIRM_PASSWORD_TB = By.id("repeatedPassword");





    public static void enterFirstName(String firstName) {
        enterText(FIRST_NAME_TB, firstName);
    }

    public static void enterLastName(String lastName) {
        enterText(LAST_NAME_TB, lastName);
    }

    public static void enterAddress(String address) {
        enterText(ADDRESS_TB, address);
    }

    public static void enterCity(String city) {
        enterText(CITY_TB, city);
    }

    public static void enterState(String state) {
        enterText(STATE_TB, state);
    }

    public static void enterZipCode(String zipCode) {
        enterText(ZIP_CODE_TB, zipCode);
    }

    public static void enterPhoneNumber(String phone) {
        enterText(PHONE_NO_TB, phone);
    }

    public static void enterSSN(String ssn) {
        enterText(SSN_TB, ssn);
    }

    public static void enterUsername(String username) {
        enterText(USERNAME_TB, username);
    }

    public static void enterPassword(String password) {
        enterText(PASSWORD_TB, password);
    }

    public static void enterConfirmPassword(String confirmPassword) {
        enterText(CONFIRM_PASSWORD_TB, confirmPassword);
    }

    public static void clickRegister() {
        click(REGISTER_BTN);
    }







}
