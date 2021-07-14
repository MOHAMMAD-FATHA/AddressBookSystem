package AddressBookMainJava;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author FATHA Purpose - To create an address book management system
 * Paractice problem
 */

public class AddressBookMain {

	ArrayList<Contacts> Book = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	/*
	 * Purpose : Used AddDetails method to add the details of person
	 */
	public void AddDetails() {

		Scanner sc = new Scanner(System.in);
		Contacts details = new Contacts();
		System.out.println("Enter the First Name of person");
		details.setFirstname(sc.nextLine());
		System.out.println("Enter the Last Name of person");
		details.setLastname(sc.nextLine());
		System.out.println("Enter the Address Name of person");
		details.setAddress(sc.nextLine());
		System.out.println("Enter the City Name of person");
		details.setCity(sc.nextLine());
		System.out.println("Enter the State Name of person");
		details.setState(sc.nextLine());
		System.out.println("Enter the Email of person");
		details.setEmail(sc.nextLine());
		System.out.println("Enter the Zip code of person");
		details.setZip(sc.nextInt());
		System.out.println("Enter the Phone number of person");
		details.setNumber(sc.nextInt());
		sc.close();
		Book.add(details);
		System.out.println(Book);
	}

	/*
	 * Purpose : Used edit method to edit the details
	 */
	public void editDetails() {

		System.out.println("Confirm your first name to edit details: ");
		String name = sc.next();

		for (int i = 0; i < Book.size(); i++) {
			if (Book.get(i).getFirstname().equals(name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
				int e = sc.nextInt();

				switch (e) {
				case 1:
					System.out.println("Enter first name");
					Book.get(i).setFirstname(sc.next());
					break;
				case 2:
					System.out.println("Enter Last name");
					Book.get(i).setLastname(sc.next());
					break;
				case 3:
					System.out.println("Enter address");
					Book.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter city");
					Book.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter state");
					Book.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter email");
					Book.get(i).setEmail(sc.next());
					break;
				case 7:
					System.out.println("Enter Zip");
					Book.get(i).setZip(sc.nextInt());
					break;
				case 8:
					System.out.println("Enter phone number");
					Book.get(i).setNumber(sc.nextInt());
					break;
				}

				System.out.println(Book);

			} else
				System.out.println("Enter valid First name");
		}

	}

	/*
	 * Purpose : Used output method to display the details
	 */
	public void output() {
		// TODO Auto-generated method stub
		System.out.println(Book);
	}

	/*
	 * Purpose : Used deleteDetails method to delete the details of the person
	 */
	public void deleteDetails() {
		// TODO Auto-generated method stub
		System.out.println("Confirm your first name to edit details: ");
		String name = sc.next();

		for (int i = 0; i < Book.size(); i++) {
			if (Book.get(i).getFirstname().equals(name)) {
				System.out.println("Select form below to change: ");
				Book.remove(i);
			}
		}
		System.out.println(Book);
	}

	public static void main(String[] args) {

		int i = 0;

		System.out.println("Welcome to Address Book Management System");

		AddressBookMain details = new AddressBookMain();

		while (i == 0) {
			System.out.println("What you want to do: ");
			System.out.println("1.Add details.\n2.Edit details.\n3.Delete the details");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				details.AddDetails();
				break;
			case 2:
				details.editDetails();
				break;
			case 3:
				details.deleteDetails();
				break;
			default:
				i = 1;
				System.out.println("Wrong option");
				details.output();
				break;
			}
		}

=======
/**
 * @author FATHA Purpose - To create an address book management system
 */
class contact {

	private String firstname, lastname, address, city, state, email;
	private int zip, phonenumber;

	// TODO Auto-generated constructor stub

	public void setStringDetails() {

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

public class AddressBookMain {
	public static void main(String[] args) {

		System.out.println("Welcome to Address Book Management System");

>>>>>>> 654e225ad6b4ad4313549a268f62d2de4d72ba8d
	}

}