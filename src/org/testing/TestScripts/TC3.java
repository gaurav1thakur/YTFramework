package org.testing.TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {

    @BeforeMethod
    public void launchBrowser(){
        System.out.println("Browser Launched");
        System.out.println("Send keys to Youtube URL");
}

    @Test
    public void launchYoutubeUrl(){

        System.out.println("Login");
        System.out.println("Video Play");
        System.out.println("Video Like");
    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("Browser session closed ");
    }
}
