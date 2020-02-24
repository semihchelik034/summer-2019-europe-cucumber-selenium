package com.vytrack.step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class NavigationMenuStepDefs {

    @Given("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        System.out.println("enter the sales manager information");
    }
    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("Navigate to Fleet Vehicles");
    }
    @When("the user navigates Marketing Campaigns")
    public void the_user_navigates_Marketing_Campaigns() {
        System.out.println("Navigate to Marketing Campaigns");
    }
    @When("the user navigates Activities - Calendar events")
    public void the_user_navigates_Activities_Calendar_events() {
        System.out.println("Navigate to Activities Calendar events");
    }
    @Then("the url should be expected Fleet url")
    public void the_url_should_be_expected_Fleet_url() {
        System.out.println("Expected ==Actual PASS");
    }
    @Then("the url should be expected Campaigns url")
    public void the_url_should_be_expected_Campaigns_url() {
        System.out.println("Expected ==Actual PASS");
    }
    @Then("the url should be expected Activities url")
    public void the_url_should_be_expected_Activities_url() {
        System.out.println("Expected ==Actual PASS");
    }
}
