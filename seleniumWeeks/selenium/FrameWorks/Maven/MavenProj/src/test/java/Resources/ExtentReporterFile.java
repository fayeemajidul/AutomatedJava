package Resources;

import java.io.File;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterFile {
    public static ExtentReports configElements(){
        File path = new File("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/Maven/MavenProj/src/test/java/Sources");
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("End To End Test: Draft");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Test# 1:", "Fayeem");
        return extent;
    }

}