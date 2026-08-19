package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final static By REGISTER_LINK = By.linkText("Register");

    public static void regBtnClick(){
        click(REGISTER_LINK);
    }

}
