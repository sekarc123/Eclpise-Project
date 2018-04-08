
Feature: Interviewhut site test
  functional and non functional test

  @search
  Scenario: search a question with text and check if it is listed correctly
    Given OPen browser and login
    When search with text and check listed corectly
    Then logout and exit browser

  @category
  Scenario: Sort a question by category
    Given LOGIN
    When ort by category and check listed corectly
    Then sign out and Exit browser

  @Trending
  Scenario: Answer a question and check listed in Trending
    Given login in interviewhut
    When check answer in Trending
    Then logout interviewhut

  @counts
  Scenario: check View count,Vote count,Answer count
    Given Login in interviewhutsite
    When Check Answer,view,and vote count
    Then Logout interviewhutsite
    
@Tagquestion
  Scenario: Tag question 
    Given LOGIN INTERVIEWHUT
    When List a question based on tag
    Then SIGNOUT

    