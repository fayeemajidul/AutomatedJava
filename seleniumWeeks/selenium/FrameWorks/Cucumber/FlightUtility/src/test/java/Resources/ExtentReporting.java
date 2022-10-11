package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReporting {
    public ExtentReports extentReportConfig(){
        File file = new File("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/Cucumber/FlightUtility/src/test/java/Resources/assets");
        ExtentSparkReporter reporter = new ExtentSparkReporter(file);
        reporter.config().setReportName("CLOTHING STORE TEST");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Fayeem");
        return extent;
    }
}
