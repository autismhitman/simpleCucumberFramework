package checkingScript;

import io.cucumber.java.ParameterType;

public class Parameters {
	
	
	@ParameterType("\"RED\"|\"BLUE\"")  // regexp "red|blue|yellow"
 	public Color color(String name){  // type, name (from method)
 		  
 		 return new Color(name);// transformer function
 	}

}
