package com.techlabs.game;

public enum Result {
	PROGRESS,WIN,DRAW;
	
	@Override
	public String toString() {
		switch(this) {
		case PROGRESS: return "Progress";
		case WIN: return "Win";
		case DRAW: return "Draw";
		}
		return null;
	}
}
