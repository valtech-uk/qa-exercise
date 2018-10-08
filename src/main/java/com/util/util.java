package com.util;

import org.openqa.selenium.By;
import valtech.tarung.PageObjectBaseClass;

import java.util.concurrent.TimeUnit;

public class util extends PageObjectBaseClass{
    public void waitForPageLoad(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void  waitForMilliseconds(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void clickByLinkText(String element){
        driver.findElement(By.linkText(element)).click();
    }

    public void clickByCssSelector(String element){
        driver.findElement(By.cssSelector(element)).click();
    }

    public String getRelaventURL() {
        String currentURL =  driver.getCurrentUrl();
        return currentURL.substring(currentURL.indexOf("/",15)+1,currentURL.lastIndexOf("/"));
    }
}
