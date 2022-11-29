package com.projectDomain.pages;

import com.projectDomain.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public CalculatorPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    public WebElement number(String number){

        return Driver.getDriver().findElement(By.xpath("//span[.='"+ number+"']"));

    }


    @FindBy(xpath = "//span[.='+']")
    public WebElement plusOperator;

    @FindBy (id = "sciOutPut")
    public WebElement output;


}
