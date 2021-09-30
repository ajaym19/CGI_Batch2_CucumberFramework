package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/Features",
		glue = "StepDefinition",
		dryRun = true,
		plugin = {"html:Reports/HTMLReport",
				"json:Reports/Jsonreport.json",
				"junit:Reports/JUnitReport.xml"}
		
		)


public class TestRunner {

}
