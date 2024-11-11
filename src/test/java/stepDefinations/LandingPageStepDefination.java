package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LandingPage;

public class LandingPageStepDefination {
	
	
public WebDriver driver;
public String shortName;
public String offerPageProductName;
public String LandingPageProductName;
public LandingPage landingpage;
TestContextSetup testContextSetup;

public LandingPageStepDefination(TestContextSetup testContextSetup)
{
	this.testContextSetup= testContextSetup;
	this.landingpage=testContextSetup.l35pageObjectManager.getLandingPage();;
}


	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		

			}
	@When("^user searched with shortname (.+) and extract actual result name of product$")
	public void user_searched_with_shortname_and_extract_actual_result_name_of_product(String shortName) throws InterruptedException {
		 
		landingpage.SearchItem(shortName);
		 Thread.sleep(2000);
		 testContextSetup.LandingPageProductName=landingpage.getProductName().split("-")[0].trim();
		 System.out.println("Landing page name:" +testContextSetup.LandingPageProductName);
	}

	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product_to_cart(String quantity)
	{
		
		landingpage.IncrementQuantity(Integer.parseInt(quantity));
		landingpage.addToCart();
	}
	
}
