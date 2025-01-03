package checkingScript;

import java.util.List;
import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;

public class DataTableRevise {
	
	@DataTableType
	public Customer cEntry(Map<String, String> mapCustomer) {
		
		return new Customer(mapCustomer.get("username"),mapCustomer.get("password"));
	 }
	
	 @Given("crentials")
     public void credentials(@Transpose List<Customer> c) {
		 
		 System.out.println(c.get(0).getUsername() +"====="+ c.get(0).getPassword());
		 System.out.println(c.get(1).getUsername() +"====="+ c.get(1).getPassword());
	 }
     
     
     
     
}
