package steps;

import core.CoreDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@ui")
    public void setup() {
        CoreDriver.getDriver();
    }

    @After("@ui")
    public void tearDown() {
        CoreDriver.quitDriver();
    }

}
