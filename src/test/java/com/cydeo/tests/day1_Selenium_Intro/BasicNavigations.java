package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();


        // Opens browser
        WebDriver driver = new ChromeDriver();
        // This line will maximize the browser size
        driver.manage().window().maximize();

        driver.get("https://Tesla.com");

        //get title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);


        //Stops code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stops code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to go forward
        driver.navigate().forward();

        //Stops code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stops code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate().to():
        driver.navigate().to("https://google.com");

        //get the current title after getting the google page
        currentTitle = driver.getTitle();

        System.out.println("currentTitle = " + currentTitle);

        //get title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());


        // Get current URL using Selenium
         currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        driver.quit();


    }
}
