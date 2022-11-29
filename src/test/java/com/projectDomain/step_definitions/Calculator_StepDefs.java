package com.projectDomain.step_definitions;

import com.projectDomain.pages.CalculatorPage;
import com.projectDomain.pages.PercentagePage;
import com.projectDomain.utilities.ConfigurationReader;
import com.projectDomain.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class Calculator_StepDefs {

    CalculatorPage calculatorPage = new CalculatorPage();
    PercentagePage percentagePage = new PercentagePage();

    @Given("user is on calculator page")
    public void userIsOnCalculatorPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }

    @When("User clicks {string} on calculator")
    public void userClicksOnCalculator(String number) {
        calculatorPage.number(number).click();
    }

    @Then("result {string} should be displayed")
    public void resultShouldBeDisplayed(String result) {
        String expectedResult = result;
        String actualResult = calculatorPage.output.getText().trim();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("User clicks {string} and {string} on calculator")
    public void userClicksAndOnCalculator(String num1, String num2) {
        calculatorPage.number(num1).click();
        calculatorPage.number(num2).click();

    }

    @Given("User is on percentage calculator page")
    public void userIsOnPercentageCalculatorPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));
    }

    @Then("User should see fallowing calculation results")
    public void userShouldSeeFallowingCalculationResults(Map<Integer, Integer> valuesMap) {
        System.out.println("valuesMap = " + valuesMap);
        percentagePage.percent.sendKeys("5");

        System.out.println("valuesMap.values() = " + valuesMap.values());
        System.out.println("valuesMap.keySet() = " + valuesMap.keySet());



        for (Integer eachKey : valuesMap.keySet()) {

            percentagePage.input.clear();
            //percentagePage.input.sendKeys(Keys.BACK_SPACE);
            percentagePage.input.sendKeys("" + eachKey);

            percentagePage.percent.clear();
            percentagePage.percent.sendKeys("" + valuesMap.get(eachKey));

            percentagePage.calculateButton.click();

            System.out.println("percentagePage.result.getAttribute(\"value\") = " + percentagePage.result.getAttribute("value"));

        }


    }
}
