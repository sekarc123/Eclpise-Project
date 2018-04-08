@tag
Feature: InterviewHut site test
  Functional and Nonfunctional test on this site

  @BestAnswer
  Scenario: Select best answer
    Given Open chrome browser and Login
    When Mark as best answer
    Then Log out
    And exit brower
