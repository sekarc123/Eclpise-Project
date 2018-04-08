Feature: InterviewHut site test
  Functional and Nonfunctional test on this site
  
 
 @ChangeAvatar
  Scenario: change profile picture
    Given OPEN browser and LOGIN
    When Update avatar
    Then LOGOUT
