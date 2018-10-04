package com.valtech;

import com.valtech.drivers.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private DriverFactory driverHelper = new DriverFactory();

    @Before
    public void setUp() {
        driverHelper.openBrowser();
        driverHelper.navigateToHome();
        driverHelper.maxBrowser();
        driverHelper.applyImpWait();
    }

    @After
    public void tearDown() {
        driverHelper.closeBrowser();
    }
}
