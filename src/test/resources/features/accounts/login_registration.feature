Feature: Patient should be able to login and register

@login
  Scenario: User can login with valid credentials

    Given patient is in login page
    When he login with valid credentials
    Then he should be able in see dashboard