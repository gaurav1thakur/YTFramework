# You Tube Sample Framework

#### Selenium Setup:
### Selected IDE: IntelliJ

```
Selenium Setup: https://www.seleniumhq.org/download/
Download: Selenium Client & WebDriver Language Bindings as for this project Java - 3.141.59	- 2018-11-14 is selected
Download: Third Party Drivers, Bindings, and Plugins - > Google Chrome Driver - latest
Webdriver (chrome/firefox/safari/ie/android/ios)
For instance : Check your chrome driver version > 3dots > help > about chrome eg(76.0.3809.100)
Find suitable chrome driver compatible to this version  here https://chromedriver.storage.googleapis.com/index.html
(76.0.3809.100) -> Compatible chrome driver version 76.0.3809.12 (https://chromedriver.storage.googleapis.com/index.html?path=76.0.3809.12/)
```
#### Locators in Selenium WebDriver

Different types of Locators in Selenium are as follows:

```
1. ID : findElement(By.id("IdName"))

2. Name : findElement(By.name("Name")) 

3. Class Name : findElement(By.className("Element Class"))

4. Tag Name : findElement(By.tagName("HTML Tag Name"))

5. Link Text  : findElement(By.linkText("LinkText"))

6. Partial Link Text : findElement(By.partialLinkText("partialLinkText"))

7. CSS Selector : 
7.1 Tag and ID
findElement(By.cssSelector(tag#id))
7.2 Tag and Class
findElement(By.cssSelector(tag.class))
7.3 Tag and Attribute
findElement(By.cssSelector(tag[attribute=value]))
7.4 Tag, Class and Attribute
findElement(By.cssSelector(tag.class[attribute=value]))

8. XPath :  findElement(By.xpath("XPath"))
```

#### TestNG Setup:

https://www.jetbrains.com/help/idea/creating-testng-test-classes.html

```
Create TestNG.xml Plugin: File > Settings/ Preferences > Plugin >  Create TestNG XML > Select all Classes and right click  that needs to be included in Test Suite TestNG.xml
Running TestNG.xml :Run/Debug Configurations > + > TestNG > Edit Configuration > Test Kind: Suite > Suite : Path to testNG.xml (in single module)
Report Generation:  Edit Configuration > Listeners > User default Reports > test-output folder will generated with html reports 
```

#### Test NG Advantages : 


1. More Annotations in TestNG comparing to Junit 

```
@Before Suite
@Before Test
@Before Class
@Before Method
@Test Test 1:  This is Test
@ After Method
@ Before Method
@Test Test 2 : This is Test 2
@ After Method
@ After Class
@ After Test
@ After Suite
```
2. We can set priority in test annotation in testNG @Test(priority = 0) Default is 0
3. We can set the dependency on methods using @Test(dependsOnMethods = "test")
4. Reporting
5. Running Multiple classes with help on testng.xml 

Working with xPaths : https://www.guru99.com/xpath-selenium.html

Usefull Plugin : 
Selector-hub https://medium.com/@mailcoolsanjay/selectorshub-a-new-reality-is-live-now-7be4794d058
ChroPath - https://medium.com/@mailcoolsanjay/chropath-firepath-for-chrome-browser-3130e72b4754
