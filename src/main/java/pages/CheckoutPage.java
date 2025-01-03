package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import domain.Address;

public class CheckoutPage extends BasePage {
	
		
	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}	
	
	By placeOrder= By.cssSelector("button#place_order");
	By successMsg = By.cssSelector("p.woocommerce-notice");
	
	By firstName = By.id("billing_first_name");
	
	public CheckoutPage enterFirstName(String fname) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
		e.clear();
		e.sendKeys(fname);
		return this;
	}
	By lastName = By.id("billing_last_name");
	
	public CheckoutPage enterLastName(String lname) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(lastName));
		e.clear();
		e.sendKeys(lname);
		return this;
	}
	
	By countryId= By.id("billing_country");
	
	
	public CheckoutPage enterCountry(String county) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(countryId));
		Select select = new Select(e);
		select.selectByVisibleText(county);
		return this;
	}
	
	
	By address1 = By.cssSelector("input#billing_address_1");
	
	public CheckoutPage enterAddress(String addr) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(address1));
		e.clear();
		e.sendKeys(addr);
		return this;
	}
	
	
	By city= By.id("billing_city");
	
	public CheckoutPage enterCity(String scity) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(city));
		e.clear();
		e.sendKeys(scity);
		return this;
	}
	 
	By stateId = By.id("billing_state");
	
	public CheckoutPage enterState(String state) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(stateId));
		Select select = new Select(e);
		select.selectByVisibleText(state);
		return this;
	}
	
	
	By zip = By.id("billing_postcode");
	
	public CheckoutPage enterZip(String postalcode) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(zip));
		e.clear();
		e.sendKeys(postalcode);
		return this;
	}
	 
	By email = By.id("billing_email");
	
	public CheckoutPage enterEmail(String semail) {
		
		WebElement e =wait.until(ExpectedConditions.presenceOfElementLocated(email));
		e.clear();
		e.sendKeys(semail);
		return this;
	}
	 
	public CheckoutPage setAddress(Address address) {
		
		return  enterFirstName(address.getFirstname())
				.enterLastName(address.getLastname())
				.enterCountry(address.getCountry())
				.enterAddress(address.getStreetaddress())
				.enterCity(address.getCity())
				.enterState(address.getState())
				.enterZip(address.getZip())
				.enterEmail(address.getEmail());
				
	}
	
	public void placeOrderBtn() {
		
		 driver.findElement(placeOrder).click();
	}
	
	public String getSuccessMsg() {
		wait.until(ExpectedConditions.presenceOfElementLocated(successMsg));
		return driver.findElement(successMsg).getText();
	}

}
