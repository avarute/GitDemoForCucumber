package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	private By Search=By.xpath("//input[@type='search']");
	private By productName=By.cssSelector("h4.product-name");
	private By topDeals=By.linkText("Top Deals");
	private By Increment=By.cssSelector("a.increment");
	private By addToCart=By.cssSelector(".product-action button");
	
	public void SearchItem(String name) {
		
		driver.findElement(Search).sendKeys(name);
	}
	
	public void getSearchText()
	{
		driver.findElement(Search).getText();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void SelecttopDeals()
	{
	driver.findElement(topDeals).click();
	}
	
	public void IncrementQuantity(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(Increment).click();
			i--;
		}

	}
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
	
	
}
