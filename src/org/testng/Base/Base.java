package org.testng.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//Base Class Functionality Functionality
//Browser Launched
//Url hit
//Properties file load
//Browser close

public class Base {
    public ChromeDriver driver;
    public Properties properties;


    @BeforeMethod
    public void launchBrowser() throws IOException {
        System.setProperty("webdriver.chrome.driver", "..\\YTFramework\\src\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Browser Launched");

        //Loading properties file for all page objects, this could be better using page object class using POM model
        File file = new File("..\\YTFramework\\src\\PageObject.properties");
        FileInputStream inputStream = new FileInputStream(file);
        properties = new Properties();
        properties.load(inputStream);

        driver.get("https://www.youtube.com/");
        //System.out.println("Send keys to Youtube URL");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Browser session closed ");
        driver.close();
        driver.quit();
    }
}
