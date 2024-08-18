package entity;

public class Address {
	private String doorno;
	private String street;
	private String city;
	private int pincode;
	
	public Address(String doorno, String street, String city, int pincode) {
		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return doorno + ", " + street + ", " + city + ", " + pincode + ".";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	
	
	
	
}
