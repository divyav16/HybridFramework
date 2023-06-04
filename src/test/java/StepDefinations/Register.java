package StepDefinations;

import ResultVerification.ResultVerificationForHomePage;
import ResultVerification.ResultVerificationForRegisterPage;
import WebElements.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {

RegisterPage registerPage = new RegisterPage();
ResultVerificationForRegisterPage resultVerificationForRegisterPage = new ResultVerificationForRegisterPage();
ResultVerificationForHomePage resultVerificationForHomePage = new ResultVerificationForHomePage();

    @When("^User click on Register Link$")
    public void user_click_on_Register_Link()  {registerPage.clickOnRegisterLink();

    }

    @When("^User on Register Page and Verify Register page Title$")
    public void user_on_Register_Page_and_Verify_Register_page_Title()  {resultVerificationForRegisterPage.registerPageTitle();
    }




    @Then("^User Enter Gender, First Name, Last Name, Date of Birthday, Date Of Birthday Month, Date of Birth Year,Email, Company Name, Password and Confirm Password on Register Button$")
    public void user_Enter_Gender_First_Name_Last_Name_Date_of_Birthday_Date_Of_Birthday_Month_Date_of_Birth_Year_Email_Company_Name_Password_and_Confirm_Password_on_Register_Button()  {
        registerPage.doRegister();

    }

    @Then("^User is on Home Page and Verify Home page Title$")
    public void user_is_on_Home_Page_and_Verify_Home_page_Title()  {resultVerificationForHomePage.HomePageTitle();

    }



    }



