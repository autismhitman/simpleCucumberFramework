package steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.EndPoint;
import di.TestContext;
import domain.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.PageObjectManager;
import pages.StorePage;

public class CartProduct {
	
	//private WebDriver driver;
	private CartPage cp;
	 
	
	public CartProduct(TestContext context) {
	
		//driver= context.driver;
		cp = PageObjectManager.getCartPage(context.driver);
		
	}
	
	


	@Then("I should see {int} {product} in the cart")
	public void i_should_see_in_the_cart(int qty, Product product) {
		 
		  String actualProdName= cp.getProductName();
		  int actualQty = cp.getProductQty();
		  Assert.assertEquals(actualProdName, product.getName());
		  Assert.assertEquals(actualQty, qty);
	 
	}
	//////////////////////////////////////.viewCart();
	



}
