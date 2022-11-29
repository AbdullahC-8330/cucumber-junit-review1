package com.projectDomain.step_definitions;

import com.projectDomain.pages.WebTableOrderPage;
import com.projectDomain.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Order_StepDefs {

    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();


    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        webTableOrderPage.usernameInput.sendKeys("Test");
        webTableOrderPage.passwordInput.sendKeys("Tester");
        webTableOrderPage.loginButton.click();
        webTableOrderPage.orderButton.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select = new Select(webTableOrderPage.selectProduct);
        select.selectByVisibleText(string);
    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {
       // webTableOrderPage.quantityInput.clear();
        //webTableOrderPage.quantityInput.sendKeys(string);
        webTableOrderPage.quantityInput.sendKeys(Keys.BACK_SPACE + string);

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        webTableOrderPage.inputcCustomerName.sendKeys(string);
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
        webTableOrderPage.inputStreet.sendKeys(string);
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
        webTableOrderPage.inputCity.sendKeys(string);
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        webTableOrderPage.inputState.sendKeys(string);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        webTableOrderPage.inputZip.sendKeys(string);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        for (WebElement eachCard : webTableOrderPage.inputAllCards) {

            if (eachCard.getAttribute("value").equalsIgnoreCase(string)){
                eachCard.click();
                break;
            }

        }

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        webTableOrderPage.inputCardNo.sendKeys(string);
    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
       webTableOrderPage.inputCardExpiryDate.sendKeys(string);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {
        String actualFirstName = webTableOrderPage.tableFirstName.getText();
        Assert.assertEquals(string, actualFirstName);


    }


}
