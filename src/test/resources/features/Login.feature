@Regression
Feature:

  @US_6
  Scenario:clicking on Login button and enter valid user
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    When validate user navigate to "Customer Service Portal"

  @US_6
  Scenario Outline:validate error massage for enter wrong information
    Given click the login bottom
    Given input Username as "<username>"
    And  input Password as "<password>"
    And  click on submit Button

    Examples:
      | username      | password       |
      | supervisor    | wrongPassword  |
      | wrongUsername | tek_supervisor |



