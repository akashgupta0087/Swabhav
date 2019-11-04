package com.techlabs.concreteclasses;

import com.techlabs.interfaces.Iterator;

public class NameIterator implements Iterator {

	private NameRepository nameRepo;

	public NameIterator() {
		nameRepo = new NameRepository();
	}

	int index;

	@Override
	public boolean hasNext() {

		if (index < nameRepo.getNames().length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {

		if (this.hasNext()) {
			return nameRepo.getNames()[index++];
		}
		return null;
	}

}
