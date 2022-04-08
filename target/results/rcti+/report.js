$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/signupValid.feature");
formatter.feature({
  "name": "Signup RCTI+",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Signup"
    },
    {
      "name": "@rcti"
    }
  ]
});
formatter.scenario({
  "name": "Positive case sign up RCTI+ Succes",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Signup"
    },
    {
      "name": "@rcti"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user access page \"https://dev-webd.rctiplus.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.HomeSteps.user_access_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user mengklik navigasi bar login Di Mainpage",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.HomeSteps.userMengklikNavigasiBarLoginDiMainpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user mengkllik button login",
  "keyword": "And "
});
formatter.match({
  "location": "steps.HomeSteps.userMengkllikButtonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user mengklik button register",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userMengklikButtonRegister()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input on username signup \"yohanaclimbong1@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.SignupSteps.userInputOnUsernameSignup(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input on password signup \"12345678\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userInputOnPasswordSignup(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input re-type password \"12345678\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userInputReTypePassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button next",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SignupSteps.userClickButtonNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input on fullname \"Yohana Limbong\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userInputOnFullname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input on birth date \"1998-08-27\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userInputOnBirthDate(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click field fullname",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userClickFieldFullname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click field gender",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userClickFieldGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click gender",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userClickGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button next",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SignupSteps.userClickButtonNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sleep waiting second",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SignupSteps.sleepWaitingSecond()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});