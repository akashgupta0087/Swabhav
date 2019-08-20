package com.swabhav.set.crud;

import java.util.*;

public class SetsCrud {
	
	Set<String> set;
	
	public void create(String element) {
	  set.add(element);
	}
	
	public String read() {
		String result = "";
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			result = result + " " + itr.next();
		}
		return result;
	}

	public void update(String oldElement, String newElement) {
//		for(String item: set) {
//			if(item.equals(oldElement)) {
//				set.remove(oldElement);
//				set.add(newElement);
//			}
//		}
		set.removeIf(str->str.contains(oldElement));
		set.add(newElement);
	}
	
	public void delete(String element) {
		set.remove(element);
	}

}
