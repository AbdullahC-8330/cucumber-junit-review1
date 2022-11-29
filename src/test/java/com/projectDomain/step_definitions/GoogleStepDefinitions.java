package com.projectDomain.step_definitions;

import com.projectDomain.pages.GoogleSearchPage;
import com.projectDomain.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user types {string} and clicks enter")
    public void userTypesAndClicksEnter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void userSeesInTheGoogleTitle(String expectedTitle) {
        String wholeEcpectedTitle = expectedTitle + " - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(wholeEcpectedTitle, actualTitle);

    }

    @When("user is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Google");
        Driver.closeDriver();
    }


    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {

        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        String ecpectedTitle = "apple - Google'da Ara";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(ecpectedTitle, actualTitle); // hoca contains yerine equal doğrulaması yapmak daha iyidir dedi
    }



}
