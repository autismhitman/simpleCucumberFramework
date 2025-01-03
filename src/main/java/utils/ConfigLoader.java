package utils;

import java.util.Properties;

public class ConfigLoader {
	
	
	private final Properties properties;
	private static ConfigLoader config;
	
	private ConfigLoader() {
		
		properties = PropertyUtils.propertyLoader("src/test/resources/config.properties");
		
	}

	public static ConfigLoader getInstance() {
		
		if(config==null) {
			
			config = new ConfigLoader();
		}
		return config;
	}
	
	
	public String getBaseUrl() {
		
		String prop= properties.getProperty("baseurl");
		if(prop!=null) return prop;
		else throw new RuntimeException("Property baseurl not found");
	}
	
 
}
