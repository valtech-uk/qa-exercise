package com.valtech.pages.home;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("https://www.valtech.co.uk")
public class HomePage extends PageObject {

    @FindBy(xpath = "//button[contains(@class, 'icon-menu')]")
    public WebElement menuBtn;

    @FindBy(xpath = "//button[contains(@class, 'location-select')]")
    public WebElement locationBtn;

    @FindBy(xpath = "//div[@id='cookiebanner']//a[contains(text(),'Accept cookies')]")
    public WebElement cookieAcceptBtn;
}
