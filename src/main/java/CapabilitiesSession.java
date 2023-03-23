//import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.example.DriverTarget;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CapabilitiesSession {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<MobileElement> driver = DriverTarget.createDriver();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

      MobileElement number1 = driver.findElementById("com.bak.mnr.calculatrice:id/btn2");
//number1.click();
System.out.println(number1.getText());
MobileElement number2 = driver.findElementById("com.bak.mnr.calculatrice:id/btnP");
//number2.click();
        System.out.println(number2.getText());
MobileElement number3= driver.findElementById("com.bak.mnr.calculatrice:id/btn9");
//number3.click();
        System.out.println(number3.getText());
MobileElement number4= driver.findElementById("com.bak.mnr.calculatrice:id/btnE");
//number4.click();
        System.out.println(number4.getText());
        MobileElement result = driver.findElementByClassName("android.widget.EditText");
        System.out.println(result.getText());

        List<MobileElement> number5 = driver.findElementsById("android:id/content");
        for (MobileElement element : number5) {
            System.out.println(element.getText());
        }


        driver.quit();

}
}

