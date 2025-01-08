package di;

import org.openqa.selenium.WebDriver;

import domain.Cookies;

public class TestContext {
	
	
      public WebDriver driver;
      public Cookies cookies;
      
      
	public TestContext( ) {
		 cookies = new Cookies();
		 cookies.setCookies(new io.restassured.http.Cookies());
	}
      
      
}
