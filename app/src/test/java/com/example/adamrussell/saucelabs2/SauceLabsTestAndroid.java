package com.example.adamrussell.saucelabs2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
    import java.net.URL;
    import java.util.concurrent.TimeUnit;

    import org.junit.Test;
    import org.openqa.selenium.remote.DesiredCapabilities;

    import io.appium.java_client.android.AndroidDriver;
    import io.appium.java_client.remote.MobileCapabilityType;

    public class SauceLabsTestAndroid {

        private AndroidDriver driver;

        @Before
        public void testCase()throws  Exception {


            DesiredCapabilities caps = DesiredCapabilities.android();
            caps.setCapability("appiumVersion", "1.5.1");
            caps.setCapability("deviceOrientation", "portrait");
            caps.setCapability("browserName", "");
            caps.setCapability("deviceName","Android GoogleAPI Emulator");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
            caps.setCapability("platformVersion","5.0");
            caps.setCapability("app","https://s3-eu-west-1.amazonaws.com/bmwchargenow/ChargeNow_v1.apk");
//		caps.setCapability("fullReset", true);
            caps.setCapability("appPackage", "com.chargenow.client");
            caps.setCapability("appActivity", "com.bmw.chargenow.ui.activity.SplashActivity");
            driver= new AndroidDriver(new URL("http://arussell3333:3fa94b8d-a5f6-468d-9f55-ede18fdadf32@ondemand.saucelabs.com:80/wd/hub"),caps);

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


            // Thread.sleep(6000);
            // driver.quit();





        }



        @Test

        public void toggleMenu() throws Exception

        {

            driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/dismiss_button\").text(\"Got it!\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"Satellite View\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"List View\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"Filter Options\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\")").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.chargenow.client:id/left_toggle\")").click();


        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
        }

    }








