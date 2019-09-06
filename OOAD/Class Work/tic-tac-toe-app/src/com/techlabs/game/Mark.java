package com.techlabs.game;

public enum Mark {
	NOUGHT, CROSS;
	
	@Override
	public String toString() {
		switch(this) {
		case NOUGHT: return "O";
		case CROSS: return "X";
		}
		return null;
	}
}


