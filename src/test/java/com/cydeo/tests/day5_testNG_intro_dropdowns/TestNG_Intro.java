package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @Test(priority = 1)
    public void test1(){

        System.out.println("Test 1 is running...");

        //Assert Equals: compare 2 of the same thing
        String apple = "apple";
        String orange = "orange";

        Assert.assertEquals(apple,orange);



    }
    @Test(priority = 2)
    public void test2(){

        System.out.println("Test 2 is running ");

        //Assert both strings are true

        String apple1 = "Apple";
        String apple2 = "Apple";

        //True
        Assert.assertEquals(apple1,apple2);
        Assert.assertTrue(apple2.equals(apple1), "They are equal");


    }

    @BeforeClass
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");

    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }



}
