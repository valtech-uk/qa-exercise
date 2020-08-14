package com.valtech.steps;

import com.valtech.pages.ContactUsPage;
import com.valtech.pages.home.HomePage;
import com.valtech.pages.home.location.LocationsPage;
import com.valtech.pages.home.menu.MenuPage;
import com.valtech.pages.home.menu.PublicSectionPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class PublicSectionSteps extends ScenarioSteps {

    private HomePage homePage;
    private MenuPage menuPage;
    private PublicSectionPage publicSectionPage;
    private ContactUsPage contactUsPage;
    private LocationsPage locationsPage;

    @Step
    public void opens_home_page() {
        getDriver().manage().window().maximize();
        homePage.open();
        homePage.cookieAcceptBtn.click();
    }

    @Step
    public void navigate_to_uk_public_sector() {
        homePage.locationBtn.click();
        locationsPage.ukLocationLink.click();
        homePage.menuBtn.click();
        menuPage.ukPublicSectorBtn.click();
    }

    @Step
    public void verify_and_print_a_list_of_all_public_sector_customers() {
        scrollToEndOfThePage();
        scrollTo(publicSectionPage.clientLogosImg);
        assertThat(publicSectionPage.clientLogosImg.isDisplayed()).isTrue();
    }

    @Step
    public void click_on_talk_to_us_and_verify_if_it_navigates_to_contact_us_page() {
        scrollToEndOfThePage();
        publicSectionPage.talkToUsBtn.click();
        assertThat(contactUsPage.contactHeaderText.isDisplayed()).isTrue();
        Serenity.takeScreenshot();
    }

    private void scrollTo(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }

    private void scrollToEndOfThePage() {
        ((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
