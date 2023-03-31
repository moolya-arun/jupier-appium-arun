package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.net.MalformedURLException;

public class ElementAttributes {
    public static void main(String[] args) throws MalformedURLException {
        AppiumDriver<MobileElement> driver = DriverTarget.createDriver();

//printing using get text and get attribute string

        By text = MobileBy.AccessibilityId("Accessibility");
        driver.findElement(text).getText();
        System.out.println(driver.findElement(text).getText());
        System.out.println(driver.findElement(text).getAttribute("text"));

        By media = MobileBy.AccessibilityId("Media");
        driver.findElement(media).getText();
        System.out.println(driver.findElement(media).getText());

        //element is clickable or not
        System.out.println("Button is clickable:" + driver.findElement(media).getAttribute("clickable"));

        //element is checkable or not
        System.out.println(driver.findElement(media).getAttribute("checkable"));

        //element is enabled or not
        System.out.println("Button is enabled: " + driver.findElement(media).getAttribute("enabled"));

        //element is displayed or not
        System.out.println("Button is dispalyed: " + driver.findElement(media).getAttribute("displayed"));

driver.findElement(media).isDisplayed();
driver.findElement(media).isEnabled();
driver.findElement(media).isSelected();
driver.findElement(media).getText();
System.out.println(driver.findElement(media).getText());
       // File screenshot = driver.findElement(media).getScreenshotAs(OutputType.FILE);
        //System.out.println("Screenshot of the element: " + screenshot.getAbsolutePath());



    }
}
