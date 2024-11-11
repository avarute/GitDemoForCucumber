package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	public WebDriver driver;
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}

	private By Search=By.xpath("//input[@type='search']");
	private By productName=By.cssSelector("tr td:nth-child(1)");
		
	
	public void SearchItem(String name) {
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(name);
	}
	
	public void getSearchText()
	{
		driver.findElement(Search).getText();
	}
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	
}
