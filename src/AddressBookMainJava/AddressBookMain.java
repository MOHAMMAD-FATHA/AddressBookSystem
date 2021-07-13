package AddressBookMainJava;
import java.util.*;
import java.util.Scanner;

/**
 * @author FATHA 
 * Purpose - To create an address book management system
 */

public class AddressBookMain {

	public void AddDetails() {

		ArrayList<Contacts> Book = new ArrayList<>();
		
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

	public static void main(String[] args) {

		  
		System.out.println("Welcome to Address Book Management System");
		
		AddressBookMain details = new AddressBookMain();
		details.AddDetails();
	
	}
}