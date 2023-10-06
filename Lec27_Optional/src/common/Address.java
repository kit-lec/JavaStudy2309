package common;

public class Address {
	private String street;

	public Address(){}
	public Address(String street) {
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return String.format("[Address: street=%s]", this.street);
	}
}
