package com.valtech.pages.home.location;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocationsPage extends PageObject {

    @FindBy(xpath = "//li//span[contains(text(),'United Kingdom')]/parent::a")
    public WebElement ukLocationLink;

}
