package Features;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/Features", glue = "Features/StepDefinition", monochrome = true )
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
}
