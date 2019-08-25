package org.testing.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
    ChromeDriver driver;

    @BeforeMethod
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","..\\YTFramework\\src\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Browser Launched");
        driver.get("https://www.youtube.com/");
        System.out.println("Send keys to Youtube URL");
    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("Browser session closed ");
        driver.close();
        driver.quit();
    }
}
