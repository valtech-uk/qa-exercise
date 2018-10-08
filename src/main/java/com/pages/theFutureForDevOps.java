package com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import valtech.tarung.PageObjectBaseClass;

/*b. Click on the first blog article & then assert that the page title is present*/

public class theFutureForDevOps extends PageObjectBaseClass{
    public void assertFutureForDevOps(){
        String actualBlogText = driver.findElement(By.cssSelector("h1")).getText();
        Assert.assertEquals(actualBlogText, "The future for DevOps");
    }
}
