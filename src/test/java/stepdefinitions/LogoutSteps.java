package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LogoutSteps {
    @And("^I select Logout$")
    public void iSelectLogout() throws Throwable {
        // selectLogInButtonLoginForm();
    }

    @Then("^I have logged out$")
    public void iHaveLoggedOut() throws Throwable {
        System.out.println("YOU HAVE LOGGED IN!");
    }
}
