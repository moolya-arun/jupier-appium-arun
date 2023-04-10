package com.moolya.pages;

import com.moolya.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {
@AndroidFindBy(accessibility = "open menu")
        private MobileElement menus;

    @AndroidFindBy(accessibility = "menu item log in")
    private MobileElement loginmenu;
    @AndroidFindBy(accessibility = "Username input field ")
    private MobileElement usernametxt;
    @AndroidFindBy(accessibility = "Password input field")
    private MobileElement passwordtxt;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Login button\"]/android.widget.TextView")
    private MobileElement Loginbutton;

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
//    public LoginPage(AppiumDriver<MobileElement> driver) {
//        super(driver);


    //    MobileElement menu = driver.findElementByAccessibilityId("open menu");
//        menu.click();
//
//    MobileElement loginmenu = driver.findElementByAccessibilityId("menu item log in");
//        loginmenu.click();
//    MobileElement username = driver.findElementByAccessibilityId("Username input field");
//        username.clear();
//        username.sendKeys("bob@example.com");
//
//    MobileElement password = driver.findElementByAccessibilityId("Password input field");
//        password.clear();
//        password.sendKeys("10203040");
//
//    MobileElement Login = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login button\"]/android.widget.TextView");
//        Login.click();
//
//

    public LoginPage clickOnOpenMenu(){
        click(menus);
        return this;
    }

    public LoginPage clickOnLoginMenu(){
click(loginmenu);
return this;
    }
    public LoginPage enterUsername (String username){
        sendkeys(usernametxt,username);
        return this;

    }
    public LoginPage enterPassword(String password) {
sendkeys(passwordtxt,password);
        return this;

    }
    public ProductsPage clickOnLoginButton() {
        click(Loginbutton);
        return new ProductsPage();
    }

    }
