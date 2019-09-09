Feature: Inbox features

  @login
  Scenario: User can check the inbox

    Given patient is in login page
    When he login with valid credentials
    When he navigate to inbox
    When he start a feed with text "Test"
    Then the feed should be shown with "Test"
    When the application is running
    When I check the application status
    Then I check the inboxs api should show the feed "Text"
