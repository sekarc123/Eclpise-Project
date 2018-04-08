Feature: Testing on interviewhut site
  I want to test functional and non functional

  Scenario: Register for interviewhut.com
    Given Open chrome browser enter url interviewhut.com
    When Click register and fill the fields
    And Update profile picture
    And Enter your personal details and save
    Then Logout
