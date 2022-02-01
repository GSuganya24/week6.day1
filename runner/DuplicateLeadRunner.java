package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/feature/DuplicateLead.feature", glue="steps_DuplicateLead", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, publish = true)
public class DuplicateLeadRunner extends AbstractTestNGCucumberTests {

}
