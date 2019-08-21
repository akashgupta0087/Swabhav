package com.techlabs.guitar;

import java.util.*;

public class Inventory {
	private ArrayList<Guitar> guitars = new ArrayList<Guitar>();

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {

		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String guitar) {
		return null;
	}

	public List<Guitar> search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			GuitarSpec guitarSpec = guitar.getSpec();
			if (searchSpec.getBuilder() != guitarSpec.getBuilder())
				continue;
			
			String model = searchSpec.getModel().toLowerCase();
			if((model !=null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase())))
				continue;
			
			if(searchSpec.getType() != guitarSpec.getType())
				continue;
			
			if(searchSpec.getBackWood() != guitarSpec.getBackWood())
				continue;
			
			if(searchSpec.getTopWood() != guitarSpec.getTopWood())
				continue;
			
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

}
