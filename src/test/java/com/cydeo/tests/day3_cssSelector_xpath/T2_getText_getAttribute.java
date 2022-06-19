package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com
        driver.get("https://login1.nextbasecrm.com");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedLabel = "Remember me on this computer";
        String actualLabel = rememberMeLabel.getText();

        if (actualLabel.equals(expectedLabel)){

            System.out.println("Label Verification Passed");
        }else{
            System.out.println("Label Verification Failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPassWordLinkText = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedLinkText =  "FORGOT YOUR PASSWORD?";
        String actualLinkText = forgotPassWordLinkText.getText();

        if (actualLinkText.equals(expectedLinkText)){

            System.out.println("Forgot password link verification PASSED!");
        }else{

            System.out.println("actualForgotPasswordLinkText = " + actualLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedLinkText);

            System.out.println("Forgot password link verification FAILED!!!");

        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPassWordLinkText.getAttribute("href");

        System.out.println("actualInHref = " + actualInHref);

        if (actualInHref.contains(expectedInHref)){

            System.out.println("HREF attribute value verification PASSED!");

        } else{

            System.out.println("HREF attribute value verification FAILED!!!");

        }



    }
}
