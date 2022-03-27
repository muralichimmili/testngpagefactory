
@CreateAccount
Feature: To create an account of facebbok

  @CreateAccount
  Scenario Outline: Create facebook account
    Given User navigated to facebook login page
    When User click on forgot password link
    Then User navigate to the forgot password page
    And User enter the "<Email>" email address

    Examples: 
      | Email                    |
      | muralichimmili@gmail.com |
