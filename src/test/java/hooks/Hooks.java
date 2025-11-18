package hooks;

import core.CoreDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@ui")
    public void setup() {
        System.out.println("-------- BEFORE triggered -------------");
        CoreDriver.getDriver();
    }

    @After("@ui")
    public void tearDown() {
        System.out.println("--------- AFTER triggered -----------");
        CoreDriver.quitDriver();
    }

}
