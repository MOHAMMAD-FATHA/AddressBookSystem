package AddressBookMainJava;

public class Contacts {

	private String firstname, lastname, address, city, state, email;
	private int zip, phonenumber;

	/*
	 * Setters
	 */
	public void setFirstname(String firstname) {

		this.firstname = firstname;
	}

	public void setLastname(String lastname) {

		this.lastname = lastname;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public void setState(String state) {

		this.state = state;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public void setZip(int zip) {

		this.zip = zip;
	}

	public void setNumber(int phonenumber) {

		this.phonenumber = phonenumber;
	}

	/*
	 * Getters
	 */

	public String getFirstname() {
		return this.firstname;
	}

	public String getLasttname() {
		return this.lastname;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getEmail() {
		return this.email;
	}

	public int getZip() {
		return this.zip;
	}

	public int getNumber() {
		return this.phonenumber;
	}

	public String toString() {
		return "First name= " + firstname + " Last name= " + lastname + " Address= " + address + " City= " + city
				+ " State= " + state + " Zip= " + zip + " Phone Number= " + phonenumber + " E-mail= " + email;
	}

}
