 package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed-scenarios.txt",
glue="stepDefinations",
plugin= {"pretty","html:target/cucumber.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"rerun:target/failed-scenarios.txt"})

/* It will run defined feature file
 * 
 */
public class FailedTestNGTestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[] [] scenarios()
	{
		return super.scenarios();
	}
 
}
