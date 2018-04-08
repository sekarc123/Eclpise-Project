Feature: InterviewHunt login test
  I want to test this site

  Scenario: login page test
    Given Open chrome browseer and enter url stage.interviewhunt.com
    And Click for register to signup for new user
    When I complete login set new profile image
    Then Enter your details in profile and save
    And Log out
