package org.testng.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC3 extends Base {

    //("Login");
    //("Video Play");
    //("Video Like");

    @Test
    public void launchYoutubeVideoPlayLike() throws InterruptedException {
        // TC3 Play Video and Like
        WebDriverWait wait = new WebDriverWait(driver, 5);
        System.out.println("Play Video and Like");
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(properties.getProperty("playvideo")), 1));
        WebElement playVideo = driver.findElements(By.xpath(properties.getProperty("playvideo"))).get(0);
        playVideo.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement likeVideo = driver.findElement(By.xpath(properties.getProperty("likevideo")));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        likeVideo.click();
    }

}
