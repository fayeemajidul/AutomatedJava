package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentReportValidator {
    public ExtentReports config(){
        //ExtentReports, ExtentSparkReporter
        File path = new File("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/Brevity/Brevity/src/test/java/Sources");
        //Created a path where extent reports will be generated.
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Automation Results");

        ExtentReports extent = new ExtentReports();
        //Extent is dependent on ExtentSpark, think of Extent class as an executioner.
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Fayeem");
        return extent;
    }
}
