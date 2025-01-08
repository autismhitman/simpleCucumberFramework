package steps;

import apis.CartApi;
import constants.EndPoint;
import di.TestContext;
import domain.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PageObjectManager;
import pages.StorePage;

public class StoreDefinitions {
	
	StorePage sp;
	TestContext context;
	
	public StoreDefinitions(TestContext context) {
        this.context= context;
		sp = PageObjectManager.getStorePage(context.driver);
		
	}
	
	@Given("I'm on the store page")
	public void i_m_on_the_store_page()   {
		
	  
	  sp.load(EndPoint.STORE.url);
	  
	 }
	

	@When("I add a {product} to the cart")
	public void i_add_a_to_the_cart(Product product)  {
	    
		  sp.addProductToCart(product.getName()).viewCart();
 
	}
	
	@Given("I'm a guest customer")
	public void i_m_a_guest_customer() {
		 
		  sp.load(EndPoint.STORE.url);
		  
	}
	
	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart( ) {
		 CartApi cartapi = new CartApi(context.cookies.getCookies());
		 cartapi.addToCart(1215,1 );
		 context.cookies.setCookies(cartapi.getCookies());
		 context.cookies.injectCookiesToBrowser(context.driver);
		 
		 
		//sp.addProductToCart(product.getName()).viewCart() ;
		
	   
	}

}
