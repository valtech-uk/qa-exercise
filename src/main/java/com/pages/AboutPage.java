package com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import valtech.tarung.PageObjectBaseClass;

public class AboutPage extends PageObjectBaseClass{

	/*H1 tag in About page is displaying as “About”*/

    public void assertAbout(String expectedText){
        String actualText = driver.findElement(By.cssSelector("h1")).getText();
        Assert.assertEquals(actualText.toLowerCase(), expectedText);
    }

    public void clickOnOurOffices(){
        driver.findElement(By.linkText("Our offices")).click();
    }
}
