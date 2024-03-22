package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePostSteps {
    @Given("I am on the create post page")
    public void onTheCreatePostPage() { }

    @When("I enter valid post title")
    public void enterValidPostTitle() { }

    @And("I enter valid post content")
    public void enterValidPostContent() { }

    @And("I click create button")
    public void clickCreateButton() { }

    @Then("I redirected to my posts page")
    public void redirectToMyPostsPage() { }

    @Then("I get error message that all fields are required")
    public void getErrorMessageFieldRequired() { }
}
