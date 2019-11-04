package com.techlabs.concreteclasses;

import com.techlabs.interfaces.Container;
import com.techlabs.interfaces.Iterator;

public class NameRepository implements Container {
	private String names[] = { "Sachin", "Dhoni", "Virat", "Rohit" };
	private NameIterator nameIterator;

	public String[] getNames() {
		return names;
	}

	@Override
	public Iterator getIterator() {
		nameIterator = new NameIterator();
		return nameIterator;
	}
}