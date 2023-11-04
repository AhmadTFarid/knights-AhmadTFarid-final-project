@Regression
Feature:
@US_9
Scenario: validate table records per page

Given click the login bottom
Given input Username as "supervisor"
And   input Password as "tek_supervisor"
And   click on submit Button
And   click Accounts page
And   validate selected show per page