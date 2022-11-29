package com.projectDomain.pages;

import com.projectDomain.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPage extends WebTableLoginPage {



    public WebTableOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[.=\"View all orders\"]")
    public WebElement viewAllOrdersButton;

    @FindBy (xpath = "//button[.=\"View all products\"]")
    public WebElement viewAllProductsButton;

    @FindBy (xpath = "//button[.=\"Order\"]")
    public WebElement orderButton;

    @FindBy(css = "select[name=\"product\"]")
    public WebElement selectProduct;

    @FindBy(css = "input[name=\"quantity\"]")
    public WebElement quantityInput;

    @FindBy (css = "input[name=\"name\"]")
    public WebElement inputcCustomerName;

    @FindBy (css = "input[name=\"street\"]")
    public WebElement inputStreet;

    @FindBy (css = "input[name=\"city\"]")
    public WebElement inputCity;

    @FindBy (css = "input[name=\"state\"]")
    public WebElement inputState;

    @FindBy (css = "input[name=\"zip\"]")
    public WebElement inputZip;

    @FindBy (css = "input[name=\"card\"]")
    public List<WebElement> inputAllCards;

    @FindBy (css = "input[name=\"cardNo\"]")
    public WebElement inputCardNo;

    @FindBy (css = "input[name=\"cardExp\"]")
    public WebElement inputCardExpiryDate;

    @FindBy(xpath = "//button[.=\"Process Order\"]")
    public WebElement processOrderButton;

    @FindBy(xpath = "//table//tbody//tr[1]/td[1]")
    public WebElement tableFirstName;


   


}
