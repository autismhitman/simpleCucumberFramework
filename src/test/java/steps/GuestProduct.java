  package steps;
  
  import static org.testng.Assert.assertEquals;  
  import java.util.ArrayList; 
  import java.util.List;
  import org.openqa.selenium.WebDriver;

import constants.EndPoint;
import di.TestContext;
import domain.Address; 
  import factory.DriverFactory; 
  import io.cucumber.java.en.Given; 
  import io.cucumber.java.en.Then; 
  import io.cucumber.java.en.When; 
  import pages.CartPage; 
  import pages.CheckoutPage;
import pages.PageObjectManager;
import pages.StorePage;
  
  public class GuestProduct {
	  
	  TestContext context;
	  CheckoutPage cop;
	  CartPage cp;
		
	   public GuestProduct(TestContext context) {
		    this.context= context;
			cp= PageObjectManager.getCartPage(context.driver);
			cop= PageObjectManager.getCheckoutPage(context.driver);
			
		}
	    
		@Given("I'm on the checkout page")
		public void i_m_on_the_checkout_page() throws InterruptedException {
			
			cop.load(EndPoint.CHECKOUT.url);
			 
		}

		@When("I provide billing details")
		public void i_provide_billing_details( Address addr) {
	       	 
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
 