Feature: InterviewHut site test
  Functional and Nonfunctional test on this site

  Scenario: Testing on Ask a question
    Given Open browser and login
    When Posting a question with sutable title and caregory
    Then logout
