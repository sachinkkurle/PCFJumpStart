$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Signup.feature");
formatter.feature({
  "line": 1,
  "name": "Signup for account",
  "description": "",
  "id": "signup-for-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1024001,
  "status": "passed"
});
formatter.before({
  "duration": 4696069,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Signup",
  "description": "",
  "id": "signup-for-account;signup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Signup"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want to signup into account",
  "keyword": "Given "
});
formatter.match({
  "location": "SignupStep.I_want_to_signup_into_account()"
});
formatter.result({
  "duration": 1198400203,
  "status": "passed"
});
formatter.after({
  "duration": 616448,
  "status": "passed"
});
formatter.after({
  "duration": 31013920,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 303104,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Valid username and password",
  "description": "",
  "id": "login-into-account;valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter correct username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Clicked on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I am login into application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.I_launch_the_application()"
});
formatter.result({
  "duration": 1572866,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_enter_correct_username_and_password()"
});
formatter.result({
  "duration": 675328,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.Clicked_on_Login_Button()"
});
formatter.result({
  "duration": 162304,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_am_login_into_application()"
});
formatter.result({
  "duration": 641025,
  "status": "passed"
});
formatter.after({
  "duration": 444416,
  "status": "passed"
});
});