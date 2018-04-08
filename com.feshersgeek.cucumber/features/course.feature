Feature: stage-academy.freshersgeek.com Test
  functional and non functional test

  @Select
  Scenario: courses scenario testing
    Given open browser enter url and login
    When I complete login click on courses
    And click on technology
    And get list of technology
    Then back to courses search a course by name
    And select a course from list and logout

  @Filter
  Scenario: filtering a course
    Given login to stage-academy.freshersgeek.com
    When click on check box to filter and check the result
    And choose a course to start
    Then Logout

  @changeProfilepicture
  Scenario: change profile picture
  Given login
  When open profile 
  And change profile picture
  Then Signout