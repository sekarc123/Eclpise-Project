$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Answer.feature");
formatter.feature({
  "line": 1,
  "name": "InterviewHut site test",
  "description": "Functional and Nonfunctional test on this site",
  "id": "interviewhut-site-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Answer a question",
  "description": "",
  "id": "interviewhut-site-test;answer-a-question",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser and login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Answer a question",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "LogOut",
  "keyword": "Then "
});
formatter.match({
  "location": "Answer.open_browser_and_login()"
});
formatter.result({
  "duration": 103265823732,
  "status": "passed"
});
formatter.match({
  "location": "Answer.answer_a_question()"
});
formatter.result({
  "duration": 225523242,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 48 milliseconds\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b32\u0027, time: \u00272017-03-10 09:04:52 -0800\u0027\nSystem info: host: \u0027WINCTRL-C7Q3GDV\u0027, ip: \u0027192.168.44.4\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\idea\\AppData\\Local\\Temp\\scoped_dir980_10675}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 3fe8ad0e73bb8a9f4957ad1c7cf38d4f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat stepdefinition.Answer.answer_a_question(Answer.java:43)\r\n\tat ✽.When Answer a question(Answer.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Answer.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Askquestion.feature");
formatter.feature({
  "line": 1,
  "name": "InterviewHut site test",
  "description": "Functional and Nonfunctional test on this site",
  "id": "interviewhut-site-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing on Ask a question",
  "description": "",
  "id": "interviewhut-site-test;testing-on-ask-a-question",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open browser and login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Posting a question with sutable title and caregory",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Askquestion.open_browser_and_login()"
});
formatter.result({
  "duration": 45685387872,
  "status": "passed"
});
formatter.match({
  "location": "Askquestion.posting_a_question_with_sutable_title_and_caregory()"
});
formatter.result({
  "duration": 7844608982,
  "error_message": "java.lang.ArrayIndexOutOfBoundsException: 0\r\n\tat jxl.read.biff.BOFRecord.\u003cinit\u003e(BOFRecord.java:81)\r\n\tat jxl.read.biff.WorkbookParser.parse(WorkbookParser.java:548)\r\n\tat jxl.Workbook.getWorkbook(Workbook.java:237)\r\n\tat jxl.Workbook.getWorkbook(Workbook.java:198)\r\n\tat stepdefinition.Askquestion.posting_a_question_with_sutable_title_and_caregory(Askquestion.java:47)\r\n\tat ✽.When Posting a question with sutable title and caregory(Askquestion.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Askquestion.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("BestAnswer.feature");
formatter.feature({
  "line": 1,
  "name": "InterviewHut site test",
  "description": "Functional and Nonfunctional test on this site",
  "id": "interviewhut-site-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Select best answer",
  "description": "",
  "id": "interviewhut-site-test;select-best-answer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open browser and Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Mark as best answer",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Log out",
  "keyword": "Then "
});
formatter.match({
  "location": "BestAnswer.open_browser_and_Login()"
});
formatter.result({
  "duration": 47439123933,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"Login or Register\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 235 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b32\u0027, time: \u00272017-03-10 09:04:52 -0800\u0027\nSystem info: host: \u0027WINCTRL-C7Q3GDV\u0027, ip: \u0027192.168.44.4\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\idea\\AppData\\Local\\Temp\\scoped_dir6824_28445}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: c11acf367984eddbce5eea560ff3cd61\n*** Element info: {Using\u003dlink text, value\u003dLogin or Register}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat stepdefinition.BestAnswer.open_browser_and_Login(BestAnswer.java:23)\r\n\tat ✽.Given Open browser and Login(BestAnswer.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BestAnswer.mark_as_best_answer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BestAnswer.log_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Interviewhuntlogin.feature");
formatter.feature({
  "line": 1,
  "name": "InterviewHunt login test",
  "description": "I want to test this site",
  "id": "interviewhunt-login-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "login page test",
  "description": "",
  "id": "interviewhunt-login-test;login-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open chrome browseer and enter url stage.interviewhunt.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click for register to signup for new user",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I complete login set new profile image",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter your details in profile and save",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Log out",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "BestAnswer.log_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Signup.feature");
formatter.feature({
  "line": 1,
  "name": "Testing on interviewhut site",
  "description": "I want to test functional and non functional",
  "id": "testing-on-interviewhut-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Register for interviewhut.com",
  "description": "",
  "id": "testing-on-interviewhut-site;register-for-interviewhut.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open chrome browser enter url interviewhut.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click register and fill the fields",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Update profile picture",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter your personal details and save",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Signup.open_chrome_browser_enter_url_interviewhut_com()"
});
formatter.result({
  "duration": 86417007928,
  "status": "passed"
});
formatter.match({
  "location": "Signup.click_register_and_fill_the_fields()"
});
formatter.result({
  "duration": 71530745485,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 90 milliseconds\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b32\u0027, time: \u00272017-03-10 09:04:52 -0800\u0027\nSystem info: host: \u0027WINCTRL-C7Q3GDV\u0027, ip: \u0027192.168.44.4\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\idea\\AppData\\Local\\Temp\\scoped_dir5724_4497}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f0124759da155313042d6d0b55f7d767\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat stepdefinition.Signup.click_register_and_fill_the_fields(Signup.java:50)\r\n\tat ✽.When Click register and fill the fields(Signup.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Signup.update_profile_picture()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signup.enter_your_personal_details_and_save()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Signup.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Upvote.feature");
formatter.feature({
  "line": 1,
  "name": "InterviewHut site test",
  "description": "Functional and Nonfunctional test on this site",
  "id": "interviewhut-site-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Upvote an answer",
  "description": "",
  "id": "interviewhut-site-test;upvote-an-answer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser and Login",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "upvote an answer",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Log Out",
  "keyword": "Then "
});
formatter.match({
  "location": "Upvote.open_browser_and_Login()"
});
formatter.result({
  "duration": 56126076685,
  "status": "passed"
});
formatter.match({
  "location": "Upvote.upvote_an_answer()"
});
formatter.result({
  "duration": 35350879068,
  "status": "passed"
});
formatter.match({
  "location": "Upvote.log_Out()"
});
formatter.result({
  "duration": 10962451332,
  "status": "passed"
});
});