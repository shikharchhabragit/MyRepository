@Test
Feature: Login Functionality


Scenario: Login logout

Given When I Launch Application
And I Enter Username and Password
And I Click Login button
Then I am on Login Page
And I Click Logout Button
Then I see Login Functionality Working message 