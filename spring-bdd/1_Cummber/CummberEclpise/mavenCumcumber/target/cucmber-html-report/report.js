$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login into account",
  "description": "",
  "id": "login-into-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Valid username and password",
  "description": "",
  "id": "login-into-account;valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter correct username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Clicked on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am login into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.I_launch_the_application()"
});
formatter.result({
  "duration": 821795146,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_enter_correct_username_and_password()"
});
formatter.result({
  "duration": 149504,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.Clicked_on_Login_Button()"
});
formatter.result({
  "duration": 208896,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_am_login_into_application()"
});
formatter.result({
  "duration": 236545,
  "status": "passed"
});
});