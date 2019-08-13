package com.techlabs.contact.businesslayer;

import java.util.*;
import java.io.*;

import java.io.Serializable;

public class ContactManager{

	public static ArrayList<Contact> contactList = new ArrayList<Contact>();

	public void addContact(Contact contact) {
		contactList.add(contact);
		save(contactList);
	}

	public ArrayList<Contact> getContacts() {
		ArrayList<Contact> newContactList = load();
		return newContactList;
	}
	
	private static void save(ArrayList<Contact> contacts) {

		try {
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("resources/contacts.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(contacts);
			System.out.println("Serialization Done");

			out.flush();
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static ArrayList load() {
		
		ArrayList contacts = null;
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("resources/contacts.txt"));
			contacts = (ArrayList) in.readObject();

			System.out.println("Deserialization Done");

			// closing the stream
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
		return contacts;

	}
	
	

}
