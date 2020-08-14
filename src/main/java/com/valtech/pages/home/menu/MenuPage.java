package com.valtech.pages.home.menu;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends PageObject {

    @FindBy(xpath = "//button[contains(text(), 'Partners')]")
    public WebElement partnersBtn;

    @FindBy(xpath = "//button[contains(text(), 'UK Public Sector')]")
    public WebElement ukPublicSectorBtn;

}
