$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cheking.feature");
formatter.feature({
  "line": 2,
  "name": "Interviewhut site test",
  "description": "functional and non functional test",
  "id": "interviewhut-site-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 30,
  "name": "Tag question",
  "description": "",
  "id": "interviewhut-site-test;tag-question",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@Tagquestion"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "LOGIN INTERVIEWHUT",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "List a question based on tag",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "SIGNOUT",
  "keyword": "Then "
});
formatter.match({
  "location": "Cheking.login_INTERVIEWHUT()"
});
formatter.result({
  "duration": 347278154516,
  "status": "passed"
});
formatter.match({
  "location": "Cheking.list_a_question_based_on_tag()"
});
formatter.result({
  "duration": 13198643502,
  "status": "passed"
});
formatter.match({
  "location": "Cheking.signout()"
});
formatter.result({
  "duration": 23872694593,
  "status": "passed"
});
});