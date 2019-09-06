package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem{
	
	private String name;
	private List<IStorageItem> items;
	
	public Folder(String name) {
		this.name = name;
		items = new ArrayList<IStorageItem>();
	}
	
	
	public String getName() {
		return name;
	}

	public List<IStorageItem> getItems() {
		return items;
	}

	public void addItem(IStorageItem item) {
		items.add(item);
	}
	
	@Override
	public void display() {
		System.out.println(name);
		for(IStorageItem item : items) {
			item.display();
		}
		
	}

}
