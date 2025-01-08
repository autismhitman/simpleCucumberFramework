package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;

import io.restassured.http.Cookies;

public class CookieUtils {
	 
	 public static List<Cookie> getSeleniumCookiefromREstAssuredCookies(Cookies cookies){
		 
		 List<io.restassured.http.Cookie> getApiCookies = cookies.asList();
		 
		 List<org.openqa.selenium.Cookie> getWebCookies = new ArrayList<>();
		 
		 for( io.restassured.http.Cookie c : getApiCookies) {
			 
			 getWebCookies.add(
					 
					 new Cookie(c .getName(), c .getValue(), c .getDomain(),
			                    c .getPath(), c .getExpiryDate(), c .isSecured(), c .isHttpOnly(),
			                    c .getSameSite()));
			 
		 }
		 
		 return getWebCookies;
		 
	 }
}
