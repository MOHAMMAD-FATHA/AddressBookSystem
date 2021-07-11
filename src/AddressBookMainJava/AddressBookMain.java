package AddressBookMainJava;


/**
 * @author FATHA
 * Purpose - To create an address book management system
 */
class contact {

	 private String firstname, lastname, address, city, state, email;
	 private int zip, phonenumber;

		// TODO Auto-generated constructor stub
		
		public void setStringDetails(){
			
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
	        this.city = city;
	        this.state = state;
	        this.email = email;
	        this.zip = zip;
	        this.phonenumber = phonenumber;
	        
		}
		
		public String getFirstname() {
			return this.firstname = firstname;
		}
		
		public String getLasttname() {
			return this.lastname = lastname;
		}

		public String getAddress() {
			return this.address = address;
		}

		public String getCity() {
			return this.city = city;
		}
		public String getState() {
			return this.state = state;
		}
		public String getEmail() {
			return this.email = email;
		}
		public int getZip() {
			return this.zip = zip;
		}
		public int getNumber() {
			return this.phonenumber = phonenumber;
		}
}



public class AddressBookMain{
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Management System");
		
	}
}