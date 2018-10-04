package com.valtech.drivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    private String browser = (System.getProperty("browser") == null) ? "chrome" : System.getProperty("browser");
    private String url = (System.getProperty("url") == null) ? "https://www.valtech.co.uk" : System.getProperty("url");

    public DriverFactory() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                if (System.getProperty("os.name").startsWith("Mac")) {
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--kiosk");
                    driver = new ChromeDriver(chromeOptions);
                } else
                    driver = new ChromeDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;

            default:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
        }
    }

    public void closeBrowser() {
        driver.quit();
    }


    public void navigateToHome() {
        driver.get(url);
    }

    public void maxBrowser() {
     //   driver.manage().window().maximize();
    }

    public void applyImpWait() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void navigateTo(String route){
        driver.navigate().to(url+route);
    }


    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException("Un expected error occurred in during sleep. ");
        }
    }

    public void explicitWait(WebElement element){
        new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOf(element));

    }
}
