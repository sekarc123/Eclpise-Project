Feature: Title of your feature
  functionality test

  @Smoke
  Scenario: login test
    Given open  browser application
    When login sucess
    Then logout sucess

  @Report
  Scenario: Title of your scenario outline
    Given I want to write a step with
    When I check for the step
    Then I verify the step
