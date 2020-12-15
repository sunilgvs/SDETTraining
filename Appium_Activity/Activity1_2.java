package Appium_Activity;



import java.io.IOException;

import java.net.MalformedURLException;

import java.net.URL;



import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Test;



import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;



public class Activity1_2 {

	

	@Test

	public void calc() throws InterruptedException, IOException {

        // Set the Desired Capabilities

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("deviceId", "RZ8N91D9NHD");

        caps.setCapability("deviceName", "Galaxy M21");

        caps.setCapability("platformName", "android");

        caps.setCapability("appPackage", "com.oneplus.calculator");

        caps.setCapability("appActivity", "com.oneplus.calculator.Calculator");

        

        // Instantiate Appium Driver

        AppiumDriver<MobileElement> driver = null;

        try {

            // Initialize driver

            driver = new AndroidDriver <MobileElement> (new URL("http://127.0.0.1:4723/wd/hub"), caps);

            System.out.println("Calculator is open");

        } 

        catch (MalformedURLException e) {

            System.out.println(e.getMessage());

        }

        

	}

}