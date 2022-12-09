package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumProject {
    @Test
    public void AppiumBasic() throws MalformedURLException {
        /*
        * Code: --> Creating drivers & Setting capabilities.
        * Need to start Server and place into Driver.
        *
        * Need to Set Capabilities [Present Versions, etc]:
        * */
        UiAutomator2Options capabilityOption = new UiAutomator2Options();
        capabilityOption.setDeviceName("FayeemPhone"); //Set Device to AndroidStudio name
        capabilityOption.setApp("/Users/fayeemmooktadeer/Desktop/LearningJava/appiumWeeks/appiumCamp/Week0/day0/AppiumAndroid/src/main/resources/Debug/ApiDemos-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),capabilityOption);

    }
}