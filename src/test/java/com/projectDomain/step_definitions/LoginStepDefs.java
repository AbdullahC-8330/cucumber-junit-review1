package com.projectDomain.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @When("Librarian types the correct name and password")
    public void librarian_types_the_correct_name_and_password() {
        System.out.println("Librarian types the correct name and password");
    }

    @When("librarian click the login button")
    public void librarian_click_the_login_button() {
        System.out.println("librarian click the login button");
    }

    @Then("librarian should log in and be on dashboard")
    public void librarian_should_log_in_and_be_on_dashboard() {
        System.out.println("librarian should log in and be on dashboard");


    }

    @When("Student types the correct name and password")
    public void studentTypesTheCorrectNameAndPassword() {
        System.out.println("Student types the correct name and password");
    }

    @And("Student click the login button")
    public void studentClickTheLoginButton() {
        System.out.println("Student click the login button");
    }

    @Then("Student should log in and be on dashboard")
    public void studentShouldLogInAndBeOnDashboard() {
        System.out.println("Student should log in and be on dashboard");
    }

    @When("Admin types the correct name and password")
    public void adminTypesTheCorrectNameAndPassword() {
        System.out.println("Admin types the correct name and password");
    }

    @And("Admin click the login button")
    public void adminClickTheLoginButton() {
        System.out.println("Admin click the login button");
    }

    @Then("Admin should log in and be on dashboard")
    public void adminShouldLogInAndBeOnDashboard() {
        System.out.println("Admin should log in and be on dashboard");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
        System.out.println("user is on the library login page");
    }
}
