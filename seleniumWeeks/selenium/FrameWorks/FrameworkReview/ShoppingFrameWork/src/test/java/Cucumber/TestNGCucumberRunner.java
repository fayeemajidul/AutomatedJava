package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Cucumber", glue = "Cucumber/StepImplementation",monochrome = true, plugin = {"html:src/test/java/Sources/Cucumber.html"}) // How initiate a test.

public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
