Feature: Navigation
  As an end user
  I want to navigate to different and assert
  So that i can verify links are working

  Scenario: Verify recent blog and verify blog article
    Given I am on home page
    Then I should see "Recent Blogs" is displayed
    When I select a blog article
    Then I should see the selected page title


    @nav
  Scenario Outline: Verify recent blog and verify blog article
    Given I am on home page
    When I select "<option>" form navigation bar
    Then I should navigate to "<option>" page

    Examples:
      | option   |
      | ABOUT    |
      | SERVICES |
      | WORK     |

      Scenario: Find number of offices
        Given I am on home page
        And I navigate to "/about/contact-us"
        And I print all the countries names

