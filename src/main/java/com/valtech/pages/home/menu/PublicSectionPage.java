package com.valtech.pages.home.menu;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublicSectionPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Talk to us')]")
    public WebElement talkToUsBtn;

    @FindBy(xpath = "//img[contains(@src, 'client-logos')]")
    public WebElement clientLogosImg;

}
