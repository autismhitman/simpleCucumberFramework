package saucescripts;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

 
@CucumberOptions(features = {"src/test/java/features/runFeature"},
	               glue = {"checkingScript","hooks", "steps","domain"},
	               plugin = {"pretty", "html:target/cucumber.html"},
	               dryRun=false,
	               snippets = SnippetType.CAMELCASE
                   //monochrome=true 
                   //tags="@tag"

)

public class DummyRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	

}
