package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckOutPage;
import pageObject.LandingPage;

public class CheckOutPageStepDefination {
	
	
public WebDriver driver;
public String shortName;
public String offerPageProductName;
public String LandingPageProductName;
TestContextSetup testContextSetup;
public CheckOutPage checkOutPage;

public CheckOutPageStepDefination(TestContextSetup testContextSetup)
{
	this.testContextSetup= testContextSetup;
	this.checkOutPage=testContextSetup.l35pageObjectManager.getcheckOutPage();
}

@Then("Verify user has ability to enter promo code and place the order")

public void Verify_user_has_ability_to_enter_promo_code()
{

	Assert.assertTrue(checkOutPage.VerifyPlaceOrder());
	Assert.assertTrue(checkOutPage.VerifyPromoButton());
}
@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
public void User_proceed_to_checkout(String Name) throws InterruptedException
{
	checkOutPage.CheckOutItems();
	
}


}
