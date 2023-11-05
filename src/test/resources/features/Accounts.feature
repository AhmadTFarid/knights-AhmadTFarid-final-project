@Regression
Feature:

  @US_12
  Scenario: Validate Accounts page rows
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    And click Accounts page
    And verify five row per page is default

  @US_13
  Scenario: validate table records per page
    Given click the login bottom
    Given input Username as "supervisor"
    And   input Password as "tek_supervisor"
    And   click on submit Button
    And   click Accounts page
    And   validate selected show per page