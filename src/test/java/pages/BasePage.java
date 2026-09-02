package pages;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage extends DriverFactory {

    protected static WebElement waitVisible(By locator)  {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected static WebElement waitClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected static void click(By locator) {
        WebElement element = waitClickable(locator);
        element.click();
    }

    protected static void enterText(By locator, String text) {
        WebElement element = waitVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected static String getText(By locator) {
        WebElement element = waitVisible(locator);
        return element.getText();
    }

    protected static boolean isElementPresent(By locator) {
        try {
            WebElement element = waitVisible(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected static void dropdownSelect(By locator, String option) {
        WebElement element = waitVisible(locator);
        new Select(element).selectByVisibleText(option);
    }

    protected static void tickCheckbox(By locator) {
        WebElement element = waitVisible(locator);
        if (!element.isSelected()) {
            element.click();
        }
    }

    protected static void untickCheckbox(By locator) {
        WebElement element = waitVisible(locator);
        if (element.isSelected()) {
            element.click();
        }
    }
}
