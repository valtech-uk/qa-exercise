package com.valtech.step_def;

import com.valtech.page_object.BlogsPage;
import com.valtech.page_object.ContactUspage;
import com.valtech.page_object.NavigationPage;
import com.valtech.page_object.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class NavigationStepDef {

    private HomePage homePage;
    private BlogsPage blogsPage;
    private NavigationPage navigationPage;
    private ContactUspage contactUspage;

    public NavigationStepDef(HomePage diHomePage, NavigationPage diNavigationPage,
                             BlogsPage diBlogsPage, ContactUspage diContactUspage) {
        this.homePage = diHomePage;
        this.navigationPage = diNavigationPage;
        this.blogsPage = diBlogsPage;
        this.contactUspage = diContactUspage;
    }

    @Given("^I am on home page$")
    public void i_am_on_home_page() {
        assertThat("User is not on home page. ", homePage.isOnHomePage(), is(equalTo(true)));
    }

    @Then("^I should see \"([^\"]*)\" is displayed$")
    public void i_should_see_is_displayed(String expected) {
        assertThat(String.format("Block header : %s is not displayed", expected),
                homePage.isBlockHeaderDisplayed(expected), is(equalTo(true)));
    }

    @When("^I select a blog article$")
    public void i_select_a_blog_article() {
        homePage.selectBlog();
    }

    @Then("^I should see the selected page title$")
    public void i_should_see_the_selected_page_title() {
        assertThat("Not displaying selected blog. ",
                homePage.getSelectedBlog(), is(equalToIgnoringCase(blogsPage.getPageTitle())));
    }

    @When("^I select \"([^\"]*)\" form navigation bar$")
    public void iSelectFormNavigationBar(String navItem) {
        homePage.selectNavigationItem(navItem);
    }

    @Then("^I should navigate to \"([^\"]*)\" page$")
    public void iShouldNavigateToPage(String expected) {
        assertThat("Expected and actual not matched. ", navigationPage.getPageTitle(), is(equalToIgnoringCase(expected)));

    }

    @And("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String page) {
        homePage.navigateTo(page);
    }

    @And("^I print all the countries names$")
    public void iPrintAllTheCountriesNames() {
        contactUspage.printAllCountries();
    }
}
