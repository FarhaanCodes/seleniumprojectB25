package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void tearDownClass(){

        driver.close();
    }

    @Test
    public void selenium_test(){
        //Verify google title is correct

        driver.get("https://google.com");

       String googleTitle = driver.getTitle();
       String expectedTitle = "Google";

        Assert.assertEquals(googleTitle,expectedTitle, "Title is not matching here.");


    }
}
