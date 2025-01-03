package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigLoader;

public class BasePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	
	public BasePage(WebDriver driver) {
		 
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	public void load(String endPoint) {
		
		driver.get(ConfigLoader.getInstance().getBaseUrl()+endPoint);
	}
	
 
}
