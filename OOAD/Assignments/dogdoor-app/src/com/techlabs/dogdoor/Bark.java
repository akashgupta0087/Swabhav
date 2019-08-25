package com.techlabs.dogdoor;

public class Bark {
	private String sound;

	public Bark(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}
	
	public boolean equals(Bark bark) {
		return this.getSound() == bark.getSound();
	}

}
