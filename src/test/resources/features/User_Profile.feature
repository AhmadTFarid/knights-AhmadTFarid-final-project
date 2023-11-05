@Regression
Feature:

  @US_8
  Scenario: profile button validate information
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    And  click on profile button

  @US_9
  Scenario:validate Profile Side Drawer is correct
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    And  click on profile button
    And validate information is in Profile





