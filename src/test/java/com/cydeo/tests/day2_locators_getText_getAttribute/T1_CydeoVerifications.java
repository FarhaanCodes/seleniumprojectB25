package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {


    /*
    IN THIS CLASS WE ARE SOLVING THE DAY2_TASK1
     */


    public static void main(String[] args) throws InterruptedException {


        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL contains
        //Expected: cydeo

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        if (actualURL.contains(expectedURL)){

            System.out.println("URL VERIFICATION PASSED");
        }else{

            System.out.println("URL VERIFICATION FAILED");
        }


        // 4. Verify title:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains(expectedTitle)){

            System.out.println("TITLE VERIFICATION PASSED");
        } else {

            System.out.println("TITLE VERIFICATION FAILED");
        }


        Thread.sleep(3000);
        driver.close();

    }
}
