package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	private By cartBag= By.cssSelector("img[alt=Cart]");
	private By  CheckOutButton= By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	private By promobtn= By.className("promoBtn");
	private By  placeOrder= By.xpath("//button[contains(text(),'Place Order')]");
	
	
	public void CheckOutItems() {
		
		driver.findElement(cartBag).click();;
		driver.findElement(CheckOutButton).click();
		
	}
	
	public boolean VerifyPromoButton()
	{
		return driver.findElement(promobtn).isDisplayed();
	}
	
	public boolean VerifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	
	
}
