package com.moolya;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestClass1 {
    //TestNG is a Testing framework used in automation testing
   //@BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod, @AfterClass
   // @AfterMethod, @Test, @AfterSuite

    protected AppiumDriver<MobileElement> driver;
    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appiumautomator");

        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\arund\\Downloads\\MyDemo.apk");

        capabilities.setCapability("avd","pixel3");
        capabilities.setCapability("avd.timeout",280);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
         driver = new AndroidDriver<>(url,capabilities);
         driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @Test(priority = 1)
    public void successfulLogin(){
        MobileElement menu = driver.findElementByAccessibilityId("open menu");
        menu.click();

        MobileElement loginmenu = driver.findElementByAccessibilityId("menu item log in");
        loginmenu.click();
        MobileElement username = driver.findElementByAccessibilityId("Username input field");
        username.clear();
        username.sendKeys("bob@example.com");

        MobileElement password = driver.findElementByAccessibilityId("Password input field");
        password.clear();
        password.sendKeys("10203040");

        MobileElement Login = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login button\"]/android.widget.TextView");
        Login.click();

        MobileElement productTitle = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
        Assert.assertTrue(productTitle.isDisplayed());
    }
   // @Test(priority = 2)

    //public void lockedOutUser(){


   // MobileElement menu = driver.findElementByAccessibilityId("open menu");
    //menu.click();

    //MobileElement loginmenu = driver.findElementByAccessibilityId("menu item log in");
        //loginmenu.click();

    //MobileElement logedoutusername = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"alice@example.com (locked out)-autofill\"]/android.widget.TextView");
    //logedoutusername.click();

      //  MobileElement username = driver.findElementByAccessibilityId("Username input field");
        //username.clear();
    //MobileElement password = driver.findElementByAccessibilityId("Password input field");
    //password.sendKeys("10203040");
   // MobileElement Login = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login button\"]/android.widget.TextView");
    //Login.click();

        //MobileElement password = driver.findElementByAccessibilityId("Password input field");
        //  password.clear();
    //MobileElement error = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Password-error-message\"]/android.widget.TextView");
    //String actualErrorText = error.getText();
  //  String expectedErrorText = "Password is required";

   // Assert.assertEquals(actualErrorText, expectedErrorText);

    @Test(priority = 2)
    public void product(){

    MobileElement product = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
    String actualtext = product.getText();
    String expectedtext = "Products";

    Assert.assertEquals(actualtext,expectedtext);

MobileElement tap = driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"store item\"])[1]/android.view.ViewGroup[1]");
tap.click();

MobileElement gettext = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
//gettext.getAttribute("Sauce Labs Backpack");
        String attributeValue = gettext.getAttribute("Sauce Labs Backpack");
        System.out.println("The value of the 'Sauce Labs Backpack' attribute is: " + attributeValue);
}
    @AfterMethod
    public void afterMethod(){
driver.quit();

    }

}
