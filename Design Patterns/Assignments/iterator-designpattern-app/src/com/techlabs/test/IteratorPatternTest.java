package com.techlabs.test;

import com.techlabs.concreteclasses.NameRepository;
import com.techlabs.interfaces.Iterator;

public class IteratorPatternTest {
	public static void main(String[] args) {

		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}

	}

}