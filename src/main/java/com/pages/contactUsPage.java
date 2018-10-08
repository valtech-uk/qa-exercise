package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import valtech.tarung.PageObjectBaseClass;

import java.util.List;
/*b. Navigate to Contact page (/about/contact-us) and output how many Valtech offices in total*/

public class contactUsPage extends PageObjectBaseClass{

    public int totalValtechOffices(){
        List<WebElement> countryName = driver.findElements(By.cssSelector("h2 a"));
        return countryName.size();
    }
}
