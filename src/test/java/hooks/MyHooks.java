package hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
 

public class MyHooks {
	
   
   private WebDriver driver;
   
 
   @Before
   public void before(Scenario scenario ) {
	   
	 System.out.println( "Thread is " + Thread.currentThread().getId()+"Scenario -> "+ scenario.getName());
	   driver = DriverFactory.initializeDriver( System.getProperty("browser","chrome"));
	 
   }
   
   @After 
   public void after( Scenario scenario) {
	   System.out.println( "Thread is " + Thread.currentThread().getId()+"Scenario -> "+ scenario.getName());
	   driver.quit();
	   
   }

}
