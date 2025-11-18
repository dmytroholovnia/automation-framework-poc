package hooks;

import core.ApiService;
import core.CoreDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    protected ApiService apiService;

    @Before
    public void setup() {
        apiService = new ApiService();
        CoreDriver.getDriver();
    }

    @After
    public void tearDown() {
        CoreDriver.quitDriver();
    }

}
