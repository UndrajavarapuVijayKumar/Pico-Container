package com.metlife.ixigo_steps;

import com.metlife.ixigo_pages.ixigoPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.metlife.ixigo_pages.ixigoPages.*;
import static com.metlife.utils.WebDriverUtils.*;

public class demo1steps {
    @Given("User have browser with ixigo application")
    public void user_have_browser_with_ixigo_application() throws InterruptedException {
        initialize("gc");
        launchBrowser();
        click(signuo);
    }
    @When("User gave mobile number")
    public void user_gave_mobile_number() {
        type(mob,"1234567890");
    }
    @When("User gave name")
    public void user_gave_name() {
        type(ixigoPages.name,"vijay");
    }
    @When("User gave email")
    public void user_gave_email() {
       type(ixigoPages.email,"abcd@gmail.com");
    }
    @When("Click on Signup")
    public void click_on_signup() throws InterruptedException {
        click(signup_btn);
    }
    @Then("It should give you an error message")
    public void it_should_give_you_an_error_message() {
        driver.quit();
    }


}
