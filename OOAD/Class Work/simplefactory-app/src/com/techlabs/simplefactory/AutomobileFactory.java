package com.techlabs.simplefactory;

public class AutomobileFactory {
	public IAutomobile make(AutoType type) {
		if(type == AutoType.BMW)
			return new BMW();
		if(type == AutoType.Audi)
			return new Audi();
		if(type == AutoType.Tesla)
			return new Tesla();
		return null;
	}

}
