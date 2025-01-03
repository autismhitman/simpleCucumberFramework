package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
	
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
   
    
    public static WebDriver initializeDriver(String browser) {
    	
    	WebDriver driver;
    	 
    		
    		switch(browser) {
    		
    		case "chrome" : 
    			driver=  new ChromeDriver();
    			break;
    			
    		case "edge":
    			driver=  new EdgeDriver();
    			break;
    			
    	    default:
    	    	driver = new FirefoxDriver();
    		}
    	  
    	driver.manage().window().maximize();
    	DriverFactory.driver.set(driver);
    	 
    	return driver;
    }
	 
      public static WebDriver getDriver() {
    
    	  return driver.get();
    	  
      }
      
      public static void closeDriver() {
    	  
    	   driver.get().quit();
      }

}
