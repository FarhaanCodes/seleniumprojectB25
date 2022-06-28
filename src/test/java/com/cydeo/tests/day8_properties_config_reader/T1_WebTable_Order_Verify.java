package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.Utilities.BrowserUtils;
import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("T1_WebTable_Order_Verify");
    }


    @Test
    public void order_name_verify_test() {

        //Locate the cell that has Bob Martin text in it.
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”

        String expectedBobName = "Bob Martin";
        String actualBobName =  bobMartinCell.getText();

        //Assert.assertEquals(actualBobName, expectedBobName);

        BrowserUtils.verifyTitle(driver, "Bob Martin" );

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021

        WebElement bobMartinDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedDate = "12/31/2021";
        String actualDate = bobMartinDate.getText();

        Assert.assertEquals(actualDate,expectedDate);

    }

    //We use the utility method we created.
    @Test
    public void test2(){


    }
}