package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

public class TouchActions {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AppiumDriver<MobileElement> driver = DriverTarget.createDriver();

        By accessibility = MobileBy.AccessibilityId("Accessibility");
        TouchAction touch = new TouchAction(driver);

        //Tapping
       // touch.tap(ElementOption.element(driver.findElement(accessibility))).perform();

        //tap by point x and y
      //  touch.tap(PointOption.point(365,422)).perform();

        //press
      //  touch.press(ElementOption.element(driver.findElement(accessibility))).release().perform();
//long press
      //  touch.longPress(ElementOption.element(driver.findElement(accessibility))).release().perform();

//long press uing wait option
        touch.longPress(ElementOption.element(driver.findElement(accessibility)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(8))).release().perform();

driver.navigate().back();
        By views = MobileBy.AccessibilityId("Views");
        driver.findElement(views).click();

        (new TouchAction<>(driver))
                .press(new PointOption().withCoordinates(507, 1675))
                .moveTo(new PointOption().withCoordinates(507, 634))
                .release()
                .perform();


        (new TouchAction<>(driver))
                .press(new PointOption().withCoordinates(490, 1743))
                .moveTo(new PointOption().withCoordinates(489, 567))
                .release()
                .perform();

        (new TouchAction<>(driver))
                .press(new PointOption().withCoordinates(501, 1712))
                .moveTo(new PointOption().withCoordinates(490, 520))
                .release()
                .perform();

    }

}
