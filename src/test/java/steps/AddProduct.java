package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.EndPoint;
import domain.Address;
import domain.Product;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;
import utils.ConfigLoader;

public class AddProduct {
	
	private WebDriver driver;
	CartPage cp;
	StorePage sp;
	 
	@Given("I'm on the store page")
	public void i_m_on_the_store_page()   {
		
	  driver = DriverFactory.getDriver();
	  new StorePage(driver).load(EndPoint.STORE.url);
	  
	 }

	@When("I add a {product} to the cart")
	public void i_add_a_to_the_cart(Product product)  {
	    
		  cp = new StorePage(driver).addProductToCart(product.getName()).viewCart();
 
	}

	@Then("I should see {int} {product} in the cart")
	public void i_should_see_in_the_cart(int qty, Product product) {
		 
		  String actualProdName= cp.getProductName();
		  int actualQty = cp.getProductQty();
		  Assert.assertEquals(actualProdName, product.getName());
		  Assert.assertEquals(actualQty, qty);
	 
	}
	//////////////////////////////////////
	CheckoutPage cop;
	//CartPage cp;
	//List<Address>  address = new ArrayList<>();
	
	@Given("I'm a guest customer")
	public void i_m_a_guest_customer() {
		  driver = DriverFactory.getDriver();
		  new StorePage(driver).load(EndPoint.STORE.url);
		  
	}

	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() {
		 
		// cp=  addProductToCart("Blue Shoes").viewCart();
		new StorePage(driver).addProductToCart("Blue Shoes").viewCart();
	   
	}

	@Given("I'm on the checkout page")
	public void i_m_on_the_checkout_page() throws InterruptedException {
		
		cop = new CartPage(driver).clickCheckoutBtn();
		 
	}

	@When("I provide billing details")
	public void i_provide_billing_details( Address addr) {
       	 
		  //address=addr;
		  cop.setAddress(addr);
		    		
	}
	

	@When("I place an order")
	public void i_place_an_order() {
		
		cop.placeOrderBtn();
       
	}

	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {
         
		assertEquals(cop.getSuccessMsg(), "Thank you. Your order has been received.");
	 
	}



}
