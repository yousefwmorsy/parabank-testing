package pages;

import org.openqa.selenium.By;

public class WelcomePage extends BasePage{
    private static final By SUCCESS_MSG = By.xpath("//p[contains(text(),'Your account was created successfully')]");

    public static Boolean IsUserRegistered(){
       return isElementPresent(SUCCESS_MSG);
    }




}
