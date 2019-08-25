package org.testing.TestScripts;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC1 extends Base {
//  Keeping @BeforeMethod and @AfterMethod this in Base Class cause its common in all test cases
//    @BeforeMethod
//   public void launchBrowser(){
//        System.out.println("Browser Launched");
//        System.out.println("Send keys to Youtube URL");
//    }

    @Test
    public void launchYoutubeUrl(){
        System.out.println("Login");
        System.out.println("Trending");
    }

//    @AfterMethod
//    public void closeBrowser(){
//        System.out.println("Browser session closed ");
//    }
}
