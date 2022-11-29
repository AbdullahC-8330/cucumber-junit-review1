package com.projectDomain.step_definitions;

import com.projectDomain.pages.WebTableLoginPage;
import com.projectDomain.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTable_StepDefs {

    WebTableLoginPage webTablePage = new WebTableLoginPage();

    /*@Given("user is o the login page of web table app - {string}")
    public void userIsOTheLoginPageOfWebTableApp(String url) {
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void userEntersUsername(String arg0) {
        webTablePage.usernameInput.sendKeys(arg0);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg0) {
        webTablePage.passwordInput.sendKeys(arg0);
    }*/

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
       webTablePage.loginButton.click();
    }
    @Then("user should see url ends with orders")
    public void user_should_see_url_ends_with(Map<String, String> expectedUrl) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(expectedUrl.get("expectedValue")));
    }

   /* @Given("user is o the login page of web table app - {string}")
    public void user_is_o_the_login_page_of_web_table_app(String string) {
        Driver.getDriver().get(string);
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTablePage.usernameInput.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
       webTablePage.passwordInput.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePage.loginButton.click();
    }
    @Then("user should see url ends with {string}")
    public void user_should_see_url_ends_with(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(string));
    }
*/
    @Given("user is on the login page of web table app")
    public void user_is_o_the_login_page_of_web_table_app(Map<String,String> url ) {
       Driver.getDriver().get(url.get("url"));
    }
    @When("user enters username")
    public void user_enters_username(Map<String,String> credentials) {
      webTablePage.usernameInput.sendKeys(credentials.get("username"));
    }
    @When("user enters password")
    public void user_enters_password(Map<String, String> credentials) {

        webTablePage.passwordInput.sendKeys(credentials.get("password"));

    }


}
