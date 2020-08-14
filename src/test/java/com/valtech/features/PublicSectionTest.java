package com.valtech.features;

import com.valtech.steps.PublicSectionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class PublicSectionTest {

    @Managed
    WebDriver driver;

    @Steps
    PublicSectionSteps publicSectionSteps;

    @Test
    public void publicSectionTest() {
        publicSectionSteps.opens_home_page();
        publicSectionSteps.navigate_to_uk_public_sector();
        publicSectionSteps.verify_and_print_a_list_of_all_public_sector_customers();
        publicSectionSteps.click_on_talk_to_us_and_verify_if_it_navigates_to_contact_us_page();
    }
}
