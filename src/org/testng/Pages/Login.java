package org.testng.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Login {
    ChromeDriver driver;
    Properties properties;
        public Login(ChromeDriver driver, Properties properties){
        this.driver = driver;
        this.properties = properties;
        }

    public void userSignIn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement signIn = driver.findElement(By.xpath(properties.getProperty("signIn")));
        signIn.click();
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath(properties.getProperty("email")));
        // email.click();

        email.sendKeys(properties.getProperty("username"));
        WebElement next = driver.findElement(By.xpath(properties.getProperty("next")));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        next.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement password = driver.findElement(By.xpath(properties.getProperty("password")));
        //password.click();
        password.sendKeys(properties.getProperty("passwordtogmail"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //We Tried to use the same previous next web element but we getting error stale element ?
        WebElement next2 = driver.findElement(By.xpath(properties.getProperty("next")));
        next2.click();

    }
}
