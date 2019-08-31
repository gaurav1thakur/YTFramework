package org.testng.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Base.Base;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC5 extends Base {
    //("Login");
    //("History ");
    @Test
    public void launchYoutubeLoginHistory() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement navigation = driver.findElement(By.xpath(properties.getProperty("navigation")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        navigation.click();
        WebElement history = driver.findElement(By.xpath(properties.getProperty("history")));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        history.click();
    }

}
