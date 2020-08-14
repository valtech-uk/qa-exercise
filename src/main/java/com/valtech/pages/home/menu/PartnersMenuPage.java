package com.valtech.pages.home.menu;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PartnersMenuPage extends PageObject {

    @FindBy(xpath = "(//a[@data-om-navcta='Partners'])[1]")
    public WebElement ourPartnersTopBtn;

    @FindBy(xpath = "//a[contains(@href, 'partners')]")
    public List<WebElement> partnersList;

}
