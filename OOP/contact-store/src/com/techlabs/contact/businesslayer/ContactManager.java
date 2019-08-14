package com.techlabs.contact.businesslayer;

import java.util.*;
import java.io.*;

import java.io.Serializable;

public class ContactManager {

	public static ArrayList<Contact> contactList = new ArrayList<Contact>();

	public void addContact(Contact contact) {
		contactList.add(contact);
		save(contactList);
	}

	public ArrayList<Contact> getContacts() {
		File file = new File("resources/contacts.txt");
		if(file.length() !=0) {
			contactList = load();
		}
		contactList = load();
		return contactList;
	}

	public ArrayList<Contact> searchContact(String search) {
		ArrayList<Contact> contactList = getContacts();
		ArrayList<Contact> searchedContactList = new ArrayList<Contact>();
		for (int i = 0; i < contactList.size(); i++) {
			if (search.equalsIgnoreCase(contactList.get(i).getFirstName())) {
				searchedContactList.add(contactList.get(i));
			}
		}
		return searchedContactList;
	}

	private static void save(ArrayList<Contact> contacts) {

		try {
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("resources/contacts.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(contacts);

			out.flush();
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static ArrayList<Contact> load() {

		ArrayList<Contact> contacts = null;
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("resources/contacts.txt"));
			contacts = (ArrayList<Contact>) in.readObject();

			// closing the stream
			in.close();

		} catch (Exception e) {
			System.out.println("Conntact list is empty");
		}

		return contacts;

	}

}
