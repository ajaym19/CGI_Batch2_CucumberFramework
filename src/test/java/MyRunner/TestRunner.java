package MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/Features", 
		glue = "StepDefinition", 
		dryRun = false, 
		plugin = {
		"html:Reports/HTMLReport", "json:target/Jsonreport.json", "junit:Reports/JUnitReport.xml" }

)

public class TestRunner extends AbstractTestNGCucumberTests{

}
