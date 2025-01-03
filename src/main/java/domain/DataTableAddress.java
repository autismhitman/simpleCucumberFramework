package domain;

import java.util.Map;

import io.cucumber.java.DataTableType;

public class DataTableAddress {
	
	
	@DataTableType
	public Address cAddress(Map<String, String> cMap) {
		
		return new Address(
				cMap.get("firstname"),
				cMap.get("lastname"), 
				cMap.get("country"),
				cMap.get("address_line1"),
				cMap.get("city"),
				cMap.get("state"),
				cMap.get("zip"),
				cMap.get("email")
				);
	}
	
 
}
