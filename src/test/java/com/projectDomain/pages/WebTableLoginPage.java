package com.projectDomain.pages;

import com.projectDomain.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {


    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "input[name=\"username\"]")
    public WebElement usernameInput;

    @FindBy (css = "input[name=\"password\"]")
    public WebElement passwordInput;

    @FindBy (css = "button[type=\"submit\"]")
    public WebElement loginButton;




}
