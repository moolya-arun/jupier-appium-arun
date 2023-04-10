package com.moolya.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductsPage {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView")

    private MobileElement productTitle;

//    MobileElement productTitle = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");
//        Assert.assertTrue(productTitle.isDisplayed());

    public boolean isTitleDisplayed() {
        return productTitle.isDisplayed();
    }
}