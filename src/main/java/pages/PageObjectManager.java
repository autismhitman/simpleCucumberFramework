package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	private static StorePage sp;
	private static CartPage cp;
	private static CheckoutPage cop;
	
	
	public static StorePage getStorePage(WebDriver driver) {
		
		return sp == null? new StorePage(driver) : sp;
	}
	
	public static CartPage getCartPage(WebDriver driver) {
		
		return cp == null? new CartPage(driver) : cp;
	}
	
	public static CheckoutPage getCheckoutPage(WebDriver driver) {
		
		return cop == null? new CheckoutPage(driver) : cop;
	}
	
	
}
