package com.projectDomain.pages;

import com.projectDomain.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownsPage {

    public DropdownsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(id = "month")
    public WebElement monthSeleckDropdowns;




}
