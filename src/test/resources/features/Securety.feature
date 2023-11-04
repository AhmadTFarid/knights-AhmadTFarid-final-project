@Regression
Feature:
@US_7
Scenario:clicking on Login button and enter valid user
Given click the login bottom
Given input Username as "supervisor"
And  input Password as "tek_supervisor"
And  click on submit Button
When validate user navigate to "Customer Service Portal"



@US_8
Scenario: profile button validate information
Given click the login bottom
Given input Username as "supervisor"
And  input Password as "tek_supervisor"
And  click on submit Button
And  click on profile button
And validate information is in Profile
