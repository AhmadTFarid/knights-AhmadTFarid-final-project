@Regression
Feature:

  @US_10
  Scenario: Validate 4 row Plans Page
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    And click Plans Page
    And Validate rows of data is present

  @US_11
  Scenario Outline: Validate date should be today
    Given click the login bottom
    Given input Username as "supervisor"
    And  input Password as "tek_supervisor"
    And  click on submit Button
    And click Plans Page
    Then Validate Date Created for DATATable "<CreatedDate>" and "<ExpiryDate>"

    Examples:
      | CreatedDate      | ExpiryDate       |
      | November 5, 2023 | November 6, 2023 |