package org.testing.Conceptual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleInvalidGMailUser {
    public static void main(String[] args) throws InterruptedException {
//      FirefoxDriver driver = new FirefoxDriver();
        //setting weddriver path here, it should be downloaded and path should be accurate to launch webdriver compatible with chrome version 76.0.3809.100
        System.setProperty("webdriver.chrome.driver","..\\YTFramework\\src\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://mail.google.com/");
        WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
        element.sendKeys("abc@gmail.com ");
        WebElement button = driver.findElement(By.xpath("//span[text()='Next']"));
        button.click();
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}