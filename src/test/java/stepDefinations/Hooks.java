package stepDefinations;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.*;


import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	
	public WebDriver driver;
	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup= testContextSetup;
	}
	@After
	
	public void AfterScenario() throws IOException
	{
		testContextSetup.testBase.WebDrivermanager().quit();
		
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver= testContextSetup.testBase.WebDrivermanager();
				
				if(scenario.isFailed())
				{
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					byte[] fileConten=FileUtils.readFileToByteArray(src);
					
					scenario.attach(fileConten, "image/png", "image");
					
					
				}
					
					
					
					
	}
	
}
