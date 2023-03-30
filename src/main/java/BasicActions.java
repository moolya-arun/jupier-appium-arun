import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.example.DriverTarget;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static net.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.release;

public class BasicActions {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AppiumDriver<MobileElement> driver = DriverTarget.createDriver();

        By views = MobileBy.AccessibilityId("Views");
        By text = MobileBy.AccessibilityId("TextFields");
        By textfield = MobileBy.id("io.appium.android.apis:id/edit");

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
        driver.findElement(text).click();

Thread.sleep(3000);

        driver.findElement(textfield).clear();

        driver.findElement(textfield).sendKeys("arun");
        driver.findElement(textfield).getText();
        System.out.println(driver.findElement(textfield).getText());
        Thread.sleep(3000);

        driver.findElement(textfield).clear();
        driver.navigate().back();

        By visibility = MobileBy.AccessibilityId("Visibility");
        driver.findElement(visibility).getText();
        System.out.println(( driver.findElement(visibility).getText()));
        driver.findElement(visibility).click();


    }
}
