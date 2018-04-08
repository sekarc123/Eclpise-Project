$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("practice.feature");
formatter.feature({
  "line": 1,
  "name": "web application testing",
  "description": "",
  "id": "web-application-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "functional testing",
  "description": "",
  "id": "web-application-testing;functional-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@practice"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "open gmail.com",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "exit",
  "keyword": "Then "
});
formatter.match({
  "location": "Example.open_chrome_browser()"
});
formatter.result({
  "duration": 3894600077,
  "status": "passed"
});
formatter.match({
  "location": "Example.open_gmail_com()"
});
formatter.result({
  "duration": 8022426222,
  "status": "passed"
});
formatter.match({
  "location": "Example.exit()"
});
formatter.result({
  "duration": 1277566533,
  "status": "passed"
});
});