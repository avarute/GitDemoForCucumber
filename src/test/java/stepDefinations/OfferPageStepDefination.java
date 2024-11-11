package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import pageObject.L35PageObjectManager;
import pageObject.LandingPage;
import pageObject.OfferPage;

public class OfferPageStepDefination {
	
	
public WebDriver driver;
public String shortName;
public String offerPageProductName;
public String LandingPageProductName;
TestContextSetup testContextSetup;
L35PageObjectManager pageObjectManager;

public OfferPageStepDefination(TestContextSetup testContextSetup)
{
	this.testContextSetup= testContextSetup;
}
	@Then("^user searched for same (.+) in offers page$")
	public void user_searched_for_same_in_offers_page(String shortName) throws InterruptedException {
		switchToOfferPage();
		
		OfferPage offerpage =testContextSetup.l35pageObjectManager.OfferPage();
		offerpage.SearchItem(shortName);
		Thread.sleep(2000);
		 offerPageProductName = offerpage.getProductName();
		// System.out.println("Offer Page Name:" +offerPageProductName);
			
	}
	
	public void switchToOfferPage()
	{
		LandingPage landingpage= testContextSetup.l35pageObjectManager.getLandingPage();
		landingpage.SelecttopDeals();
		testContextSetup.genericUtils.switchToWindow();
		
	}
	@Then("validate product name in offer page matches with landing page")
	public void validate_product_name_in_offer_page_matches_with_landing_page()
	{
		
		System.out.println("Name on offer page:" +offerPageProductName);
		System.out.println("Name on landing page:" +testContextSetup.LandingPageProductName);
		Assert.assertEquals(testContextSetup.LandingPageProductName, offerPageProductName);
		
	}
}
