package com.valtech.page_object;

import com.valtech.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContactUspage extends DriverFactory {


    @FindBy(css = ".office__heading")
    private List<WebElement> countries;

    public void printAllCountries() {
        List<String> countriesList = new ArrayList<>();
        for (WebElement countries : countries) {
            countriesList.add(countries.getText());
        }
        System.out.println("List of Offices : " + countriesList);
    }

}
