package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/tes/resources/feature",
glue = "step.definations", 
tags = "@all", 
dryRun = false, 
monochrome = true,
strict = true, 
plugin = {
		"pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber.json" },

		publish = true

)

public class TestRunner {
	
	

}
