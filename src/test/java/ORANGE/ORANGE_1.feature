Feature: Orange

  Scenario: Forgot password -001

    Given user on orange login page
    When user click the forgot password button
    Then site should redirect user to reset password page
    When user provide his valid username
    And click the reset password button
    Then site should redirect user to "send password to mail" page