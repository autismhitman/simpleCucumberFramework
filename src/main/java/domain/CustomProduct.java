package domain;

import io.cucumber.java.ParameterType;

public class CustomProduct {
	
	
	@ParameterType(".*")
	public Product product(String name) {
		
		return new Product(name.replace("\"","" ));
	}

}
