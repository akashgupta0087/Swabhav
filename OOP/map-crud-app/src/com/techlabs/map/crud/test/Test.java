package com.techlabs.map.crud.test;

import com.techlabs.map.crud.HashMapCrud;
import com.techlabs.map.crud.LinkedHashMapCrud;
import com.techlabs.map.crud.MapCrud;
import com.techlabs.map.crud.TreeMapCrud;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("HashMap starts here: ");
        HashMapCrud hashMap = new HashMapCrud();
        doCRUDOperations(hashMap);
		
		System.out.println("\nLinkedHashMap starts here: ");
		LinkedHashMapCrud linkedHashMap = new LinkedHashMapCrud();
		doCRUDOperations(linkedHashMap);
		
		System.out.println("\nTreeMap starts here: ");
		TreeMapCrud treeMap = new TreeMapCrud();
		doCRUDOperations(treeMap);
		
		//Double a = null;
	
	}
	
	public static void doCRUDOperations(MapCrud mapType) {
		mapType.create(2, "Football");
		mapType.create(4, "Cricket bat");
		mapType.create(1, "Basketball");
		mapType.create(3, "Badminton");
		mapType.create(81, "Hockey");
		mapType.create(5555, "Baseball");
		mapType.create(78, "CarromBoard");
		mapType.create(600, "ChessBoard");
		
		mapType.read();
		mapType.update(3, "Tennis");
		System.out.println(" ");
		mapType.read();
		mapType.remove(3);
		System.out.println(" ");
		mapType.read();
	}

}
