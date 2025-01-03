package domain;

public class Address {

	
	String firstname;
	String lastname;
	String country;
	String address_line1;
	String city;
	String state;
	String zip;
	String email;
	
	
	public Address(String firstname, String lastname, String country, String address_line1, String city, String state,
			String zip, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
		this.address_line1 = address_line1;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getStreetaddress() {
		return address_line1;
	}


	public void setStreetaddress(String address_line1) {
		this.address_line1 = address_line1;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
