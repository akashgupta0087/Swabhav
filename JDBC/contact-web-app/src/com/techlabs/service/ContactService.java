package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {
	
	private ContactRepository contactRepo;
	
	public ContactService() {
		contactRepo = new ContactRepository();
	}
	
	public void addContact(Contact contact) {
		contactRepo.addContact(contact);
	}
	
	public List<Contact> getContacts(){
		List<Contact> contacts = new ArrayList<Contact>();
			contacts = contactRepo.getContacts();
			return contacts;
		}
	}

