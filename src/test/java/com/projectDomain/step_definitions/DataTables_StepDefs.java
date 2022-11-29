package com.projectDomain.step_definitions;

import com.projectDomain.pages.DropdownsPage;
import com.projectDomain.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTables_StepDefs {

    @Then("User should see fruits I like")
    public void user_should_see_fruits_ı_like(List<String> fruits) {

        System.out.println("fruits = " + fruits);
        System.out.println("fruits.get(1) = " + fruits.get(1));

    }

    DropdownsPage dropdownsPage = new DropdownsPage();

    @Given("User is on the dropdowns page of practice tool-{string}")
    public void userIsOnTheDropdownsPageOfPracticeTool(String arg0) {
        Driver.getDriver().get(arg0);
    }
    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths) {


        Select select = new Select(dropdownsPage.monthSeleckDropdowns);
        List<WebElement> monthOptions = select.getOptions();

        List<String> monthTextAsString = new ArrayList<>();
        for (WebElement monthOption : monthOptions) {
            monthTextAsString.add(monthOption.getText());
        }

        System.out.println("monthText = " + monthTextAsString);

        Assert.assertEquals(expectedMonths, monthTextAsString);

    }


}
