package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.L35PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String LandingPageProductName;
	public L35PageObjectManager l35pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	
	public TestContextSetup() throws IOException
	{
		testBase=new TestBase();
		l35pageObjectManager=new L35PageObjectManager(testBase.WebDrivermanager());
		genericUtils=new GenericUtils(testBase.WebDrivermanager());
		
		
	}

	
	
	
}
