package com.projectDomain.pages;

import com.projectDomain.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PercentagePage {

    public PercentagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@size='3']")
    public WebElement percent;

    @FindBy(xpath = "//input[@size='7']")
    public WebElement input;

    @FindBy(xpath = "(//input[@size='6'])[1]")
    public WebElement result;


    @FindBy (xpath = "(//input[@value=\"Calculate\"])[1]")
    public  WebElement calculateButton;



}
