package com.techlabs.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.guitar.*;

public class GuitarTester {
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatClientLikes = new GuitarSpec(Builder.FENDER, "Stratocaster", Type.ACOUSTIC, 16, Wood.MAHOGANY,
				Wood.INDIAN_ROSEWOOD);
		List<Guitar> matchingGuitars = inventory.search(whatClientLikes);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("You might like these guitars:");
			for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = i.next();
				GuitarSpec spec = guitar.getSpec();
				
				System.out.println("\nWe have a " + spec.getBuilder() + " " + spec.getModel()
				   + " " + spec.getType() + " guitar:\n" + spec.getBackWood() + " back and sides,\n" + 
						spec.getTopWood() + " top.\n" + "You can have it for only Rs." + guitar.getPrice());
			}
		}
		else
			System.out.println("No guitars found");
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("123ABC", 9000, Builder.FENDER, "Stratocaster", Type.ACOUSTIC, 16, Wood.MAHOGANY,
				Wood.INDIAN_ROSEWOOD);
		inventory.addGuitar("321DEF", 5000, Builder.GIBSON, "Les Paul", Type.ELECTRIC, 16, Wood.ALDER,
				Wood.INDIAN_ROSEWOOD);
		inventory.addGuitar("456ABC", 3000, Builder.COLLINGS, "Sitka", Type.ACOUSTIC, 16, Wood.BRAZILIAN_ROSEWOOD,
				Wood.ALDER);
		inventory.addGuitar("654GHI", 6000, Builder.PRS, "Schizoid", Type.ELECTRIC, 16, Wood.COCOBOLO, Wood.CEDAR);
		inventory.addGuitar("786JKL", 15000, Builder.FENDER, "Stratocaster", Type.ACOUSTIC, 16, Wood.MAHOGANY,
				Wood.INDIAN_ROSEWOOD);
	}

}
