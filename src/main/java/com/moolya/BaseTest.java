package com.moolya;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;


public class BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    protected static Properties properties;
    InputStream inputStream;
    public BaseTest(AppiumDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(BaseTest.driver), this);

    }
@Parameters({"platformName","udid","platformVersion"})

    @BeforeMethod
    public void setUp(String platformName, String platformVersion, String udid) throws IOException {
        String propertyFileName = "config.properties";
        properties = new Properties();

        inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);
        properties.load(inputStream);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "platformName");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"platformVersion");
        capabilities.setCapability(MobileCapabilityType.UDID,"udid");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, properties.getProperty("androidautomationName"));

    String appurl = System.getProperty("user.dir") + "/src/test/resources/" + properties.getProperty("androidAppPath");
    System.out.println(appurl);
           capabilities.setCapability(MobileCapabilityType.APP,appurl);

        capabilities.setCapability("avd","pixel3");
        capabilities.setCapability("avd.timeout",280);

        URL url = new URL(properties.getProperty("appiumServerUrl"));
        driver = new AndroidDriver<>(url,capabilities);


    }
   //Explicit wait reusable method
    public void waitForVisibility(MobileElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //click reusable method
    public void click (MobileElement element){
    waitForVisibility(element);
    element.click();
    }

    //Sendkeys reusable method
    public void sendkeys(MobileElement element, String txt){
        waitForVisibility(element);
element.sendKeys(txt);
    }

    //Get Attribute reusable method
    public void getAttribute(MobileElement element, String attribute){
    waitForVisibility(element);
    element.getAttribute(attribute);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();


    }
}
