Feature: signin demo ixigo
  I want to signin to ixigo demo
  As a user
  I would like to access the ixigo
  Scenario: signIn
    Given User have browser with ixigo application
    When User gave mobile number
    And User gave name
    And User gave email
    And Click on Signup
    Then It should give you an error message
