package com.techlabs.ocp.violation;

public enum FestivalCategory {
	NEWYEAR,HOLI,NORMAL;
	
	@Override
	public String toString() {
		switch(this) {
		case NEWYEAR:
			return "New Year";
		case HOLI:
			return "Holi";
		case NORMAL:
			return "Normal";
		}
		return null;
	}

}
