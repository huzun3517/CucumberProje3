
Feature: automationpractice

    Background: Login
    Given Navigate to automationpractice
    When  Enter username and password and click Sign in button
    Then User should login successfully

 @RegressionTest
 Scenario: Social Media Functionality

    Then User clicks social media links and verifies
      | facebook |
      | twitter  |
      | youtube  |
      | google   |





