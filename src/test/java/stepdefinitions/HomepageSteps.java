package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private NavigationPageObject homepage = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("Navigation is visible");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        homepage.selectMyAccountButton();
    }

    @And("^I select Sign up button from My account menu$")
    public void iSelectSignUpButtonFromMyAccountMenu() throws Throwable {
        homepage.selectSignUpButtonMyAccountMenu();
    }
    @And("^I select Login from my account menu$")
    public void iSelectLoginFromMyAccountMenu() throws Throwable {
        //selectLogInButtonMyAccountMenu();
    }

    @And("I navigate to Signup page$")
    public void iNavigateToSignUpPage() throws Throwable {
    }

    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED!");
    }

}
