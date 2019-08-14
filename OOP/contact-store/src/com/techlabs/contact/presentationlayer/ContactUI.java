package com.techlabs.contact.presentationlayer;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.techlabs.contact.businesslayer.Contact;
import com.techlabs.contact.businesslayer.ContactManager;

public class ContactUI {
	public void menu() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		ContactManager manager = new ContactManager();
		
		while (true) {
			System.out.println(" ");
			System.out.println("What do you want to do :");
			System.out.println("1.Add a new Contact \n2.View Contacts \n3.Search \n4.Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println(" ");
			switch (choice) {
			case 1:
				input(manager);
				break;
			case 2:
				output(manager);
				break;
			case 3:
				search(manager);
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

	public void input(ContactManager manager) {
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
		manager.addContact(c1);
	}

	public void output(ContactManager manager) {
		ArrayList<Contact> contacts = manager.getContacts();
		if (contacts != null) {
			display(contacts);
		}
	}

	public void search(ContactManager manager) {
		String searchInput = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		searchInput = sc.next();
		ArrayList<Contact> searchedContacts = manager.searchContact(searchInput);
		if (searchedContacts != null) {
			display(searchedContacts);
		}
		if (searchedContacts.isEmpty()) {
			System.out.println("Contact not found");
		}
	}

	private void display(ArrayList<Contact> contacts) {
		for (Contact contact : contacts) {
			System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getEmail() + " "
					+ contact.getPhoneNo());
		}
	}
}