package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.Scenario;
 
import java.util.Map;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"},
		tags={"@SmokeTest"},
		plugin={"html:target/selenium-reports"}
		)

public class TestRunner {
	public static Map<String, String> config;
	public static Scenario scenario;
}