package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
	
	
	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
	By prodNameField =By.cssSelector("td[class='product-name'] a");
	By prodQtyFld= By.cssSelector("input[type='number']");
	By proceedToCheckOutBtn = By.cssSelector(".checkout-button.button");
	
	public String getProductName() {
		
		 
	     return driver.findElement(prodNameField).getText();
	}
	
	
	public int getProductQty() {
		
		 
	     return Integer.parseInt(driver.findElement(prodQtyFld).getDomAttribute("value"));
	}
	
	public CheckoutPage clickCheckoutBtn()  {
		
		driver.findElement(proceedToCheckOutBtn).click();
	 
		return new CheckoutPage(driver);
	}

}
