@Regression
Feature:

  @US_1
  Scenario: Validate home page title and create Primary Account Button is exist
    Given page title should be "Tek Insurance UI"
    Then Button should be exist

  @US_2
  Scenario:Create Primary Account
    When click Create Primary Account bottom
    Given Expected page title should be "Create Primary Account Holder"

  @US_3
  Scenario:fill up the form and click on create Account
    When click Create Primary Account bottom
    And fill up the form
    And click on create Account Button
    And navigate to Sing up your Account page

  @US_4
  Scenario: Create account with existing email address and validate error message as expected
    When click Create Primary Account bottom
    And fill up the form
    And click on create Account Button
    And navigate to Sing up your Account page
    Then existing email address and validate error message