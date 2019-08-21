package com.techlabs.map.crud;

import java.util.Map;

public class MapCrud {
	Map<Integer, String> sportsItems;
	
	public void create(int key, String value) {
		sportsItems.put(key, value);
	}
	
	public void read() {
		for(Map.Entry sportsItem : sportsItems.entrySet()) {
			System.out.println(sportsItem.getKey() + " " + sportsItem.getValue());
		}
	}
	
	public void update(int key, String value) {
		sportsItems.replace(key, value);
	}
	
	public void remove(int key) {
		sportsItems.remove(key);
	}

}
