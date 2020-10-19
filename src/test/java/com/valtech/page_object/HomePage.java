package com.valtech.page_object;

import com.valtech.Utils.Helpers;
import com.valtech.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends DriverFactory {

    @FindBy(css = ".cookie__action>a")
    private WebElement cookiesBtn;

    @FindBy(css = ".block-header__heading")
    private List<WebElement> blockHeaders;

    @FindBy(css = ".bloglisting__item__heading")
    private List<WebElement> blogs;

    @FindBy(css = ".navigation__menu__item>a>span")
    private List<WebElement> navBarItems;

    private String selectedBlog;

    public boolean isOnHomePage() {
        explicitWait(cookiesBtn);
        acceptCookies();
        return driver.getCurrentUrl().endsWith("co.uk/");
    }

    private void acceptCookies() {
        cookiesBtn.click();
    }

    public boolean isBlockHeaderDisplayed(String heading) {
        boolean headerBlog = false;
        for (WebElement blockHeader : blockHeaders) {
            if (blockHeader.getText().equalsIgnoreCase(heading)) {
                headerBlog = true;
                break;
            }
        }
        return headerBlog;
    }

    public void selectBlog() {
        int randomBlog = new Helpers().generateRandomNumber(blogs.size());
        WebElement blog = blogs.get(randomBlog);
        setSelectedBlog(blog.getText());
        blog.click();
    }


    public String getSelectedBlog() {
        return selectedBlog;
    }

    private void setSelectedBlog(String selectedBlog) {
        this.selectedBlog = selectedBlog;
    }

    public void selectNavigationItem(String navItem) {
        for (WebElement navBarItem : navBarItems) {
            if (navBarItem.getText().equalsIgnoreCase(navItem)) {
                navBarItem.click();
                break;
            }
        }
    }
}
