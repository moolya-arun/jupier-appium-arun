package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class Swipe {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AppiumDriver<MobileElement> driver = DriverTarget.createDriver();

        By viwes = MobileBy.AccessibilityId("Views");
        driver.findElement(viwes).click();

        TouchAction t = new TouchAction(driver);

       t.press(PointOption.point(598,1678))
                .moveTo(PointOption.point(507, 634))
                .release()
                .perform();


        t.press(PointOption.point(598,1678))
                .moveTo(PointOption.point(507, 634))
                .release()
                .perform();


        t.press(PointOption.point(598,1678))
                .moveTo(PointOption.point(507, 634))
                .release()
                .perform();

        By searchView = MobileBy.AccessibilityId("Search View");
driver.findElement(searchView).click();

    }
}
