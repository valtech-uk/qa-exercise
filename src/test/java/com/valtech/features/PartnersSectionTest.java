package com.valtech.features;

import com.valtech.steps.PartnersSectionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class PartnersSectionTest {

    @Managed
    WebDriver driver;

    @Steps
    PartnersSectionSteps partnersSectionSteps;

    @Test
    public void partnersListVerificationTest() {
        partnersSectionSteps.opens_home_page();
        partnersSectionSteps.assert_that_the_partners_section_is_displaying();
        partnersSectionSteps.click_on_our_partners_button_on_the_partners_page();
        partnersSectionSteps.capture_and_print_a_list_of_all_the_partners_across_industries();
    }
}
