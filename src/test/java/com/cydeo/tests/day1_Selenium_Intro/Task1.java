package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //do setup for browser driver

        WebDriverManager.chromedriver().setup();


        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //Make our page fullscreen
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://yahoo.com");

        //3. Verify title:
        //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        // driver.getTitle();
        // String title = driver.getTitle();
        // System.out.println("title = " + title);

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Video";

        //actual title comes from browser

        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)){

            System.out.println("Title is expected. Verification is passed");
        } else{
            System.out.println("Title is NOT expected. Verification has failed");
        }




    }
}
