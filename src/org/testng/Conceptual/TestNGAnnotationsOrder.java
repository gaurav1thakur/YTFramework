package org.testng.Conceptual;

import org.testng.annotations.*;

public class TestNGAnnotationsOrder {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test(priority = 0)
    public void test() {
        System.out.println("Test 1:  This is Test");
    }


    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("After Groups");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }


    @Test(dependsOnMethods = "test")
    public void test2() {
        System.out.println("Test 2 : This is Test 2");
    }


}
