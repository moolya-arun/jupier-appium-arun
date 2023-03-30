package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverTarget {

    public static AndroidDriver<MobileElement> createDriver() throws MalformedURLException {


    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
    capabilities.setCapability(MobileCapabilityType.APP,"C:/Users/arund/Downloads/ApiDemos-debug.apk");

       // capabilities.setCapability("appPackage","com.bak.mnr.calculatrice");

        // apabilities.setCapability("appActivity", "MainActivity");
        capabilities.setCapability("avd","pixel3");
        capabilities.setCapability("avd.timeout",280);

    URL url = new URL("http://127.0.0.1:4723/wd/hub");
    AndroidDriver<MobileElement> driver = new AndroidDriver<>(url,capabilities);
return driver;

}
}

