package com.valtech.page_object;

import com.valtech.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends DriverFactory {

    @FindBy(css = "h1")
    private WebElement title;

    public String getPageTitle() {
        return title.getText();
    }
}
