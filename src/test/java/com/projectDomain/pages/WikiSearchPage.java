package com.projectDomain.pages;

import com.projectDomain.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {


    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name=\"search\"]")
    public WebElement searchBox;

    @FindBy (xpath = "//button[.='Ara']")
    public WebElement searchButton;

    @FindBy (xpath = "//h1")
    public WebElement mainHeader;

    @FindBy (css = "div[class=\"fn\"]")
    public WebElement imageHeader;


}
