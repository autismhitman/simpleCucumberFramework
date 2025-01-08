package domain;

import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import utils.CookieUtils;

 

public class Cookies {
	
	
	private io.restassured.http.Cookies cookies;

	public io.restassured.http.Cookies getCookies() {
		return cookies;
	}

	public void setCookies(io.restassured.http.Cookies cookies) {
		this.cookies = cookies;
	}
	
	public void injectCookiesToBrowser(WebDriver driver) {
		
		List<Cookie> selCookies = CookieUtils.getSeleniumCookiefromREstAssuredCookies(cookies);
		for( Cookie e : selCookies) {
			System.out.println(e);
			driver.manage().addCookie(e);
		}
		
	}
	

}
