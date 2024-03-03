package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/test/resources/Featurefiles/Login.feature" }, glue = { "stepdefnitions" }, plugin = { "pretty",
		"html:/target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml" })

public class TestRunLogin {

}
