
@CreateAccount
Feature: To create an account of facebbok

  @CreateAccount
  Scenario: Create facebook account
    Given User navigated to facebook login page
    When User click on create a page link
    And User click on signup button
    Then User navigate to the create account page
    And User enter all the required details
      | FName  | LName   |
      | murali | Krishna |