package com.pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import valtech.tarung.PageObjectBaseClass;

public class homePage extends PageObjectBaseClass{
    public void acceptCookies(){
        driver.findElement(By.cssSelector("#CybotCookiebotDialogBodyButtonAccept")).click();
    }

    public void assertRecentBlogs(){
        String actualBlogText = driver.findElement(By.cssSelector("#container > div:nth-child(2) > div:nth-child(3) h2")).getText();
        Assert.assertEquals("RECENT BLOGS", actualBlogText);
    }

    public void clickOnFirstBlog(){
        utils.clickByLinkText("The future for DevOps");
    }

    public void clickOnAbout(){
        utils.clickByLinkText("ABOUT");
    }

    public void clickOnWork(){
        utils.clickByLinkText("WORK");
    }

    public void clickOnServices(){
        utils.clickByLinkText("SERVICES");
    }
}