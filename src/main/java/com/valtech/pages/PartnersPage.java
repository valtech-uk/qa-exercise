package com.valtech.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PartnersPage extends PageObject {

    @FindBy(xpath = "//div[@class='partners-block']//a[@href and not(contains(@class, 'button'))]")
    public List<WebElement> partnersLinksList;


}
