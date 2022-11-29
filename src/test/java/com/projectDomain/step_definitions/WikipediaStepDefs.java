package com.projectDomain.step_definitions;

import com.projectDomain.pages.WikiSearchPage;
import com.projectDomain.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepDefs {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://tr.wikipedia.org/");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String searchKeyword) {
        wikiSearchPage.searchBox.sendKeys(searchKeyword);
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }


    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String searchKeyword) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = searchKeyword + " - Vikipedi";

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String searchKeyword) {
        String expectedMainHeader = searchKeyword;
        String actualMainHeader = wikiSearchPage.mainHeader.getText();

        Assert.assertEquals(expectedMainHeader, actualMainHeader);
    }


    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String searchKeyword) {
        String expectedImageHeader = searchKeyword;
        System.out.println("expectedImageHeader = " + expectedImageHeader);
        String actualImageHeader = wikiSearchPage.imageHeader.getText();
        System.out.println("actualImageHeader = " + actualImageHeader);

        Assert.assertTrue(actualImageHeader.contains(expectedImageHeader));
    }



}
