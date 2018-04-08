$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Application.feature");
formatter.feature({
  "line": 1,
  "name": "Test on facebook",
  "description": "I want to test this application",
  "id": "test-on-facebook",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "functional test on facebook",
  "description": "",
  "id": "test-on-facebook;functional-test-on-facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "Abc.open_facebook()"
});
formatter.result({
  "duration": 41078638742,
  "status": "passed"
});
formatter.match({
  "location": "Abc.enter_username_and_password()"
});
formatter.result({
  "duration": 5549013748,
  "status": "passed"
});
formatter.match({
  "location": "Abc.validate_the_outcomes()"
});
formatter.result({
  "duration": 90138928,
  "status": "passed"
});
});