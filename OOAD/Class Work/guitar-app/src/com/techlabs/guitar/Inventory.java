package com.techlabs.guitar;

import java.util.*;

public class Inventory {
	private List<Instrument> inventory;

	public Inventory() {
		inventory = new LinkedList<Instrument>();
	}
	
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNumber, price, spec);
		inventory.add(instrument);
		
	}
	
	public Instrument get(String serialNumber) {
	    for (Iterator<Instrument> i = inventory.iterator(); i.hasNext(); ) {
	      Instrument instrument = i.next();
	      if (instrument.getSerialNumber().equals(serialNumber)) {
	        return instrument;
	      }
	    }
	    return null;
	  }

	public List search(InstrumentSpec searchSpec) {
	    List matchingInstruments = new LinkedList();
	    for (Iterator<Instrument> i = inventory.iterator(); i.hasNext(); ) {
	      Instrument instrument = i.next();
	      if (instrument.getSpec().matches(searchSpec))
	        matchingInstruments.add(instrument);
	    }
	    return matchingInstruments;
	  }


}
