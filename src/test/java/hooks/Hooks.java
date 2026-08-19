package hooks;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        DriverFactory.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
