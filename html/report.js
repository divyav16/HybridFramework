$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3860997700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "NOpCommerce Valid Register Test",
  "description": "",
  "id": "nopcommerce-login;nopcommerce-valid-register-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User click on Register Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User on Register Page and Verify Register page Title",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Enter Gender, First Name, Last Name, Date of Birthday, Date Of Birthday Month, Date of Birth Year,Email, Company Name, Password and Confirm Password on Register Button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is on Home Page and Verify Home page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_click_on_Register_Link()"
});
formatter.result({
  "duration": 1033966299,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_on_Register_Page_and_Verify_Register_page_Title()"
});
formatter.result({
  "duration": 53138800,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_Enter_Gender_First_Name_Last_Name_Date_of_Birthday_Date_Of_Birthday_Month_Date_of_Birth_Year_Email_Company_Name_Password_and_Confirm_Password_on_Register_Button()"
});
formatter.result({
  "duration": 1390342500,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_is_on_Home_Page_and_Verify_Home_page_Title()"
});
formatter.result({
  "duration": 10806500,
  "error_message": "java.lang.AssertionError: Home page title not matched expected [nopCommerce demo store] but found [nopCommerce demo store. Register]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:629)\r\n\tat ResultVerification.ResultVerificationForHomePage.HomePageTitle(ResultVerificationForHomePage.java:10)\r\n\tat StepDefinations.Register.user_is_on_Home_Page_and_Verify_Home_page_Title(Register.java:35)\r\n\tat ✽.Then User is on Home Page and Verify Home page Title(src/test/resources/Features/Register.feature:9)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 714653200,
  "status": "passed"
});
});