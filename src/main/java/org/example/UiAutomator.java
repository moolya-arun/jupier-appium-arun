package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class UiAutomator {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5556");
        capabilities.setCapability(MobileCapabilityType.APP,"C:/Users/arund/Downloads/ApiDemos-debug.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AppiumDriver<MobileElement> driver = new AndroidDriver<>(url,capabilities);

    }


}



