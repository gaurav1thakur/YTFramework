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
        WebElement navigation = driver.findElement(By.xpath(properties.getProperty("navigation")));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        navigation.click();
        //what happens if user have no history ? will history tab will be enabled?

        WebElement history = driver.findElement(By.xpath(properties.getProperty("history")));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        if(history.isDisplayed()){
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            history.click();
        }else
        {
            //log history tab is not present for user
        }

    }

}
