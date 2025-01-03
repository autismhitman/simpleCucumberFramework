package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {

	public StorePage(WebDriver driver) {
		super(driver);
		
	}
  
	By viewCartLnk = By.cssSelector("a[title='View cart']");
	
	public StorePage addProductToCart(String prodName) {
		
		By addProductToCart= By.cssSelector("a[aria-label='Add “"+prodName+"” to your cart']");
		wait.until(ExpectedConditions.presenceOfElementLocated(addProductToCart));
        driver.findElement(addProductToCart).click();
        return this;
	}
	
	public CartPage  viewCart() {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(viewCartLnk));
		driver.findElement(viewCartLnk).click();
		return new CartPage(driver);
	}

}
