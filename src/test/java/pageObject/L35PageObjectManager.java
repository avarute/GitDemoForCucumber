package pageObject;

import org.openqa.selenium.WebDriver;

public class L35PageObjectManager {
	
	public WebDriver driver;
	public LandingPage landingpage;
	public OfferPage offerpage;
	public CheckOutPage checkOutPage;
	
	public L35PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}

	public LandingPage getLandingPage()
	{
		 landingpage=new LandingPage(driver);
		 return landingpage;
		
	}
	
	public OfferPage OfferPage()
	{
		offerpage=new OfferPage(driver);
		 return offerpage;
		
	}
	
	public CheckOutPage getcheckOutPage()
	{
		checkOutPage= new CheckOutPage(driver);
		return checkOutPage;
		
	};
}
