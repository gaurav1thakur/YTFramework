package org.testng.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Base.Base;
import org.testng.Pages.Login;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC4 extends Base {
    Login login = new Login(driver,properties);
    //("Login");
    //("Video Play");
    //("Channel Subscribe");
    @Test
    public void launchYoutubeVideoPlaySubscribe() throws InterruptedException {
        login.userSignIn();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(properties.getProperty("playvideo")), 1));
        WebElement playVideo = driver.findElements(By.xpath(properties.getProperty("playvideo"))).get(0);
        playVideo.click();
        Thread.sleep(2000);

        // Channel Subscribe
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(properties.getProperty("subscribe")), 1));
        WebElement subscribe = driver.findElements(By.xpath(properties.getProperty("subscribe"))).get(0);
        subscribe.click();
    }

}
