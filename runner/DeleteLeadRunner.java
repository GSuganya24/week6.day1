package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/feature/DeleteLead.feature", glue = "steps_DeleteLead", monochrome = true,
                 dryRun = false, snippets = SnippetType.CAMELCASE, publish = true)
public class DeleteLeadRunner extends AbstractTestNGCucumberTests{

}
