Feature: InterviewHut site test
  Functional and Nonfunctional test on this site

  @Askquestion
  Scenario: Testing on Ask a question
    Given Login
    When Posting a question with sutable title and caregory
    Then Signout
 
 @Answer
    Scenario: Answer a question
    Given open browser and login
    When Answer a question
    Then LogOut

  @BestAnswer
  Scenario: Select best answer
    Given Open chrome browser and Login
    When Mark as best answer
    Then Log out
    And exit brower
    
