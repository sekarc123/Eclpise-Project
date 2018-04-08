Feature: stage-academy.freshersgeek.com Test
  functional and non functional test

  @signup
  Scenario: signup scenario testing
    Given open browser and enter url
    When click on signup
    Then logout

  @Select
  Scenario: courses scenario testing
    Given open browser enter url and login
    When click on technology
    And get list of technology
    Then select a course from list add to cart and logout

  @Review
  Scenario: Review a course
  Given Login to freshergeek
  When click on course
  And Review A course 
  Then logout freshersgeek 
  