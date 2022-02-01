package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/MergeLead.feature", glue = "steps_MergeLead", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, publish = true)
public class MergeLeadRunner extends AbstractTestNGCucumberTests{

}
