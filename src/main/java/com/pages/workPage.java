package com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import valtech.tarung.PageObjectBaseClass;

/*H1 tag in Services page is displaying as “Services”*/

public class workPage extends PageObjectBaseClass{
    public void assertWork(String expectedText){
        String actualText = driver.findElement(By.cssSelector("h1")).getText();
        Assert.assertEquals(actualText.toLowerCase(), expectedText);
    }
}
