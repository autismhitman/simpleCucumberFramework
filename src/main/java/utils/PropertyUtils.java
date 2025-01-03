package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
	
	
	public static Properties propertyLoader(String filepath)   {
		
		Properties prop = new Properties();
		BufferedReader br ;
		try {
			br = new BufferedReader(new FileReader(filepath));
				try {
					prop.load(br);
					br.close();
				} catch (IOException e) {
					 
					throw new RuntimeException("Failed to load properties file "+ filepath);
				}
			
		} catch (FileNotFoundException e) {
			 
			throw new RuntimeException("file not found at  "+ filepath);
		}
	 	
		return prop;
		
	}

}
