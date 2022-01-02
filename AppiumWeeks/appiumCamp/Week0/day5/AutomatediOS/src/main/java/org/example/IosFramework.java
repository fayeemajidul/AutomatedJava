package org.example;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class IosFramework extends BaseTest{
    //Locator Usage: Xpath + ClassName + IOS + IosClassChain, IOSPredicateString, Accessibility ID, id

    @Test
    public void IosBasic() {
        driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
        /*
         * APPIUM wrapper work --> Xpath slow, so it does class chain.
         */
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Text Entry'`]")).click();
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("Short Text");
        driver.findElement(AppiumBy.iOSNsPredicateString("label == 'OK'")).click();

//        driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value == 'Confirm / Cancel'")).click();
        /*Regular Expression*/
//        driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] == 'Confirm'")).click();

    }
}
