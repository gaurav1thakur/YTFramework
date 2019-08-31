package org.testng.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Base.Base;
import org.testng.Pages.Login;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1 extends Base {
//  Keeping @BeforeMethod and @AfterMethod this in Base Class cause its common in all test cases
//    @BeforeMethod
//   public void launchBrowser(){
//        System.out.println("Browser Launched");
//        System.out.println("Send keys to Youtube URL");
//    }

    @Test
    public void launchYoutubeTrending() throws InterruptedException {
        System.out.println("Sign In");
        Login login = new Login(driver,properties);
        login.userSignIn();
        //TC1 Click on Trending
        System.out.println("Navigating to Trending Section");
        WebDriverWait wait = new WebDriverWait(driver, 5);
       //Type of waits
        WebElement trending = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(properties.getProperty("trending"))));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Thread.sleep(2000);
        trending.click();

    }

    // The User Sign In Function for sign in process
    //click on sign in
    //wait till next screen appear with // enter email
    // click next
    //wait till next screen appear with  // enter password
    // click next
    //wait till next screen appear with  // Youtube Landing Page


//    @AfterMethod
//    public void closeBrowser(){
//        System.out.println("Browser session closed ");
//    }
}
