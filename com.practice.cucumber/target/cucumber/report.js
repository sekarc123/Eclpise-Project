$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mytag.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "functionality test",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Report"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I want to write a step with",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I check for the step",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I verify the step",
  "keyword": "Then "
});
formatter.match({
  "location": "Tags.i_want_to_write_a_step_with()"
});
formatter.result({
  "duration": 2811822572,
  "status": "passed"
});
formatter.match({
  "location": "Tags.i_check_for_the_step()"
});
formatter.result({
  "duration": 147915,
  "status": "passed"
});
formatter.match({
  "location": "Tags.i_verify_the_step()"
});
formatter.result({
  "duration": 156367,
  "status": "passed"
});
});