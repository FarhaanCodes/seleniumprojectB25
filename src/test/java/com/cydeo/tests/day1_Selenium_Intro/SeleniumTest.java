package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create Instance of the Chrome Driver
        WebDriver driver = new ChromeDriver();

        //3 - Test if driver is working as expected
        driver.get("https://www.google.com");

    }
}
