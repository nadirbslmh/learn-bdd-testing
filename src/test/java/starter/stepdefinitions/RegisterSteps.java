package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

    @Given("I am on the register page")
    public void onTheRegisterPage() { }

    @When("I input valid email")
    public void inputValidEmail() { }

    @And("I input valid password")
    public void inputValidPassword() { }

    @And("I input valid phone number")
    public void inputValidPhoneNumber() { }

    @Then("I redirected to the login page")
    public void redirectToLoginPage() { }

    @When("I input invalid email")
    public void inputInvalidEmail() { }

    @And("I input invalid password")
    public void inputInvalidPassword() { }

    @And("I input invalid phone number")
    public void inputInvalidPhonenumber() { }

    @Then("I get error message")
    public void getErrorMessage() { }
}
