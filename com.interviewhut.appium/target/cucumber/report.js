$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("geek.feature");
formatter.feature({
  "line": 1,
  "name": "stage-academy.freshersgeek.com Test",
  "description": "functional and non functional test",
  "id": "stage-academy.freshersgeek.com-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "signup scenario testing",
  "description": "",
  "id": "stage-academy.freshersgeek.com-test;signup-scenario-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@signup"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open browser and enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "click on signup",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "freshergeek.open_browser_and_enter_url()"
});
formatter.result({
  "duration": 68031283188,
  "status": "passed"
});
formatter.match({
  "location": "freshergeek.click_on_signup()"
});
formatter.result({
  "duration": 49954318034,
  "status": "passed"
});
formatter.match({
  "location": "freshergeek.logout()"
});
formatter.result({
  "duration": 5000367682,
  "status": "passed"
});
});