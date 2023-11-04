@Regression
Feature:
  @US_5
  Scenario: Validate Accounts page rows
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    And click Accounts page
    And verify five row per page is default


  @US_6
  Scenario: Validate 4 row Plans Page
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    And click Plans Page
    And Validate rows of data is present