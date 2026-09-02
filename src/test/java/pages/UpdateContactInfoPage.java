package pages;

import org.openqa.selenium.By;

public class UpdateContactInfoPage extends BasePage {

    private final static By FIRST_NAME_TB = By.id("customer.firstName");
    private final static By LAST_NAME_TB = By.id("customer.lastName");
    private final static By ADDRESS_TB = By.id("customer.address.street");
    private final static By CITY_TB = By.id("customer.address.city");
    private final static By STATE_TB = By.id("customer.address.state");
    private final static By ZIP_CODE_TB = By.id("customer.address.zipCode");
    private final static By PHONE_NO_TB = By.id("customer.phoneNumber");
    private final static By UPDATE_BTN = By.cssSelector("input.button[value='Update Profile']");
    private final static By UPDATE_PROFILE_FORM = By.id("updateProfileForm");

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

    public static void clickUpdateProfileButton() {
        click(UPDATE_BTN);
    }

    public static String getFirstNameValue() {
        return getDriver().findElement(FIRST_NAME_TB).getAttribute("value");
    }

    public static String getLastNameValue() {
        return getDriver().findElement(LAST_NAME_TB).getAttribute("value");
    }

    public static String getAddressValue() {
        return getDriver().findElement(ADDRESS_TB).getAttribute("value");
    }

    public static String getCityValue() {
        return getDriver().findElement(CITY_TB).getAttribute("value");
    }

    public static String getStateValue() {
        return getDriver().findElement(STATE_TB).getAttribute("value");
    }

    public static String getZipCodeValue() {
        return getDriver().findElement(ZIP_CODE_TB).getAttribute("value");
    }

    public static String getPhoneNumberValue() {
        return getDriver().findElement(PHONE_NO_TB).getAttribute("value");
    }

    public static boolean isUpdateProfileFormDisplayed() {
        return isElementPresent(UPDATE_PROFILE_FORM);
    }
}
