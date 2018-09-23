package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginSteps {

    @And("^I enter Email in login form $")
    public void iEnterEmailAddressInLoginForm() throws Throwable {
        //enterEmailAddressLoginForm();
    }

    @And("^I enter PasswordInLoginForm$")
    public void iEnterPasswordLoginForm() throws Throwable {
        //enterPassword();
    }

    @And("^I select login from login form$")
    public void iConfirmPassword() throws Throwable {
       // selectLogInButtonLoginForm();
    }

    @Then("^I have logged in$")
    public void iHaveLoggedIn() throws Throwable {
        System.out.println("YOU HAVE LOGGED IN!");
    }

}