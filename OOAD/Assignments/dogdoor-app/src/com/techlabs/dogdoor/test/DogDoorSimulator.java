package com.techlabs.dogdoor.test;

import com.techlabs.dogdoor.*;

public class DogDoorSimulator {
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		
		door.addAllowedBarks(new Bark("rowlf"));
		door.addAllowedBarks(new Bark("rooowlf"));
		door.addAllowedBarks(new Bark("rawlf"));
		door.addAllowedBarks(new Bark("woof"));
		
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);

		System.out.println("Bruce starts barking.");
		recognizer.recognize(new Bark("rowlf"));
//		remote.pressButton();

		System.out.println("\nBruce has gone outside...");
		
		try {
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e){
		}
		
		System.out.println("\nBruce's all done...");
		System.out.println("...but he's stuck outside!");
		
		Bark smallDogBark = new Bark("yip");
		System.out.println("Bitsie starts barking.");
		recognizer.recognize(smallDogBark);
	
		try {
			Thread.currentThread().sleep(5000);
		}catch(InterruptedException e){
		}
		
		System.out.println("\nBruce starts barking...");
		recognizer.recognize(new Bark("rooowlf"));
		
//		System.out.println("...so Gina grabs the remote control.");
//		remote.pressButton();

		System.out.println("\nBruce's back inside...");

	}

}
