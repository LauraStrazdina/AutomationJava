package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import general.User;
import pages.login.LoginPageObject;

public class LoginSteps {

    private LoginPageObject login = new LoginPageObject();
    private User user = new User();

    @And("^I enter Email in login form$")
    public void iEnterEmailAddressInLoginForm() throws Throwable {
        login.enterEmail(user.getEmailAddress());
    }

    @And("^I enter Password In Login Form$")
    public void iEnterPasswordLoginForm() throws Throwable {
        login.enterPassword(user.getPassword());
    }

    @And("^I select login from login form$")
    public void iSelectLoginFromLoginForm() throws Throwable {
        login.selectLoginButton();
    }

    @Then("^I have logged in$")
    public void iHaveLoggedIn() throws Throwable {
        System.out.println("YOU HAVE LOGGED IN!");
    }

}