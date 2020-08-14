package com.valtech.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageObject {

    @FindBy(xpath = "//h1[contains(text(),'Contact')]")
    public WebElement contactHeaderText;
}
