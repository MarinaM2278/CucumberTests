package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\sjDemo\\Batch16CucumberUITests\\Features\\Hooks.feature",
		// features = "@target/rerun.txt",
		glue = "stepDefinition",
		// tags = "@Sanity and @End2End",
		// tags = "@Sanity or ~@End2End",  // tags = "@Sanity"
		plugin= {"pretty","html:reports/test-output.html", "json:logs/json_output",  "junit:junit_xml_output/cucumber.xml",
				"rerun:target/rerun.txt"}
		)

public class TestRunner {
	
	
	

}