@Regression
Feature:

  @US_5
  Scenario: Create account with existing email address and validate error message as expected
    When click Create Primary Account bottom
    And fill up the form
    And click on create Account Button
    And navigate to Sing up your Account page
    Then existing email address and validate error message




