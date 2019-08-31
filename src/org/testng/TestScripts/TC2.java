package org.testng.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2 extends Base {
    //TC2 Click on Subscription
    @Test
    public void launchYoutubeLogin() {
        System.out.println("Login");
        WebDriverWait driverWait = new WebDriverWait(driver, 5);
        System.out.println("Navigating to  Subscription");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement subscriptions = driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(properties.getProperty("subscriptions"))));
        subscriptions.click();
    }

}
