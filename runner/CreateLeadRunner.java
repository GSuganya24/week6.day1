package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/Login_Lead.feature", glue = "steps_CreateLead", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, publish = true)
public class CreateLeadRunner extends AbstractTestNGCucumberTests {

}
