package org.testng.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Base.Base;
import org.testng.Pages.Login;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TC4 extends Base {

    //("Login");
    //("Video Play");
    //("Channel Subscribe");
    @Test
    public void launchYoutubeVideoPlaySubscribe() throws InterruptedException {
        Login login = new Login(driver,properties);
        //if we make it global variable we getting null pinter in user sign In function?
        login.userSignIn();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(properties.getProperty("playvideo")), 1));
        WebElement playVideo = driver.findElements(By.xpath(properties.getProperty("playvideo"))).get(0);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        playVideo.click();

        // Channel Subscribe
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(properties.getProperty("subscribe"))));
        WebElement subscribe = driver.findElements(By.xpath(properties.getProperty("subscribe"))).get(0);
        subscribe.click();
    }

}
