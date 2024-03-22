package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("I am on the login page")
    public void onTheLoginPage() { }

    @When("I input valid email for login")
    public void inputValidEmail() { }

    @And("I input valid password for login")
    public void inputValidPassword() { }

    @And("I click login button")
    public void clickLoginButton() { }

    @Then("I redirected to the dashboard page")
    public void redirectToDashboardPage() { }

    @When("I input invalid email for login")
    public void inputInvalidEmail() { }

    @And("I input invalid password for login")
    public void inputInvalidPassword() { }

    @Then("I see error message that email or password is invalid")
    public void seeErrorMessageInvalidCredentials() { }

}
