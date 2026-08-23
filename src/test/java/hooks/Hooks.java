package hooks;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    @Before
    public void setUp() {
        DriverFactory.initDriver();
        DriverFactory.getDriver().get("http://localhost:8080/parabank/index.htm");
    }

    @After
    public void embedScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            attachScreenshot(screenshot);
            scenario.attach(screenshot, "image/png", "Screenshot on failure");
        }

        DriverFactory.quitDriver();
    }

    @Attachment(value = "Screenshot on failure", type = "image/png")
    public byte[] attachScreenshot(byte[] screenshot) {
        return screenshot;
    }
}
