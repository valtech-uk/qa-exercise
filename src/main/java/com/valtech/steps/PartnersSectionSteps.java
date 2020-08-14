package com.valtech.steps;

import com.valtech.pages.PartnersPage;
import com.valtech.pages.home.HomePage;
import com.valtech.pages.home.menu.MenuPage;
import com.valtech.pages.home.menu.PartnersMenuPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class PartnersSectionSteps extends ScenarioSteps {

    private HomePage homePage;
    private MenuPage menuPage;
    private PartnersMenuPage partnersMenuPage;
    private PartnersPage partnersPage;

    @Step
    public void opens_home_page() {
        getDriver().manage().window().maximize();
        homePage.open();
        homePage.cookieAcceptBtn.click();
    }

    @Step
    public void assert_that_the_partners_section_is_displaying() {
        homePage.menuBtn.click();
        menuPage.partnersBtn.click();
        assertThat(partnersMenuPage.partnersList).isNotEmpty();
    }

    @Step
    public void click_on_our_partners_button_on_the_partners_page() {
        partnersMenuPage.ourPartnersTopBtn.click();
    }

    @Step
    public void capture_and_print_a_list_of_all_the_partners_across_industries() {
        partnersPage.partnersLinksList.forEach(it -> System.out.println(it.getAttribute("href")));
        assertThat(partnersPage.partnersLinksList).isNotEmpty();
    }


}
