package com.projectDomain.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    /*
  This method will accept int (in seconds) and execute Thread.sleep
  for given duration
   */
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }

    }

    public static void verifyTitle(String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);


    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedTitle){

        for (String eachWindowHandle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(eachWindowHandle);

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        String expectedTitlee = expectedTitle;
        System.out.println("expectedTitlee = " + expectedTitlee);
        String currentTitle = Driver.getDriver().getTitle();
        System.out.println("currentTitle = " + currentTitle);

        Assert.assertTrue(currentTitle.contains(expectedTitle));


    }

    public static void waitForİnvisiblityOf(WebElement webElement){

        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));

    }

}

//TC #2: Create utility method
//1. Create a new class called BrowserUtils
//2. Create a method to make Task1 logic re-usable
//3. When method is called, it should switch window and verify title.
//Method info:
//• Name: switchWindowAndVerify
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String expectedInUrl
//• Arg3: String expectedTitle



