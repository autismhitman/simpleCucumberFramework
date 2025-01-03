package checkingScript;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DummySteps {
	
	static WebDriver driver;
	
	@Given("{string} as the application")
	public void url_as_the_application(String url) {
	  
	  
	  driver = new ChromeDriver();
	  driver.get(url);
	}

	@When("I enter {string} and {string}")
	public void i_enter_standard_user_and_secret_sauce(String username, String password) {
	   
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("I am able to login successfully")
	public void i_am_able_to_login_successfully() {
	    driver.findElement(By.cssSelector("input.btn_action#login-button")).click();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#inventory_filter_container div.product_label")));
	    String actualText=driver.findElement(By.cssSelector("#inventory_filter_container div.product_label")).getText();
	     assertEquals(actualText, "Products", "Not matched");
	}
	
	@Given("I have {int} cucumber(s) in my belly/stomach")
	public void iHaveCucumbersInMyBelly(Integer word ) {
	     System.out.println("====> is :" + word  );
	}

//	@And("I have a {color} ball")
// 	public void iHaveAColorBall(Color color) {
// 		System.out.println(color.getName());
// 	}

}
