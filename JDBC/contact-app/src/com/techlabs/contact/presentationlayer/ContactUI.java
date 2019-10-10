package com.techlabs.contact.presentationlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.contact.businesslayer.Contact;
import com.techlabs.contact.servicelayer.ContactService;

public class ContactUI {
	
	public void menu() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		ContactService service = new ContactService();
		
		while (true) {
			System.out.println(" ");
			System.out.println("What do you want to do :");
			System.out.println("1.Add a new Contact \n2.View Contacts \n3.Search \n4.Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println(" ");
			switch (choice) {
			case 1:
				input(service);
				break;
			case 2:
				output(service);
				break;
			case 3:
				search(service);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}
	
	public void input(ContactService service) {
		String firstName = "";
		String lastName = "";
		String email = "";
		String phoneNo = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		firstName = sc.next();
		System.out.print("Enter last name: ");
		lastName = sc.next();
		System.out.print("Enter email: ");
		email = sc.next();
		System.out.print("Enter phone number: ");
		phoneNo = sc.next();

		Contact c1 = new Contact(firstName, lastName, email, phoneNo);
		service.addContact(c1);
	}
	
	public void output(ContactService service) {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts = service.getContacts();
		display(contacts);
		
	}
	
	public void search(ContactService service) {
		List<Contact> searchedContacts = new ArrayList<Contact>();
		String firstName = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		firstName = sc.next();
		searchedContacts = service.searchContacts(firstName);
		display(searchedContacts);
	}
	
	private void display(List<Contact> contacts) {
		if(contacts.isEmpty()) {
			System.out.println("No contacts found");
		}
		
		else {
			System.out.println("FirstName\t LastName\t Email\t\t\t\t PhoneNumber");
			for(Contact contact : contacts) {
				System.out.println(contact.getFirstName() + "\t\t " + contact.getLastName()
				+ "\t\t " + contact.getEmail() + "\t " + contact.getPhoneNo());
			}
		}
	}

}
