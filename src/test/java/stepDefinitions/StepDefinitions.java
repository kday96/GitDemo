package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
public class StepDefinitions {
	

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("User on Landing Page");
    }

    @When("^User logs into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_into_application_with_username_and_password(String username, String password) throws Throwable {
    	System.out.println(username + "user logs in");
    }

    @Then("^Homepage is displayed$")
    public void homepage_is_displayed() throws Throwable {
    	System.out.println("User is on Homepage");
    }

    @And("^User card is displayed$")
    public void user_card_is_displayed() throws Throwable {
    	System.out.println("User sees the card displayed");
    }

}
