package com.metlife.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo1steps {
    @Given("User have browser with ixigo application")
    public void user_have_browser_with_ixigo_application() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user_have_browser_with_ixigo_application");
    }
    @When("User gave mobile number")
    public void user_gave_mobile_number() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user_gave_mobile_number");
    }
    @When("User gave name")
    public void user_gave_name() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user_gave_name");
    }
    @When("User gave email")
    public void user_gave_email() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user_gave_email");
    }
    @When("Click on Signup")
    public void click_on_signup() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("click_on_signup");
    }
    @Then("It should give you an error message")
    public void it_should_give_you_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("it_should_give_you_an_error_message");
    }


}
